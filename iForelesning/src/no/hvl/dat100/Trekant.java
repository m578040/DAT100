package no.hvl.dat100;

public class Trekant extends Figur {
	private int høyde;
	private int grunnlinje;
	
	public Trekant(int høyde, int grunnlinje) {
		this.høyde = høyde;
		this.grunnlinje = grunnlinje;
	}

	public int getHøyde() {
		return høyde;
	}

	public void setHøyde(int høyde) {
		this.høyde = høyde;
	}

	public int getGrunnlinje() {
		return grunnlinje;
	}

	public void setGrunnlinje(int grunnlinje) {
		this.grunnlinje = grunnlinje;
	}
	
	public double areal() {
		return (høyde * grunnlinje) / 2;
	}
	
	public void tegn(char t) {
		for (int i = 0; i < høyde; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print(t);
			}
			System.out.println();
		}
	}
	
	public boolean equals(Object annen) {
		Trekant tk = (Trekant) annen;
		
		if (this == annen) {
			return true;
		} else if (annen == null || annen instanceof Trekant) {
			return false;
		} else {
			return this.høyde == tk.høyde && this.grunnlinje == tk.grunnlinje;
		}
	}
}