package test.set1;

import static org.junit.Assert.*;
import main.set1.XOR;

import org.junit.Test;

public class XORTest {

	@Test
	public void testOfHexStrings() {
		assertEquals("54", XOR.hexStrings("ab", "ff"));
		assertEquals("0f", XOR.hexStrings("f0", "ff"));
		assertEquals("1234abcd1234", XOR.hexStrings("1234abcd1234", "000000000000"));
	}
	
	@Test
	public void testChallenge2() {
		assertEquals(
				"746865206b696420646f6e277420706c6179",
				XOR.hexStrings("1c0111001f010100061a024b53535009181c", "686974207468652062756c6c277320657965"));
	}

}
