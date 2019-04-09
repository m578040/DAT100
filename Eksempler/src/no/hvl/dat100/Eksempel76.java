package no.hvl.dat100;
import java.io.*;
import java.util.*;

public class Eksempel76 {
	public static void kopierFil(String inn, String ut) throws Exception {
		Scanner leser = new Scanner( new File(inn));
		PrintWriter skriver = new PrintWriter(ut);
		leser.useDelimiter("\\Z"); // Slutt på filen
		String innhold = leser.next();
		skriver.print(innhold);
		leser.close();
		skriver.close();
	}
}