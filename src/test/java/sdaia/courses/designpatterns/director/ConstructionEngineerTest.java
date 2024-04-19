package sdaia.courses.designpatterns.director;

import org.junit.Test;
import sdaia.courses.designpatterns.builder.builders.ConcreteHouseBuilder;
import sdaia.courses.designpatterns.builder.builders.HouseBuilder;
import sdaia.courses.designpatterns.builder.builders.PrefabricatedHouseBuilder;
import sdaia.courses.designpatterns.builder.director.ConstructionEngineer;
import sdaia.courses.designpatterns.builder.product.House;

public class ConstructionEngineerTest {

    @Test
    public void testConstructHouse() throws Exception {
        HouseBuilder concreteHouseBuilder = new ConcreteHouseBuilder();
        ConstructionEngineer engineerA = new ConstructionEngineer(concreteHouseBuilder);
        House houseA = engineerA.constructHouse();
        System.out.println("House is: "+houseA);
        PrefabricatedHouseBuilder prefabricatedHouseBuilder = new PrefabricatedHouseBuilder();
        ConstructionEngineer engineerB = new ConstructionEngineer(prefabricatedHouseBuilder);
        House houseB = engineerB.constructHouse();
        System.out.println("House is: "+houseB);
    }
}
