package oppg1;

public class D {
	/*
	 * 2
	 * 3
	 * 5
	 * 7
	 * 11
	 * 13
	 */

	public static void main(String[] args) {
		d(15);
	}

	public static void d(int n) {
		boolean[] t = new boolean[n + 1];
		t[0] = false;
		t[1] = false;
		
		for (int i = 2; i <= n; i++) {
			t[i] = true;
		}
		
		int i = 0;
		while (i <= n) {
			while (i <= n && !t[i]) {
				i++;
			}
			for (int j = 2 * i; j <= n; j = j + i) {
				t[j] = false;
			}
			i++;
		}
		
		for (int k = 0; k <= n; k++) {
			if (t[k]) {
				System.out.println(k);
			}
		}
	}
}