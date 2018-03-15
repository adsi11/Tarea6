package decorator;

/**
*
* @author lpenaf
*/
public class Main {
    public static void main(String[] args) {
    		System.out.println("=====================Inicio del Main=======================");
    		System.out.println("=====================Se crean los juegos=======================");
        Juego juego = new Competitivo(new TemplateJuego());
        Juego juego2 = new Competitivo(new TresJaques(new TemplateJuego()));
        Juego juego3 = new TresJaques(new Chaturanga(new TemplateJuego()));
        Juego juego4= new TresJaques(new Chaturanga(new Competitivo(new TemplateJuego())));
        System.out.println("=====================Se imprime la información de los juegos=======================");
        System.out.println("=====Juego 1=====");
        juego.print();
        System.out.println("=====Juego 2=====");
        juego2.print();
        System.out.println("=====Juego 3=====");
        juego3.print();
        System.out.println("=====Juego 4=====");
        juego4.print();
        System.out.println("=====================Fin del Main=======================");
    }
}
