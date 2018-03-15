package testing;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import decorator.Chaturanga;
import decorator.Competitivo;
import decorator.Juego;
import decorator.TemplateJuego;
import decorator.TresJaques;

public class Testing {
	@Test
	public void t() {
		Juego juego = new Competitivo(new TemplateJuego());
        Juego juego2 = new Competitivo(new TresJaques(new TemplateJuego()));
        Juego juego3 = new TresJaques(new Chaturanga(new TemplateJuego()));
        
        assertTrue(juego.getDescription().equals("Juego de 2 jugadores. Se juega con el tablero y las piezas del ajedrez. Se juegan con las leyes vigentes establecidas por la FIDE."));
        assertTrue(juego2.getDescription().equals("Juego de 2 jugadores. Se juega con el tablero y las piezas del ajedrez. Gana el jugador que da tres jaques a su rival. Se juegan con las leyes vigentes establecidas por la FIDE."));
        assertTrue(juego3.getDescription().equals("Juego de 2 jugadores. Se juega con el tablero y las piezas del ajedrez. Se alternan por turnos. Nada evita alianzas momentaneas entre jugadores ;). Gana el jugador que da tres jaques a su rival."));
        assertFalse(juego.getDescription().equals("Si metes un gol más que el contrario ganas."));
        assertFalse(juego2.getDescription().equals("No hay descripción."));
        System.out.println("Se pasaron las pruebas.");
	}
}
