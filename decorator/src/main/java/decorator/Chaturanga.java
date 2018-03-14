package decorator;

/**
*
* @author lpenaf
*/
public class Chaturanga extends Decorator{
    
    public Chaturanga(Juego juego) {
        super(juego);
    }
    
    @Override
    public int getNumPlayers() {
        return 4;
    }

    @Override
    public String getDescription() {
        return this.juego.getDescription() + " Se alternan por turnos. Nada evita alianzas momentaneas entre jugadores ;).";
    }
    
}
