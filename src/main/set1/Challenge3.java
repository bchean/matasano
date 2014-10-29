package main.set1;

public class Challenge3 {

    public static void main(String[] args) {
        String cipher = "1b37373331363f78151b7f2b783431333d78397828372d363c78373e783a393b3736";
        final int numKeys = 256;

        String[] xoreds = new String[numKeys];
        for (int key = 0; key < numKeys; key++) {
            String hexChar = Str.padZeros(Integer.toHexString(key), 2);
            String keyStr = Str.repeat(hexChar, cipher.length()/2);
            xoreds[key] = XOR.hexStrings(cipher, keyStr);
        }

        String[] plains = new String[numKeys];
        for (int key = 0; key < numKeys; key++) {
            plains[key] = ASCII.fromHex(xoreds[key]);
        }
        
        for (int key = 0; key < numKeys; key++) {
            String plain = plains[key];
            double score = English.howLikely(plain);
            if (score > 0) {
                System.out.printf("0x%02x : %4.2f : %s\n", key, score, plain);
            }
        }
    }

}
