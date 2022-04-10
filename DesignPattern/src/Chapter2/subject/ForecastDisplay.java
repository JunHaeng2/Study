package Chapter2.subject;

import Chapter2.display.WeatherData;
import Chapter2.observer.Observer;

public class ForecastDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private float pressure;
    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        if (temperature >= 40) {
            System.out.println("너무 더워요");
        } else if (40 > temperature ) {
            System.out.println("적당히 더워요");
        }
    }
}
