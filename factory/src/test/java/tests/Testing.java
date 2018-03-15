package tests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import factory.Player;
import factory.PlayerFactory;

public class Testing {
	@Test
	public void t() {
		PlayerFactory players = new PlayerFactory();
		Player uno, dos, tres;
		uno = players.newPlayer("Club", "Ernestina", "None", 1587);
		dos = players.newPlayer("National", "Miguel", "CM", 1975);
		tres = players.newPlayer("International", "Froylan", "GM", 2589);
		
		uno.computeRating(1800, 1, 5);
		dos.computeRating(1800, 0.5, 20);
		tres.computeRating(1800, 0, 40);
		assertTrue(uno.getRating() == 1630);
		assertTrue(dos.getRating() == 2250);
		assertTrue(tres.getRating() == 2654);
		System.out.println("Se pasaron las pruebas.");
	}
}
