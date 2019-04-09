package oppg5;

public class Ikon {
	private static boolean[][] ikon;
	
	public boolean erSvart(int r, int k) {
		if (ikon[r][k]) {
			return true;
		} else {
			return false;
		}
	}
	
	public void vis() {
		String ut = "";
		for (boolean[] i : ikon) {
			for (boolean k : i) {
				if (k) {
					ut += "#";
				} else {
					ut += " ";
				}
			}
			ut += "\n";
		}
		System.out.println(ut);
	}
	
	public boolean flestSvarte() {
		int antSvart = 0;
		int antHvit = 0;
		for (int r = 0; r < ikon.length; r++) {
			for (int k = 0; k < ikon[r].length; k++) {
				if (erSvart(r, k)) {
					antSvart++;
				} else {
					antHvit++;
				}
			}
		}
		
		if (antSvart > antHvit) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean[][] inverter() {
		boolean[][] nyTab = new boolean[ikon.length][ikon[0].length];
		
		for (int r = 0; r < ikon.length; r++) {
			for (int k = 0; k < ikon[r].length; k++) {
				nyTab[r][k] = !ikon[r][k];
			}
		}
		return nyTab;
	}
	
	public boolean[][] speilVend() {
		boolean[][] nyTab = new boolean[ikon.length][ikon[0].length];
		
		for (int r = 0; r < ikon.length; r++) {
			for (int k = 0; k < ikon[r].length; k++) {
				nyTab[r][k] = ikon[r][ikon[r].length-1-k];
			}
		}
		return nyTab;
	}
}