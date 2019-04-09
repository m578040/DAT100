package oppg2;

public class Flyavganger {
	private Flyavgang[] tab;

	public Flyavganger(int størrelse) {
		tab = new Flyavgang[størrelse];
	}

	public boolean erNull(int p) {
		if (tab[p] == null) {
			return true;
		}
		return false;
	}

	public int antall() {
		int ant = 0;
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] != null) {
				ant++;
			}
		}
		return ant;
	}

	public void visInfo() {
		String ut = "";
		for (Flyavgang f : tab) {
			if (f != null) {
				ut += f.toString();
			}
		}

		System.out.println(ut);
	}
	
	public boolean setStatus(int nummer, char status) {
		boolean finnes = false;
		int i = 0;
		
		while (!finnes && i < tab.length) {
			if (erNull(i) && tab[i].getNummer() == nummer) {
				tab[i].setStatus(status);
				finnes = true;
			}
			i++;
		}
		
		return finnes;
	}
	
	public boolean settInn(Flyavgang flyavgang) {
		boolean ledig = false;
		int i = 0;
		
		while (!ledig && i < tab.length) {
			if (erNull(i)) {
				ledig = true;
			}
			i++;
		}
		
		if (ledig) {
			tab[i] = flyavgang;
		}
		
		return ledig;
	}
	
	public boolean slett(int nummer) {
		boolean slettet = false;
		int i = 0;
		
		while (!slettet && i < tab.length) {
			if (tab[i].getNummer() == nummer) {
				tab[i] = null;
				slettet = true;
			}
			i++;
		}
		
		return slettet;
	}
}