package Chapter2.subject;

import Chapter2.display.WeatherData;
import Chapter2.observer.Observer;

public class CurrentConditionDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    // 옵저버 등록
    public CurrentConditionDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    // 값 받아오는 업데이트 부분
    // 이를 통해 display 까지 같이
    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    // display를 한다
    @Override
    public void display() {
        System.out.println("현재 상태 : 온도 " + temperature
        + "F, 습도 " + humidity + "%");
    }
}
