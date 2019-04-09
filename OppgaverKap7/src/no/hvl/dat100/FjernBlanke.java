package no.hvl.dat100;
import java.io.*;
import java.util.*;
import static javax.swing.JOptionPane.*;


public class FjernBlanke {
	public static void main(String[] args) throws Exception {
		String filnavn = args[0];
		File fil = new File(filnavn);
		Scanner leser = new Scanner(fil);
		
		String filTxt = "";
		while (leser.hasNextLine()) {
			String linje = leser.nextLine();
			if (linje.length() > 0) {
				filTxt += linje + "\n";
			}
		}
		leser.close();
		
		PrintWriter skriver = new PrintWriter(fil);
		skriver.println(filTxt);
		skriver.close();
		
		showMessageDialog(null, "Filbehandlingne er ferdig!");
	}
}