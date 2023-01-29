package com.deny;

import com.deny.decorator.Cafeteria;
import com.deny.observer.WeatherStation;
import com.deny.strategy.StrategyExample;

public class Main {
    public static void main(String[] args) {
        //new StrategyExample().start();
        //new WeatherStation().start();
        new Cafeteria().start();
    }
}
