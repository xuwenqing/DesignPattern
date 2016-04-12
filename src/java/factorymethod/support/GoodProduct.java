package factorymethod.support;

import factorymethod.Product;

/**
 * Created by OGC on 2016/4/12.
 */
public class GoodProduct implements Product {
    public void name() {
        System.out.println("good");
    }
}
