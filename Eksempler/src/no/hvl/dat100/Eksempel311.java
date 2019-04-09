package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Eksempel311 {
	public static void main(String[] args) {
		int mnd = 0;
		do {
			mnd = parseInt(showInputDialog("Månedsnr:"));
		} while (mnd < 1 || mnd > 12);
	}
}