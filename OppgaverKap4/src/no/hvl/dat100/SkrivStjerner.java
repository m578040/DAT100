package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;
import static java.lang.Integer.*;

public class SkrivStjerner {
	public static void main(String[] args) {
		String melding = "Oppgi antall linjer:";
		int m = parseInt(showInputDialog(melding));
		melding = "Oppgi antall stjerner per linje:";
		int n = parseInt(showInputDialog(melding));
		
		skrivStjerner(m, n);
		
		out.println();
		out.println();
		
		melding = "Oppgi et helltall:";
		int o = parseInt(showInputDialog(melding));
		
		skrivStjerner2(o);
	}
	
	private static void skrivStjerner(int m, int n) {
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				out.print("* ");
			}
			out.println();
		}
	}
	
	private static void skrivStjerner2(int o) {
		for (int i = 1; i <= o; i++) {
			for (int j = 1; j <= i; j++) {
				out.print("* ");
			}
			out.println();
		}
	}
}