package lambdastest;

public class Main {
	public static void main(String[] args) {
		MinecraftSub mS = new MinecraftSub();
		printMainInfo(mS);
		CODSub cS = new CODSub();
		cS.printDevelopers();
	}
	static void printMainInfo(MainInterface mI) {
		mI.printAll();
	}
}
