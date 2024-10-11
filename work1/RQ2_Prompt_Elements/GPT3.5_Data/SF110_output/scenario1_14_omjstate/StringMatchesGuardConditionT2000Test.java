// Test class of StringMatchesGuardCondition
package uk.me.jockmacmad.jstate.state;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for StringMatchesGuardCondition.
 */
public class StringMatchesGuardConditionTest {

    /**
     * Test method for evaluating a matching string.
     */
    @Test
    public void testEvaluateMatchingString() {
        StringMatchesGuardCondition condition = new StringMatchesGuardCondition("hello");
        Event event = new Event("test", "hello");
        assertTrue(condition.evaluate(event));
    }

    /**
     * Test method for evaluating a non-matching string.
     */
    @Test
    public void testEvaluateNonMatchingString() {
        StringMatchesGuardCondition condition = new StringMatchesGuardCondition("hello");
        Event event = new Event("test", "world");
        assertFalse(condition.evaluate(event));
    }

    /**
     * Test method for evaluating a null event.
     */
    @Test
    public void testEvaluateNullEvent() {
        StringMatchesGuardCondition condition = new StringMatchesGuardCondition("hello");
        assertFalse(condition.evaluate(null));
    }

    /**
     * Test method for evaluating an event with no parameters.
     */
    @Test
    public void testEvaluateEventWithNoParameters() {
        StringMatchesGuardCondition condition = new StringMatchesGuardCondition("hello");
        Event event = new Event("test");
        assertFalse(condition.evaluate(event));
    }

    /**
     * Test method for evaluating an event with a non-string parameter.
     */
    @Test
    public void testEvaluateEventWithNonStringParameter() {
        StringMatchesGuardCondition condition = new StringMatchesGuardCondition("hello");
        Event event = new Event("test", 123);
        assertFalse(condition.evaluate(event));
    }

    /**
     * Test method for evaluating an event with multiple parameters.
     */
    @Test
    public void testEvaluateEventWithMultipleParameters() {
        StringMatchesGuardCondition condition = new StringMatchesGuardCondition("hello");
        Event event = new Event("test", "hello", "world");
        assertTrue(condition.evaluate(event));
    }

    /**
     * Test method for evaluating an event with a null parameter.
     */
    @Test
    public void testEvaluateEventWithNullParameter() {
        StringMatchesGuardCondition condition = new StringMatchesGuardCondition("hello");
        Event event = new Event("test", null);
        assertFalse(condition.evaluate(event));
    }

    /**
     * Test method for evaluating an event with an empty string parameter.
     */
    @Test
    public void testEvaluateEventWithEmptyStringParameter() {
        StringMatchesGuardCondition condition = new StringMatchesGuardCondition("");
        Event event = new Event("test", "");
        assertTrue(condition.evaluate(event));
    }

    /**
     * Test method for evaluating an event with a whitespace string parameter.
     */
    @Test
    public void testEvaluateEventWithWhitespaceStringParameter() {
        StringMatchesGuardCondition condition = new StringMatchesGuardCondition(" ");
        Event event = new Event("test", " ");
        assertTrue(condition.evaluate(event));
    }
}