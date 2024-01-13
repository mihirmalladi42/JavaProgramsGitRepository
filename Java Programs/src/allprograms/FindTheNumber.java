package allprograms;
import java.util.Scanner;
public class FindTheNumber {
	public static void game() {
		int num = (int)(Math.random() * 100 + 1);
		int guess = 0;
		int count = 1;
		Scanner s = new Scanner(System.in);
		while (count <= 9) {
			if (count <= 8) {
				System.out.println("Enter a number (1-100): ");
				guess = s.nextInt();
				if (guess > num) {
					System.out.println("The number I chose is less than your guess.");
					count++;
				} else if (guess < num) {
					System.out.println("The number I chose is greater than your guess.");
					count++;
				} if (guess == num) {
					System.out.println("Correct! It took you " + count + " guess/guesses.");
					boolean play = playAgain();
					if (play) {
						game();
					} else {
						System.out.println("Thank you for playing!");
					}
					break;
				}
			} else {
				System.out.println("You ran out of guesses.");
				boolean play = playAgain();
				if (play) {
					game();
				} else {
					System.out.println("Thank you for playing!");
				}
				break;
			}
		}
		s.close();
	}
	public static boolean playAgain() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Do you want to play again? (Yes or no)");
		String again = scan.nextLine();
		if (again.equalsIgnoreCase("no")) {
			return false;
		} else if (again.equalsIgnoreCase("yes")) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		game();
	}
}
