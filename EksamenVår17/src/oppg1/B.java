package oppg1;

public class B {
	/*
	 * 7.0
	 */

	public static int f() {
		return 0;
	}
	
	public static double f(double a) {
		return a;
	}
	
	public static double f(int a, double b) {
		if (a < b) {
			return a * b;
		} else {
			return a - b;
		}
	}
	
	public static double f(double a, int b) {
		if (a < b) {
			return a / b;
		} else {
			return a + b;
		}
	}
	
	public static void b(){
		System.out.println(f(5.0, 2));
	}
	
	public static void main(String[] args) {
		b();
	}
}
