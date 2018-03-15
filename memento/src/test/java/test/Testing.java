package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import memento.Caretaker;
import memento.Originator;


public class Testing {
	@Test
	public void t() {
		Caretaker caretaker = new Caretaker();
        Originator originator = new Originator();
        
        originator.setRonda("Ronda 1");
        caretaker.addMemento(originator.guarda());
        assertTrue(originator.getRonda().equals("Ronda 1"));
        
        originator.setRonda("Ronda 2");
        caretaker.addMemento(originator.guarda());
        assertTrue(originator.getRonda().equals("Ronda 2"));
        
        originator.setRonda("Ronda 3");
        caretaker.addMemento(originator.guarda());
        assertTrue(originator.getRonda().equals("Ronda 3"));
        
        originator.restaura(caretaker.getMemento(0));
        assertTrue(originator.getRonda().equals("Ronda 1"));
        assertFalse(originator.getRonda().equals("Ronda 2"));
        assertFalse(originator.getRonda().equals("Ronda 3"));

        System.out.println("Se pasaron las pruebas.");
	}
}
