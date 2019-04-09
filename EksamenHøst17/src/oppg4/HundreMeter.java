package oppg4;

public class HundreMeter extends Resultat {
	private double tid;

	public HundreMeter(String navn, char kjønn, double tid) {
		super(navn, kjønn);
		this.tid = tid;
	}

	public int poeng() {
		int poeng = 1000;
		double forskjell = 0;
		if (getKjønn() == 'M') {
			forskjell = tid - 10.40;
		} else {
			forskjell = tid - 11.60;
		}
		poeng -= forskjell * 240;
		return poeng;
	}
}