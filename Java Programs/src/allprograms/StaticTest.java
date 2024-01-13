package allprograms;

public class StaticTest {
	public static void main(String[] args) {
		TestingStatic call1 = new TestingStatic();
		TestingStatic call2 = new TestingStatic();
		TestingStatic call3 = new TestingStatic();
		TestingStatic call4 = new TestingStatic();
		TestingStatic call5 = new TestingStatic();
		TestingStatic.print();
	}
}
class TestingStatic {
	static int numOfCalls = 0;
	public TestingStatic() {
		numOfCalls++;
	}
	public static void print() {
		System.out.println(numOfCalls);
	}
}
