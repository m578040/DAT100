package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class ArealSirkel {
	public static void main(String[] args) {
		String tallTxt = showInputDialog("Oppgi radius av sirkelen");
		double radius = parseDouble(tallTxt);
		double areal =  round(PI * pow(radius, 2));
		String utTxt = "Arealet av sirkelen blir " + areal;
		showMessageDialog(null, utTxt);
	}
}