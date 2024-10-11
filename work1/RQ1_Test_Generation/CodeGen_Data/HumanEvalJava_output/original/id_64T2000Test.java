// VowelsCountTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link VowelsCount}.
* It contains one unit test case for the {@link VowelsCount#vowelsCount(String)} method.
*/
class VowelsCountTest {

	// Method to test the class {@link VowelsCount}.
	@Test
	void testVowelsCount() {
	  
		// Expected result
		assertEquals(2, VowelsCount.vowelsCount("abcde"));
		assertEquals(1, VowelsCount.vowelsCount("Alone"));
		assertEquals(3, VowelsCount.vowelsCount("key"));
		assertEquals(2, VowelsCount.vowelsCount("bye"));
		assertEquals(1, VowelsCount.vowelsCount("keY"));
		assertEquals(1, VowelsCount.vowelsCount("bYe"));	
			// assertEquals(0, VowelsCount.vowelsCount("ACEDY")); 
		assertEquals(0, VowelsCount.vowelsCount("key"));
		assertEquals(0, VowelsCount.vowelsCount("byEs"));
	  }
}
