package main.set1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Challenge4 {
    
    public static void main(String[] args) throws Exception {
        List<String> hexStrings = File.readLines(new Scanner(new java.io.File("4.txt")));
        for (String hexString : hexStrings) {
            List<String> plainCandidates = tryDecodeHexString(hexString);
            if (!plainCandidates.isEmpty()) {
                System.out.println(hexString);
                for (String plain : plainCandidates) {
                    System.out.println("  " + plain);
                }
                System.out.println();
            }
        }
    }
    
    private static List<String> tryDecodeHexString(String hexString) {
        List<String> plainCandidates = new ArrayList<String>();
        for (int key = 0x00; key <= 0xff; key++) {
            String plain = ASCII.decodeHex(hexString, key);
            if (English.howLikely(plain) > 0) {
                plainCandidates.add(plain);
            }
        }
        return plainCandidates;
    }

}
