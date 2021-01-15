package com.qa.main;

public class TemperatureConverter {
	 public static double convertFahrenheitToCelsius(int fahrenheit) {
	        return (fahrenheit-32)*5/9;
	    }
	 
	    public static double convertCelsiusToFahrenheit(int celsius) {
	        return (celsius*9/5) + 32;
	    }

	    public static double convertKelvinToCelsius(int kelvin) {
	        return (kelvin - 273);
	    }

	    public static double convertCelsiusToKelvin(int celsius) {
	        return (celsius + 273);
	    }

	    public static double convertKelvinToFahrenheit(int kelvin) {
	    	int celsius=(int)(convertKelvinToCelsius(kelvin));
	        return convertCelsiusToFahrenheit(celsius);
	    }

	    public static double convertFahrenheitToKelvin(int fahrenheit) {
	        int celsius=(int)(convertFahrenheitToCelsius(fahrenheit));
	        return convertCelsiusToKelvin(celsius);
	    }

}
