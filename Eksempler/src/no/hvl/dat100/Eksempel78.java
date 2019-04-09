package no.hvl.dat100;
import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class Eksempel78 {
	public static void main(String[] args) throws Exception{
		finnVarer("varedata.txt", "akk", ";");
	}
	
	public static void finnVarer(String filnavn, String søk, String skilletegn) throws Exception {
		Scanner leser = new Scanner(new File(filnavn));
		String linje;
		if (leser.hasNextLine()) {
			linje = leser.nextLine();
		} // NB! Fjernet bare kolonneoverskriftene
		while (leser.hasNextLine()) {
			linje = leser.nextLine();
			behandleVareLinje(linje, søk, skilletegn);
		}
		leser.close();
	}
	
	public static void behandleVareLinje(String linje, String søk, String skilletegn) {
		String[] vareTab = linje.split(skilletegn);
		int nr = Integer.parseInt(vareTab[0]);
		String navn = vareTab[1];
		double pris = Double.parseDouble(vareTab[2]);
		int antall = Integer.parseInt(vareTab[3]);
		if (navn.matches( "(.)*" + søk + "(.)*" ) ) {
			out.println("Vare " + nr + ": " + navn + " - pris=" + pris + " antall=" + antall);
		}
	}
}