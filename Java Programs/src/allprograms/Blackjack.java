package allprograms;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Blackjack {
	static String[] randCard = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
	static int[] value = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};
	static ArrayList<String> dealerDealt = new ArrayList<>();
	static int dealerSum = 0;
	static double betN = 0;
	static double original;
	static double money;
	static int roundNum;
	public static void game(ArrayList<String> playerDealt, int playerSum) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Your cards are " + playerDealt + " (sum of " + playerSum + "). Would you like to hit or stand?");
		String hitorstand = scan.nextLine();
		if (hitorstand.equalsIgnoreCase("hit")) {
			Random randCardR = new Random();
			int rand = randCardR.nextInt(13);
			playerSum += value[rand];
			playerDealt.add(randCard[rand]);
			if (playerSum > 21) {
				System.out.println("__________♠♠♠BLACKJACK♠♠♠__________");
				System.out.println("Bust! Computer wins. Your cards were " + playerDealt + " with a sum of " + playerSum + ".");
				money -= betN;
				money = Math.round(money * 100.0) / 100.0;
				System.out.println("Your total money is: $" + money);
				newGame();
			} else if (playerSum == 21) {
				System.out.println("__________♠♠♠BLACKJACK♠♠♠__________");
				System.out.println("Win! Player wins. Your cards were " + playerDealt + " with a sum of " + playerSum + ".");
				money += betN*1.5;
				money = Math.round(money * 100.0) / 100.0;
				System.out.println("Your total money is: $" + money);
				newGame();
			} else if (playerSum < 21) {
				game(playerDealt, playerSum);
			}
		} else if (hitorstand.equalsIgnoreCase("stand")) {
			dealer(dealerDealt, dealerSum, playerSum);
		}
	}
	
	public static void dealer(ArrayList<String> dealerDealt, int dealerSum, int playerSum) {
		while (dealerSum < 17) {
			Random randCardR = new Random();
			int card = randCardR.nextInt(13);
			dealerSum += value[card];
			dealerDealt.add(randCard[card]);
			if (dealerSum > 21) {
				System.out.println("__________♠♠♠BLACKJACK♠♠♠__________");
				System.out.println("Bust! Player wins. Computer's cards were " + dealerDealt + ". The sum was " + dealerSum + ".");
				money += betN*1.5;
				money = Math.round(money * 100.0) / 100.0;
				System.out.println("Your total money is: $" + money);
				newGame();
			}
		}
		if (!(dealerSum > 21)) {
			if (dealerSum > playerSum) {
				System.out.println("__________♠♠♠BLACKJACK♠♠♠__________");
				System.out.println("Lose! Computer wins. Computer's cards were " + dealerDealt + ". The sum was " + dealerSum + ".");
				money -= betN;
				money = Math.round(money * 100.0) / 100.0;
				System.out.println("Your total money is: $" + money);
			} else if (dealerSum == playerSum) {
				System.out.println("__________♠♠♠BLACKJACK♠♠♠__________");
				System.out.println("Tie! Computer's cards were " + dealerDealt + ". The sum was " + dealerSum + ".");
				System.out.println("Your total money is: $" + money);
			} else if (dealerSum < playerSum) {
				System.out.println("__________♠♠♠BLACKJACK♠♠♠__________");
				System.out.println("Win! Computer's cards were " + dealerDealt + ". The sum was " + dealerSum + ".");
				money += betN*1.5;
				money = Math.round(money * 100.0) / 100.0;
				System.out.println("Your total money is: $" + money);
			}
			newGame();
		}
	}
	public static void newGame() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Would you like to play again? (Enter yes or no):");
		String res = scan.nextLine();
		if (res.equalsIgnoreCase("yes")) {
			loadGame(true);
		} else if (res.equalsIgnoreCase("no")) {
			if (money < original) {
				System.out.println("Better luck next time. You lost $" + (Math.round((original - money) * 100.0) / 100.0) + ".");
			} else if (money > original) {
				System.out.println("Nice job! You won $" + (Math.round((money - original) * 100.0) / 100.0) + ".");
			}
			System.out.println("Goodbye, player!");
		} else {
			System.out.println("Enter a correct response.");
			newGame();
		}
	}
	public static void loadGame(boolean doPrint) {
		if (doPrint) {
			System.out.println("__________♠♠♠BLACKJACK♠♠♠__________");	
		}
		betN = 0;
		System.out.println("ALL ACES ARE WORTH 1 IN THIS GAME. MINIMUM BET IS $20. If you win, you earn 150% of the money bet. If you lose, you lose your bet.");
		Scanner bet = new Scanner(System.in);
		System.out.println("Enter the amount of money you want to bet: ");
		betN = bet.nextDouble();
		if (betN < 20) {
			System.out.println("Enter a valid bet.");
			loadGame(false);
		}
		ArrayList<String> playerDealt = new ArrayList<>();
		dealerDealt = new ArrayList<>();
		int playerSum = 0;
		dealerSum = 0;
		Random randCardR = new Random();
		int cd1 = randCardR.nextInt(13);
		int cd2 = randCardR.nextInt(13);
		int cp1 = randCardR.nextInt(13);
		int cp2 = randCardR.nextInt(13);
		dealerDealt.add(randCard[cd1]);
		dealerDealt.add(randCard[cd2]);
		playerDealt.add(randCard[cp1]);
		playerDealt.add(randCard[cp2]);
		playerSum += value[cp1];
		playerSum += value[cp2];
		dealerSum += value[cd1];
		dealerSum += value[cd2];
		System.out.println("__________♠♠♠BLACKJACK♠♠♠__________");
		game(playerDealt, playerSum);
	}
	public static void main(String[] args) {
		System.out.println("__________♠♠♠BLACKJACK♠♠♠__________");
		Scanner originalScan = new Scanner(System.in);
		System.out.println("How much money do you have to start with?");
		original = Math.round(originalScan.nextDouble() * 100.0) / 100.0;
		money = original;
		loadGame(false);
	}
}
