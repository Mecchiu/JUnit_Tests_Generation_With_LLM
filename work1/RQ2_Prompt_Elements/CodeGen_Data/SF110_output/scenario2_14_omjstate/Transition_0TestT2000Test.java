// Transition_0Test.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Transition}.
* It contains one unit test case for the {@link Transition#trigger(IState, Event)} method.
*/
class Transition_0Test {

	/**
	 * The IState of the State Machine
	 */
	private IState initialState;
	
	/**
	 * The Event of the event triggered the State Machine to initiate, 
	 */
	private Event triggerEvent;

    Transition_0Test(IState initialState, Event triggerEvent) {
        this.initialState = initialState;
        this.triggerEvent = triggerEvent;
    }

    /**
     * Return the IState of the StateMachine
     * @return IState
     */
    public IState getState() {
        return initialState;
    }

	/**
	 * Set the IState of the StateMachine
	 * @param state the state state
	 */
    protected void setState(IState state) {
	    initialState = state;
    }

    /**
     * Returns the Event of the event triggered the State Machine to initiate
     * @return Event
     */
    public Event getTriggerEvent() {
        return triggerEvent;
    }

    /**
     * Sets the Event of the event triggered the State Machine to initiate
     * @param triggerEvent The State Machine to initiate the Event
     */
    protected void setTriggerEvent(Event triggerEvent) {
        this.triggerEvent = triggerEvent;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).toString();
    }

    @Test
    public void testEquals() throws Exception {
        assertTrue(new Transition((IState) null, null).equals(new Transition((IState) null, null)));
        assertTrue(new Transition((IState) null, null).equals(new Transition((IState) null, "initiated")));
        assertFalse("equals should return false", new Transition((IState) null, "initiated").equals(new Transition((IState) null, "initiated")));
        assertTrue(new Transition((IState) null, null).equals(new Transition((IState) null, "notstartedinitiated")));
        assertFalse("equals should return false for transition with nulls", 
                new Transition((IState) null, null).equals(new Transition((IState) null, "initiated")));
        assertTrue("equals should return false for different event", 
                new Transition((IState) null, "initiated").equals(new Transition((IState) null, "notstartedinitiated")));
        assertTrue("not equals", new Transition((IState) null, "notstartedinitiated").equals(new Transition((IState) null, "notstartedinitiated")));
    }
    
    @Test
    public void testHashCode() throws Exception {
        
        assertEquals("equals should always return true", 
                new Transition((IState) null, null).equals(new Transition((IState) null, null)), true);
        assertEquals("hashcode should return same hashcode for both types", 
                (new Transition((IState) null, null)).hashCode(), 
                new Transition((IState) null, null).hashCode());
        assertFalse("hashcode should return different hashcode for not null", 
                new Transition((IState) null, null).hashCode(), 
                new Transition((IState) null, "notstartedinitiated").hashCode());
        
	}
	
	@Test
	public void testUpdateGuardConditions() throws Exception {
         assertNotNull(new Transition((IState) null, null).guardConditions);
         assertTrue("guardConditions is empty", new Transition((IState) null, null).guardConditions.isEmpty());
         assertEquals(triggerEvent.equals(new Transition((IState) null, null).triggerEvent),
                    !initialState.equals(new Transition((IState) null, null).triggerEvent));
        
	}

}
