package no.hvl.dat100;

import java.io.*;
import java.util.*;

public class SnuSortertNavneliste {
	public static void main(String[] args) throws Exception {
		String filnavn = args[0];
		File fil = new File(filnavn);
		Scanner leser = new Scanner(fil);

		String linje = "";
		while (leser.hasNextLine()) {
			linje += leser.nextLine() + " ";
		}
		leser.close();

		String[] navnTab = linje.split(" ");

		PrintWriter skriver = new PrintWriter(filnavn);
		for (int i = 0; i <= navnTab.length; i++)
			skriver.println(navnTab[navnTab.length - i]);
		skriver.close();
	}
}