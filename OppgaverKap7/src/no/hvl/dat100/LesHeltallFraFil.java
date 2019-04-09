package no.hvl.dat100;

import java.io.*;
import java.util.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class LesHeltallFraFil {
	public static void main(String[] args) throws FileNotFoundException {
		String filnavn = showInputDialog("Gi filnavn: ");
		File fil = new File(filnavn);
		Scanner leser = new Scanner(fil);

		PrintWriter skriver = new PrintWriter("Res" + fil);

		int linjenr = 0;
		skriver.println("Resultat fra: " + fil);
		
		while (leser.hasNextLine()) {
			String linje = leser.nextLine();
			int antall, sum;
			if (linje.length() > 0) {
				// Linje med tall på, finn ut hvor mange...
				String[] dataTab = linje.split(" ");
				antall = dataTab.length;
				// Beregn summen av tallen på linjen
				sum = 0;
				for (int i = 0; i < dataTab.length; i++) {
					int tall = parseInt(dataTab[i]);
					sum += tall;
				}
			} else { // Tom linje, ingen heltall her...
				antall = 0;
				sum = 0;
			}
			linjenr++;
			skriver.println(linjenr + ":  " + antall + " - " + sum);
		}
		leser.close();
		skriver.close();

		showMessageDialog(null, "Filen er ferdigbehandlet!");
	}
}