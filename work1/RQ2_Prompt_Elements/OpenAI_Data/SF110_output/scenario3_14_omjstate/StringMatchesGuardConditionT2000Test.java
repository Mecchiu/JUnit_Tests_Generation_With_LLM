// StringMatchesGuardConditionTest.java
package uk.me.jockmacmad.jstate.state;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StringMatchesGuardCondition}.
* It contains ten unit test cases for the {@link StringMatchesGuardCondition#evaluate(Object)} method.
*/
class StringMatchesGuardConditionTest {

	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: null.
	* Expected result: false.
	*/
	@Test
	void testEvaluate_Null() {
		StringMatchesGuardCondition guard = new StringMatchesGuardCondition("");
		assertFalse(guard.evaluate(null));
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: empty string.
	* Expected result: false.
	*/
	@Test
	void testEvaluate_EmptyString() {
		StringMatchesGuardCondition guard = new StringMatchesGuardCondition("");
		assertFalse(guard.evaluate(""));
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: string that does not match.
	* Expected result: false.
	*/
	@Test
	void testEvaluate_StringDoesNotMatch() {
		StringMatchesGuardCondition guard = new StringMatchesGuardCondition("abc");
		assertFalse(guard.evaluate("def"));
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: string that matches.
	* Expected result: true.
	*/
	@Test
	void testEvaluate_StringMatches() {
		StringMatchesGuardCondition guard = new StringMatchesGuardCondition("abc");
		assertTrue(guard.evaluate("abc"));
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: string that matches with leading and trailing whitespace.
	* Expected result: true.
	*/
	@Test
	void testEvaluate_StringMatchesWithLeadingAndTrailingWhitespace() {
		StringMatchesGuardCondition guard = new StringMatchesGuardCondition("abc");
		assertTrue(guard.evaluate(" abc "));
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: string that matches with leading whitespace.
	* Expected result: true.
	*/
	@Test
	void testEvaluate_StringMatchesWithLeadingWhitespace() {
		StringMatchesGuardCondition guard = new StringMatchesGuardCondition("abc");
		assertTrue(guard.evaluate(" abc"));
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: string that matches with trailing whitespace.
	* Expected result: true.
	*/
	@Test
	void testEvaluate_StringMatchesWithTrailingWhitespace() {
		StringMatchesGuardCondition guard = new StringMatchesGuardCondition("abc");
		assertTrue(guard.evaluate("abc "));
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: string that matches with leading and trailing whitespace.
	* Expected result: true.
	*/
	@Test
	void testEvaluate_StringMatchesWithLeadingAndTrailingWhitespaceAndCaseInsensitive() {
		StringMatchesGuardCondition guard = new StringMatchesGuardCondition("abc", true);
		assertTrue(guard.evaluate(" Abc "));
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: string that matches with leading whitespace.
	* Expected result: true.
	*/
	@Test
	void testEvaluate_StringMatchesWithLeadingWhitespaceAndCaseInsensitive() {
		StringMatchesGuardCondition guard = new StringMatchesGuardCondition("abc", true);
		assertTrue(guard.evaluate(" Abc"));
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: string that matches with trailing whitespace.
	* Expected result: true.
	*/
	@Test
	void testEvaluate_StringMatchesWithTrailingWhitespaceAndCaseInsensitive() {
		StringMatchesGuardCondition guard = new StringMatchesGuardCondition("abc", true);
		assertTrue(guard.evaluate("Abc "));
	}
}

// StringMatchesGuardCondition.java
package uk.me.jockmacmad.jstate.state;

/**
 * Insert the type's description here.
 * Creation date: (2/26/01 5:09:09 PM)
 *
 * @author: Administrator
 */
public class StringMatchesGuardCondition implements uk.me.jockmacmad.jstate.state.IGuardCondition {

    /**
     * Insert the method's description here.
     * Creation date: (2/26/01 5:09:09 PM)
     *
     * @return boolean
     * @param o java.lang.Object
     */
    public boolean evaluate(Object o);
}

// StringMatchesGuardConditionTest.java
package uk.me.jockmacmad.jstate.state;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StringMatchesGuardCondition}.
* It contains ten unit test cases for the {@link StringMatchesGuardCondition#evaluate(Object)} method.
*/
class StringMatchesGuardConditionTest {
		
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: null.
	* Expected result: false.
	*/
	@Test
	void testEvaluate_Null() {
		StringMatchesGuardCondition guard = new StringMatchesGuardCondition("");
		assertFalse(guard.evaluate(null));
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: empty string.
	* Expected result: false.
	*/
	@Test
	void testEvaluate_EmptyString() {
		StringMatchesGuardCondition guard = new StringMatchesGuardCondition("");
		assertFalse(guard.evaluate(""));
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: string that does not match.
	* Expected result: false.
	*/
	@Test
	void testEvaluate_StringDoesNotMatch() {
		StringMatchesGuardCondition guard = new StringMatchesGuardCondition("abc");
		assertFalse(guard.evaluate("def"));
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: string that matches.
	* Expected result: true.
	*/
	@Test
	void testEvaluate_StringMatches() {
		StringMatchesGuardCondition guard = new StringMatchesGuardCondition("abc");
		assertTrue(guard.evaluate("abc"));
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: string that matches with leading and trailing whitespace.
	* Expected result: true.
	*/
	@Test
	void testEvaluate_StringMatchesWithLeadingAndTrailingWhitespace() {
		StringMatchesGuardCondition guard = new StringMatchesGuardCondition("abc");
		assertTrue(guard.evaluate(" abc "));
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: string that matches with leading whitespace.
	* Expected result: true.
	*/
	@Test
	void testEvaluate_StringMatchesWithLeadingWhitespace() {
		StringMatchesGuardCondition guard = new StringMatchesGuardCondition("abc");
		assertTrue(guard.evaluate(" abc"));
	}
	
	/**
	* Test case for {@link StringMatches