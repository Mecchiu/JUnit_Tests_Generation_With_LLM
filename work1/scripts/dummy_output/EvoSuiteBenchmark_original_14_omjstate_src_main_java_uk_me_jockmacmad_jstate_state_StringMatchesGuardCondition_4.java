// StringMatchesGuardConditionTest.java
package uk.me.jockmacmad.jstate.state;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StringMatchesGuardCondition}.
* It contains one unit test case for the {@link StringMatchesGuardCondition#evaluate(Object)} method.
*/
class StringMatchesGuardConditionTest {
		final String valueA;
    final String valueB;
/**
 *
 */
    StringMatchesGuardConditionTest(String varA, String varB) {
       valueA = varA;
        valueB = varB;
    }
    @Test
/**
 * Insert the method's description here.
* The method tests the value of 'value'
 *
*/
    public void test() {
       if(! valueA.equals(valueB)) {
//            assertTrue("The value of '" + valueA.toString() + "' is not equal to '" + valueB.toString() + "', which is true", false);
//        }
        assertFalse("The value of '" + valueA.toString() + "' is equal to '" + valueB.toString() + "', which is true", valueA.equals(valueB));
    }
}