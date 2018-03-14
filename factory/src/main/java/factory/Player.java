package factory;

/**
 *
 * @author lpenaf
 */
public abstract class Player {
    private String name;
    private String title;
    private int rating;

    public Player(String name, String title, int rating) {
        this.name = name;
        this.title = title;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }
    
    public String getTitle() {
        return title;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "ChessPlayer{" + "name=" + name + ", title=" + title + ", rating=" + rating + '}';
    }
    
    public void print(){
        System.out.println(this.toString());
    }

    public abstract void computeRating(int opponentRating, int result, int k);
}
