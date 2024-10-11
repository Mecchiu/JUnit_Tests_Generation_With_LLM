// ArrayOfStringTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfString}.
* It contains one unit test case for the {@link ArrayOfString#getTypeDesc()} method.
*/
class ArrayOfStringTest {
		
	/**
	 * Creating array of {@link String} instance from java array
	 * with type {@link java.lang.Integer}
	 */
	@Test
	public void testArrayOfString01() throws Exception {
		java.lang.String[] expected = {};
		ArrayOfString arrayOfString = new ArrayOfString();

		expected = arrayOfString.getString();
		assertTrue("There are no expected values in the array", expected.length == arrayOfString.getString().length);
		for (int i = 0; i < expected.length; i++) {
			expected[i] = "test" + i;
		}

			// test method body
			assertSameEquals(expected, arrayOfString.getString(i));
	}
		
	/**
	 * Creating array of {@link String} instance from java array
* with type {@link java.lang.String}
*
	 *
	 * @throws Exception
	 */
	@Test
	public void testArrayOfString02() throws Exception {
		ArrayOfString expected = new ArrayOfString();

	    expected.setString(ArrayOfString.class, "");
	    assertFalse("ArrayOfString should not contained String.",expected.contains(ArrayOfString.class, ""));
	    assertTrue("ArrayOfString should contained String.",expected.contains(ArrayOfString.class, "testtesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttestteetestteetesteteetteseteetsetetestseteteetestsetesetetesetsettesettesetteetetetetesettesettesetteetetetetesettesettesettesettesettesettesettaetetetsettesettesettesettesettesettesettesettesettesettesettesettesettesettesettesettesetteetetetesettesettesettesettesettesettesettesettesettesettesettesettesettesettesettesettesettesettesettesettesetsetsettesettesettesettesettesettesettesettesettes");
	}
		
	/**
	 * Creating array of {@link String} instance from java array
* with type {@link java.lang.Double}
	 */
	@Test
	public void testArrayOfString03() throws Exception {
		java.lang.Double[] expected = {};
		ArrayOfString arrayOfString = new ArrayOfString();

		expected = arrayOfString.getString();
		assertTrue("There are no expected values in the array", expected.length == arrayOfString.getString().length);
		for (int i = 0; i < expected.length; i++) {
			expected[i] = 2.0d;
		}

			ArrayOfString.setString(arrayOfString, "");
		assertTrue("ArrayOfString shouldn't had string.",arrayOfString.equals(ArrayOfString.class, expected));
	}
		
	/**
	 * Creating array of {@link String} instance from java array
* with type {@link java.lang.String}
	 */
	@Test
	public void testArrayOfString04() throws Exception {
		ArrayOfString expected = new ArrayOfString();
		expected.setString("testtesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttestteseetteet");

		ArrayOfString arrayOfString = new ArrayOfString();

		expected = arrayOfString.getString();
		assertTrue("There are no expected values in the array", expected.length == arrayOfString.getString().length);
		for (int i = 0; i < expected.length; i++) {
			expected[i] = "test" + i;
		}

			// test method body
			assertSameEquals(expected, arrayOfString.getString(i));
	}
		
}