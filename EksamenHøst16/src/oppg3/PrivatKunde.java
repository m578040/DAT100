package oppg3;

public class PrivatKunde extends Kunde {
	private int avslag;
	private double grense;
	private double total;

	public PrivatKunde(String brukernavn, String passord, int kundenummer, int avslag, double grense, double total) {
		super(brukernavn, passord, kundenummer);
		this.avslag = avslag;
		this.grense = grense;
		this.total = total;
	}
	
	public double betal(double belop) {
		if (total > grense) {
			belop -= (belop/100) * avslag;
		}
		
		total += belop;
		
		return belop;
	}
	
	public BedriftsKunde tilBedriftsKunde(PrivatKunde pkunde) {
		BedriftsKunde bkunde = new BedriftsKunde(pkunde.getBrukernavn(), pkunde.getPassord(), pkunde.getKundenummer(), 5);
		return bkunde;
	}
}