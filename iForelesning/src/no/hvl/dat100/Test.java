package no.hvl.dat100;

public class Test {
	public static void metodeA(int x) {
		if (x < 0) {
			throw new ArithmeticException("X er negatic");
		} else {
			System.out.println(x + " ");
		}
	}
	
	public static void metodeB() {
		int[] tab = {0, 1, -1, 2, 3};
		int x = 0;
		
		try {
			for (int i = 0; i < tab.length; i++) {
				x = i;
				metodeA(tab[i]);
			}
		} catch (ArithmeticException exception) {
			System.out.println();
			System.out.println(tab[x]);
		} finally {
			System.out.println("x = " + x);
		}
	}
	
	public static void main(String[] args) {
		metodeB();
	}

}
