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
    
    public static String repeat(String base, int length) {
        String result = "";
        for (int i = 0; i < length; i++) {
            result += base;
        }
        return result;
    }
    
    public static String makeHexString(int hexValue, int desiredLength) {
        if (desiredLength % 2 != 0) {
            throw new IllegalArgumentException("Desired length must be even.");
        }
        String hexChar = padZeros(Integer.toHexString(hexValue), 2);
        return repeat(hexChar, desiredLength/2);
    }

}
