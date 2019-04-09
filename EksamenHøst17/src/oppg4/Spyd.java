package oppg4;

public class Spyd extends Resultat {
	private double lengde;

	public Spyd(String navn, char kjønn, double lengde) {
		super(navn, kjønn);
		this.lengde = lengde;
	}

	public int poeng() {
		int poeng = 1000;

		if (getKjønn() == 'M') {
			double forskjell = lengde - 77.20;
			poeng += 15 * forskjell;
		} else {
			double forskjell = lengde - 60;
			poeng += 15 * forskjell;
		}
		return poeng;
	}
}