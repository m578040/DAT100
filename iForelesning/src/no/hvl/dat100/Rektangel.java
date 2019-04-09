package no.hvl.dat100;

public class Rektangel extends Figur {
	private int høyde;
	private int bredde;
	
	public Rektangel(int høyde, int bredde) {
		this.høyde = høyde;
		this.bredde = bredde;
	}
	
	public int getHøyde() {
		return høyde;
	}
	
	public void setHøyde(int høyde) {
		this.høyde = høyde;
	}
	
	public int getBredde() {
		return bredde;
	}
	
	public void setBredde(int bredde) {
		this.bredde = bredde;
	}
	
	public double areal() {
		return høyde * bredde;
	}
	
	public void tegn(char t) {
		for (int i = 0; i < høyde; i++) {
			for (int j = 0; j < bredde; j++) {
				System.out.print(t);
			}
			System.out.println();
		}
	}
}