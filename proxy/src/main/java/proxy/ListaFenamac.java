package proxy;

/**
 *
 * @author LPENAF
 */
public class ListaFenamac implements ListaRating{
    private final String listaActual;
    
    public ListaFenamac(String lista){
        this.listaActual = lista;
        loadLocally(lista);
    }

    public void load() {
        System.out.println(this.listaActual + " loaded from PC. Previously downloaded from FENAMAC's website.");
    }

    private void loadLocally(String lista) {
        System.out.println("Downloading list " + lista + " from FENAMAC's website.");
    }
}
