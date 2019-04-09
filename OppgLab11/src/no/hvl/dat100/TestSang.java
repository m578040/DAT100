package no.hvl.dat100;

import java.util.Iterator;

public class TestSang {

	public static void main(String[] args) {
		Sang s1 = new Sang("Africa", (int)4.56*60, Sjanger.ANNET);
		Sang s2 = new Sang("I Want It That Way", (int)3.33*60, Sjanger.POP);
		Sang s3 = new Sang("Country Roads", (int)3.13*60, Sjanger.ANNET);
		Sang s4 = new Sang("The River", (int)5*60, Sjanger.ROCK);
		
		Spilleliste sListe = new Spilleliste();
		sListe.leggTil(s1);
		sListe.leggTil(s2);
		sListe.leggTil(s4);
		sListe.leggTilSjekk(s3);
		
		sListe.visListe();
		
		Iterator<Sang> iNyListe = sListe.finnSanger(Sjanger.ANNET).iterator();
		while (iNyListe.hasNext()) {
			iNyListe.next().skrivUt();
		}
	}
}