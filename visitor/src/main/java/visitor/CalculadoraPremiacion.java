package visitor;

import java.util.ArrayList;

/**
 *
 * @author Fernando Peña
 */
public class CalculadoraPremiacion {
    private ArrayList<Visitable> categorias;
    
    public double getPremiacionTotal(){
        VisitorCategoria vc = new VisitorCategoria();
        
        for (Visitable cat : categorias) {
            cat.accept(vc);
        }
        return vc.getTotalPremio();
    }
}
