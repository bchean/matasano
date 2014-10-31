package main.set1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class File {
    
    public static List<String> readLines(Scanner in) {
        List<String> lines = new ArrayList<String>();
        try {
            while (in.hasNextLine()) {
                String line = in.nextLine().trim();
                if (line.length() > 0) {
                    lines.add(line);
                }
            }
        } catch (Exception e) {
            throw e;
        } finally {
            in.close();
        }
        return lines;
    }

}
