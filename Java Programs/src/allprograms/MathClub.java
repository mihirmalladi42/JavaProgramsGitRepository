package allprograms;

public class MathClub {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 10000; i < 100000 && i >= 10000; i++) {
			String strI = Integer.toString(i);
			if ((int)strI.charAt(0) >= (int)strI.charAt(1) &&
				(int)strI.charAt(1) >= (int)strI.charAt(2) &&
				(int)strI.charAt(2) >= (int)strI.charAt(3) &&
				(int)strI.charAt(3) >= (int)strI.charAt(4)) {
				count++;
				System.out.println(i);
			}
		}
		System.out.println("Count: " + count);
	}
}
