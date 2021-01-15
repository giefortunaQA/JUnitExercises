package com.qa.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

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
		float result=(new TemperatureConverter()).convertFahrenheitToCelsius(212);
		float expected=100;
		assertEquals(expected,result);
		System.out.println("F to C test passed");
	}
	
	@Test
	public void cToFTest() {
		float result=(new TemperatureConverter()).convertCelsiusToFahrenheit(100);
		float expected=212;
		assertEquals(expected,result);
		System.out.println("C to F test passed");
	}
	
	@Test
	public void kToCTest() {
		float result=(new TemperatureConverter()).convertKelvinToCelsius(373);
		float expected=100;
		assertEquals(expected,result);
		System.out.println("K to C test passed");
	}

	@Test
	public void cToKTest() {
		float result=(new TemperatureConverter()).convertCelsiusToKelvin(100);
		float expected=373;
		assertEquals(expected,result);
		System.out.println("C to K test passed");
	}
	
	@Test
	public void kToFTest() {
		float result=(new TemperatureConverter()).convertKelvinToFahrenheit(373);
		float expected=212;
		assertEquals(expected,result);
		System.out.println("K to F test passed");
	}
	
	@Test
	public void fToKTest() {
		float result=(new TemperatureConverter()).convertFahrenheitToKelvin(212);
		float expected=373;
		assertEquals(expected,result);
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
