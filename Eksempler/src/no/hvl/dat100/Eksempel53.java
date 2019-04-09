package no.hvl.dat100;

public class Eksempel53 {
	public static void main(String[] args) {
		int[] tall = {7, 2, 1, 4};
		int[] nyeTall = new int[tall.length];
		
		for (int tallNr = 0; tallNr < tall.length; tallNr++) {
			int minPos = 0;
			for (int posNr = 1; posNr < tall.length; posNr++) {
				if (tall[posNr] < tall[minPos]) {
					minPos = posNr;
				}
			}
			
			nyeTall[tallNr] = tall[minPos];
			
			tall[minPos] = Integer.MAX_VALUE;
		}
		
		tall = nyeTall;
	}
}