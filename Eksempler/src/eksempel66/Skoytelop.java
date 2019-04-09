package eksempel66;
import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class Skoytelop {
	// Klassevariabel
	private static Deltager[] løperTab;
	
	public static void main(String[] args) {
		lesInnResultat();
		//double best = bestePoengsum();
		//visVinnere(best);
	}
	
	private static void lesInnResultat() {
		// Les inn data om en og en løper
		String antTxt = showInputDialog("Antall løpere:");
		int ant = parseInt(antTxt);
		løperTab = new Deltager[ant];
		for (int nr = 0; nr < ant; nr++) {
		//	løperTab[nr] = lesDeltager();
		}
	}
	
	/*
	private static Deltager lesDeltager() {
		// Les inn nr, navn og tider for 1 deltager
		//Opprett og returner Deltager-objekt
	}
	*/
	
	/*
	private static double bestePoengsum() {
		// Finn laveste poengsum blant løperne
		double bestePoengsum = Double.MAX_VALUE;
		for (int nr = 0; nr < løperTab.length; nr++) {
			if (løperTab[nr].poengsum() < bestePoengsum) {
				bestePoengsum = løperTab[nr].poengsum();
			}
			return bestePoengsum;
		}
	}
	*/
	
	private static void visVinnere(double best) {
		// Skriv ut den/de som har best poengsum
	}
}