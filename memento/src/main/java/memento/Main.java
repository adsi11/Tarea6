package memento;

/**
*
* @author Fernando Peña
*/
public class Main {
	public static void main(String[] args) {
		System.out.println("=====================Inicio del Main=======================");
		Caretaker caretaker = new Caretaker();
        Originator originator = new Originator();
        System.out.println("=====================Torneo de ajedrez a 5 rondas=======================");
        System.out.println("=====================Inicia el torneo=======================");
        System.out.println("");
        
        System.out.println("======Se crea la ronda 1=====");
        originator.setRonda("Ronda 1");
        caretaker.addMemento(originator.guarda());
        System.out.println("Nos encontramos en la ronda " + originator.getRonda());
        
        System.out.println("=====Se crea la ronda 2=====");
        originator.setRonda("Ronda 2");
        caretaker.addMemento(originator.guarda());
        System.out.println("Nos encontramos en la ronda " + originator.getRonda());
        
        System.out.println("======Se crea la ronda 3=====");
        originator.setRonda("Ronda 3");
        caretaker.addMemento(originator.guarda());
        System.out.println("Nos encontramos en la ronda " + originator.getRonda());
        
        System.out.println("");
        System.out.println("=====Llegó un jugador nuevo, hay que poner 1/2 puntos en ronda 1 y 2=====");
        System.out.println("");
        System.out.println("=====Regresamos a la ronda 1 para ponerle 1/2 punto=====");

        originator.restaura(caretaker.getMemento(0));
        System.out.println("Nos encontramos en la ronda " + originator.getRonda());
        System.out.println("=====Regresamos a la ronda 2 para ponerle 1/2 punto=====");
        originator.restaura(caretaker.getMemento(1));
        System.out.println("Nos encontramos en la ronda " + originator.getRonda());
        
        System.out.println("=====Regresamos a la ronda 3 para hacer la ronda 4=====");
        originator.restaura(caretaker.getMemento(2));
        System.out.println("Nos encontramos en la ronda " + originator.getRonda());
        
        System.out.println("");
        System.out.println("======Se crea la ronda 4=====");
        originator.setRonda("Ronda 4");
        caretaker.addMemento(originator.guarda());
        System.out.println("Nos encontramos en la ronda " + originator.getRonda());
        
        System.out.println("======Se crea la ronda 5=====");
        originator.setRonda("Ronda 5");
        caretaker.addMemento(originator.guarda());
        System.out.println("Nos encontramos en la ronda " + originator.getRonda());
        
        System.out.println("");
        System.out.println("=====Upsss!! El árbitro se equivocó en un resultado de la ronda 3=====");
        System.out.println("");
        System.out.println("=====Regresamos a la ronda 3 para corregirlo=====");

        originator.restaura(caretaker.getMemento(2));
        System.out.println("Nos encontramos en la ronda " + originator.getRonda());
        System.out.println("=====Regresamos a la ronda 5 para terminar el torneo=====");
        originator.restaura(caretaker.getMemento(4));
        System.out.println("Nos encontramos en la ronda " + originator.getRonda());

        System.out.println("=====================Termina el torneo=======================");
        System.out.println("=====================Fin del Main=======================");
    }
}
