package decorator;

/**
*
* @author lpenaf
*/
public class TresJaques extends Decorator{
    
    public TresJaques(Juego juego) {
        super(juego);
    }
    
    @Override
    public int getNumPlayers() {
        return super.juego.getNumPlayers();
    }

    @Override
    public String getDescription() {
        return super.juego.getDescription() + " Gana el jugador que da tres jaques a su rival.";
    }
    
}
