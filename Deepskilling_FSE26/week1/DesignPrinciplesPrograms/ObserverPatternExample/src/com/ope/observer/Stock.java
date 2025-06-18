package com.ope.observer;

public interface Stock {
	void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
