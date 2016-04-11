package observer.support;

import observer.Observer;

/**
 * Created by OGC on 2016/4/11.
 */
public class Observer2 implements Observer {
    public void update() {
        System.out.println("Observer2");
    }
}