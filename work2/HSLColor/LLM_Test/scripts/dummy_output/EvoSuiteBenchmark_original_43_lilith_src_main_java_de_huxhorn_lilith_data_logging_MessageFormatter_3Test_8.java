// MessageFormatter_3Test.java
package de.huxhorn.lilith.data.logging;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MessageFormatter}.
* It contains one unit test case for the {@link MessageFormatter#identityToString(Object)} method.
*/
class MessageFormatter_3Test {
		/**
		 * Test case for {@link MessageFormatter#identityToString(Object)}.
		 */
	@Test
	void testIdentityToString() {
		String resultString = MessageFormatter.identityToString(null);
		assertEquals(resultString, IdentityToString.identityToString(null));
		
		String resultIdentity = MessageFormatter.identityToString(new IdentityEntity());
		assertEquals(resultIdentity.hashCode(), IdentityToString.identityToString(new IdentityEntity()).hashCode());
		assertEquals(resultString, resultIdentity);
	}

	/**
	 * Helper for test cases.
	 * Returns two sets of arguments sorted by their hashCode.
	 * 
	 * @return sorted argument sets
	 * 
	 * @see MessageFormatter_3Test#testIdentityToString()
	 */
	private Set<String> makeArguments() {
		Set<String> set = new HashSet<>();
		for (int i = 0; i < 2; i++) {
			set.add("");
		}
		set.add("");
		return set;
	}	
	
	@Test
	void concat() {
		String test = "";
		for (int i = 0; i < 10; i++) {
			test = concatArguments(test, makeArguments());
		}
		assertEquals(identityToString(null), test);
	}	
	
	@Test
	public void concat() {
		String test = "";
		for (int i = 0; i < 10; i++) {
			test = concatArguments(test, makeArguments());
		}
		assertEquals(identityToString(null).hashCode(), test.hashCode());

		String[] expected = makeArguments().toArray(new String[0]);
		String[] actual = concatArguments(identityToString(null), expected).toArray(new String[0]);
		assertArrayEquals(expected, actual);
	}

	@Test
	public void concat_Empty() {
		String test = "";
		for (int i = 0; i < 6; i++) {
			test = concatArguments(test, makeArguments());
		}
		assertEquals(identityToString(null), test);
	}
	
	private static String concatArguments(String test, Set<String> expected) {
		return Arrays.toString(expected
				.toArray(new String[expected.size()]));
	}
	
    @Test
    public void with() throws Throwable {
			Set<String> testArguments, expectedArguments, actualArguments;		
			testArguments = makeArguments();
			expectedArguments = makeArguments();
			actualArguments = concatArguments(identityToString(null), testArguments);
			testArguments.addAll(expectedArguments);
			testArguments.clear();
			System.out.println("test arguments: \n" + makeArguments());
			System.out.println("expected arguments: \n" + concatArguments(identityToString(null), expectedArguments));
			System.out.println("actual arguments: \n" + actualArguments);
			
		Thread.sleep(200);
		System.out.println("--- End of concatTest!");
		
		assertEqual(actualArguments, testArguments);
    }
}