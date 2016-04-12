package simplefactory;

/**
 * Created by OGC on 2016/4/12.
 */
public class ProductFactory {
    public static Product createProduct(String type) {
        if("ProductA".equals(type)) {
            return new ProductA();
        }
        else if("ProductB".equals(type)) {
            return new ProductB();
        }
        return null;
    }
}
