package visitor;
/**
 *
 * @author Fernando Peña
 */
public interface Visitable {
    void accept(Visitor visitor);
}
