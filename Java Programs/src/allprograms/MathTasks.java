package allprograms;

import java.util.ArrayList;
import java.util.Scanner;

public class MathTasks {
	
	public static void pascalTriangle() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of lines you want to print: ");
		int num = scan.nextInt();
        int[] nums = new int[1];
        ArrayList<Integer> prevNum = new ArrayList<>();
        num--;
        for (int i = 0; i < num; i++) {
            System.out.print(i > 0? "Line " + (i+2) + ": " : "Line " + (i+1) + ": ");
            if (i == 0) {
                nums[0] = 1;
                System.out.println(1);
            } else {
                prevNum = new ArrayList<>();
                for (int k = 0; k < nums.length; k++) {
                    prevNum.add(nums[k]);
                }
                prevNum.add(1);
                nums = new int[i+1];
                nums[0] = 1;
                if (nums.length != 1) {
                    for (int j = 1; j < nums.length; j++) {
                        if (prevNum.size() != j) {
                            nums[j] = prevNum.get(j-1)+prevNum.get(j);
                        } else {
                            nums[nums.length-1] = 1;
                            break;
                        }
                    }   
                }
            }

            System.out.print(i == 0? "Line 2: " : "");
            for (int l = 0; l < nums.length; l++) {
                System.out.print(nums[l] + " ");
            }
            System.out.print("1\n");
        }
        boolean again = doAgain();
		if (again) {
			start();
		} else {
			System.out.println("If you said no, thank you for using the Math Tasks! Otherwise, please give a valid answer.");
		}
	}
	public static void fibonacciSeries() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter how many numbers in the series you want: ");
		int num = scan.nextInt();
		// num1 = 2
		// num2 = 1
		// num3 = 2
		int num1 = 1;
		int num2 = 1;
		int num3 = num1 + num2;
		System.out.print("1 1 ");
		for (int i = 0; i < num; i++) {
			System.out.print(num3 + " ");
			num2 = num1;
			num1 = num3;
			num3 = num1 + num2;
		}
		boolean again = doAgain();
		if (again) {
			start();
		} else {
			System.out.println("If you said no, thank you for using the Math Tasks! Otherwise, please give a valid answer.");
		}
	}
	public static boolean doAgain() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Do you want to use the Math Tasks again? (Enter yes or no): ");
		String doAgain = scan.nextLine();
		if (doAgain.equalsIgnoreCase("yes")) {
			return true;
		} else if (doAgain.equalsIgnoreCase("no")) {
			return false;
		}
		return false;
	}
	public static void calculator() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the equation you want to solve (basic operations, +, -, *, /, example: 5 + 6): ");
		double num1 = scan.nextDouble();
		String operation = scan.next();
		double num2 = scan.nextDouble();
		if (operation.equals("+")) {
			System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
		} else if (operation.equals("-")) {
			System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
		} else if (operation.equals("*")) {
			System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
		} else if (operation.equals("/")) {
			System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
		}
		boolean again = doAgain();
		if (again) {
			start();
		} else {
			System.out.println("If you said no, thank you for using the Math Tasks! Otherwise, please give a valid answer.");
		}
	}
	public static void start() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Do you want a pascal triangle, fibonacci series, or a calculator? (type pascal, fibonacci, or calculator): ");
		String res = scan.nextLine();
		if (res.equalsIgnoreCase("pascal")) {
			pascalTriangle();
		} else if (res.equalsIgnoreCase("fibonacci")) {
			fibonacciSeries();
		} else if (res.equalsIgnoreCase("calculator")) {
			calculator();
		}
	}
	public static void main(String[] args) {
		start();
	}
}
