package no.hvl.dat100;

import static java.lang.System.*;
import static java.lang.Math.*;

public class Oppgave7 {
	public static void main(String[] args) {
		double lat1 = random()*180-90;
		double lat2 = random()*180-90;
		double long1 = random()*180-90;
		double long2 = random()*180-90;
		int avstand = (int)(distance(lat1, lat2, long1, long2)+0.5);
		out.println(lat1 + ", " + long1);
		out.println(lat2 + ", " + long2);
		out.println(avstand/1000 + " km.");
		out.println();
		
		double secs = (int)(random()*1000000);
		int fart = (int)(speed(secs, lat1,lat2, long1, long2)+0.5);
		out.println(secs + " sekunder.");
		out.println(fart + " km/t.");
		out.println();
		
		int sek = (int)(random()*86400);
		String ut = printTime(sek);
		out.println(sek + " sekunder etter midnatt tilsvarer: " + ut);
	}
	
	public static double distance(double lat1, double lat2, double long1, double long2) {
		final double R = 6371000;
		double ø1 = toRadians(lat1);
		double ø2 = toRadians(lat2);
		double deltaLat = toRadians(lat2-lat1);
		double deltaLong = toRadians(long2-long1);
		double a = sin(deltaLat/2) * sin(deltaLat/2) + cos(ø1) * cos(ø2) * sin(deltaLong/2) * sin(deltaLong/2);
		double c = 2*atan2(sqrt(a), sqrt(1-a));
		double d = R*c;
		return d;
	}
	
	public static double speed(double secs, double lat1, double lat2, double long1, double long2) {
		final double R = 6371000;
		double ø1 = toRadians(lat1);
		double ø2 = toRadians(lat2);
		double deltaLat = toRadians(lat2-lat1);
		double deltaLong = toRadians(long2-long1);
		double a = sin(deltaLat/2) * sin(deltaLat/2) + cos(ø1) * cos(ø2) * sin(deltaLong/2) * sin(deltaLong/2);
		double c = 2*atan2(sqrt(a), sqrt(1-a));
		double d = R*c;
		
		double t = secs/3600;
		double v = d/t;
		return v;
	}
	
	public static String printTime(int secs) {
		int hh = secs/3600;
		int mm = (secs%3600)/60;
		int ss = (secs%3600)%60;
		String ut = "";
		if (hh < 10) {
			ut += "0" + hh + ":";
		} else {
			ut += hh + ":";
		}
		if (mm < 10) {
			ut += "0" + mm + ":";
		} else {
			ut += mm + ":";
		}
		if (ss < 10) {
			ut += "0" + ss;
		} else {
			ut += ss;
		}
		return ut;
	}
}