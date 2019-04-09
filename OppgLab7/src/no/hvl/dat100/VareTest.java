package no.hvl.dat100;
import static java.lang.System.*;

public class VareTest {
	public static void main(String[] args) {
		Vare v1 = new Vare(1, "Nudler", 29.90);
		Vare v2 = new Vare(2, "Melkesjokolade", 33.40);
		
		out.println(v1.toString());
		out.println("Moms: " + v1.moms());
		
		out.println();
		
		out.println(v2.toString());
		out.println("Moms: " + v2.moms());
		
		out.println();
		
		out.println("Nudler billigere enn Sjokolade = " + v1.billigereEnn(v2));
		
		out.println();
		
		v1.setPris(35.10);
		out.println(v1.getNavn() + " ny pris: " + v1.getPris());
		out.println(v1.getNavn() + " billigere enn " + v2.getNavn() + " = " + v1.billigereEnn(v2));
	}
}