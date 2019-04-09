package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Areal {
	public static void main(String[] args) {
		String tallTxt = showInputDialog("Oppgi lengden på rektangelet");
		int tall1 = parseInt(tallTxt);
		tallTxt = showInputDialog("Oppgi bredden på rektangelet");
		int tall2 = parseInt(tallTxt);
		int areal = tall1 * tall2;
		String utTxt = "Arealet av rektangelet blir " + areal;
		showMessageDialog(null, utTxt);
	}
}