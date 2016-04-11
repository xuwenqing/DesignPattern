package observer.support;

import observer.Observer;
import observer.Subject;

/**
 * Created by OGC on 2016/4/11.
 */
public class Observer2 implements Observer {

    private Subject subject;

    public Observer2(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    public void update() {
        System.out.println("Observer2");
    }
}