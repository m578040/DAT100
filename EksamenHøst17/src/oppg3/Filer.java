package oppg3;

import java.io.*;
import java.util.*;
import static javax.swing.JOptionPane.*;

public class Filer {
	public static void les(String filnavn) throws FileNotFoundException {
		File fil = new File(filnavn);
		Scanner sc = new Scanner(fil);

		String ut = "";

		while (sc.hasNextLine()) {
			String linje = sc.nextLine();
			if (!linje.contains("//")) {
				ut += linje + "\n";
			}
		}

		sc.close();

		System.out.println(ut);
	}
	
	public static boolean lesCatch(String filnavn) {
		try {
			les(filnavn);
			return true;
		} catch (FileNotFoundException e) {
			return false;
		}
	}
	
	public static void lesForsok(int forsok) {
		int antforsok = 0;
		
		while (!lesCatch(showInputDialog("Gi filnavn")) && antforsok < forsok) {
			showMessageDialog(null, "Fil ikke funnet, prøv på nytt");
			antforsok++;
		}
		
		if (antforsok == forsok) {
			showMessageDialog(null, "Antall forsøk brukt opp");
		}
	}
}