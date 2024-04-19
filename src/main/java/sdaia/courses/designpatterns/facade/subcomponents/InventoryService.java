package sdaia.courses.designpatterns.facade.subcomponents;


import sdaia.courses.designpatterns.facade.domain.Product;

public class InventoryService {
    public static boolean isAvailable(Product product) {
        /*Check Warehouse database for product availability*/
        return true;
    }
}
