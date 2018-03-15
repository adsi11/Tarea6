package tests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import abstractFactory.Arbiter;
import abstractFactory.ChessFactory;
import abstractFactory.Factory;
import abstractFactory.Player;

public class Testing {
	@Test
	public void t() {
		ChessFactory players = Factory.getFactory("Player");
		ChessFactory arbiters = Factory.getFactory("Arbiter");
		Player uno, dos, tres;
		Arbiter a1, a2;
		a1 = arbiters.newArbiter("National", "Mara", "AO");
		a2 = arbiters.newArbiter("International", "Dona", "IA");
		uno = players.newPlayer("Club", "Ernestina", "None", 1587);
		dos = players.newPlayer("National", "Miguel", "CM", 1975);
		tres = players.newPlayer("International", "Froylan", "GM", 2589);
		
		assertTrue(!a1.isAuthorizedToReport());
		assertTrue(a2.isAuthorizedToReport());
		uno.computeRating(1800, 1, 5);
		dos.computeRating(1800, 0.5, 20);
		tres.computeRating(1800, 0, 40);
		assertTrue(uno.getRating() == 1630);
		assertTrue(dos.getRating() == 2250);
		assertTrue(tres.getRating() == 2654);
		System.out.println("Se pasaron las pruebas.");
	}
}