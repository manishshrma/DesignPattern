package ObserverPattern;

import java.util.ArrayList;

public class WeatherData implements Subject {
    public ArrayList observers;
    float temperature;
    float humidity;
    float pressure;

    public WeatherData() {
        this.observers = new ArrayList();
    }

    public void measurementChanges() {
        // trigger all the display class that show case the weather data
        this.notifyObserver();


    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.measurementChanges();
        return;
    }


    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);

    }

    @Override
    public void removeObserver(Observer observer) {
        int idx = observers.indexOf(observer);
        if (idx >= 0) {
            observers.remove(idx);
        }
    }

    @Override
    public void notifyObserver() {
        for (int i = 0; i < this.observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.update(this.temperature, this.humidity, this.pressure);
        }
    }
}
