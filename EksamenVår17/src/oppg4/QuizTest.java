package oppg4;

public class QuizTest {
	public static void main(String[] args) {
		Oppgave[] quiz = new Oppgave[2];
		Flervalg s1 = new Flervalg("Hvor mange innbyggere hadde Bergen 1. januar 2016?", 2, 3, 0);
		Heltall s2 = new Heltall("Hviket år hadde Norge sist folkeavstemming om medlemsskap i EU?", 3, 1994, 2);
		quiz[0] = s1;
		quiz[1] = s2;
	}
}