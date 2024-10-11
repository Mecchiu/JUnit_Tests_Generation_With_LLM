// StringXorTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StringXor}.
* It contains one unit test case for the {@link StringXor#stringXor(String, String)} method.
*/
class StringXorTest {
    	
	@Test
	public void test1() {
		StringXor.stringXor((""),(""));
		assertTrue(0 == StringXor.stringXor("",("")));
	}
	
	@Test
	public void test2() {
		StringXor.stringXor((""),("01"));
		assertTrue(0 == StringXor.stringXor("01",("")));
		assertTrue(0 == StringXor.stringXor("01",("00")));
		assertTrue(0 == StringXor.stringXor("010",("00")));
		assertTrue(0 == StringXor.stringXor("100",("000")));
		assertTrue(0 == StringXor.stringXor("100",("010")));
		assertTrue(0 == StringXor.stringXor("100",("100")));
		
	}
	

}
