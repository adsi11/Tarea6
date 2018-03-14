package decorator;

/**
 *
 * @author lpenaf
 */
public class Decorator implements Juego{
    protected Juego juego;

    public Decorator(Juego juego) {
        this.juego = juego;
    }
    
    public int getNumPlayers() {
        return this.juego.getNumPlayers();
    }

    public String getDescription() {
        return this.juego.getDescription();
    }

    public void print() {
        System.out.println(this.getDescription());
    }
}