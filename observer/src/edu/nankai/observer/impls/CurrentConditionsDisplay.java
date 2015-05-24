package edu.nankai.observer.impls;

import java.util.Observable;
import java.util.Observer;

import edu.nankai.observer.interfaces.DisplayElement;

/*
 * author:zyfaker
 * date:2015-5-25 0：03
 * 观察者类，当被观察者类执行了notifyObservers()后，它会执行update()方法。
 * 实现DisplayElement和Observer接口
 */
public class CurrentConditionsDisplay implements DisplayElement, Observer {

	private WeatherData weatherData = new WeatherData();

	public CurrentConditionsDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.addObserver(this);
	}

	public void display() {
		System.out.println("Current conditions: "
				+ weatherData.getTemperature() + "F degrees and "
				+ weatherData.getHumidity() + "% humidity");
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		display();

	}
}
