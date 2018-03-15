package test;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

import visitor.Categoria;
import visitor.VisitorCategoria;

public class Testing {
	@Test
	public void t() {
		VisitorCategoria vc1 = new VisitorCategoria();
		VisitorCategoria vc2 = new VisitorCategoria();
		VisitorCategoria vc3 = new VisitorCategoria();
		VisitorCategoria vc4 = new VisitorCategoria();
        Categoria c1 = new Categoria(10, 0, 1, 30);
        Categoria c2 = new Categoria(20, 0, 2, 50);
        Categoria c3 = new Categoria(108, 3, 6, 150);
        Categoria c4 = new Categoria(34, 2, 0, 17);
        
        c1.accept(vc1);
        assertTrue(vc1.getTotalPremio() == 120);
        c2.accept(vc2);
        assertTrue(vc2.getTotalPremio() == 400);
        c3.accept(vc3);
        assertTrue(vc3.getTotalPremio() == 9809.999999999998);
        c4.accept(vc4);
        assertTrue(vc4.getTotalPremio() == 317.90000000000003);
        System.out.println("Se pasaron las pruebas.");
	}
}
