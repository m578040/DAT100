package oppg2;

public class SpillelisteTest {
	public static void main(String[] args) {
		Sang s1 = new Sang("Bendiks sang", 100, Sjanger.POP);
		Sang s2 = new Sang("Jons sang om livet", 123, Sjanger.ROCK);
		
		Spilleliste sanger = new Spilleliste();
		
		sanger.leggTil(s1);
		System.out.println(sanger.leggTilSjekk(s2));
		System.out.println(sanger.leggTilSjekk(s2));
		
		sanger.visListe();
		
		sanger.finnSanger(Sjanger.POP).toString();
	}
}