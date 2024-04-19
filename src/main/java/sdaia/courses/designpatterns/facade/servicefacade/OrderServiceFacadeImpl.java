package sdaia.courses.designpatterns.facade.servicefacade;

import sdaia.courses.designpatterns.facade.domain.Product;
import sdaia.courses.designpatterns.facade.subcomponents.InventoryService;
import sdaia.courses.designpatterns.facade.subcomponents.PaymentService;
import sdaia.courses.designpatterns.facade.subcomponents.ShippingService;

public class OrderServiceFacadeImpl implements OrderServiceFacade{

    public boolean placeOrder(int pId){
        boolean orderFulfilled=false;
        Product product=new Product();
        product.productId=pId;
        if(InventoryService.isAvailable(product))
        {
            System.out.println("Product with ID: "+ product.productId+" is available.");
            boolean paymentConfirmed= PaymentService.makePayment();
            if(paymentConfirmed){
                System.out.println("Payment confirmed...");
                ShippingService.shipProduct(product);
                System.out.println("Product shipped...");
                orderFulfilled=true;
            }
        }
        return orderFulfilled;
    }
}
