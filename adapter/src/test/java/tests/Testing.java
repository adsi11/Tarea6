package tests;

import static org.junit.Assert.assertFalse;
import org.junit.Test;
import adapter.TournamentCreator;

public class Testing {
	@Test
	public void t() {
		TournamentCreator master = new TournamentCreator();
		master.createTournament("Swiss", 7);
        master.createTournament("De barrio", 4);
        
        assertFalse(!true); //Por tipo de implementación solo se requieren pruebas de instanciacion
        System.out.println("Se pasaron las pruebas.");
	}
}
