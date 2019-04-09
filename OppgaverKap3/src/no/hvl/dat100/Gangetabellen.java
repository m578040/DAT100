package no.hvl.dat100;

public class Gangetabellen {
	public static void main(String[] args) {
		String mr1 = "    ";
		String mr2 = "   ";
		String mr3 = "  ";
		String mr4 = " ";
		
		System.out.print("  ");
		
		for (int i = 1; i <= 10; i++) {
			if ((i/10) >= 1) {
				System.out.print(mr2 + i);
			} else {
				System.out.print(mr1 + i);
			}
		}
		
		System.out.println();
		System.out.println();
		
		for (int a = 1; a <= 10; a++) {
			if (a == 10) {
				System.out.print(a);
			} else {
				System.out.print(mr4 + a);
			}
			
			for (int b = 1; b <= 10; b++) {
				int resultat = a*b;
				
				if (b == 10) {
					if ((resultat/100) >= 1) {
						System.out.println(mr3 + resultat);
					} else if (((resultat/10) >= 1) && ((resultat/10) < 10)) {
						System.out.println(mr2 + resultat);
					} else {
						System.out.println(mr1 + resultat);
					}
				} else {
					if (((resultat/10) >= 1) && ((resultat/10) < 10)) {
						System.out.print(mr2 + resultat);
					} else {
						System.out.print(mr1 + resultat);
					}
				}
			}
		}
	}
}