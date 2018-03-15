package adapter;

/**
*
* @author lpenaf
*/
public class Main {
    public static void main(String[] args) {
    		System.out.println("=====================Inicio del Main=======================");
    		System.out.println("=====================Se crean los torneos=======================");
    		TournamentCreator master = new TournamentCreator();
        master.createTournament("Teams", 4);
        master.createTournament("Wimbledon", 32);
        master.createTournament("Round Robin", 9);
        master.createTournament("Double Round Robin", 8);
        master.createTournament("Swiss", 58);
        System.out.println("=====================Fin del Main=======================");
    }
}
