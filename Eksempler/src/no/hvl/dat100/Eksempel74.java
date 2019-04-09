package no.hvl.dat100;
import java.io.*;
import static java.lang.System.*;

public class Eksempel74 {
	public static void listFiler(String katNavn) throws Exception{
		File katalog = new File(katNavn);
		if (!katalog.exists()) {
			out.println("Katalogen finnes ikke.");
		} else {
			if (!katalog.isDirectory()) {
				out.println("Katalogen er en fil.");
			} else {
				String[] filer = katalog.list();
				for (String filnavn : filer) {
					out.println(filnavn);
				}
			}
		}
	}
}