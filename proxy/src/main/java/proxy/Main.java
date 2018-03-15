package proxy;

/**
 *
 * @author LPENAF
 */
public class Main {
    public static void main(String[] args) {
    		System.out.println("=====================Inicio del Main=======================");
		System.out.println("=====================Se crean las listas=======================");
        ListaRating lista1 = new ProxyLista("Rating FENAMAC Marzo 2018");
        ListaRating lista2 = new ProxyLista("Rating ESNAJ Marzo 2018");
        ListaRating lista3 = new ProxyLista("Rating FIDE Blitz Febrero 2017");
        ListaRating lista4 = new ProxyLista("Rating FIDE Standar Marzo 2018");
        
        System.out.println("\n=====Se quiere usar lista 1=====");
        lista1.load();
        System.out.println("\n=====Se quiere usar lista 2=====");
        lista2.load();
        System.out.println("\n=====Se volver quiere usar lista 1=====");
        lista1.load();
        System.out.println("\n=====Se quiere usar lista 3=====");
        lista3.load();
        System.out.println("\n=====Se volver quiere usar lista 2=====");
        lista2.load();
        System.out.println("\n=====Se quiere usar lista 4=====");
        lista4.load();
        System.out.println("\n=====Se volver quiere usar lista 3=====");
        lista3.load();
        System.out.println("\n=====Se volver quiere usar lista 4=====");
        lista4.load();
        System.out.println("\n=====================Fin del Main=======================");
    }
}
