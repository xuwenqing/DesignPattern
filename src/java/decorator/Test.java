package decorator;

import decorator.decorator.Concreate1DecoratorComponent;
import decorator.decorator.Concreate2DecoratorComponent;

/**
 * Created by OGC on 2016/4/12.
 */
public class Test {
    public static void main(String[] args) {
        Component component = new ConcreateComponent();
        component = new Concreate1DecoratorComponent(component);
        component.operation();
        component = new Concreate2DecoratorComponent(component);
        component.operation();
    }
}
