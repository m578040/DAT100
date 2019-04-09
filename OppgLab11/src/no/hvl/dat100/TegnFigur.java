package no.hvl.dat100;

public class TegnFigur {
	public static void main(String[] args) {
		Tegnbar firkant = new Firkant();
		Tegnbar sirkel = new Sirkel();
		Tegnbar bil = new Bil();
		
		Tegnbar[] figurTab = {firkant, sirkel, bil};
		
		for (int i = 0; i < figurTab.length; i++) {
			figurTab[i].tegnOpp();
		}
	}
}