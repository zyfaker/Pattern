package edu.nankai.observer.impls;

import java.util.Observable;

/*
 * author:zyfaker
 * date:2015-5-25 0：01
 * 被观察的对象数值发生变化时，会通知所有的观察者
 * 继承Observable类
 */
public class WeatherData extends Observable {

	private float temperature, humidity, pressure;

	public void measurementsChanged() {
		setChanged();
		notifyObservers();
	}

	public float getTemperature() {
		return temperature;

	}

	public float getHumidity() {
		return humidity;

	}

	public float getPressure() {
		return pressure;

	}

	public void setMeasurements(float temperature, float humidity,
			float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		this.pressure = pressure;
		measurementsChanged();
	}

}
