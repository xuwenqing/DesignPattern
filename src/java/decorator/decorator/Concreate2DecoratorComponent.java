package decorator.decorator;

import decorator.Component;

/**
 * Created by OGC on 2016/4/12.
 */
public class Concreate2DecoratorComponent extends DecoratorCompnoent {
    private Component component;

    public Concreate2DecoratorComponent(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        System.out.println("Concreate2DecoratorComponent add behavior");
        component.operation();
    }


}