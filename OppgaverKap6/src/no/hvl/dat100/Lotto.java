package no.hvl.dat100;

import java.util.Arrays;
import static javax.swing.JOptionPane.*;

public class Lotto {
	int[] rekke = new int[7];
	
	public Lotto() {
		nyRekke();
	}
	
	private void nyRekke() {
		for (int i = 0; i < rekke.length; i++) {
			int tall;
			boolean fraFør;
			do {
				fraFør = false;
				tall = 1 + (int)(Math.random()*34);
				int j = 0;
				while (!fraFør && j < i) {
					if (tall == rekke[j++]) {
						fraFør = true;
					}
				}
			} while (fraFør);
			rekke[i] = tall;
		}
		Arrays.sort(rekke);
	}
	
	public String toString() {
		return Arrays.toString(rekke);
	}
	
	public boolean erLik(Lotto annen) {
		return Arrays.equals(rekke, annen.rekke);
	}
	
	public static void main(String[] args) {
		Lotto r1 = new Lotto();
		Lotto r2;
		
		do {
			r2 = new Lotto();
		} while (r2.erLik(r1));
		
		String ut = "Lottokupong" + "\n" +
                "1:  " + r1.toString() + "\n" +
                "2:  " + r2.toString();
    showMessageDialog(null, ut);
	}
}