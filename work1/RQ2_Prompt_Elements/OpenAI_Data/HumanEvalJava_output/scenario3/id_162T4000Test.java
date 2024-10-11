// StringToMd5Test.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StringToMd5}.
* It contains ten unit test cases for the {@link StringToMd5#stringToMd5(String)} method.
*/
class StringToMd5Test {

	@Test
	void testStringToMd5_1() {
		assertEquals("3e25960a79dbc69b674cd4ec67a72c62", StringToMd5.stringToMd5("Hello world"));
	}
	
	@Test
	void testStringToMd5_2() {
		assertEquals(null, StringToMd5.stringToMd5(""));
	}
	
	@Test
	void testStringToMd5_3() {
		assertEquals("0ef78513b0cb8cef12743f5aeb35f888", StringToMd5.stringToMd5("A B C"));
	}
	
	@Test
	void testStringToMd5_4() {
		assertEquals("5f4dcc3b5aa765d61d8327deb882cf99", StringToMd5.stringToMd5("password"));
	}
	
	@Test
	void testStringToMd5_5() {
		assertEquals("d41d8cd98f00b204e9800998ecf8427e", StringToMd5.stringToMd5(""));
	}
	
	@Test
	void testStringToMd5_6() {
		assertEquals("9e107d9d372bb6826bd81d3542a419d6", StringToMd5.stringToMd5("The quick brown fox jumps over the lazy dog"));
	}
	
	@Test
	void testStringToMd5_7() {
		assertEquals("1055d3e698d289f2af8663725127bd4b", StringToMd5.stringToMd5("The quick brown fox jumps over the lazy dog."));
	}
	
	@Test
	void testStringToMd5_8() {
		assertEquals("e4d909c290d0fb1ca068ffaddf22cbd0", StringToMd5.stringToMd5("abc"));
	}
	
	@Test
	void testStringToMd5_9() {
		assertEquals("900150983cd24fb0d6963f7d28e17f72", StringToMd5.stringToMd5("abcdefghijklmnopqrstuvwxyz"));
	}
	
	@Test
	void testStringToMd5_10() {
		assertEquals("f96b697d7cb7938d525a2f31aaf161d0", StringToMd5.stringToMd5("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789"));
	}
}