// Transition_1Test.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Transition}.
* It contains one unit test case for the {@link Transition#willTrigger(IState, Event)} method.
*/
class Transition_1Test {
/**
		 * Test method for {@link Transition#TRANSITION_NAME}.
		 */
		@Test
            public void testTRANSITION_NAME() {
                    for (Transition t : new Transition[] {new Transition(), new Transition(), null, new Transition()}) {
                        assertEquals(TRANSITION_NAME, t.name);
                    }
            }

    /**
     * Tests {@link Transition#willTrigger(IState, Event)} method.
     */
    @Test
    public final void testWillTrigger() {
        for (Transition t : new Transition[] {new Transition(), new Transition(), null, new Transition()}) {
            assertFalse(t.willTrigger(null, null));
            assertTrue(t.willTrigger(null, null));
        }

    }
    /**
     * Tests that the equality comparison.
     */
    @Test
    public final void testEquals() {
        final Transition t1 = new Transition();
        final Transition t2 = new Transition();
        final Transition t3 = new Transition();
        t1.setName(TRANSITION_NAME);
        t2.setName(TRANSITION_NAME);
        t3.setName(TRANSITION_NAME);
        assertEquals(t1, t2);
        assertTrue(new EqualsBuilder()
               .append(t1, t2)
               .isEquals());
        assertFalse(new EqualsBuilder()
               .append(t1, t3)
               .isEquals());
        t1.setName("t");
        assertFalse(new EqualsBuilder()
               .append(t1, t2)
               .isEquals());
        assertFalse(new EqualsBuilder()
               .append(t1, t1)
               .isEquals());
        assertFalse(new EqualsBuilder()
               .append(t1, t3)
               .isEquals());

    }
    /**
     * Tests that the hashcode is calculated based
     * on {@link Transition#name()}.
     */
    @Test
    public final void testHashCode() {
        final Transition t = new Transition();
        t.setName(TRANSITION_NAME);
        assertEquals(new HashCodeBuilder().append(t.name)
               .toHashCode(),
                new HashCodeBuilder().append(t.name)
               .toHashCode());
        assertTrue(new HashCodeBuilder().append(t.name)
               .toHashCode()!= new HashCodeBuilder().append(t.name)
               .toHashCode());
        assertFalse(new EqualsBuilder()
               .append(t.name)
               .isEquals());
    }
    /**
     * Tests that the toString contains the toString of
     * object of {@link Transition})
     */
    @Test
    public final void testToString() {
        final Transition t = new Transition();
        t.setName(TRANSITION_NAME);
        assertTrue(new ToStringBuilder(t)
               .append(t.name)
               .toString().contains("TRANSITION_NAME"));
    }
}