package com.qa.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.qa.main.TemperatureConverter;

public class TemperatureConverterTest {
	//I am going to use the boiling point of water for each measure:
	// 100 degree C
	// 212 degree F
	// 373 K

	@BeforeAll
	public static void beforeAll() {
		System.out.println("Start of all tests");
	}
	
	@BeforeEach
	public void before() {
		System.out.println("\n=======start========");
	}
	
	@Test
	public void constructorTest() {
		TemperatureConverter conv=new TemperatureConverter();
		assertTrue(conv instanceof TemperatureConverter);
		System.out.println("Constructor test passed");
	}
	
	@Test
	public void fToCTest() {
		double result=(TemperatureConverter.convertFahrenheitToCelsius(212));
		assertEquals(100,result);
		System.out.println("F to C test passed");
	}
	
	@Test
	public void cToFTest() {
		double result=(TemperatureConverter.convertCelsiusToFahrenheit(100));
		assertEquals(212,result);
		System.out.println("C to F test passed");
	}
	
	@Test
	public void kToCTest() {
		double result=(TemperatureConverter.convertKelvinToCelsius(373));
		assertEquals(100,result);
		System.out.println("K to C test passed");
	}

	@Test
	public void cToKTest() {
		double result=(TemperatureConverter.convertCelsiusToKelvin(100));
		assertEquals(373,result);
		System.out.println("C to K test passed");
	}
	
	@Test
	public void kToFTest() {
		double result=(TemperatureConverter.convertKelvinToFahrenheit(373));
		assertEquals(212,result);
		System.out.println("K to F test passed");
	}
	
	@Test
	public void fToKTest() {
		double result=(TemperatureConverter.convertFahrenheitToKelvin(212));
		assertEquals(373,result);
		System.out.println("F to K test passed");
	}
	
	@AfterEach
	public void after() {
		System.out.println("========end=========\n");
	}
	
	@AfterAll
	public static void afterAll() {
		System.out.println("End of all tests");
	}

}
