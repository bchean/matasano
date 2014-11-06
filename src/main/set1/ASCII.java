package main.set1;

public class ASCII {
    
    private static final int HEX_CHARS_PER_BYTE = 2;
    
    public static String toHex(String ascii) {
        StringBuilder sb = new StringBuilder();
        for (char asciiChar : ascii.toCharArray()) {
            String hexChar = Str.padZeros(Integer.toHexString(asciiChar), HEX_CHARS_PER_BYTE);
            sb.append(hexChar);
        }
        return sb.toString();
    }
    
    public static String fromHex(String hex) {
        if (hex.length() % 2 != 0) {
            throw new IllegalArgumentException("Hex string must be of even length.");
        }
        
        String asciiStr = "";
        for (int byteStart = 0; byteStart < hex.length(); byteStart += HEX_CHARS_PER_BYTE) {
            String hexByte = hex.substring(byteStart, byteStart+HEX_CHARS_PER_BYTE);
            char asciiChar = (char)(Integer.parseInt(hexByte, 16));
            asciiStr += asciiChar;
        }
        return asciiStr;
    }
    
    public static String decodeHex(String hexString, int hexKey) {
        String keyStr = Str.makeHexString(hexKey, hexString.length());
        String xored = XOR.hexStrings(hexString, keyStr);
        String plain = ASCII.fromHex(xored);
        return plain;
    }
    
    public static String encryptToHex(String plain, String keyString) {
        if (plain.length() == 0 || keyString.length() == 0) {
            throw new IllegalArgumentException("Plaintext and key must be non-empty strings.");
        }
        String hexOriginal = toHex(plain);
        String hexKey = toHex(keyString);
        String hexKeyRepeated = Str.repeatUntilLength(hexKey, hexOriginal.length());
        return XOR.hexStrings(hexOriginal, hexKeyRepeated);
    }

}
