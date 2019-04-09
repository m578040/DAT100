package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.System.*;
import static java.lang.Integer.*;

public class Oppgave2 {
	public static void main(String[] args) {
		String setning = showInputDialog("Skriv inn antall ord i setningen:");
		int antOrd = parseInt(setning);
		
		String[] tabell = new String[antOrd];
		final int TABLENGDE = tabell.length;
		
		for (int i = 0; i < TABLENGDE; i++) {
			tabell[i] = showInputDialog("Skriv inn ord nr. " + (i+1) + ":");
		}
		
		String ut = "";
		
		for (int i = 0; i < TABLENGDE; i++) {
			ut += tabell[i] + " ";
		}
		
		showMessageDialog(null, ut);
		
		setning = showInputDialog("Skriv inn et bokstavmønster:");
		int antall = 0;
		
		for (int i = 0; i < TABLENGDE; i++) {
			if (tabell[i].contains(setning)) {
				antall++;
			}
		}
		showMessageDialog(null, "Det er " + antall + " forekomster av mønsteret " + setning + " i tabellen.");
		
		for (int i = 0; i < TABLENGDE; i++) {
			final int ORDLENGDE = tabell[i].length();
			final String ORD = tabell[i];
			if (ORDLENGDE == 1) {
				out.print(ORD);
			} else if (ORDLENGDE%2 == 1) {
				out.print(ORD.charAt(ORDLENGDE/2-1));
				out.print(ORD.charAt(ORDLENGDE/2));
				out.print(ORD.charAt(ORDLENGDE/2+1));
			} else {
				out.print(ORD.charAt(ORDLENGDE/2-1));
				out.print(ORD.charAt(ORDLENGDE/2));
			}
			out.println();
		}
	}
}