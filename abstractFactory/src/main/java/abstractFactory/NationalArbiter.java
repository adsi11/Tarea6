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
