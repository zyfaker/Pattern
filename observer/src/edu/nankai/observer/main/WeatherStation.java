package edu.nankai.observer.main;

import edu.nankai.observer.impls.CurrentConditionsDisplay;
import edu.nankai.observer.impls.WeatherData;

//²âÊÔÖ÷º¯Êı

public class WeatherStation {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		@SuppressWarnings("unused")
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(
				weatherData);
		//StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		//ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}
}
