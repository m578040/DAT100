package eksempel64;
import static java.lang.System.*;

public class Rektangel {
	int x;		// (x, y) er posisjon for
	int y; 		// øvre venstre hjørne
	int b; 		// rektanglets bredde
	int h; 		// rektanglets høyde
	
	public Rektangel(int x, int y, int b, int h) {
		this.x = x; this.y = y;
		this.b = b; this.h = h;
	}
	
	public void størrelse(int b, int h) {
		this.b = b; this.h = h;
	}
	
	public void flytt(int dx, int dy) {
		this.x += dx; this.y += dy;
	}
	
	public double omkrets() {
		return 2*b + 2*h;
	}
	
	public String vis() {
		return "(" + x + "," + y + ") - B=" + b + ", H=" + h;
	}
	
	public static void main(String[] args) {
		Rektangel r1 = new Rektangel(200, 100, 20, 10);
		out.println(r1.vis());
		r1.flytt(40, 80);
		out.println(r1.vis());
		r1.størrelse(25, 15);
		out.println(r1.vis());
		out.println("Omkrets: " + r1.omkrets());
	}
}