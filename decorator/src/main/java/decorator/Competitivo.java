package decorator;

/**
*
* @author lpenaf
*/
public class Competitivo extends Decorator{
    
    public Competitivo(Juego juego) {
        super(juego);
    }
    
    @Override
    public int getNumPlayers() {
        return super.juego.getNumPlayers();
    }

    @Override
    public String getDescription() {
        return super.juego.getDescription() + " Se juegan con las leyes vigentes establecidas por la FIDE.";
    }   
}