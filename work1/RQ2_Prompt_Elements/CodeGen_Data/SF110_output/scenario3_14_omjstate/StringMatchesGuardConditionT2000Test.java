// StringMatchesGuardConditionTest.java
package uk.me.jockmacmad.jstate.state;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StringMatchesGuardCondition}.
* It contains one unit test case for the {@link StringMatchesGuardCondition#evaluate(Object)} method.
*/
class StringMatchesGuardConditionTest {

	@Test
	public void test1() {
		String s = "Hello World";
		assertFalse("' " + s + "' should not match the string'Hello World'",
				        StringMatchesGuardCondition.evaluate(s));
	}
	
}

