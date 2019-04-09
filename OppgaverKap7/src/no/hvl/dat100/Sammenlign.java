package no.hvl.dat100;

import java.io.*;
import java.util.*;
import static javax.swing.JOptionPane.*;

public class Sammenlign {
	public static void main(String[] args) {
		String ut = "Sammenliknede filer" + "\n";

		try {
			String filnavn = showInputDialog("Gi filnavn (fil nr 1):");
			File fil = new File(filnavn);
			Scanner leser1 = new Scanner(fil, "utf8");
			ut += "Fil nr 1: " + filnavn;

			filnavn = showInputDialog("Gi filnavn (fil nr 2):");
			fil = new File(filnavn);
			Scanner leser2 = new Scanner(fil, "utf8");
			ut += "Fil nr 2: " + filnavn;

			int antUlike = 0;
			String ulikeLinjer = "";
			int linjeNr = 0;
			while (leser1.hasNextLine()) {
				String linje1 = leser1.nextLine();
				String linje2 = leser2.nextLine();
				linjeNr++;
				if (!linje1.equals(linje2)) {
					antUlike++;
					ulikeLinjer += linjeNr + ": " + linje1 + "\n" + linjeNr + ": " + linje2 + "\n\n";
				}
			}
			
			leser1.close();
			leser2.close();
			
			if (antUlike > 0) {
				ut += "Følgende linjer var ulike: " + "\n" + ulikeLinjer + "\n" + "Antall ulike linjer: " + antUlike;
			} else {
				ut += "Ingen linjer var ulike! Antall linjer = " + linjeNr;
			}
		} catch (Exception e) {
			ut = "Filsammenlikningen lot seg ikke utføre";
		}

		showMessageDialog(null, ut);
	}
}