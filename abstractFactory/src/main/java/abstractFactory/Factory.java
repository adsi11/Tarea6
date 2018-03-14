/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractFactory;

/**
 *
 * @author lpenaf
 */
public class Factory {
	public static ChessFactory getFactory(String type) {
		if(type.equals("Player"))
			return new PlayerFactory();
		else if(type.equals("Arbiter"))
			return new ArbiterFactory();
		else return null;
	}
}
