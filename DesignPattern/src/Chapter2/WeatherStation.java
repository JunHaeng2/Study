package Chapter2;

import Chapter2.display.WeatherData;
import Chapter2.subject.CurrentConditionDisplay;
import Chapter2.subject.ForecastDisplay;

import java.util.ArrayList;

/**
 *  옵저버 패턴
 *  subject, observer, display
 *  -> 주제 부분에서 observer에 등록된 객체들에게 내용을 전달하고
 *  -> 디스플레이에서 이를 보여주는거임..
 *  그렇기에 observer에 등록된 아무 디스플레이나 subject가 전달해주는 내용을 활용할수있게 만들어주는
 *  패턴을 옵저버 패턴이라고 한다.. !
 */


public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);

        // 대충 만들어봄..
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        weatherData.setMeasurements(50, 40, 10f);
        weatherData.setMeasurements(30, 30, 10f);

    }
}
