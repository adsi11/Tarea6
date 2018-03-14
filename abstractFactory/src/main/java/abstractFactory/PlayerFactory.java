package abstractFactory;

/**
 *
 * @author lpenaf
 */
public class PlayerFactory extends ChessFactory {
	public Player newPlayer(String type, String name, String title, int rating) {
		if(type.equals("Club"))
			return new ClubPlayer(name, title, rating);
		else if(type.equals("National"))
			return new NationalPlayer(name, title, rating);
		else if(type.equals("International"))
			return new FidePlayer(name, title, rating);
		else
			return null;
	}

	@Override
	public Arbiter newArbiter(String type, String name, String title) {
		return null;
	}
}