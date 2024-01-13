package allprograms;

public class Generics<A, B, C> {
	A firstType;
	B secondType;
	C thirdType;
	public static void main(String[] args) {
		Generics<Integer, Double, Character> instance = new Generics<>(5, 6.7, 'c');
		instance.print();
	}
	public Generics(A a, B b, C c) {
		firstType = a;
		secondType = b;
		thirdType = c;
	}
	public void print() {
		System.out.println(firstType);
		System.out.println(secondType);
		System.out.println(thirdType);
	}
}
