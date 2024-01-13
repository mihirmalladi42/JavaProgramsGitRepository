package allprograms;
//1/16/2023, 1:29 PM, selection sort
import java.util.Arrays;
import java.util.Scanner;
public class SelectionSort {
	public static void sort() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of numbers you want to sort: ");
		int num = scan.nextInt();
		int[] testarr = new int[num];
		for (int k = 0; k < num; k++) {
			Scanner numScan = new Scanner(System.in);
			System.out.println("Enter number " + (k+1) + ":");
			testarr[k] = numScan.nextInt();
		}
		int arrSmallNum;
		int index;
		for (int i = 0; i < testarr.length; i++) {
			arrSmallNum = testarr[i];
			index = i;
			for (int j = i; j < testarr.length; j++) {
				if (testarr[j] < arrSmallNum) {
					arrSmallNum = testarr[j];
					index = j;
				}
			}
			int temp = testarr[i];
			testarr[i] = arrSmallNum;
			testarr[index] = temp;
		}
	System.out.println("Here is the sorted array: " + Arrays.toString(testarr));
		again();
	}
	public static void again() {
		Scanner again = new Scanner(System.in);
		System.out.println("Do you want to sort more numbers? (Enter yes/y, or no/n): ");
		String againStr = again.nextLine();
		if (againStr.equalsIgnoreCase("yes") || againStr.equalsIgnoreCase("y")) {
			sort();
		} else if (againStr.equalsIgnoreCase("no") || againStr.equalsIgnoreCase("n")) {
			System.out.println("Thank you for sorting using selection sort!");
		} else {
			System.out.println("Enter a correct response.");
			again();
		}
	}
	public static void main(String[] args) {
		sort();
	}

}
