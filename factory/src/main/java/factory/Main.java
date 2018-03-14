package factory;

/**
 *
 * @author lpenaf
 */
public class Main {
    public static void main(String[] args) {
        PlayerFactory factory = new PlayerFactory();
        Player uno, dos, tres;
        
        uno = factory.newPlayer("Club", "Fernando", "None", 1587);
        dos = factory.newPlayer("National", "Mauricio", "CM", 1587);
        tres = factory.newPlayer("International", "Lety", "GM", 1587);
        
        uno.print();
        dos.print();
        tres.print();
        
        uno.computeRating(1200, 1, 40);
        dos.computeRating(1200, 1, 40);
        tres.computeRating(1200, 1, 40);
        
        uno.print();
        dos.print();
        tres.print();
    }
}
