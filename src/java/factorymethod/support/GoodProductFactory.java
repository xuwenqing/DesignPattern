package factorymethod.support;

import factorymethod.Product;
import factorymethod.ProductFactory;

/**
 * Created by OGC on 2016/4/12.
 */
public class GoodProductFactory extends ProductFactory {

    @Override
    public Product createProduct() {
        return new GoodProduct();
    }
}
