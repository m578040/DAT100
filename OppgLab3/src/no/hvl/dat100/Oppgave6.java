package no.hvl.dat100;
import easygraphics.*;
import static java.lang.Integer.*;

public class Oppgave6 extends EasyGraphics {
	public static void main(String[] args) {
		launch(args);
	}
	
	public void run() {
		makeWindow("Temperaturer", 500, 500);
		
		setColor(0, 0, 0);
		drawLine(0, 400, 500, 400);
		
		int man = parseInt(getText("Oppgi temperaturen på mandag"));
		setColor(148, 0, 211);
		fillRectangle(50, 400-(man*10), 20, man*10);
		setColor(0, 0, 0);
		setFont("Arial", 20);
		drawString(String.valueOf(man), 53, 395-(man*10));
		setFont("Arial", 12);
		drawString("Man", 50, 413);
		
		int tir = parseInt(getText("Oppgi temperaturen på tirsdag"));
		setColor(75, 0, 130);
		fillRectangle(100, 400-(tir*10), 20, tir*10);
		setColor(0, 0, 0);
		setFont("Arial", 20);
		drawString(String.valueOf(tir), 103, 395-(tir*10));
		setFont("Arial", 12);
		drawString("Tir", 100, 413);
		
		int ons = parseInt(getText("Oppgi temperaturen på onsdag"));
		setColor(0, 0, 255);
		fillRectangle(150, 400-(ons*10), 20, ons*10);
		setColor(0, 0, 0);
		setFont("Arial", 20);
		drawString(String.valueOf(ons), 153, 395-(ons*10));
		setFont("Arial", 12);
		drawString("Ons", 150, 413);
		
		int tor = parseInt(getText("Oppgi temperaturen på torsdag"));
		setColor(0, 255, 0);
		fillRectangle(200, 400-(tor*10), 20, tor*10);
		setColor(0, 0, 0);
		setFont("Arial", 20);
		drawString(String.valueOf(tor), 200, 395-(tor*10));
		setFont("Arial", 12);
		drawString("Tor", 200, 413);
		
		int fre = parseInt(getText("Oppgi temperaturen på fredag"));
		setColor(255, 255, 0);
		fillRectangle(250, 400-(fre*10), 20, fre*10);
		setColor(0, 0, 0);
		setFont("Arial", 20);
		drawString(String.valueOf(fre), 253, 395-(fre*10));
		setFont("Arial", 12);
		drawString("Fre", 250, 413);
		
		int lør = parseInt(getText("Oppgi temperaturen på lørdag"));
		setColor(255, 127, 0);
		fillRectangle(300, 400-(lør*10), 20, lør*10);
		setColor(0, 0, 0);
		setFont("Arial", 20);
		drawString(String.valueOf(lør), 303, 395-(lør*10));
		setFont("Arial", 12);
		drawString("Lør", 300, 413);
		
		int søn = parseInt(getText("Oppgi temperaturen på søndag"));
		setColor(255, 0, 0);
		fillRectangle(350, 400-(søn*10), 20, søn*10);
		setColor(0, 0, 0);
		setFont("Arial", 20);
		drawString(String.valueOf(søn), 353, 395-(søn*10));
		setFont("Arial", 12);
		drawString("Søn", 350, 413);
	}
}