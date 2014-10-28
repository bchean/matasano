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

}
