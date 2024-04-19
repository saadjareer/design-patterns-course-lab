package sdaia.courses.designpatterns.abstractFactory.topping;

public class MozzarellaCheese implements Cheese{
    public  MozzarellaCheese(){prepareCheese();
    }

    @Override
    public void prepareCheese() {
        System.out.println("Preparing mozzarella cheese...");
    }
}