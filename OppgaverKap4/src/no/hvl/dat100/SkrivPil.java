package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;
import static java.lang.Integer.*;

public class SkrivPil {
	public static void main(String[] args) {
		String melding = "Oppgi antall nivåer for pilutskriften:";
		int antall = parseInt(showInputDialog(melding));
		
		skrivPil('>', antall);
	}
	
	private static void skrivPil(char t, int m) {
		for (int i = 1; i <= m*2; i+=2) {
			for (int j = 1; j <= i; j++) {
				out.print(t);
			}
			out.println();
		}
		
		for (int i = m; i > 0; i-=2) {
			for (int j = i; j > 0; j--) {
				out.print(t);
			}
			out.println();
		}
	}
}