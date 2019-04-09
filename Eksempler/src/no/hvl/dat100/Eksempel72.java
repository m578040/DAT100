package no.hvl.dat100;
import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import java.io.*;
import java.util.*;

public class Eksempel72 {
	public static void main(String[] args) throws Exception{
		String filnavn = showInputDialog("Filnavn:");
		File fil = new File(filnavn);
		Scanner leser = new Scanner(fil);
		int linjeNr = 1;
		String linje;
		while (leser.hasNextLine()) {
			linje = leser.nextLine();
			out.println(linjeNr + ": " + linje);
			linjeNr++;
		}
		leser.close();
	}
}