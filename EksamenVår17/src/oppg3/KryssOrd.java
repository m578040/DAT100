package oppg3;

import java.util.*;

public class KryssOrd {
	public static boolean likeLange(String s, String t) {
		return (s.length() == t.length());
	}
	
	public static boolean matchPos(String s, String t, int p) {
		return ((s.charAt(p) == t.charAt(p)) || (s.charAt(p) == '*') || (t.charAt(p) == '*'));
	}
	
	public static boolean matcher(String s, String t) {
		boolean like = true;
		if (likeLange(s, t)) {
			int i = 0;
			while (i < s.length() && like) {
				if ((s.charAt(i) != t.charAt(i)) || (s.charAt(i) != '*') || (t.charAt(i) != '*')) {
					like = false;
				}
				i++;
			}
		} else {
			like = false;
		}
		return like;
	}
	
	public static int compareTo(String s, String t) {
		if (s.length() > t.length()) {
			return 1;
		} else if (s.length() < t.length()) {
			return -1;
		} else {
			int i = 0;
			int sammenlign = 0;
			while ((i < s.length()) && (sammenlign == 0)) {
				if (s.charAt(i) < t.charAt(i)) {
					sammenlign = -1;
				} else if (s.charAt(i) > t.charAt(i)) {
					sammenlign = 1;
				}
				i++;
			}
			return sammenlign;
		}
	}
	
	public static String forsteSomPasser(String monster, ArrayList<String> list) {
		Iterator<String> i = list.iterator();
		boolean passer = false;
		String ord = null;
		while (i.hasNext() || !passer) {
			ord = i.next();
			if (matcher(ord, monster)) {
				passer = true;
			}
		}
		return ord;
	}
}