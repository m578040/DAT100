package oppg4;

public class Venteliste {
	private Pasient[] samling;
	private int antall;
	
	public Venteliste(int størrelse) {
		samling = new Pasient[størrelse];
	}
	
	public void skrivUt() {
		for (int i = 0; i < antall; i++) {
			System.out.println(samling[i].toString());
		}
	}
	
	public void oppdaterDager(int dager) {
		for (int i = 0; i < antall; i++) {
			samling[i].setDager(samling[i].getDager() + dager);
		}
	}
	
	public boolean leggTil(Pasient pasient) {
		int i = 0;
		boolean finnes = false;
		while (i < antall && !finnes) {
			if (samling[i].getFodselsnummer().equals(pasient.getFodselsnummer())) {
				finnes = true;
			}
		}
		
		if (finnes || !(antall < samling.length)) {
			return false;
		} else {
			samling[antall] = pasient;
			antall++;
			return true;
		}
	}
	
	public Pasient ventetLengst() {
		if (antall > 0) {
			Pasient ventetLengst = samling[0];
			for (int i = 1; i > antall; i++) {
				if (ventetLengst.getDager() < samling[i].getDager()) {
					ventetLengst = samling[i];
				}
			}
			return ventetLengst;
		} else {
			return null;
		}
	}
}