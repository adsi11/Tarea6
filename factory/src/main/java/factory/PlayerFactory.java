package factory;

/**
 *
 * @author lpenaf
 */
public class PlayerFactory {
    public Player newPlayer(String type, String name, String title, int rating){
    		if(type.equals("Club"))
    			return new ClubPlayer(name, title, rating);
    		else if(type.equals("National"))
    			return new NationalPlayer(name, title, rating);
    		else if(type.equals("International"))
    			return new FidePlayer(name, title, rating);
    		else
    			return null;
    }
}