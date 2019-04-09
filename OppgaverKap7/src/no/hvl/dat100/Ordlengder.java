package no.hvl.dat100;

import java.io.*;
import java.util.*;
import static javax.swing.JOptionPane.*;

public class Ordlengder {
	public static void main(String[] args) throws FileNotFoundException {
		String filnavn = showInputDialog("Gi filnavn: ");
		File fil = new File(filnavn);
		Scanner leser = new Scanner(fil);

		int antKorte = 0;
		int antHalvlang = 0;
		int antLang = 0;

		while (leser.hasNext()) {
			String ord = leser.next();

			if (ord.length() < 5) {
				antKorte++;
			} else if (ord.length() < 11) {
				antHalvlang++;
			} else {
				antLang++;
			}
		}
		
		leser.close();

		int sum = antKorte + antHalvlang + antLang;

		showMessageDialog(null,
				"Korte ord: " + antKorte + " Tilsvarer: " + (antKorte / sum * 100) + "%" + "\n" + "Halvlange ord: "
						+ antHalvlang + " Tilsvarer: " + (antHalvlang / sum * 100) + "%" + "\n" + "Lange ord: "
						+ antLang + " Tilsvarer: " + (antLang / sum * 100) + "%");
	}
}