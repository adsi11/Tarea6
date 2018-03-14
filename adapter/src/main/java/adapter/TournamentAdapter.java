package adapter;

/**
*
* @author lpenaf
*/
public class TournamentAdapter implements SwissMaster{
    private SwissManager manager;
    
    public TournamentAdapter(String tournamentType){
    		if(tournamentType.equals("Swiss"))
    			manager = new SwissTournament();
    		else if(tournamentType.equals("Round Robin"))
    			manager = new RRTournament();
    }
    
    public void createTournament(String type, int num) {
    		if(type.equals("Swiss"))
    			manager.createSwiss(type, num);
		else if(type.equals("Round Robin"))
			manager.createRoundRobin(type, num);
		else
			System.out.println("No type of tournament.");
    }
}