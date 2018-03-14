package proxy;

/**
 *
 * @author LPENAF
 */
public class Main {
    public static void main(String[] args) {
        ListaRating lista = new ProxyLista("Rating Enero 2019");
        lista.load();
        lista.load();
    }
}
