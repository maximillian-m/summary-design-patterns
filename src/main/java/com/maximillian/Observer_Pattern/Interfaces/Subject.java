package com.maximillian.Observer_Pattern.Interfaces;

public interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();

}
