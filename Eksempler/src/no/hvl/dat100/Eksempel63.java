package no.hvl.dat100;

public class Eksempel63 {
	public static void main(String[] args) {
		String[] ordTab = {"Et", "tall", "og", "et", "tall"};
		String søkeord = "Tall";
		søkeord = søkeord.toUpperCase();
		int antall = 0;
		for (int i = 0; i < ordTab.length; i++) {
			String ord = ordTab[i].toUpperCase();
			if (søkeord.equals(ord)) {
				antall++;
			}
		}
	}
}