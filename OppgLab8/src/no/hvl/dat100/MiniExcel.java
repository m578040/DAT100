package no.hvl.dat100;

public class MiniExcel {

	private static int[][] data = {{ 1, 2, 0 },
									{ 3, 4, 0 },
									{ 5, 6, 0 },
									{ 0, 0, 0 }};

	public static void skrivUt() {

		System.out.println("-----");

		// TODO - START
		
		// iterer igjennom tabellen og skriv ut - utvidet for-løkke
		for (int[] i : data) {
			for (int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		// TODO _END

		System.out.println("-----");
	}

	public static void beregnSum() {

		// TODO - START

		// summer hver rad og skriv summen i siste element
		for (int i = 0; i < data.length; i++) {
			int sum = 0;
			for (int j = 0; j < data[0].length; j++) {
				if (j == data[0].length - 1) {
					data[i][j] = sum;
				} else {
					sum += data[i][j];
				}
			}
		}
	
		// TODO - END

		
		// TODO - START

		// summer hver kolonne og skrive summen i siste element
		for (int i = 0; i < (data[0].length - 1); i++) {
			int sum = 0;
			for (int j = 0; j < data.length; j++) {
				if (j == data.length - 1) {
					data[j][i] = sum;
				} else {
					sum += data[j][i];
				}
			}
		}

		// TODO - END

	}

	public static void main(String args[]) {

		skrivUt();

		beregnSum();

		skrivUt();
	}
}