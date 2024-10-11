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
		IState initialState;
		IState outcomeState;
		Event triggerEvent;

        /**
     * Test Method to check if the {@link Transition#trigger} method
     * will trigger a state machine.
     * Creation date: (2/15/01 9:58:00 AM)
     * @expectedNoStateMachineToChange
     * @since 0.1
     */
    @Test
    public void willTriggerStateMachine() throws Exception {

        this.initialState = uj.me.jockmacmad.jstate.utl.IStateMachine.NULL_STATEMACHINE;
        this.outcomeState = uj.me.jockmacmad.jstate.utl.IStateMachine.NULL_STATE;
        this.triggerEvent = Event.NON_EVENT;

        assertNotNull( "Should always have a null transition", initialState.getTransition() );

        final Transition object = new Transition( "test_1", Event.NON_EVENT, this.initialState, this.outcomeState );
        assertFalse( "Not null transition",
                     object.willTrigger( this.initialState, this.triggerEvent )
                     );
    }

    /**
     * Test Method to check if two Transition objects,
     * their initialState, and their outcomeState, will
     * only return identical objects.
     * Creation date: (2/16/01 0:00:00 AM)
     * @since 0.1
     */
    @Test
    public void onlyWillTriggerSameInstance(){
        this.initialState = uj.me.jockmacmad.jstate.utl.IStateMachine.NULL_STATE;
        this.outcomeState = uj.me.jockmacmad.jstate.utl.IStateMachine.NULL_STATE;
        assertNotSame( "State A should return State B", this.initialState, this.outcomeState );
    }

}