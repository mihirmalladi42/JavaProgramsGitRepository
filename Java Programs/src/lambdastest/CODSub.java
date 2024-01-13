package lambdastest;

public class CODSub implements MainInterface {
	public static void main(String[] args) {

	}

	@Override
	public void printTitle() {
		System.out.println("Call of Duty");
	}

	@Override
	public void printDevelopers() {
		System.out.println("Activision");
	}

	@Override
	public void printFunction() {
		System.out.println("Fighting against other players and survive the longest.");
	}
	public void printAll() {
		System.out.println("Minecraft");
		System.out.println("Mojang");
		System.out.println("Sandbox game where you can do whatever you want in a world.");
	}
}
