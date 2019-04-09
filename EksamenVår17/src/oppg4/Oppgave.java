package oppg4;

public abstract class Oppgave {
	private String spørsmål;
	private int maksPoeng;
	
	public Oppgave(String sp, int p) {
		spørsmål = sp;
		maksPoeng = p;
	}

	public String getSpørsmål() {
		return spørsmål;
	}

	public void setSpørsmål(String spørsmål) {
		this.spørsmål = spørsmål;
	}

	public int getMaksPoeng() {
		return maksPoeng;
	}

	public void setMaksPoeng(int maksPoeng) {
		this.maksPoeng = maksPoeng;
	}
	
	public abstract double poeng(int svar);
}