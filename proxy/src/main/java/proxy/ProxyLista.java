package proxy;

/**
 *
 * @author LPENAF
 */
public class ProxyLista implements ListaRating{
    private final String listaActual;
    private ListaFenamac listaFenamac;
    
    public ProxyLista(String lista){
        this.listaActual = lista;
    }
    
    public void load() {
        if(this.listaFenamac == null)
            this.listaFenamac = new ListaFenamac(this.listaActual);
        this.listaFenamac.load();
    }
    
}
