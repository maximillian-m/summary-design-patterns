package com.maximillian.Observer_Pattern.java_observer;

import com.maximillian.Observer_Pattern.Interfaces.Display;
import com.maximillian.Observer_Pattern.Interfaces.Observer;
import com.maximillian.Observer_Pattern.Interfaces.Subject;

import java.util.Observable;

public class CurrentConditionDisplay extends Observable {
    private float temperature;
    private float humidity;

}
