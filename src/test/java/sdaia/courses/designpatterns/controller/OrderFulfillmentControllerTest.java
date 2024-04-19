package sdaia.courses.designpatterns.controller;

import org.junit.Test;
import sdaia.courses.designpatterns.facade.controller.OrderFulfillmentController;
import sdaia.courses.designpatterns.facade.servicefacade.OrderServiceFacadeImpl;

import static org.junit.Assert.assertTrue;

public class OrderFulfillmentControllerTest {

    @Test
    public void testOrderProduct() throws Exception {
        OrderFulfillmentController controller=new OrderFulfillmentController();
        controller.facade=new OrderServiceFacadeImpl();
        controller.orderProduct(9);
        boolean result=controller.orderFulfilled;
        assertTrue(result);
    }
}
