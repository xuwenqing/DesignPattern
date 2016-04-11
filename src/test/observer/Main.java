package observer;

import observer.support.Observer1;
import observer.support.Observer2;
import observer.support.WeatherSubject;
import org.junit.Test;

/**
 * Created by OGC on 2016/4/11.
 */
public class Main {
    @Test
    public void test() {
        Subject subject = new WeatherSubject();
        subject.registerObserver(new Observer1());
        subject.registerObserver(new Observer2());
        subject.notifyObeserver();
    }
}
