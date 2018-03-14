package factory;

/**
 *
 * @author lpenaf
 */
public class NationalPlayer extends Player{

    public NationalPlayer(String name, String type, int rating) {
        super(name, type, rating);
    }

    @Override
    public void computeRating(int opponentRating, int result, int k) {
        int newRating = this.getRating() + Math.abs((this.getRating() * result) - (opponentRating / k));
        this.setRating(newRating);
    }   
}