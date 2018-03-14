package decorator;

/**
*
* @author lpenaf
*/
public class Main {
    public static void main(String[] args) {
        Juego juego = new Competitivo(new TemplateJuego());
        juego.print();
        
        Juego juego2 = new Competitivo(new TresJaques(new TemplateJuego()));
        juego2.print();
        
        Juego juego3 = new TresJaques(new Chaturanga(new TemplateJuego()));
        juego3.print();
    }
}
