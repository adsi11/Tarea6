package abstractFactory;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author lpenaf
 */
public class Main {

	public static void main(String[] args) {
		System.out.println("=====================Inicio del Main=======================");
		ChessFactory players = Factory.getFactory("Player");
		ChessFactory arbiters = Factory.getFactory("Arbiter");
		Player j1, j2, j3;
		Arbiter a1, a2;
		System.out.println("=====================Se crean los jugadores y árbitros=======================");
		j1 = players.newPlayer("Club", "Fernando", "None", 0);
		j2 = players.newPlayer("National", "Mauricio", "CM", 0);
		j3 = players.newPlayer("International", "Lety", "GM", 0);
		a1 = arbiters.newArbiter("National", "Ernesto", "AO");
		a2 = arbiters.newArbiter("International", "Rosa", "FA");
		
		System.out.println("=====================Impresión de la información=======================");
		j1.print();
		j2.print();
		j3.print();
		a1.print();
		a2.print();
		System.out.println("Is " + a1.getName() + " authorized"
				+ " to report to FIDE ? -> " + a1.isAuthorizedToReport());
		System.out.println("Is " + a2.getName() + " authorized"
				+ " to report to FIDE ? -> " + a2.isAuthorizedToReport());

		System.out.println("=====================Se calculan diversos cambios en rating=======================");
		
		System.out.println("=====================Se imprime la información después de cada cambio=======================");
		
		for (int i = 1; i <= 10; i++) {
			int opRating = ThreadLocalRandom.current().nextInt(1000, 2850);
			
			j1.computeRating(opRating, 1, 5);
			j2.computeRating(opRating, 0.5, 20);
			j3.computeRating(opRating, 0, 40);
			System.out.println("=======" + "cambio de rating: " + i + "======");

			j1.print();
			j2.print();
			j3.print();
			System.out.println();
		}
		
		System.out.println("=====================Fin del Main=======================");
	}

}
