// EndState_0Test.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EndState}.
* It contains one unit test case for the {@link EndState#getSingleton()} method.
*/
class EndState_0Test {
/**
		* Some basic unit test code for the method {@link EndState#isStateAlone()}.
		*/
    @Test
    public void testIsStateAlone() {
        assertTrue(EndState.getSingleton() instanceof EndState);
    }

    /**
     * Test case of {@link EndState#isStateAlone()}.
     * This test verifies if getSingleton() returns the final instance
     * of the {@link EndState}.
     */
    @Test
    public void testIsStateAloneFailed() {
		assertFalse(EndState.getSingleton() instanceof EndState);
        assertTrue(false);
    }

    /**
     * Test case of {@link EndState#isStateAlone()}.
     * This test verifies if getSingleton() returns a newly created instance:
     *      assertTrue(getSingleton() == endState);
     */
    @Test
    public void testIsStateAloneNew() {
		assertNotSame(EndState.getSingleton(), EndState.getSingleton());
    }

    /**
     * Test case of {@link EndState#toString()}.
     * This test verifies if we have the method {@link EndState#toString()}
     * that we should be able to call it with the final {@link EndState} objects.
     */
    @Test
    public void testToString() {
		assertNotNull(EndState.getSingleton());
        assertEquals("<eu.objectmentors.state.EndState>", EndState.getSingleton().toString());
    }

    /**
     * Test case of {@link EndState#isEnumClass()}.
     * This test verifies if the class {} has a property called "Enum"
     * for a method {@link EndState#getSingleton()} that returns a new end state.
     */
    @Test
    public void testIsEnumClass() {
		assertNotNull(EndState.getSingleton().getEnum());
        assertEquals("E", new EndState().getEnum().getValue());
    }
}
