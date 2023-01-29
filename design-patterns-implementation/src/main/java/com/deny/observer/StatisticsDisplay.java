package com.deny.observer;

public class StatisticsDisplay implements Observer, DisplayElement {
    private float avgTemperature = 0;
    private float avgHumidity = 0;
    int weatherMessagesCounter = 0;
    private final WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Average weather: " + avgTemperature+ "C degrees and " +
                avgHumidity + "% humidity");
    }

    @Override
    public void update(WeatherMessage weatherMessage) {
        recalculateAvgWeather(weatherMessage);
        this.display();
    }

    private void recalculateAvgWeather(WeatherMessage weatherMessage) {
        avgTemperature = (avgTemperature * weatherMessagesCounter + weatherMessage.temperature()) / (weatherMessagesCounter + 1);
        avgHumidity = (avgHumidity * weatherMessagesCounter + weatherMessage.humidity()) / (weatherMessagesCounter + 1);
        weatherMessagesCounter++;
    }
}
