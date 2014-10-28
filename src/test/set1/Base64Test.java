package test.set1;

import static org.junit.Assert.*;
import main.set1.Base64;

import org.junit.Test;

public class Base64Test {
	
	@Test
	public void testFromOrdinal() {
		assertEquals('A', Base64.fromOrdinal(0));
		assertEquals('Z', Base64.fromOrdinal(25));
		assertEquals('a', Base64.fromOrdinal(26));
		assertEquals('z', Base64.fromOrdinal(51));
		assertEquals('0', Base64.fromOrdinal(52));
		assertEquals('9', Base64.fromOrdinal(61));
		assertEquals('+', Base64.fromOrdinal(62));
		assertEquals('/', Base64.fromOrdinal(63));
	}

	@Test
	public void testFromHex() {
		assertEquals("", Base64.fromHexString(""));
		assertEquals("qw==", Base64.fromHexString("AB"));
		assertEquals("q80=", Base64.fromHexString("ABCD"));
		assertEquals("q83v", Base64.fromHexString("ABCDEF"));
		assertEquals("q83vEg==", Base64.fromHexString("ABCDEF12"));
	}
	
	@Test
	public void testChallenge1() {
		assertEquals(
				"SSdtIGtpbGxpbmcgeW91ciBicmFpbiBsaWtlIGEgcG9pc29ub3VzIG11c2hyb29t",
				Base64.fromHexString("49276d206b696c6c696e6720796f757220627261696e206c696b65206120706f69736f6e6f7573206d757368726f6f6d"));
	}

}
