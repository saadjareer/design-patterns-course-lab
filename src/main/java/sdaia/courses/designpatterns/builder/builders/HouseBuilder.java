package sdaia.courses.designpatterns.builder.builders;


import sdaia.courses.designpatterns.builder.product.House;

public interface HouseBuilder {
    void buildFoundation();
    void buildStructure();
    void buildRoof();
    void paintHouse();
    void furnishHouse();
    House getHouse();
}
