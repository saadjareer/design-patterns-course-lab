package sdaia.courses.designpatterns.abstractFactory;

import org.junit.Test;
import sdaia.courses.designpatterns.abstractFactory.product.Pizza;

public class GourmetPizzaFactoryTest {

    @Test
    public void testCreatePizza() throws Exception {
    BasePizzaFactory pizzaFactory=new GourmetPizzaFactory();
        Pizza cheesePizza= pizzaFactory.createPizza("cheese");
        Pizza veggiePizza=pizzaFactory.createPizza("veggie");
    }
}
