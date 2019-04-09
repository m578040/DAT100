package no.hvl.dat100;

import static java.lang.System.*;
import java.util.*;

public class Oppgave2 {
	public static void main(String[] args) {
		int[] tab1 = { 1, 6, 2, 9 };
		int[] tab2 = { 16, 4, 8 };

		int[] fletteTab = flette(tab1, tab2);
		out.println(Arrays.toString(fletteTab));

		out.println();

		int[] tab3 = { 1, 4, 5, 6 };
		int[] tab4 = { 5, 4, 1, 6 };
		int[] tab5 = { 1, 4, 5, 6 };

		out.println(tab3.equals(tab4));
		out.println(tab3.equals(tab5));

		out.println();

		int[][] tab6 = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };
		int[][] tab7 = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };

		out.println(erLik(tab6, tab7));
	}

	public static int[] flette(int[] tabell1, int[] tabell2) {
		int[] nyTab = new int[tabell1.length + tabell2.length];

		for (int i = 0; i < tabell1.length; i++) {
			nyTab[i] = tabell1[i];
		}

		for (int i = tabell1.length; i < nyTab.length; i++) {
			nyTab[i] = tabell2[i - tabell1.length];
		}

		Arrays.sort(nyTab);

		return nyTab;
	}

	public static boolean erLik(int[][] matrise1, int[][] matrise2) {
		boolean lik = false;

		if (matrise1.length == matrise2.length) {
			for (int i = 0; i < matrise1.length; i++) {
				if (matrise1[i].length == matrise2[i].length) {
						for (int j = 0; j < matrise1[0].length; j++) {
							if (matrise1[i][j] == matrise2[i][j]) {
								lik = true;
							} else {
								return false;
							}
						}
				} else {
					return false;
				}
			}
		} else {
			return false;
		}

		return lik;
	}
}