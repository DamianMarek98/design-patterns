package com.deny.observer;

public class CurrentConditionDisplay implements DisplayElement, Observer {
    private WeatherMessage latestWeatherMessage;
    private final WeatherData weatherData;

    public CurrentConditionDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current weather: " + latestWeatherMessage.temperature() + "C degrees and " +
                latestWeatherMessage.humidity() + "% humidity");
    }

    @Override
    public void update(WeatherMessage weatherMessage) {
        latestWeatherMessage = weatherMessage;
        display();
    }
}
