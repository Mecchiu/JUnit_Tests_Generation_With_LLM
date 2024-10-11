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
    void testEvaluateWithMatchingString() {
        StringMatchesGuardCondition condition = new StringMatchesGuardCondition("hello");
        Event event = new Event("test", "hello");
        assertTrue(condition.evaluate(event));
    }

    @Test
    void testEvaluateWithNonMatchingString() {
        StringMatchesGuardCondition condition = new StringMatchesGuardCondition("hello");
        Event event = new Event("test", "world");
        assertFalse(condition.evaluate(event));
    }

    @Test
    void testEvaluateWithNullEvent() {
        StringMatchesGuardCondition condition = new StringMatchesGuardCondition("hello");
        assertFalse(condition.evaluate(null));
    }

    @Test
    void testEvaluateWithNullParameter() {
        StringMatchesGuardCondition condition = new StringMatchesGuardCondition("hello");
        Event event = new Event("test", null);
        assertFalse(condition.evaluate(event));
    }

    @Test
    void testEvaluateWithNonStringParameter() {
        StringMatchesGuardCondition condition = new StringMatchesGuardCondition("hello");
        Event event = new Event("test", 123);
        assertFalse(condition.evaluate(event));
    }

    @Test
    void testEvaluateWithEmptyString() {
        StringMatchesGuardCondition condition = new StringMatchesGuardCondition("");
        Event event = new Event("test", "");
        assertTrue(condition.evaluate(event));
    }

    @Test
    void testEvaluateWithWhitespaceString() {
        StringMatchesGuardCondition condition = new StringMatchesGuardCondition(" ");
        Event event = new Event("test", " ");
        assertTrue(condition.evaluate(event));
    }

    @Test
    void testEvaluateWithRegexSpecialCharacters() {
        StringMatchesGuardCondition condition = new StringMatchesGuardCondition("[a-z]+");
        Event event = new Event("test", "hello");
        assertTrue(condition.evaluate(event));
    }

    @Test
    void testEvaluateWithRegexSpecialCharactersNotMatching() {
        StringMatchesGuardCondition condition = new StringMatchesGuardCondition("[a-z]+");
        Event event = new Event("test", "123");
        assertFalse(condition.evaluate(event));
    }

    @Test
    void testEvaluateWithUnicodeCharacters() {
        StringMatchesGuardCondition condition = new StringMatchesGuardCondition("こんにちは");
        Event event = new Event("test", "こんにちは");
        assertTrue(condition.evaluate(event));
    }
}