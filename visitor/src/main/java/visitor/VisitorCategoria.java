package visitor;

/**
 *
 * @author Fernando Peña
 */
public class VisitorCategoria implements Visitor{
    private double totalPremio;

    public double getTotalPremio() {
        return totalPremio;
    }

    public void visit(Categoria categoria) {
        int numPart = categoria.getNumParticipantes();
        int numGMs = categoria.getNumGMs();
        int numCampAnt = categoria.getNumCampeonesAnteriores();
        double monto = categoria.getMontoInscripcion();
        
        if(numPart < 30){
            this.totalPremio += numPart * monto * 0.4;
        } else if(numGMs > 11){
            this.totalPremio += monto * (numPart + numGMs) * 0.75;
        } else if(numCampAnt > 5){
            this.totalPremio += monto * (numPart * 0.6 + numCampAnt * 0.1);
        } else {
            this.totalPremio += monto * numPart * 0.55;
        }
    }
}