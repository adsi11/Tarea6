package abstractFactory;

/**
 *
 * @author lpenaf
 */
public class Factory {
	public static ChessFactory getFactory(String type) {
		if(type.equals("Player"))
			return new PlayerFactory();
		else if(type.equals("Arbiter"))
			return new ArbiterFactory();
		else return null;
	}
}
