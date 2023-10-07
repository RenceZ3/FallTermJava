package week5;

public class PolySampleClass {
	
	private static int num1;
	private static int num2;

	public int product(int a, int b) {
		return a * b;
	}
	
	public void product(int a) {
		for(int i=1; i<=10; i++) {
			int prod = i * a;
			System.out.printf("\n\n%d\t*\t%d\t=\t%d\n", i, a, prod);
		}
	}
	
	public static void product() {
		maxMethod(num1, num2);
		System.out.println("This is just a test...");
	}
	
	private static int maxMethod(int a, int b) {
		return Math.max(a, b);
	}
}
