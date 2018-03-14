package adapter;

/**
*
* @author lpenaf
*/
public class SwissTournament implements SwissManager{
    
    public void createSwiss(String type, int rounds) {
        System.out.println(type + " tournament with " + rounds + " rounds.");
    }

    public void createRoundRobin(String type, int players) {
        
    }
}
