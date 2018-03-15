package abstractFactory;

/**
 *
 * @author lpenaf
 */
public class FidePlayer extends Player {

	public FidePlayer(String name, String title, int rating) {
		super(name, title, rating);
	}

	@Override
	public void computeRating(int opponentRating, double result, int k) {
		int newRating = (int) (this.getRating() + Math.abs(this.getRating() - opponentRating * result) / k + 1);
		this.setRating(Math.min(Math.max(2000, newRating), 2950));
	}
}