package oppg1;

public class FigurTest {
	public static void main(String[] args) {
		Tegnbar[] figur = new Tegnbar[3];
		
		figur[0] = new Firkant();
		figur[1] = new Sirkel();
		figur[2] = new Pil();
		
		for (int i = 0; i < figur.length; i++) {
			figur[i].tegnOpp();
			System.out.println();
		}
	}
}