package oppg2;

public class KSamling {
	private Kommune[] kTab;
	private int antall;
	
	private KSamling(int størrelse) {
		kTab = new Kommune[størrelse];
		antall = 0;
	}
	
	public boolean leggTil(Kommune k) {
		if (antall > kTab.length) {
			kTab[antall] = k;
			return true;
		} else {
			return false;
		}
	}
	
	public Kommune tettestBefolket() {
		Kommune tettestBefolket = null;
		
		if (antall > 0) {
			tettestBefolket = kTab[0];
			for (int i = 1; i < antall; i++) {
				if (tettestBefolket.tetthet() > kTab[i].tetthet()) {
					tettestBefolket = kTab[i];
				}
			}
		} else {
			return null;
		}
		
		return tettestBefolket;
	}
}