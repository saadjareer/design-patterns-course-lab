package sdaia.courses.designpatterns.decorator.components;


public class OrchidBouquet extends FlowerBouquet {
    public OrchidBouquet() {
        description = "Orchid bouquet";
    }

    public double cost() {
        return 29.0;
    }
}
