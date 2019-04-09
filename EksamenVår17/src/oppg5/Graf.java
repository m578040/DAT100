package oppg5;

import java.util.*;

public class Graf {
	private boolean[][] nabomatrise;
	
	public boolean erNaboer(int u, int w) {
		return nabomatrise[u][w];
	}
	
	public boolean erSti(int[] noder) {
		boolean sti = true;
		int i = 0;
		
		while (sti && i < noder.length) {
			if (!erNaboer(i - 1, i)) {
				sti = false;
			}
			i++;
		}
		return sti;
	}
	
	public ArrayList<Integer> naboer(int v) {
		ArrayList<Integer> naboer = new ArrayList<Integer>();
		for (int i = 0; i < nabomatrise.length; i++) {
			if (erNaboer(v, i)) {
				naboer.add(i);
			}
		}
		return naboer;
	}
	
	public boolean harLøkke() {
		boolean harLøkke = false;
		int i = 0;
		while (!harLøkke && i < nabomatrise.length) {
			if (nabomatrise[i][i]) {
				harLøkke = true;
			}
			i++;
		}
		return harLøkke;
	}
}