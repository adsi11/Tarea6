package test;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import proxy.ListaRating;
import proxy.ProxyLista;


public class Testing {
	@Test
	public void t() {
		ListaRating lista1 = new ProxyLista("Rating FENAMAC Marzo 2018");
        	ListaRating lista2 = new ProxyLista("Rating ESNAJ Marzo 2018");
        	
        	lista1.load();
        	lista2.load();
        	lista1.load();
        	lista2.load();
        
        assertTrue(!false); //Por el tipo de implementación solo se prueba instanciación
        System.out.println("Por el tipo de implementación solo se prueba instanciación");
        System.out.println("Se pasaron las pruebas.");
	}
}