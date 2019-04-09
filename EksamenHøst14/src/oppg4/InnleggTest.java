package oppg4;
import static javax.swing.JOptionPane.*;

public class InnleggTest {
	public static void main(String[] args) {
		String bruker = showInputDialog("Gi bruker");
		String dato = showInputDialog("Gi dato");
		String tekst = showInputDialog("Gi tekst");
		
		Tekst t1 = new Tekst(bruker, dato, tekst);
		
		t1.atLike();
		
		t1.skrivUt();
	}
}