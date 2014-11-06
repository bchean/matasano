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
    
    public static String repeat(String base, int repeatCount) {
        String result = "";
        for (int i = 0; i < repeatCount; i++) {
            result += base;
        }
        return result;
    }
    
    public static String repeatUntilLength(String base, int desiredLength) {
        if (base.length() == 0) {
            throw new IllegalArgumentException("Length of base string must be positive.");
        }
        if (desiredLength == 0) {
            throw new IllegalArgumentException("Desired length must be positive.");
        }
        if (base.length() > desiredLength) {
            throw new IllegalArgumentException("Length of base string must not exceed desired length.");
        }
        
        StringBuilder result = new StringBuilder();
        int numTimesToRepeat = desiredLength / base.length();
        result.append(repeat(base, numTimesToRepeat));
        int leftoverLength = desiredLength - result.length();
        result.append(base.substring(0, leftoverLength));
        return result.toString();
    }
    
    public static String makeHexString(int hexValue, int desiredLength) {
        if (desiredLength % 2 != 0) {
            throw new IllegalArgumentException("Desired length must be even.");
        }
        String hexChar = padZeros(Integer.toHexString(hexValue), 2);
        return repeat(hexChar, desiredLength/2);
    }

}
