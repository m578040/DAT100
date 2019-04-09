package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;
import static java.lang.Integer.*;

public class Eksempel44 {
	public static void main(String[] args) {
		int årstall = parseInt(showInputDialog("Årstall:"));
		int månedsnr = parseInt(showInputDialog("Månedsnr:"));
		int dager = 0;
		// dager = antallDager(årstall, månedsnr);
		showMessageDialog(null, "Dager: " + dager);
	}
	
	private static int antallDager(int år, int mnd) {
		return 0; // Må erstattes med reell kode...
	}
		
	private static boolean skuddår(int år) {
		return false; // Må erstattes med reell kode...
	}
	
	private static void årskalender(int år) {
		// Reell kode
	}
	
	private static void månedskalender(int år, int mnd) {
		out.println("År: " + år);
		for (int i=1; i<=12; i++) {
			månedskalender(år, mnd);
		}
	}
	
	private static void ukekalender(int år, int mnd, int uke) {
		// Reell kode
	}
	
	private static String månedsnavn(int mnd) {
		return "Januar"; // Må bygges ut etter hvert...
	}
	
	private static int startUke(int år, int mnd) {
		return 2; // Reell kode
	}
	
	private static int sluttUke(int år, int mnd) {
		return 4; // Reell kode
	}
}