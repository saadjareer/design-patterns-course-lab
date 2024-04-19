package sdaia.courses.designpatterns.facade.controller;


import sdaia.courses.designpatterns.facade.servicefacade.OrderServiceFacade;

public class OrderFulfillmentController {
    public OrderServiceFacade facade;
    public boolean orderFulfilled = false;

    public void orderProduct(int productId) {
        orderFulfilled = facade.placeOrder(productId);
        System.out.println("OrderFulfillmentController: Order fulfillment completed. ");
    }
}
