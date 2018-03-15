package factory;

/**
 *
 * @author lpenaf
 */
public class NationalPlayer extends Player {

	public NationalPlayer(String name, String title, int rating) {
		super(name, title, rating);
	}

	@Override
	public void computeRating(int opponentRating, double result, int k) {
		int newRating = (int) (this.getRating() + Math.abs((this.getRating() * result) - (opponentRating / k)));
		this.setRating(Math.min(Math.max(1000, newRating), 2250));
	}
}