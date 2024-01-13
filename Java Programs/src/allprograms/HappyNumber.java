package allprograms;

public class HappyNumber {

	public static void main(String[] args) {
		int sum = 0;
		int num = 19;
		sum = num;
		while (sum != 1) {
			String numStr = Integer.toString(num);
			String[] numStrArr = numStr.split("");
			for (int i = 0; i < numStrArr.length; i++) {
				sum += Math.pow(Integer.parseInt(numStrArr[i]), 2);
			}
			System.out.println(sum);
			num = sum;
			sum = 0;
		}
	}

}
