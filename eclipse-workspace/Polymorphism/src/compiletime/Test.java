package compiletime;

public class Test {
	public static int sum(int a, int b) {
		return a + b;
	}
	
	public static int sum(int a, int b, int c) {
		return a + b + c;
	}
	public static void main(String args[]) {
		int a = 10, b = 14;
		System.out.println(sum(a, b));
		System.out.println(sum(a, b, 11));
	}
}
