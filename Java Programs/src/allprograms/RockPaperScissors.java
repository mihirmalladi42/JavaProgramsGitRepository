package allprograms;
import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors {
	public static void play(int playerScore, int compScore) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter rock, paper, or scissors: ");
		String res = scan.nextLine();
		Random random = new Random();
		int rand = random.nextInt(3);
		String compRes = "";
		if (rand == 0) {
			compRes = "rock";
		} else if (rand == 1) {
			compRes = "paper";
		} else if (rand == 2) {
			compRes = "scissors";
		}
		int thisPlayer = playerScore;
		int thisComp = compScore;
		System.out.println("The computer's choice was: " + compRes + ".");
		if (res.equals(compRes)) {
			System.out.println("Draw!");
			System.out.println("Player 1 Score: " + thisPlayer);
			System.out.println("Computer Score: " + thisComp);
		}
		if (res.equals("rock") && compRes.equals("paper")) {
			System.out.println("Lose!");
			thisComp++;
			System.out.println("Player 1 Score: " + thisPlayer);
			System.out.println("Computer Score: " + thisComp);
		} else if (res.equals("rock") && compRes.equals("scissors")) {
			System.out.println("Win!");
			thisPlayer++;
			System.out.println("Player 1 Score: " + thisPlayer);
			System.out.println("Computer Score: " + thisComp);
		} 
		
		if (res.equals("paper") && compRes.equals("rock")) {
			System.out.println("Win!");
			thisPlayer++;
			System.out.println("Player 1 Score: " + thisPlayer);
			System.out.println("Computer Score: " + thisComp);
		} else if (res.equals("paper") && compRes.equals("scissors")) {
			System.out.println("Lose!");
			thisComp++;
			System.out.println("Player 1 Score: " + thisPlayer);
			System.out.println("Computer Score: " + thisComp);
		}
		
		if (res.equals("scissors") && compRes.equals("rock")) {
			System.out.println("Lose!");
			thisComp++;
			System.out.println("Player 1 Score: " + thisPlayer);
			System.out.println("Computer Score: " + thisComp);
		} else if (res.equals("scissors") && compRes.equals("paper")) {
			System.out.println("Win!");
			thisPlayer++;
			System.out.println("Player 1 Score: " + thisPlayer);
			System.out.println("Computer Score: " + thisComp);
		}
		Scanner playAgain = new Scanner(System.in);
		System.out.println("Do you want to play again? Enter yes or no: ");
		String yesorno = playAgain.nextLine();
		if (yesorno.equals("yes")) {
			play(thisPlayer, thisComp);
		} else {
			System.out.println("Thank you for playing.");
		}
	}
	public static void main(String[] args) {
		play(0, 0);
	}
}
