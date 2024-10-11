// StringMatchesGuardConditionTest.java
package uk.me.jockmacmad.jstate.state;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link StringMatchesGuardCondition}.
 * It contains ten unit test cases for the {@link StringMatchesGuardCondition#evaluate(Object)} method.
 */
class StringMatchesGuardConditionTest {

    @Test
    void testEvaluate_NullInput() {
        StringMatchesGuardCondition condition = new StringMatchesGuardCondition("test");
        assertFalse(condition.evaluate(null));
    }

    @Test
    void testEvaluate_NonStringInput() {
        StringMatchesGuardCondition condition = new StringMatchesGuardCondition("test");
        assertFalse(condition.evaluate(123));
    }

    @Test
    void testEvaluate_EmptyStringInput() {
        StringMatchesGuardCondition condition = new StringMatchesGuardCondition("");
        assertTrue(condition.evaluate(""));
    }

    @Test
    void testEvaluate_MatchingStringInput() {
        StringMatchesGuardCondition condition = new StringMatchesGuardCondition("test");
        assertTrue(condition.evaluate("test"));
    }

    @Test
    void testEvaluate_NonMatchingStringInput() {
        StringMatchesGuardCondition condition = new StringMatchesGuardCondition("test");
        assertFalse(condition.evaluate("not test"));
    }

    @Test
    void testEvaluate_CaseSensitiveMatchingStringInput() {
        StringMatchesGuardCondition condition = new StringMatchesGuardCondition("test");
        assertFalse(condition.evaluate("Test"));
    }

    @Test
    void testEvaluate_CaseInsensitiveMatchingStringInput() {
        StringMatchesGuardCondition condition = new StringMatchesGuardCondition("test", true);
        assertTrue(condition.evaluate("Test"));
    }

    @Test
    void testEvaluate_RegexMatchingStringInput() {
        StringMatchesGuardCondition condition = new StringMatchesGuardCondition("\\d{3}-\\d{2}-\\d{4}");
        assertTrue(condition.evaluate("123-45-6789"));
    }

    @Test
    void testEvaluate_RegexNonMatchingStringInput() {
        StringMatchesGuardCondition condition = new StringMatchesGuardCondition("\\d{3}-\\d{2}-\\d{4}");
        assertFalse(condition.evaluate("123-456-789"));
    }

    @Test
    void testEvaluate_RegexCaseInsensitiveMatchingStringInput() {
        StringMatchesGuardCondition condition = new StringMatchesGuardCondition("test", true);
        assertTrue(condition.evaluate("TEST"));
    }
}