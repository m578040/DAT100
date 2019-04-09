package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Sortere {
	public static void main(String[] args) {
		String tallTxt = showInputDialog("Oppgi det første tallet:");
		int tall1 = parseInt(tallTxt);
		tallTxt = showInputDialog("Oppgi det andre tallet:");
		int tall2 = parseInt(tallTxt);
		tallTxt = showInputDialog("Oppgi det siste tallet:");
		int tall3 = parseInt(tallTxt);
		String utTxt;
		
		if (tall1 < tall2 && tall1 < tall3 && tall2 < tall3) 
			utTxt = tall1 + " - " + tall2 + " - " + tall3;
		else if (tall1 < tall2 && tall1 < tall3 && tall2 > tall3)
			utTxt = tall1 + " - " + tall3 + " - " + tall2;
		else if (tall1 > tall2 && tall1 < tall3 && tall2 < tall3)
			utTxt = tall2 + " - " + tall1 + " - " + tall3;
		else if (tall1 > tall2 && tall1 > tall3 && tall2 < tall3)
			utTxt = tall2 + " - " + tall3 + " - " + tall1;
		else if (tall1 < tall2 && tall1 > tall3 && tall2 > tall3)
			utTxt = tall3 + " - " + tall1 + " - " + tall2;
		else
			utTxt = tall3 + " - " + tall2 + " - " + tall1;
		
		showMessageDialog(null, utTxt);
	}
}