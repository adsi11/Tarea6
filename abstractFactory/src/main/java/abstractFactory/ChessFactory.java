package abstractFactory;

/**
 *
 * @author lpenaf
 */
public abstract class ChessFactory {
	abstract Arbiter newArbiter(String type, String name, String title);

	abstract Player newPlayer(String type, String name, String title, int rating);
}
