package no.hvl.dat100;
import java.io.*;
// Importerer aktuelle filklasser

public class Eksempel71 {
	public static void main(String[] args) throws Exception {
		//Åpner filen for skriving
		String filnavn = "navn.txt";
		PrintWriter skriver = new PrintWriter(filnavn);
		
		String[] navnTab = {"Jo", "Jan", "June", "Jenny"};
		
		// Skriv hvert navn i navnTab til fil
		for (int i = 0; i < navnTab.length; i++) {
			skriver.println(navnTab[i]);
		}
		
		skriver.close();
	}
}