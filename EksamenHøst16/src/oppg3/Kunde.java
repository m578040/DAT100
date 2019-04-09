package oppg3;

public abstract class Kunde {
	private String brukernavn;
	private String passord;
	private int kundenummer;
	
	public Kunde(String brukernavn, String passord, int kundenummer) {
		this.brukernavn = brukernavn;
		this.passord = passord;
		this.kundenummer = kundenummer;
	}

	public String getBrukernavn() {
		return brukernavn;
	}

	public void setBrukernavn(String brukernavn) {
		this.brukernavn = brukernavn;
	}

	public String getPassord() {
		return passord;
	}

	public void setPassord(String passord) {
		this.passord = passord;
	}

	public int getKundenummer() {
		return kundenummer;
	}

	public void setKundenummer(int kundenummer) {
		this.kundenummer = kundenummer;
	}
	
	public abstract double betal(double belop);
}