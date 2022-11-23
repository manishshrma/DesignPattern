package ObserverPattern;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();


        // Register CurrentConditionDisplay (Observer)  to the WeatherData (Subject)
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay();
        weatherData.registerObserver(currentConditionDisplay);

        weatherData.setMeasurements(37, 35, 2);
        weatherData.setMeasurements(4, 1, 12);

    }
}
