package memento;

/**
 *
 * @author Fernando Peña
 */
public class Memento {
    private String ronda;
    
    public Memento(String ronda){
        this.ronda = ronda;
    }
    
    public String getRonda(){
        return this.ronda;
    }
}
