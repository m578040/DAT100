package no.hvl.dat100;
import java.io.*;
import java.util.*;
import static javax.swing.JOptionPane.*;

public class LeseFraFil {

	static String MAPPE_STR = System.getProperty("user.dir") + "/src/no/hvl/dat100/lesinnfil/";

	static public void main(String[] args) {
		String filnavn = "";
		int forsøk = 0;
		
		do {
		try {
			filnavn = showInputDialog("Filnavn i mappen " + MAPPE_STR);
	
			File file = new File(MAPPE_STR + filnavn);
			Scanner reader = new Scanner(file);
	
			int linenumber = 1;
	
			// les innhold i filen linje for linje
			String line;
	
			while (reader.hasNextLine()) {
				line = reader.nextLine();
				System.out.println(linenumber + " " + line);
				linenumber++;
			}
	
			reader.close();
		} catch (FileNotFoundException e) {
			showMessageDialog(null, "Filen " + filnavn + " finnes ikke. \n" + e.getMessage());
			forsøk++;
		}
		
		} while (forsøk < 3);
		
		if (forsøk == 3) {
			showMessageDialog(null, "Du har brukt opp antall forsøk!");
		}
	}
}