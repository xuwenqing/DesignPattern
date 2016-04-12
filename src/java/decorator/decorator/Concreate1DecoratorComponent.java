package decorator.decorator;

import decorator.Component;

/**
 * Created by OGC on 2016/4/12.
 */
public class Concreate1DecoratorComponent extends DecoratorCompnoent {
    private Component component;

    public Concreate1DecoratorComponent(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        System.out.println("Concreate1DecoratorComponent add behavior");
        component.operation();
    }
}
