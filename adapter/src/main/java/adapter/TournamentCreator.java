package adapter;

/**
*
* @author lpenaf
*/
public class TournamentCreator implements SwissMaster{
    private TournamentAdapter adapter;
    
    public void createTournament(String type, int num) {
    		if(type.equals("Teams"))
    			System.out.println(type + " tournament with " + num + " teams.");
    		else if (type.equals("Round Robin") || type.equals("Swiss")) {
    			adapter = new TournamentAdapter(type);
    			adapter.createTournament(type, num);
    		} else
    			System.out.println("No valid type. " + type + " not recognized.");
    }
}