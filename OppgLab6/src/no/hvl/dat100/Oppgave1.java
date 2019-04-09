package no.hvl.dat100;

public class Oppgave1 {
	public static void main(String[] args) {
		skrivUtv1();
		
		System.out.println();
		
		skrivUtv2();
		
		System.out.println();
		
		int[][] matrise1 = {
				{0, 1, 0, 1, 0, 1, 0},
				{1, 1, 1, 1, 1, 1, 0},
				{0, 0, 1, 1, 0, 0, 1}
		};
		
		int[][] nymatrise = skaler(2, matrise1);
		
		for (int i[] : nymatrise) {
			for (int j : i) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println();
		
		int[][] matrise2 = {
				{0, 1, 0, 1, 0, 1, 0},
				{1, 1, 1, 1, 1, 1, 0},
				{0, 0, 1, 1, 0, 0, 1},
				{1, 0, 0, 0, 1, 1, 1},
				{0, 1, 1, 0, 0, 0, 0},
				{1, 0, 1, 1, 0, 1, 1},
				{0, 1, 0, 0, 1, 0, 1}
		};
		
		int[][] nymatrise2 = speile(matrise2);
		
		for (int i[] : nymatrise2) {
			for (int j : i) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public static void skrivUtv1() {
		int[][] matrise1 = {
				{0, 1, 0, 1, 0, 1, 0},
				{1, 1, 1, 1, 1, 1, 0},
				{0, 0, 1, 1, 0, 0, 1}
		};
		
		for (int i = 0; i < matrise1.length; i++) {
			for (int j = 0; j < matrise1[i].length; j++) {
				System.out.print(matrise1[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void skrivUtv2() {
		int[][] matrise2 = {
				{1, 0, 1, 0, 1, 0, 1},
				{0, 0, 1, 0, 0, 1, 0},
				{1, 1, 0, 0, 1, 1, 0}
		};
		
		for (int i[] : matrise2) {
			for (int j : i) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	public static int[][] skaler(int tall, int[][] matrise) {
		int[][] nyMatrise = new int[matrise.length][matrise[0].length];
		
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				nyMatrise[i][j] = matrise[i][j]*tall;
			}
		}
		
		return nyMatrise;
	}
	
	public static int[][] speile(int[][] matrise) {
		int[][] nyMatrise = new int[matrise.length][matrise[0].length];
		
		for (int i = 0; i < matrise[0].length; i++) {
			for (int j = 0; j < matrise.length; j++) {
				nyMatrise[i][j] = matrise[j][i];
			}
		}
		
		return nyMatrise;
	}
}