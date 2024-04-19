package sdaia.courses.designpatterns.abstractFactory;

import org.junit.Test;
import sdaia.courses.designpatterns.abstractFactory.product.Pizza;

public class SicilianPizzaFactoryTest {

    @Test
    public void testCreatePizza() throws Exception {
        BasePizzaFactory pizzaFactory = new SicilianPizzaFactory();
        Pizza cheesePizza = pizzaFactory.createPizza("cheese");
        Pizza pepperoniPizza = pizzaFactory.createPizza("pepperoni");
    }
}
