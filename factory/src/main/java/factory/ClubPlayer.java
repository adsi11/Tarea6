package factory;

/**
 *
 * @author lpenaf
 */
public class ClubPlayer extends Player {

	public ClubPlayer(String name, String title, int rating) {
		super(name, title, rating);
	}

	@Override
	public void computeRating(int opponentRating, double result, int k) {
		int newRating = this.getRating() + Math.abs(this.getRating() - opponentRating) / k + 1;
		this.setRating(Math.min(Math.max(500, newRating), 2000));
	}
}
