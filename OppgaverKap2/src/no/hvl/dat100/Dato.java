package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Dato {

	public static void main(String[] args) {
		String tallTxt = showInputDialog("Oppgi dag:");
		int dag = parseInt(tallTxt);
		tallTxt = showInputDialog("Oppgi måned");
		int måned = parseInt(tallTxt);
		tallTxt = showInputDialog("Oppgi år");
		int år = parseInt(tallTxt);
		String dato = "Datoen blir da: " + dag + "." + måned + "." + år;
		showMessageDialog(null, dato);
	}
}