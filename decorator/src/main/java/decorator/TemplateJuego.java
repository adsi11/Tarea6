package decorator;

/**
*
* @author lpenaf
*/
public class TemplateJuego implements Juego{

    public int getNumPlayers() {
        return 2;
    }

    public String getDescription() {
        return "Juego de " + this.getNumPlayers() + " jugadores. " + "Se juega con el tablero y las piezas del ajedrez.";
    }
    
    public void print(){
        System.out.println(this.getDescription());
    }
}
