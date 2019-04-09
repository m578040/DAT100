package oppg4;

public class Mainmetode {
	public static void main(String[] args) {
		Resultat[] tab = new Resultat[10];
		
		Spyd r1 = new Spyd("Bendik Simonsen", 'M', 68.65);
		HundreMeter r2 = new HundreMeter("Jon Vollset", 'M', 9.00);
		
		tab[0] = r1;
		tab[1] = r2;
		
		System.out.println(tab[0].poeng());
		System.out.println(tab[1].poeng());
	}
}