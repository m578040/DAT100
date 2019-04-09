package no.hvl.dat100;

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
		if (!sanger.contains(sang)) {
			sanger.add(sang);
			return true;
		} else {
			return false;
		}
	}

	public void visListe() {
		Iterator<Sang> liste = sanger.iterator();
		while (liste.hasNext()) {
			liste.next().skrivUt();
		}
	}

	public ArrayList<Sang> finnSanger(Sjanger sjanger) {
		ArrayList<Sang> nyListe = new ArrayList<Sang>();

		Iterator<Sang> liste = sanger.iterator();
		while (liste.hasNext()) {
			Sang tempSang = liste.next();
			if (tempSang.getGenre().equals(sjanger)) {
				nyListe.add(tempSang);
			}
		}

		return nyListe;
	}
}