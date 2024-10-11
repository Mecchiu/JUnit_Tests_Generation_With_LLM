// VowelsCountTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link VowelsCount}.
* It contains ten unit test cases for the {@link VowelsCount#vowelsCount(String)} method.
*/
class VowelsCountTest {

	@Test
	void testVowelsCount() {
		assertEquals(0, VowelsCount.vowelsCount(""));
		assertEquals(1, VowelsCount.vowelsCount("a"));
		assertEquals(1, VowelsCount.vowelsCount("e"));
		assertEquals(1, VowelsCount.vowelsCount("i"));
		assertEquals(1, VowelsCount.vowelsCount("o"));
		assertEquals(1, VowelsCount.vowelsCount("u"));
		assertEquals(1, VowelsCount.vowelsCount("y"));
		assertEquals(2, VowelsCount.vowelsCount("ae"));
		assertEquals(2, VowelsCount.vowelsCount("ei"));
		assertEquals(2, VowelsCount.vowelsCount("io"));
		assertEquals(2, VowelsCount.vowelsCount("ou"));
		assertEquals(2, VowelsCount.vowelsCount("uy"));
		assertEquals(3, VowelsCount.vowelsCount("aei"));
		assertEquals(3, VowelsCount.vowelsCount("eio"));
		assertEquals(3, VowelsCount.vowelsCount("iou"));
		assertEquals(3, VowelsCount.vowelsCount("uyy"));
		assertEquals(4, VowelsCount.vowelsCount("aeio"));
		assertEquals(4, VowelsCount.vowelsCount("eiou"));
		assertEquals(4, VowelsCount.vowelsCount("iouy"));
		assertEquals(5, VowelsCount.vowelsCount("aeiou"));
		assertEquals(5, VowelsCount.vowelsCount("eiouy"));
		assertEquals(6, VowelsCount.vowelsCount("aeiouy"));
		assertEquals(1, VowelsCount.vowelsCount("A"));
		assertEquals(1, VowelsCount.vowelsCount("E"));
		assertEquals(1, VowelsCount.vowelsCount("I"));
		assertEquals(1, VowelsCount.vowelsCount("O"));
		assertEquals(1, VowelsCount.vowelsCount("U"));
		assertEquals(1, VowelsCount.vowelsCount("Y"));
		assertEquals(2, VowelsCount.vowelsCount("AE"));
		assertEquals(2, VowelsCount.vowelsCount("EI"));
		assertEquals(2, VowelsCount.vowelsCount("IO"));
		assertEquals(2, VowelsCount.vowelsCount("OU"));
		assertEquals(2, VowelsCount.vowelsCount("UY"));
		assertEquals(3, VowelsCount.vowelsCount("AEI"));
		assertEquals(3, VowelsCount.vowelsCount("EIO"));
		assertEquals(3, VowelsCount.vowelsCount("IOU"));
		assertEquals(3, VowelsCount.vowelsCount("UYY"));
		assertEquals(4, VowelsCount.vowelsCount("AEIO"));
		assertEquals(4, VowelsCount.vowelsCount("EIOU"));
		assertEquals(4, VowelsCount.vowelsCount("IOUY"));
		assertEquals(5, VowelsCount.vowelsCount("AEIOU"));
		assertEquals(5, VowelsCount.vowelsCount("EIOUY"));
		assertEquals(6, VowelsCount.vowelsCount("AEIOUY"));
	}
}