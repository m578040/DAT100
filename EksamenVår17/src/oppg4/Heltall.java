package oppg4;

public class Heltall extends Oppgave {
	private int korrekt;
	private int feilmargin;

	public Heltall(String sp, int p, int korrekt, int feilmargin) {
		super(sp, p);
		this.korrekt = korrekt;
		this.feilmargin = feilmargin;
	}

	public double poeng(int svar) {
		if (svar == korrekt) {
			return getMaksPoeng();
		} else if (svar >= (korrekt - feilmargin) || svar <= (korrekt + feilmargin)) {
			return getMaksPoeng()/100 * 50;
		} else {
			return 0;
		}
	}
}