package abstractFactory;

/**
 *
 * @author lpenaf
 */
public class Main {

	public static void main(String[] args) {
		ChessFactory players = Factory.getFactory("Player");
		ChessFactory arbiters = Factory.getFactory("Arbiter");
		Player uno, dos, tres;
		Arbiter a1;

		uno = players.newPlayer("Club", "Fernando", "None", 1587);
		dos = players.newPlayer("National", "Mauricio", "CM", 1587);
		tres = players.newPlayer("International", "Lety", "GM", 1587);
		a1 = arbiters.newArbiter("National", "Fernando", "AO");

		uno.print();
		dos.print();
		tres.print();
		a1.print();
		System.out.println(a1.isAuthorizedToReport());

		uno.computeRating(1200, 1, 40);
		dos.computeRating(1200, 1, 40);
		tres.computeRating(1200, 1, 40);

		uno.print();
		dos.print();
		tres.print();
	}

}
