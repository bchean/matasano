package test.set1;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import main.set1.File;

import org.junit.Test;

public class FileTest {

    @Test
    public void testReadLines() {
        List<String> expected = Arrays.asList("a", "b");
        List<String> actual = File.readLines(new Scanner("a\nb \n\n"));
        assertEquals(expected.size(), actual.size());
        assertEquals(expected.get(0), actual.get(0));
        assertEquals(expected.get(1), actual.get(1));
    }

}
