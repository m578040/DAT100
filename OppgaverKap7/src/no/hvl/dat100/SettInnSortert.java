package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import java.io.*;
import java.util.*;

public class SettInnSortert {
	public static void main(String[] args) throws Exception {
		String filnavn = showInputDialog("Gi filnavn:");
		File fil = new File(filnavn);
		Scanner leser = new Scanner(fil);

		int antNavn = 0;
		while (leser.hasNextLine()) {
			leser.nextLine();
			antNavn++;
		}
		leser.close();

		String[] navnTab = new String[antNavn + 1];

		leser = new Scanner(fil);
		for (int i = 0; i < antNavn; i++)
			navnTab[i] = leser.nextLine();
		leser.close();

		navnTab[antNavn] = showInputDialog("Gi nytt fornavn:");

		Arrays.sort(navnTab);

		PrintWriter skriver = new PrintWriter(filnavn);
		for (int i = 0; i <= antNavn; i++)
			skriver.println(navnTab[i]);
		skriver.close();
	}
}