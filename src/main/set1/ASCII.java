package main.set1;

public class ASCII {
    
    private static final int HEX_CHARS_PER_BYTE = 2;
    
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

}
