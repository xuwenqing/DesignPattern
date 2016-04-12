package factorymethod;

import factorymethod.support.BadProductFactory;
import factorymethod.support.GoodProductFactory;

/**
 * Created by OGC on 2016/4/12.
 */
public class Test {
    public static void main(String[] args) {
        ProductFactory goodfactory = new GoodProductFactory();
        ProductFactory badfactory = new BadProductFactory();
        goodfactory.createProduct().name();
        badfactory.createProduct().name();
    }
}
