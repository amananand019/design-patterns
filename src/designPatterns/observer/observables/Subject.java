package designPatterns.observer.observables;

import designPatterns.observer.observers.Observer;

public interface Subject {
    public void registerObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObservers();
}
