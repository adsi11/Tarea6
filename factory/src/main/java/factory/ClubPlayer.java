package factory;

/**
 *
 * @author lpenaf
 */
public class ClubPlayer extends Player{

    public ClubPlayer(String name, String type, int rating) {
        super(name, type, rating);
    }

    @Override
    public void computeRating(int opponentRating, int result, int k) {
        int newRating = this.getRating() + Math.abs(this.getRating() - opponentRating) / k + 1;
        this.setRating(newRating);
    }
}
