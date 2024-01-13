package allprograms;

import java.util.ArrayList;
import java.util.Scanner;
public class CaesarCipher {
    public static void encoder(ArrayList<String>letters, ArrayList<String>lettersLower, ArrayList<String>symbolsnums){
        Scanner whatWord = new Scanner(System.in);
        System.out.println("What text do you want to encode/decode? (DO NOT USE DOUBLE QUOTATION MARKS OR BACKSLASH): ");
        String word = whatWord.nextLine();
        Scanner howManyMovements = new Scanner(System.in);
        System.out.println("How many digits do you want to shift the text? (For example, APPLE becomes BQQMF if the digits to shift is 1) (If you use a letter that is close to the end/beginning of the alphabet, there may be an error depending on the number you put): ");
        System.out.println("To encode text, enter the numbers you want to shift. If you want to decode, do the number of digits you want to shift subtracted from 26.");
        System.out.println("(Ex: If you want to decode Crrng with shift 2, decode it with shift 26-2, or 24.)");
        int numWord = howManyMovements.nextInt();
        String[] wordSpt = word.split("");
        String[] result = new String[wordSpt.length];
        for (int i = 0; i < wordSpt.length; i++) {
            for(int j = 0; j < 30; j++){
                if (wordSpt[i].equals(lettersLower.get(j))) {
                    result[i] = lettersLower.get((lettersLower.indexOf(lettersLower.get(j))) + numWord);
                } else if (wordSpt[i].equals(letters.get(j))) {
                    result[i] = letters.get((letters.indexOf(letters.get(j))) + numWord);
                } else if (wordSpt[i].equals(symbolsnums.get(j))) {
                    result[i] = symbolsnums.get(j);
                }
            }
        }
        System.out.println("The encoded/decoded text is '" + String.join("",result) + "'.");
        Scanner again = new Scanner(System.in);
        System.out.println("Do you want to encode more text?: ");
        String resp = again.nextLine();
        if (resp.equalsIgnoreCase("yes")) {
            encoder(letters, lettersLower, symbolsnums);
        } else {
            System.out.println("Thank you for using the encoder/decoder.");
        }
    }
    //updated and more compact code
    /*
     * public static String caesarCipher(String s, int k) {
    String[] lowChars = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    String[] uppChars = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
    ArrayList<String> lCA = new ArrayList<>(Arrays.asList(lowChars));
    ArrayList<String> uCA = new ArrayList<>(Arrays.asList(uppChars));
    int shift = k % 26;
    //shift is an integer from 0 to 25
    String newString = "";
    for (int i = 0; i < s.length(); i++) {
        if (lCA.contains("" + s.charAt(i))) {
            newString += lCA.get(lCA.indexOf("" + s.charAt(i)) + shift);
        } else if (uCA.contains("" + s.charAt(i))) {
            newString += uCA.get(uCA.indexOf("" + s.charAt(i)) + shift);
        } else {
            newString += s.charAt(i);
        }
    }
    return newString;
    }
     */
    public static void main(String[] args) {
        ArrayList<String> letters = new ArrayList<String>();
        ArrayList<String> lettersLower = new ArrayList<String>();
        ArrayList<String> symbolsnums = new ArrayList<String>();
        String[] letterArr ={"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        String[] letterLowerArr = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String[] symbolsnumsArr = {" ", "~", "`", "!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "_", "-", "+", "=", "{", "}", "[", "]", "|", "'", ":", ";", "<", ",", ".", ">", "?", "/"};
        for (int i = 0; i <= 51; i++) {
            letters.add(letterArr[i]);
            lettersLower.add(letterLowerArr[i]);
        } 
        for (int k = 0; k < 30; k++) {
            symbolsnums.add(symbolsnumsArr[k]);
        }
        encoder(letters, lettersLower, symbolsnums);
    }
}