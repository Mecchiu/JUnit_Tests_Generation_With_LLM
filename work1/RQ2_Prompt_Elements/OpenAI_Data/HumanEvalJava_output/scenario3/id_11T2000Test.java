// StringXorTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StringXor}.
* It contains ten unit test cases for the {@link StringXor#stringXor(String, String)} method.
*/
class StringXorTest {
	@Test
			void testStringXor() {
				assertEquals("100", StringXor.stringXor("010", "110"));
				assertEquals("010010", StringXor.stringXor("111000", "101010"));
				assertEquals("0", StringXor.stringXor("1", "1"));
				assertEquals("0101", StringXor.stringXor("0101", "0000"));
				assertEquals("111111", StringXor.stringXor("000000", "111111"));
				assertEquals("000000", StringXor.stringXor("000000", "000000"));
				assertEquals("111111", StringXor.stringXor("111111", "000000"));
				assertEquals("000000", StringXor.stringXor("000000", "111111"));
				assertEquals("111111", StringXor.stringXor("111111", "111111"));
				assertEquals("000000", StringXor.stringXor("000000", "000000"));
			}
}
