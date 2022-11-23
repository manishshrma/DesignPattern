package ObserverPattern;

public class StatisticDisplay implements Observer {
    float temperature;
    float humidity;
    float pressure;

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    public void display() {
        System.out.println("Statistic Display");
        System.out.println(temperature + " " + humidity + " " + pressure);
    }
}
