package main.set1;

public class Str {
	
	public static String padZeros(String s, int length) {
		if (length < s.length()) {
			throw new IllegalArgumentException("String length exceeds pad length.");
		}

		int padLength = length - s.length();
		String pad = "";
		for (int i = 0; i < padLength; i++) {
			pad += "0";
		}
		return pad + s;
	}

}
