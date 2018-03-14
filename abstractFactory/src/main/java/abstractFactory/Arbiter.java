package abstractFactory;

/**
 *
 * @author lpenaf
 */
public abstract class Arbiter {
	private String name;
	private String title;

	public Arbiter(String name, String title) {
		this.name = name;
		this.title = title;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Arbiter{" + "name=" + name + ", title=" + title + '}';
	}

	public void print() {
		System.out.println(this.toString());
	}

	public abstract boolean isAuthorizedToReport();
}
