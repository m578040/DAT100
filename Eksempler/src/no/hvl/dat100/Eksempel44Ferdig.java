package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.System.*;
import java.util.Calendar;
 
public class Eksempel44Ferdig {
	public static void main(String[] args) {
		int år = parseInt( showInputDialog("Årstall:") );
		årskalender(år);
	}
 
	private static void årskalender(int år) {
	    startDok();
	    overskrift1("År " + år);
	    for (int mnr=1; mnr<=12; mnr++) {
	    	månedskalender(år, mnr);
	    }
	    stoppDok();
	}
	 
	private static void månedskalender(int år, int mnr) {
		overskrift2( månedsnavn(mnr) );
	    startTabell();
	    startRad();
	    tabellOverskrift("Uke");
	    tabellOverskrift("Man");
	    tabellOverskrift("Tir");
	    tabellOverskrift("Ons");
	    tabellOverskrift("Tor");
	    tabellOverskrift("Fre");
	    tabellOverskrift("Lør");
	    tabellOverskrift("Søn");
	    stoppRad();
	    int startUke = startUke(år, mnr);
	    int sluttUke = sluttUke(år, mnr);
	 
	    if ( startUke>sluttUke ) { // De første dagene i jan
	    	ukekalender(år-1, 12, startUke);
	    	startUke = 1;
	    }
	 
	    for (int ukenr=startUke; ukenr<=sluttUke; ukenr++) {
	    	ukekalender(år, mnr, ukenr);
	    }
	    stoppTabell();
	  }
	 
	  private static void ukekalender(int år, int mnr, int unr) {
		  startRad();
		  tabellVerdi(unr + " ");
		  for (int dnr=1; dnr<=7; dnr++) {
			  int dagNr = dagNr(år, mnr, unr, dnr);
			  tabellVerdi(dagNr + " ");
		  }
		  stoppRad();
	  }
	 
	  private static int startUke(int år, int mnr) {
		  Calendar c = Calendar.getInstance();
		  c.set(Calendar.YEAR, år);
		  c.set(Calendar.MONTH, mnr-1); // Starter på 0...
		  c.set(Calendar.DAY_OF_MONTH, 1);
		  c.clear(Calendar.WEEK_OF_YEAR);
		  int ukenr = c.get(Calendar.WEEK_OF_YEAR);
		  return ukenr;
	  }
	 
	  private static int sluttUke(int år, int mnr) {
		  Calendar c = Calendar.getInstance();
		  c.set(Calendar.YEAR, år);
		  c.set(Calendar.MONTH, mnr-1);
		  c.set(Calendar.DAY_OF_MONTH, antallDager(år, mnr));
		  c.clear(Calendar.WEEK_OF_YEAR);
		  int ukenr = c.get(Calendar.WEEK_OF_YEAR);
		  return ukenr;
	  }
	 
	  private static int dagNr(int år, int mnr, int unr, int dnr) {
		  Calendar c = Calendar.getInstance();
		  c.clear(Calendar.DAY_OF_MONTH);
		  c.set(Calendar.YEAR, år);
		  c.set(Calendar.MONTH, mnr-1);
		  c.set(Calendar.WEEK_OF_YEAR, unr);
		  c.set(Calendar.DAY_OF_WEEK, dnr+1); // søndag=1
		  int dagnr = c.get(Calendar.DAY_OF_MONTH);
		  return dagnr;
	  }
	 
	  private static String månedsnavn(int mnr) {
		  switch (mnr) {
		  case  1: return "Januar";
	      case  2: return "Februar";
	      case  3: return "Mars";
	      case  4: return "April";
	      case  5: return "Mai";
	      case  6: return "Juni";
	      case  7: return "Juli";
	      case  8: return "August";
	      case  9: return "September";
	      case 10: return "Oktober";
	      case 11: return "November";
	      case 12: return "Desember";
		  }
		  return "";
	  }
	 
	  private static int antallDager(int år, int m) {
		  int d = 31; // jan, mar, mai, jul, aug, okt, des
		  if ( m == 4 || m == 6 || m == 9 || m == 11 )
			  d = 30; // apr, jun, sep, nov
		  else if ( m == 2 ) { // feb
			  if ( skuddår(år) )
				  d = 29;
			  else
				  d = 28;
		  }
		  return d;
	  }
	 
	  private static boolean skuddår(int år) {
		  return ( (år%4==0 && år%100!=0) || (år%400 == 0) );
	  }
	 
	 
	 
	  /* ************  HTML-metoder ************ */
	 
	  private static void startDok() {
		  out.println("<html><body>");
	  }
	 
	  private static void stoppDok() {
		  out.println("</body></html>");
	  }
	 
	  private static void overskrift1(String s) {
		  out.println("<h1>" + s + "</h1>");
	  }
	 
	  private static void overskrift2(String s) {
		  out.println("<h2>" + s + "</h2>");
	  }
	 
	  private static void startTabell() {
		  out.println("<table width='50%' border='1'>");
	  }
	 
	  private static void stoppTabell() {
		  out.println("</table>");
	  }
	 
	  private static void startRad() {
		  out.println("<tr>");
	  }
	 
	  private static void stoppRad() {
		  out.println("</tr>");
	  }
	 
	  private static void tabellOverskrift(String s) {
		  out.println("<th align='center'>" + s + "</th>");
	  }
	 
	  private static void tabellVerdi(String s) {
		  out.println("<td align='center'>" + s + "</td>");
	  }
 
}