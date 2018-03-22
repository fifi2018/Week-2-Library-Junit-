package Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import Model.BlackJack;

public class TesterBlackJack {

	@Test
	public void testBlackJack() {
		
		BlackJack testing = new BlackJack(); //Creating a class object and naming 'testing'
	
		assertEquals(21,testing.blackJack(19,21)); //Calling a method
		
	}

	}
	

	