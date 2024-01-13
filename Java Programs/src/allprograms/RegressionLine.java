package allprograms;

import java.util.Scanner;

public class RegressionLine {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of points you are calculating the regression line of: ");
		int num = scan.nextInt();
		double[] x = new double[num];
		double[] y = new double[num];
		for (int i = 0; i < num; i++) {
			Scanner xval = new Scanner(System.in);
			System.out.println("Enter the next point (x value): ");
			x[i] = xval.nextDouble();
		}
		for (int j = 0; j < num; j++) {
			Scanner yval = new Scanner(System.in);
			System.out.println("Enter the next point (y value): ");
			y[j] = yval.nextDouble();
		}
		//double[] x = {2, 3, 4, 5, 6, 7, 8};
		//double[] y = {35, 37, 39, 41, 43, 45, 47};
		double sumx = 0;
		double sumy = 0;
		double sumxy = 0;
		double sumx2 = 0;
		double sumy2 = 0;
		int n = x.length;
		for (int i = 0; i < x.length; i++) {
			sumx += x[i];
			sumy += y[i];
			sumxy += x[i]*y[i];
			sumx2 += Math.pow(x[i],2);
			sumy2 += Math.pow(y[i],2);
		}
		double r = (n*sumxy-sumx*sumy)/Math.sqrt((n*sumx2-Math.pow(sumx, 2))*(n*sumy2-Math.pow(sumy, 2)));
		System.out.println("Correlation Coefficient: " + r);
		double xmean = 0;
		double ymean = 0;
		
		for (int j = 0; j < x.length; j++) {
			xmean += x[j];
			ymean += y[j];
		}
		xmean /= x.length;
		ymean /= x.length;
		double stDevXMeanDiff = 0;
		double stDevYMeanDiff = 0;
		for (int k = 0; k < x.length; k++) {
			stDevXMeanDiff += Math.pow((x[k]-xmean),2);
			stDevYMeanDiff += Math.pow((y[k]-ymean),2);
		}
		double stDevX = Math.sqrt(stDevXMeanDiff/(x.length-1));
		double stDevY = Math.sqrt(stDevYMeanDiff/(x.length-1));
		double b = r * stDevY/stDevX;
		double a = ymean - b * xmean;
		System.out.println("Line of Best Fit / Linear Regression Line: y = " + b + "x + " + a);
		System.out.println("X Sample Standard Deviation: " + stDevX);
		System.out.println("Y Sample Standard Deviation: " + stDevY);
		System.out.println("X Mean: " + xmean);
		System.out.println("Y Mean: " + ymean);
	}
}
