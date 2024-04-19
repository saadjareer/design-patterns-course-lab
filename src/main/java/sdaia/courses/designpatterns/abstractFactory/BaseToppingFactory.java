package sdaia.courses.designpatterns.abstractFactory;

import sdaia.courses.designpatterns.abstractFactory.topping.Cheese;
import sdaia.courses.designpatterns.abstractFactory.topping.Sauce;

public abstract class BaseToppingFactory {
    public abstract Cheese createCheese();
    public abstract Sauce createSauce();
}
