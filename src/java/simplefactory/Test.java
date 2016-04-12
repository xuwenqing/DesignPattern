package simplefactory;

/**
 * Created by OGC on 2016/4/12.
 */
public class Test {
    public static void main(String[] args) {
        Product product1 = ProductFactory.createProduct("ProductA");
        Product product2 = ProductFactory.createProduct("ProductB");
        product1.name();
        product2.name();
    }
}
