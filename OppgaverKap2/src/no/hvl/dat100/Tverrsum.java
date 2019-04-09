package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Tverrsum {
	public static void main(String[] args) {
		String tallTxt = showInputDialog("Oppgi et heltall mellom 0 og 1000");
		int tall = parseInt(tallTxt);
		int tall1 = tall/100;
		int tall2 = (tall%100)/10;
		int tall3 = tall%10;
		int sum = tall1 + tall2 + tall3;
		String utTxt = "Tverrsummen av tallet du skrev inn blir " + sum;
		showMessageDialog(null, utTxt);
	}
}