package observer;

/**
 * Created by OGC on 2016/4/11.
 */
public interface Subject {
    void registerObserver(Observer observer);
    void removeObeserver(Observer observer);
    void notifyObeserver();
}
