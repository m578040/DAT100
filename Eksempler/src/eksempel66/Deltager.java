package eksempel66;

public class Deltager {
	int nr;
	String navn;
	double tid5H, tid5T, tid15H, tid10T;
	// 5H=500, 5t=5000, 15H=1500, 10T=10000

	public Deltager(int nr, String navn, double tid5H, double tid5T, double tid15H, double tid10T) {
		this.nr = nr;
		this.navn = navn;
		this.tid5H = tid5H;
		this.tid5T = tid5T;
		this.tid15H = tid15H;
		this.tid10T = tid10T;
	}

	public double poengsum() {
		return tid5H + tid5T / 10 + tid15H / 3 + tid10T / 20;
	}

	public String toString() {
		return nr + " " + navn + ": " + poengsum();
	}
}