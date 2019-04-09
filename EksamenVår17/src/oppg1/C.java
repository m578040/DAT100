package oppg1;

public class C {
	/*
	 * 0 4 0 2
	 * 1 4 1 2
	 * 2 4 2 2
	 * 3 4 3 2
	 */

	public static void main(String[] args) {
		c(4);
	}
	
	public static void c(int n) {
		for (int i = 0; i < n; i++) {
			for (int j= n; j > 0; j = j -2 ) {
				System.out.print(i+ " "+ j+ " ");
			}
			System.out.println();
		}
	}
}