package abstractFactory;

/**
 *
 * @author lpenaf
 */
public abstract class ChessFactory {
	public abstract Arbiter newArbiter(String type, String name, String title);

	public abstract Player newPlayer(String type, String name, String title, int rating);
}
