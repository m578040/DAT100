package no.hvl.dat100;

public class Varelager {
	private Vare[] varelager;
	private int antall;
	private final static int ANT = 10;

	public Varelager(int startKapasitet) {
		varelager = new Vare[startKapasitet];
		antall = 0;
	}

	public Varelager() {
		this(ANT);
	}

	public void leggTil(Vare v) {
		if (antall < ANT) {
			varelager[antall] = v;
			antall++;
		}
	}

	public boolean søkVare(int vareNr) {
		for (int i = 0; i < antall; i++) {
			if (varelager[i].getVareNr() == vareNr) {
				return true;
			}
		}
		return false;
	}

	public double totalPris() {
		double sum = 0;
		for (int i = 0; i < antall; i++) {
			sum += varelager[i].getPris();
		}
		return sum;
	}

	public void slett(int vareNr) {
		int pos = 0;
		for (int i = 0; i < antall; i++) {
			if (varelager[i].getVareNr() == vareNr) {
				pos = i;
			}
		}
		for (int i = pos; i < (antall - 1); i++) {
			varelager[i].setVareNr(i+1);
			varelager[i].setNavn(varelager[i+1].getNavn());
			varelager[i].setPris(varelager[i+1].getPris());
		}
		varelager[antall] = null;
		antall--;
	}

	public String toString() {
		String ut = "";
		for (int i = 0; i < antall; i++) {
			ut += "Varenr: " + varelager[i].getVareNr() + " Navn: " + varelager[i].getNavn() + " Pris: "
					+ varelager[i].getPris() + "\n";
		}
		return ut;
	}

	public int getAntall() {
		return antall;
	}

	public void setAntall(int antall) {
		this.antall = antall;
	}

	public Vare[] getVarelager() {
		return varelager;
	}

	public void setVarelager(Vare[] varelager) {
		this.varelager = varelager;
	}
}