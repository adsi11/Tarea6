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
public class Main {
    public static void main(String[] args) {
        ListaRating lista = new ProxyLista("Rating Enero 2019");
        lista.load();
        lista.load();
    }
}
