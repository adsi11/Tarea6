package memento;

import java.util.ArrayList;

/**
 *
 * @author Fernando Peña
 */
public class Caretaker {
    private ArrayList<Memento> mementos = new ArrayList<Memento>();
    
    public void addMemento(Memento memento){
        this.mementos.add(memento);
    }
    
    public Memento getMemento(int index){
        return this.mementos.get(index);
    }
}
