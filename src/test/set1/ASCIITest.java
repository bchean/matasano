package test.set1;

import static org.junit.Assert.*;
import main.set1.ASCII;

import org.junit.Test;

public class ASCIITest {
    
    @Test
    public void testToHex() {
        assertEquals("4161", ASCII.toHex("Aa"));
    }

    @Test
    public void testFromHex() {
        assertEquals("Aa", ASCII.fromHex("4161"));
    }
    
    @Test
    public void testDecodeHex() {
        assertEquals("ab", ASCII.decodeHex("6261", 0x03));
    }
    
    @Test
    public void testEncryptToHex() {
        assertEquals("03", ASCII.encryptToHex("a", "b"));
        assertEquals("030203", ASCII.encryptToHex("aaa", "bc"));
    }
    
    @Test
    public void testChallenge5() {
        assertEquals(
                "0b3637272a2b2e63622c2e69692a23693a2a3c6324202d623d63343c2a26226324272765272a282b2f20430a652e2c652a3124333a653e2b2027630c692b20283165286326302e27282f",
                ASCII.encryptToHex("Burning 'em, if you ain't quick and nimble\nI go crazy when I hear a cymbal", "ICE"));
    }

}
