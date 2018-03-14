package factory;

/**
 *
 * @author lpenaf
 */
public class FidePlayer extends Player{

    public FidePlayer(String name, String type, int rating) {
        super(name, type, rating);
    }

    @Override
    public void computeRating(int opponentRating, int result, int k) {
        int newRating = this.getRating() + Math.abs(this.getRating() - opponentRating * result) / k + 1;
        this.setRating(newRating);
    }
}