package test.set1;

import static org.junit.Assert.*;
import main.set1.ASCII;

import org.junit.Test;

public class ASCIITest {

    @Test
    public void testFromHex() {
        assertEquals("Aa", ASCII.fromHex("4161"));
    }

}
