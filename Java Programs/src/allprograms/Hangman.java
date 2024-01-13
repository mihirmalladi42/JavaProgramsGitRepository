package allprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Hangman {
	static int num;
	static int length;
	static String[] blank;
	static ArrayList<String> wrongChars = new ArrayList<>();
	public static void guess(String word, int incorrectNum) {
		num = incorrectNum;
		Scanner guess = new Scanner(System.in);
		System.out.println("Player 2, enter your guess (one character only): ");
		String[] chars = word.split("");
		String res = guess.nextLine().toLowerCase();
		if (word.toLowerCase().contains(res)) {
			System.out.println(res + " is in the word!");
			for (int i = 0; i < blank.length; i++) {
				if (chars[i].equals(res)) {
					blank[i] = res;
				}
			}
			ArrayList<String> blankArr = new ArrayList<>(Arrays.asList(blank));
			ArrayList<String> charsArr = new ArrayList<>(Arrays.asList(chars));
			if (blankArr.equals(charsArr)) {
				System.out.println("Congrats! You won!");
				if (num == 0) {
					System.out.println("---------");
					System.out.println("|       |");
					System.out.println("|");
					System.out.println("|");
					System.out.println("|");
					System.out.println("|");
					System.out.println("---------");
					System.out.println(String.join(" ", blank));
					System.out.println(wrongChars);
				} else if (num == 1) {
					System.out.println("---------");
					System.out.println("|       |");
					System.out.println("|       O");
					System.out.println("|");
					System.out.println("|");
					System.out.println("|");
					System.out.println("---------");
					System.out.println(String.join(" ", blank));
					System.out.println(wrongChars);
				} else if (num == 2) {
					System.out.println("---------");
					System.out.println("|       |");
					System.out.println("|       O");
					System.out.println("|       |");
					System.out.println("|");
					System.out.println("|");
					System.out.println("---------");
					System.out.println(String.join(" ", blank));
					System.out.println(wrongChars);
				} else if (num == 3) {
					System.out.println("---------");
					System.out.println("|       |");
					System.out.println("|       O");
					System.out.println("|       |");
					System.out.println("|      |");
					System.out.println("|");
					System.out.println("---------");
					System.out.println(String.join(" ", blank));
					System.out.println(wrongChars);
				} else if (num == 4) {
					System.out.println("---------");
					System.out.println("|       |");
					System.out.println("|       O");
					System.out.println("|       |");
					System.out.println("|      | |");
					System.out.println("|");
					System.out.println("---------");
					System.out.println(String.join(" ", blank));
					System.out.println(wrongChars);
				} else if (num == 5) {
					System.out.println("---------");
					System.out.println("|       |");
					System.out.println("|       O");
					System.out.println("|      ||");
					System.out.println("|      | |");
					System.out.println("|");
					System.out.println("---------");
					System.out.println(String.join(" ", blank));
					System.out.println(wrongChars);
				}
			} else {
				if (num == 0) {
					System.out.println("---------");
					System.out.println("|       |");
					System.out.println("|");
					System.out.println("|");
					System.out.println("|");
					System.out.println("|");
					System.out.println("---------");
					System.out.println(String.join(" ", blank));
					System.out.println(wrongChars);
					guess(word, num);
				} else if (num == 1) {
					System.out.println("---------");
					System.out.println("|       |");
					System.out.println("|       O");
					System.out.println("|");
					System.out.println("|");
					System.out.println("|");
					System.out.println("---------");
					System.out.println(String.join(" ", blank));
					System.out.println(wrongChars);
					guess(word, num);
				} else if (num == 2) {
					System.out.println("---------");
					System.out.println("|       |");
					System.out.println("|       O");
					System.out.println("|       |");
					System.out.println("|");
					System.out.println("|");
					System.out.println("---------");
					System.out.println(String.join(" ", blank));
					System.out.println(wrongChars);
					guess(word, num);
				} else if (num == 3) {
					System.out.println("---------");
					System.out.println("|       |");
					System.out.println("|       O");
					System.out.println("|       |");
					System.out.println("|      |");
					System.out.println("|");
					System.out.println("---------");
					System.out.println(String.join(" ", blank));
					System.out.println(wrongChars);
					guess(word, num);
				} else if (num == 4) {
					System.out.println("---------");
					System.out.println("|       |");
					System.out.println("|       O");
					System.out.println("|       |");
					System.out.println("|      | |");
					System.out.println("|");
					System.out.println("---------");
					System.out.println(String.join(" ", blank));
					System.out.println(wrongChars);
					guess(word, num);
				} else if (num == 5) {
					System.out.println("---------");
					System.out.println("|       |");
					System.out.println("|       O");
					System.out.println("|      ||");
					System.out.println("|      | |");
					System.out.println("|");
					System.out.println("---------");
					System.out.println(String.join(" ", blank));
					System.out.println(wrongChars);
					guess(word, num);
				}
				
			}
			
		} else {
			num++;
			System.out.println(res + " is not in the word.");
			if (num == 1) {
				System.out.println("---------");
				System.out.println("|       |");
				System.out.println("|       O");
				System.out.println("|");
				System.out.println("|");
				System.out.println("|");
				System.out.println("---------");
				System.out.println(String.join(" ", blank));
				wrongChars.add(res);
				System.out.println(wrongChars);
				guess(word, num);
			} else if (num == 2) {
				System.out.println("---------");
				System.out.println("|       |");
				System.out.println("|       O");
				System.out.println("|       |");
				System.out.println("|");
				System.out.println("|");
				System.out.println("---------");
				System.out.println(String.join(" ", blank));
				wrongChars.add(res);
				System.out.println(wrongChars);
				guess(word, num);
			} else if (num == 3) {
				System.out.println("---------");
				System.out.println("|       |");
				System.out.println("|       O");
				System.out.println("|       |");
				System.out.println("|      |");
				System.out.println("|");
				System.out.println("---------");
				System.out.println(String.join(" ", blank));
				wrongChars.add(res);
				System.out.println(wrongChars);
				guess(word, num);
			} else if (num == 4) {
				System.out.println("---------");
				System.out.println("|       |");
				System.out.println("|       O");
				System.out.println("|       |");
				System.out.println("|      | |");
				System.out.println("|");
				System.out.println("---------");
				System.out.println(String.join(" ", blank));
				wrongChars.add(res);
				System.out.println(wrongChars);
				guess(word, num);
			} else if (num == 5) {
				System.out.println("---------");
				System.out.println("|       |");
				System.out.println("|       O");
				System.out.println("|      ||");
				System.out.println("|      | |");
				System.out.println("|");
				System.out.println("---------");
				System.out.println(String.join(" ", blank));
				wrongChars.add(res);
				System.out.println(wrongChars);
				guess(word, num);
			} else if (num == 6) {
				System.out.println("---------");
				System.out.println("|       |");
				System.out.println("|       O");
				System.out.println("|      |||");
				System.out.println("|      | |");
				System.out.println("|");
				System.out.println("---------");
				System.out.println("Game over. The word was " + word);
				wrongChars.add(res);
				System.out.println(wrongChars);
			}
		}
		
	}
	public static void main(String[] args) {
		Scanner getWord = new Scanner(System.in);
		System.out.println("Player 1, enter the word: ");
		String word = getWord.nextLine();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("---------");
		System.out.println("|       |");
		System.out.println("|");
		System.out.println("|");
		System.out.println("|");
		System.out.println("|");
		System.out.println("---------");
		blank = new String[word.length()];
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == ' ') {
				blank[i] = " ";
				System.out.print(blank[i] + " ");
			} else {
				blank[i] = "_";
				System.out.print(blank[i] + " ");
			}
		}
		System.out.println();
		length = word.length();
		guess(word, 0);
	}

}
