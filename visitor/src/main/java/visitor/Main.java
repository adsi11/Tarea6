package visitor;

import java.util.ArrayList;

/**
*
* @author Fernando Peña
*/
public class Main {
	public static void main(String[] args) {
		System.out.println("=====================Inicio del Main=======================");
		VisitorCategoria vc = new VisitorCategoria();
        ArrayList<Categoria> c = new ArrayList<>();
        
        System.out.println("=====================Las categorias del torneo son las siguientes:=======================");
        c.add(new Categoria(10, 0, 1, 30));
        c.add(new Categoria(20, 0, 2, 50));
        c.add(new Categoria(53, 1, 1, 250));
        c.add(new Categoria(108, 3, 0, 200));
        c.add(new Categoria(34, 2, 0, 17));
        c.add(new Categoria(8, 0, 0, 10));
        c.add(new Categoria(19, 8, 0, 1700));
        c.add(new Categoria(67, 9, 1, 2000));
        c.add(new Categoria(10, 4, 0, 10));
        c.add(new Categoria(19, 1, 0, 15));
		
		for (Categoria categoria : c) {
			categoria.print();
			categoria.accept(vc);
		}
		
		System.out.println("=====================Premiación=======================");
		System.out.println("Dadas las características de todas las categorías");
		System.out.println("el organizador debe garantizar una premiación de " + vc.getTotalPremio() + " pesos.");
		System.out.println("=====================Fin del Main=======================");
	}
}
