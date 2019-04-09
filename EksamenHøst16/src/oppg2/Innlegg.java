package oppg2;

import java.util.*;

public class Innlegg {
	private String tekst;
	private ArrayList<String> tagged;
	
	public Innlegg(String tekst) {
		this.tekst = tekst;
		tagged = new ArrayList<String>();
	}
	
	public boolean erTagget(String person) {
		if (tagged.contains(person)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean tag(String person) {
		if (!erTagget(person)) {
			tagged.add(person);
			return true;
		} else {
			return false;
		}
	}
	
	public ArrayList<String> vennerTagget(String[] venner) {
		ArrayList<String> vennerTagget = new ArrayList<String>();
		for (int i = 0; i < venner.length; i++) {
			if (tagged.contains(venner[i])) {
				vennerTagget.add(venner[i]);
			}
		}
		return vennerTagget;
	}
	
	public void skrivUt() {
		String ut = tekst + "\n";
		
		Iterator<String> iterator = tagged.iterator();
		while (iterator.hasNext()) {
			ut += "@" + iterator.next() + " ";
		}
		
		System.out.println(ut);
	}
}