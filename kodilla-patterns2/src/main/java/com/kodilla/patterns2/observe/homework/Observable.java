package com.kodilla.patterns2.observe.homework;

public interface Observable {
    void registerObserver(Observer observer);
    void notifyObservers();
}
