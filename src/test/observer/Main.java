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
        Observer1 observer1 = new Observer1(subject);
        Observer2 observer2 = new Observer2(subject);
        subject.notifyObeserver();
    }
}
