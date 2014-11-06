package test.set1;

import static org.junit.Assert.*;
import main.set1.Str;

import org.junit.Test;

public class StrTest {

    @Test
    public void testPadZeros() {
        assertEquals("a", Str.padZeros("a", 1));
        assertEquals("0a", Str.padZeros("a", 2));
    }
    
    @Test
    public void testRepeat() {
        assertEquals("", Str.repeat("ab", 0));
        assertEquals("ab", Str.repeat("ab", 1));
    }
    
    @Test
    public void testRepeatUntilLength() {
        assertEquals("ab", Str.repeatUntilLength("ab", 2));
        assertEquals("aba", Str.repeatUntilLength("ab", 3));
    }
    
    @Test
    public void testMakeHexString() {
        assertEquals("ffff", Str.makeHexString(0xff, 4));
    }

}
