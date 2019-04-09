package no.hvl.dat100;
import java.io.*;

public class Eksempel73 {
	public static void main(String[] args) throws Exception{
		String fil = "navn.txt";
		String nyttNavn = "Anders";
		FileWriter skrivelink = new FileWriter(fil, true);
		PrintWriter skriver = new PrintWriter(skrivelink);
		skriver.println(nyttNavn);
		skriver.close();
	}
}