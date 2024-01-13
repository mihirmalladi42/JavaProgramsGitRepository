package allprograms;

public class GammaFunction {
	public static void main(String[] args) {
		int x = 5;
		double inverse = 1.0/x;
		double secondProd = 1.0;
		for (double i = 1; i <= 100000; i++) {
			double prod1 = 1.0/(1.0+(x/i));
			double prod2 = Math.pow((1.0+1.0/i), x);
			secondProd *= (prod1 * prod2);
		}
		System.out.println(inverse * secondProd);
	}
}
