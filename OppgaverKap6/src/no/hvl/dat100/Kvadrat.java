package no.hvl.dat100;
import static java.lang.Math.*;
import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Kvadrat {
	int sidelengde;
	
	public Kvadrat(int sidelengde) {
		this.sidelengde = sidelengde;
	}
	
	public double areal() {
		return pow(sidelengde, 2);
	}
	
	public double omkrets() {
		return sidelengde*4;
	}
	
	public double diagonal() {
		return sidelengde;
	}
	
	public void tegn() {
		for (int i = 0; i < sidelengde; i++) {
			for (int j = 0; j < sidelengde; j++) {
				out.print("* ");
			}
			out.println();
		}
	}
	
	public static boolean sum(Kvadrat sl1, Kvadrat sl2, Kvadrat sl3) {
		if (sl3.areal() == (sl1.areal() + sl2.areal())) {
			return true;
		} else if (sl2.areal() == (sl1.areal() + sl3.areal())) {
			return true;
		} else if (sl1.areal() == (sl2.areal() + sl3.areal())) {
			return true;
		} else {
			return false;
		}
	}
	
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
		
		if (sum(sl1, sl2, sl3)) {
			out.print("Det ene kvadratet kan skrives som en sum av de to andre kvadratene.");
		}
	}
}