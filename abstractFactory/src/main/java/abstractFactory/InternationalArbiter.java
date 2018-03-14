package abstractFactory;

/**
 *
 * @author lpenaf
 */
public class InternationalArbiter extends Arbiter {

	public InternationalArbiter(String name, String title) {
		super(name, title);
	}

	@Override
	public boolean isAuthorizedToReport() {
		return true;
	}

}
