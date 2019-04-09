package oppg4;

public class Flervalg extends Oppgave {
	private String[] alternativ;
	private int korrekt;
	
	public Flervalg(String sp, int p, int antAlternativ, int korrekt) {
		super(sp, p);
		alternativ = new String[antAlternativ];
		this.korrekt = korrekt;
	}
	
	public double poeng(int svar) {
		if (alternativ[svar].equals(alternativ[korrekt])) {
			return getMaksPoeng();
		} else {
			return 0;
		}
	}
}