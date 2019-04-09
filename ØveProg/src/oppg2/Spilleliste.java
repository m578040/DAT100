package oppg2;
import java.util.*;

public class Spilleliste {
	private ArrayList<Sang> sanger;
	
	public Spilleliste() {
		sanger = new ArrayList<Sang>();
	}
	
	public void leggTil(Sang sang) {
		sanger.add(sang);
	}
	
	public boolean leggTilSjekk(Sang sang) {
		if (sanger.contains(sang)) {
			return false;
		}
		sanger.add(sang);
		return true;
	}
	
	public void visListe() {
		Iterator<Sang> i = sanger.iterator();
		
		while(i.hasNext()) {
			i.next().skrivUt();
		}
	}
	
	public ArrayList<Sang> finnSanger(Sjanger sjanger) {
		ArrayList<Sang> sangerFraSjanger = new ArrayList<Sang>();
		Iterator<Sang> i = sanger.iterator();
		Sang sang = null;
		
		while (i.hasNext()) {
			sang = i.next();
			if (sang.getGenre().equals(sjanger)) {
				sangerFraSjanger.add(sang);
			}
		}
		return sangerFraSjanger;
	}
}