package allprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NewCodingLanguage {
	static String[] allChars = {"!", "`", "~", "@", "#", "$", "%", "^", "&", "*", "(", ")", "-", "_", "=", "+", "[", "{", "]", "}", ";", ":", "'", " ", "/", "?", ".", ",", "<", ">", "|", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "!", "`", "~", "@", "#", "$", "%", "^", "&", "*", "(", ")", "-", "_", "=", "+", "[", "{", "]", "}", ";", ":", "'", " ", "/", "?", ".", ",", "<", ">", "|", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
	static ArrayList<String> chars = new ArrayList<>(Arrays.asList(allChars));
	static int shift;
	public static void encrypt() {
		int shiftMethod = new Random().nextInt(93 /* allChars.length / 2 + 1*/);
		//shift = 12;
		System.out.println(shiftMethod);
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the code here: ");
		String code = scan.nextLine();
		String[] codeSplit = code.split("");
		String output = "";
		for (int i = 0; i < codeSplit.length; i++) {
			int index = chars.indexOf(codeSplit[i]);
			index += shiftMethod;
			output += chars.get(index);
		}
		if (output.contains("System.out.println('")) {
			String[] splitOutput = output.split("");
			ArrayList<String> arr = new ArrayList<>(Arrays.asList(splitOutput));
			for (int i = 0; i < 20; i++) {
				arr.remove(0);
			}
			arr.remove(arr.size()-1);
			arr.remove(arr.size()-1);
			arr.remove(arr.size()-1);
			String print = String.join("", arr);
			System.out.println(print);
		}
		again();
	}
	public static void again() {
		Scanner doAgain = new Scanner(System.in);
		System.out.println();
		System.out.println("Would you like to code again using this new coding language? (Type yes or no): ");
		String res = doAgain.nextLine();
		if (res.equalsIgnoreCase("yes")) {
			encrypt();
		} else {
			System.out.println("Thank you for coding in this new language!");
		}
	}
	public static void main(String[] args) {
		encrypt();
	}
	//CODE FOR ENCRYPTING STANDARD CODE TO THE NEW CODING LANGUAGE CODE
	/* 
	 import java.util.ArrayList;
	 import java.util.Arrays;
	 public class Main {
	     public static void main(String[] args) {
		    String code = "System.out.println('Hello world');";
		    String[] allChars = {"!", "`", "~", "@", "#", "$", "%", "^", "&", "*", "(", ")", "-", "_", "=", "+", "[", "{", "]", "}", ";", ":", "'", " ", "/", "?", ".", ",", "<", ">", "|", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "!", "`", "~", "@", "#", "$", "%", "^", "&", "*", "(", ")", "-", "_", "=", "+", "[", "{", "]", "}", ";", ":", "'", " ", "/", "?", ".", ",", "<", ">", "|", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
		    ArrayList<String> arrList = new ArrayList<>(Arrays.asList(allChars));
		    int shift = 93-85;
		    String[] split = code.split("");
		    for (int i = 0; i < code.length(); i++) {
		        System.out.print(arrList.get(arrList.indexOf(split[i])+shift));
		    }
	     }
    }
*/
	
}
