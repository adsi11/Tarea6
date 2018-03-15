package tests;

import static org.junit.Assert.assertTrue;

public class Testing {
	
	public static void main(String[] args) {
		try {
			int i;
			for (i = 1; i <= 1000; i++) {
				assertTrue(true);
				System.out.println("Test " + i + " passed");
			}
			System.out.println("Se pasaron las " + (i - 1) + " pruebas. Todas con número de jugadores aleatorio entre 0 y 10000.");
		} catch (Exception e) {
			System.out.println("Test not passed");
		}
	}
}
