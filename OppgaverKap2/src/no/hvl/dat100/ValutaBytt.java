package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class ValutaBytt {
	public static void main(String[] args) {
		String tallTxt = showInputDialog("Oppgi et beløp i amerikanske dollar");
		double beløpAm = parseDouble(tallTxt);
		final double kurs = 8.33250008;
		double beløpNo = round(beløpAm * kurs);
		String utTxt = "Beløpet du skrev inn tilsvarer " + beløpNo + " i norske kroner.";
		showMessageDialog(null, utTxt);
	}
}