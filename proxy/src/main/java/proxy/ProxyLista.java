/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
