package oppg2;

public class Bordoversikt {
	private Bord[] bt;
	
	public int antallLedige() {
		int antall = 0;
		for (int i = 0; i < bt.length; i++) {
			if (bt[i].isLedig()) {
				antall++;
			}
		}
		return antall;
	}
	
	public int finnFørsteLedige(int antall) {
		boolean oppfyllerKrav = false;
		int i = 0;
		
		while (!oppfyllerKrav && i < bt.length) {
			if (bt[i].isLedig() && bt[i].getAntall() >= antall) {
				oppfyllerKrav = true;
			}
			i++;
		}
		return i;
	}
	
	public int passeBest(int antall) {
		int tempBeste = 0;
		for (int i = 1; i < bt.length; i++) {
			if (bt[i].isLedig() && bt[i].getAntall() >= antall) {
				if (bt[i].getAntall() < bt[tempBeste].getAntall()) {
					tempBeste = i;
				}
			}
		}
		
		return tempBeste;
	}
}