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
public class NationalArbiter extends Arbiter {

	public NationalArbiter(String name, String title) {
		super(name, title);
	}

	@Override
	public boolean isAuthorizedToReport() {
		return false;
	}

}
