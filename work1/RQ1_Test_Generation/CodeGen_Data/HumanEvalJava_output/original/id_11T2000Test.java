// StringXorTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StringXor}.
* It contains one unit test case for the {@link StringXor#stringXor(String, String)} method.
*/
class StringXorTest {

	/**
	* Constructs a new instance of {@link StringXorTest},
	* with given parameters.
	*/
	public StringXorTest(String a, String b) {
		// TODO Auto-generated constructor stub
	}

	 /**
	 * Test method for {@link StringXor#stringXor(String, String)}.
	 */
	@Test
	public void testStringXor() {
		
		// TEST CASE 1
		
		System.out.println("Test 1... PASS");
		String result = "";
		String[] testCases =
			{
				"0",
				"1",
				"01010",
				"10110",
				"1010",
				"1010",
				"1010",
				"1010",
				"1010",
				"01010",
				"010",
				"010"
			};
		for (String input : testCases) {
			result = StringXor.stringXor(input, input);
			assertTrue("StringXor.stringXor() - result is \"\\x00\\x00\\x00\\x00\"", result.equals("\\x00\\x00\\x00\\x00"));
			System.out.println(
				"StringXor.stringXor() - result: \\" + 
				result + "\". Error is:\n";
			System.out.println(
				"StringXor.stringXor() - result: \\" + 
				result + 
				"\". Error message is:\n";
			assertEquals("StringXor.stringXor() - result: \\" + 
				result + 
				"\". Error message is: \"" + 
				"Illegal character in string");
		}
	}
}