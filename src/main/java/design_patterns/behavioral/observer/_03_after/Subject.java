package main.java.design_patterns.behavioral.observer._03_after;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observerList = new ArrayList<>();

    public void attach(Observer observer) {
        observerList.add(observer);
    }

    public void detach(Observer observer) {
        observerList.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer: this.observerList) {
            observer.update();
        }
    }
}
