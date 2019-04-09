package no.hvl.dat100;
import java.io.*;
import java.util.*;
import static javax.swing.JOptionPane.*;

public class TellAntTegn {
	public static void main(String[] args) throws FileNotFoundException {
		String filnavn = showInputDialog("Skriv navnet på filen:");
		
		File fil = new File(filnavn);
		Scanner leser = new Scanner(fil);
		
		int antTegn = 0;
		
		while (leser.hasNextLine()) {
			String linje = leser.nextLine();
			antTegn += linje.length();
		}
		
		leser.close();
		
		System.out.println("Antall ord i fil: " + antTegn);
	}
}