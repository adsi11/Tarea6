package visitor;

/**
 *
 * @author Fernando Peña
 */
public class Categoria implements Visitable{
    private final int numParticipantes;
    private final int numGMs;
    private final int numCampeonesAnteriores;
    private final double montoInscripcion;

    public Categoria(int numParticipantes, int numGMs, int numCampeonesAnteriores, double montoInscripcion) {
        this.numParticipantes = numParticipantes;
        this.numGMs = numGMs;
        this.numCampeonesAnteriores = numCampeonesAnteriores;
        this.montoInscripcion = montoInscripcion;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    
    public int getNumParticipantes() {
        return numParticipantes;
    }

    public int getNumGMs() {
        return numGMs;
    }

    public int getNumCampeonesAnteriores() {
        return numCampeonesAnteriores;
    }

    public double getMontoInscripcion() {
        return montoInscripcion;
    }
}