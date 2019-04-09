package oppg5;

public class Login {
	private boolean[][] monster;
	
	public boolean erMed(int r, int k) {
		return monster[r][k];
	}
	
	public void skrivUt() {
		String ut = "";
		for (boolean i[] : monster) {
			for (boolean k : i) {
				if (k) {
					ut += "*";
				} else {
					ut += " ";
				}
			}
			ut += "\n";
		}
		System.out.println(ut);
	}
	
	public boolean sjekkMonster(boolean[][] mnstr) {
		boolean like = true;
		for (int r = 0; r < monster.length; r++) {
			for (int k = 0; k < monster[r].length; k++) {
				if (monster[r][k] != mnstr[r][k]) {
					like = false;
				}
			}
		}
		return like;
	}
}