package observer.support;

import observer.Observer;
import observer.Subject;

import java.util.ArrayList;
import java.util.List;

public class WeatherSubject implements Subject {
    protected final List<Observer> observers;

    public WeatherSubject() {
        this.observers = new ArrayList<Observer>(0);
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObeserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObeserver() {
        for(Observer observer : this.observers) {
            observer.update();
        }
    }
}
