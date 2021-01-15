package com.qa.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.qa.main.BlackJack;

public class BlackJackTest {
	@BeforeAll
	public static void beforeAll() {
		System.out.println("before all");
	}
	
	@BeforeEach
	public void before() {
		System.out.println("before");
	}
	
	@Test
	public void negativeInputs() {
		String result=BlackJack.play(-1, -1);
		assertEquals(null,result);
	}
	
	@Test
	public void bothExceed21() {
		String result=BlackJack.play(22,22);
		assertEquals("Nobody",result);
	}
	
	@Test
	public void onlyDealerExceed21() {
		String result=BlackJack.play(22, 19);
		assertEquals("Player",result);
		
	}
	
	@Test
	public void onlyPlayerExceed21() {
		String result=BlackJack.play(19,22);
		assertEquals("Dealer",result);
	}

	@Test
	public void noOneExceedsDealerWin() {
		String result=BlackJack.play(21, 20);
		assertEquals("Dealer",result);
	}
	
	@Test
	public void noOneExceedsPlayerWin() {
		String result=BlackJack.play(20, 21);
		assertEquals("Player",result);
	}
	@AfterEach
	public void after() {
		System.out.println("after");
	}
	
	@AfterAll
	public static void afterAll() {
		System.out.println("after all");
	}
	
	
}
