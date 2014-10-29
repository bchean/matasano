package test.set1;

import static org.junit.Assert.*;
import main.set1.English;

import org.junit.Test;

public class EnglishTest {

    @Test
    public void testHowLikely() {
        assertEquals(1.0, English.howLikely("the"), 1e-6);
        assertEquals(0.5, English.howLikely("the \t\nf"), 1e-6);
        assertEquals(0, English.howLikely("f"), 1e-6);
    }

}
