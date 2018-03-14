package memento;

/**
 *
 * @author Fernando Peña
 */
public class Originator {
    private String ronda;
    
    public void setRonda(String ronda){
        this.ronda = ronda;
    }
    
    public Memento guarda(){
        return new Memento(ronda);
    }
    
    public void restaura(Memento memento){
        ronda = memento.getRonda();
    }
}
