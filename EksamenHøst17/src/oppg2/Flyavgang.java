package oppg2;

public class Flyavgang {
	private int nummer;
	private String destinasjon;
	private String tid;
	private char status;

	public Flyavgang(int nummer, String destinasjon, String tid, char status) {
		this.nummer = nummer;
		this.destinasjon = destinasjon;
		this.tid = tid;
		this.status = status;
	}

	public int getNummer() {
		return nummer;
	}

	public void setNummer(int nummer) {
		this.nummer = nummer;
	}

	public String getDestinasjon() {
		return destinasjon;
	}

	public void setDestinasjon(String destinasjon) {
		this.destinasjon = destinasjon;
	}

	public String getTid() {
		return tid;
	}

	public void setTid(String tid) {
		this.tid = tid;
	}

	public char getStatus() {
		return status;
	}

	public void setStatus(char status) {
		this.status = status;
	}

	public String toString() {
		String st = "";
		switch (this.status) {
		case 'o':
			st = "on-time";
			break;
		case 'g':
			st = "go-to-gate";
			break;
		case 'b':
			st = "boarding";
			break;
		case 'c':
			st = "gate-closed";
			break;
		default:
			st = "-";
		}
		
		return nummer + " " + destinasjon + " " + tid + " " + st + "\n";
	}
}