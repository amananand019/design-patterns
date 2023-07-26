package designPatterns.observer.observers;

import designPatterns.observer.subjects.WeatherData;

public class StatisticsDisplay implements Observer, DisplayElement {
    private float maxTemperature;
    private float minTemperature;
    private float sumTemperature;
    private int countTempChange;
    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.maxTemperature = Float.MIN_VALUE;
        this.minTemperature = Float.MAX_VALUE;
        this.sumTemperature = 0f;
        this.countTempChange = 0;
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + sumTemperature / (countTempChange * 1f) + "/" + maxTemperature + "/" + minTemperature);
    }

    @Override
    public void update() {
        float temperature = weatherData.getTemperature();
        this.maxTemperature = Math.max(temperature, maxTemperature);
        this.minTemperature = Math.min(temperature, minTemperature);
        this.sumTemperature += temperature;
        this.countTempChange++;
        display();
    }
}
