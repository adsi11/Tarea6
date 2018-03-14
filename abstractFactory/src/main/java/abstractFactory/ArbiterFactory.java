package abstractFactory;

/**
 *
 * @author lpenaf
 */
public class ArbiterFactory extends ChessFactory {
	public Arbiter newArbiter(String type, String name, String title) {
		if(type.equals("National"))
			return new NationalArbiter(name, title);
		else if(type.equals("International"))
			return new InternationalArbiter(name, title);
		else return null;
	}

	@Override
	public Player newPlayer(String type, String name, String title, int rating) {
		return null;
	}
}