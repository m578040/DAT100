package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Divisjon {
	public static void main(String[] args) {
		String tallTxt = showInputDialog("Oppgi det første tallet:");
		int a = parseInt(tallTxt);
		tallTxt = showInputDialog("Oppgi tallet du vil dele det første tallet på:");
		int b = parseInt(tallTxt);
		
		if (b != 0) {
			showMessageDialog(null, a/b);
		}
		else {
			showMessageDialog(null, "Error");
		}
	}
}