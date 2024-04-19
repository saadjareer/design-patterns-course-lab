package sdaia.courses.designpatterns.abstractFactory;

import sdaia.courses.designpatterns.abstractFactory.topping.Cheese;
import sdaia.courses.designpatterns.abstractFactory.topping.MozzarellaCheese;
import sdaia.courses.designpatterns.abstractFactory.topping.Sauce;
import sdaia.courses.designpatterns.abstractFactory.topping.TomatoSauce;

public class SicilianToppingFactory extends BaseToppingFactory {
    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Sauce createSauce() {
        return new TomatoSauce();
    }
}
