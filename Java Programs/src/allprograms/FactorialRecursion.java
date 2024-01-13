package allprograms;

import java.util.ArrayList;

public class FactorialRecursion {
	static ArrayList<Integer> l = new ArrayList<>();
	public static void doSomething(int n) {
		if (n > 0) {
			doSomething(n-1);
			System.out.print(n);
			l.add(n);
			doSomething(n-1);
		}
	}
	public static void main(String[] args) {
		doSomething(9);
		System.out.println();
		for (int i = 0; i < l.size(); i++) {
			if (l.get(i) == 1) {
				l.remove(i);
			}
		}
		System.out.println(l);
	}

}
