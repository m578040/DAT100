package no.hvl.dat100;

public class SorteringTest {
	public static void main(String[] args) {
		double[] a = {2.0, 5.0, 9.0};
		double[] b = {1.0, 5.0, 4.0};
		
		System.out.println(Sortering.erSortert(a));
		System.out.println(Sortering.erSortert(b));
		
		int[] tabell = {0, 8, 4, 6, 2, 1};
		Sortering.plukkSortering(tabell);
		
		for (int e : tabell) {
			System.out.print(e + " ");
		}
		System.out.println();
		
		Bil[] bTab = new Bil[5];
		bTab[0] = new Bil("SU 912345");
		bTab[1] = new Bil("AB 12345");
		bTab[2] = new Bil("SU 12345");
		bTab[3] = new Bil("MU 12345");
		bTab[4] = new Bil("SU 12845");
		
		Sortering.plukkSortering(bTab);
		
		for (Bil e : bTab) {
			System.out.print(e + "\n");
		}
		System.out.println();
	}
}