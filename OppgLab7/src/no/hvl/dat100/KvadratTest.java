package no.hvl.dat100;
import static java.lang.Integer.*;
import static java.lang.System.*;
import static javax.swing.JOptionPane.*;

public class KvadratTest {
	public static void main(String[] args) {
		String tallTxt = showInputDialog("Oppgi sidelengden på kvadratet:");
		Kvadrat sl1 = new Kvadrat(parseInt(tallTxt));
		tallTxt = showInputDialog("Oppgi sidelengden på kvadratet:");
		Kvadrat sl2 = new Kvadrat(parseInt(tallTxt));
		tallTxt = showInputDialog("Oppgi sidelengden på kvadratet:");
		Kvadrat sl3 = new Kvadrat(parseInt(tallTxt));
		
		out.println("Kvadrat med sidelengde: " + sl1.sidelengde);
		out.println("Areal: " + sl1.areal());
		out.println("Omkrets: " + sl1.omkrets());
		out.println("Lengde på diagonal: " + sl1.diagonal());
		sl1.tegn();
		
		out.println();
		
		out.println("Kvadrat med sidelengde: " + sl2.sidelengde);
		out.println("Areal: " + sl2.areal());
		out.println("Omkrets: " + sl2.omkrets());
		out.println("Lengde på diagonal: " + sl2.diagonal());
		sl2.tegn();
		
		out.println();
		
		out.println("Kvadrat med sidelengde: " + sl3.sidelengde);
		out.println("Areal: " + sl3.areal());
		out.println("Omkrets: " + sl3.omkrets());
		out.println("Lengde på diagonal: " + sl3.diagonal());
		sl3.tegn();
		
		out.println();
		
		if (Kvadrat.sum(sl1, sl2, sl3)) {
			out.print("Det ene kvadratet kan skrives som en sum av de to andre kvadratene.");
		}
	}
}