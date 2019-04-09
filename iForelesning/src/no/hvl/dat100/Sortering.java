package no.hvl.dat100;

public class Sortering {
	public static boolean erSortert(double[] tab) {
		int n = tab.length;
		for (int i = 0; i < (n - 1); i++) {
			if (tab[i] > tab[i + 1]) {
				return false;
			}
		}
		return true;
	}

	public static void plukkSortering(Sammenlignbar[] tab) {
		int n = tab.length;
		
		for (int i = 0; i < n - 1; i++) {
			int minstePos = i;
			
			for (int j = i + 1; j < n; j++) {
				if (tab[j].mindreEnn(tab[minstePos])) {
					minstePos = j;
				}
			}
			
			Sammenlignbar temp = tab[i];
			tab[i] = tab[minstePos];
			tab[minstePos] = temp;
		}
	}
}