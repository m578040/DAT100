package oppg5;

public class Matrise {
	public static boolean erPositiv(int[][] mat, int r, int k) {
		if (mat[r][k] > 0) {
			return true;
		}
		return false;
	}

	public static boolean erPositivRekke(int[][] mat, int r) {
		boolean positiv = true;
		int i = 0;

		while (positiv && i < mat[r].length) {
			if (mat[r][i] < 1) {
				positiv = false;
			}
			i++;
		}

		return positiv;
	}

	public static int antallNuller(int[][] mat) {
		int ant = 0;

		for (int i[] : mat) {
			for (int j : i) {
				if (j == 0) {
					ant++;
				}
			}
		}
		return ant;
	}
	
	public static boolean erKvadratisk(int[][] mat) {
		if (mat.length == mat[0].length) {
			return true;
		}
		return false;
	}
	
	public static int spor(int[][] mat) {
		int sum = 0;
		for (int i = 0; i < mat.length; i++) {
			sum += mat[i][i];
		}
		return sum;
	}
}