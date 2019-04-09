package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import java.util.*;

public class Oppgave5Metoder {
	public static void baklengs() {
		String setning = showInputDialog("Skriv en setning:");
		String baklengs = "";
		for (int i = setning.length(); i > 0; i--) {
			baklengs += setning.charAt(i-1);
		}
		out.println(setning + " baklengs blir:");
		out.println(baklengs);
		out.println();
	}
	
	public static void sortert() {
		int[] tab = new int[4];
		
		for (int i = 0; i < tab.length; i++) {
			tab[i] = parseInt(showInputDialog("Oppgi tall nr. " + (i+1) + ":"));
		}
		
		boolean sortert = true;
		int i = 1;
		while (sortert && i < tab.length) {
			if (tab[i-1] <= tab[i]) {
				i++;
			} else {
				sortert = false;
			}
		}
		
		if (sortert) {
			out.println("Tabellen du skrev inn er sortert.");
		} else {
			out.println("Tabellen du skrev inn er ikke sortert.");
		}
		out.println();
	}
	
	public static String først() {
		String[] tab2 = new String[3];
		
		for (int i = 0; i < tab2.length; i++) {
			tab2[i] = showInputDialog("Oppgi ord nr. " + (i+1) + ":");
		}
		
		Arrays.sort(tab2);
		return tab2[0];
	}
}
