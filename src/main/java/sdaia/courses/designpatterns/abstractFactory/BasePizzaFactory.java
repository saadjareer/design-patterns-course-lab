package sdaia.courses.designpatterns.abstractFactory;


import sdaia.courses.designpatterns.abstractFactory.product.Pizza;

public abstract class BasePizzaFactory {
    
    public abstract Pizza createPizza(String type);
}
