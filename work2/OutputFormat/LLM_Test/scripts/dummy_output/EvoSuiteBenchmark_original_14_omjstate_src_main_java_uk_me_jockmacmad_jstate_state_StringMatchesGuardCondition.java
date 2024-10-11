package uk.me.jockmacmad.jstate.state;
java
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class StringMatchesGuardConditionTest {

    @Test
    void testEvaluate_StringMatches() {
        StringMatchesGuardCondition condition = new StringMatchesGuardCondition("test");
        assertTrue(condition.evaluate(new Event("test")));
    }

    @Test
    void testEvaluate_StringNotMatches() {
        StringMatchesGuardCondition condition = new StringMatchesGuardCondition("test");
        assertFalse(condition.evaluate(new Event("example")));
    }

    @Test
    void testEvaluate_NullParameter() {
        StringMatchesGuardCondition condition = new StringMatchesGuardCondition("test");
        assertFalse(condition.evaluate(new Event(null)));
    }

    @Test
    void testEvaluate_EmptyString() {
        StringMatchesGuardCondition condition = new StringMatchesGuardCondition("");
        assertTrue(condition.evaluate(new Event("")));
    }

    @Test
    void testEvaluate_StringMatchesWithExtraParameters() {
        StringMatchesGuardCondition condition = new StringMatchesGuardCondition("test");
        assertTrue(condition.evaluate(new Event("test", "extra")));
    }

    @Test
    void testEvaluate_StringMatchesWithDifferentCase() {
        StringMatchesGuardCondition condition = new StringMatchesGuardCondition("Test");
        assertTrue(condition.evaluate(new Event("test")));
    }

    @Test
    void testEvaluate_ClassCastException() {
        StringMatchesGuardCondition condition = new StringMatchesGuardCondition("test");
        assertFalse(condition.evaluate(new Object()));
    }

    @Test
    void testGetValue() {
        StringMatchesGuardCondition condition = new StringMatchesGuardCondition("test");
        assertEquals("test", condition.getValue());
    }

    @Test
    void testToString() {
        StringMatchesGuardCondition condition = new StringMatchesGuardCondition("test");
        assertNotNull(condition.toString());
    }
}
