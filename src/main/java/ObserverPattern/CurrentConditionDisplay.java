package ObserverPattern;

public class CurrentConditionDisplay implements Observer {
    float temperature;
    float humidity;
    float pressure;

    public CurrentConditionDisplay() {

    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    public void display() {
        System.out.println("Current Condition....");
        System.out.println(temperature + " " + humidity + " " + pressure);
    }
}
