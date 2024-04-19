package sdaia.courses.designpatterns.abstractFactory;

import sdaia.courses.designpatterns.abstractFactory.topping.CaliforniaOilSauce;
import sdaia.courses.designpatterns.abstractFactory.topping.Cheese;
import sdaia.courses.designpatterns.abstractFactory.topping.GoatCheese;
import sdaia.courses.designpatterns.abstractFactory.topping.Sauce;

public class GourmetToppingFactory extends BaseToppingFactory {
    @Override
    public Cheese createCheese() {
        return new GoatCheese();
    }

    @Override
    public Sauce createSauce() {
        return new CaliforniaOilSauce();
    }
}
