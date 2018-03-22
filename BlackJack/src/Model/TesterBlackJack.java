package Model;

import static org.junit.Assert.*;

import org.junit.Test;

import Model.BlackJack;

public class TesterBlackJack {

	@Test
	public void testBlackJack() {
		
		BlackJack testing = new BlackJack();
	
		assertEquals(21,testing.blackJack(19,21));
	}
	

	}