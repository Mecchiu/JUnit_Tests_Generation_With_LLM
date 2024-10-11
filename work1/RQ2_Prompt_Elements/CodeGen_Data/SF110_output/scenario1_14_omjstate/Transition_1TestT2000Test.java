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

    @Test
    public void transition_1_shouldBeTrueForStartState_whenTrueHasStartState() {
        final IState startState = new StateMachineStartState("startState");
        final Event triggerEvent = new Event("triggerEvent");
        assertFalse("triggered transition is false", Transition.willTrigger(startState, triggerEvent));
    }

    /**
     * This {@link Transition} contains 2 guard conditions.
     * The test below ensures that all conditions evaluate to true and therefore
     * the transition executes and returns the new state that the state machine
     * is in.
     */
    @Test
    public void transition_1_shouldBeTrueForEvent_whenTrueHasEvent(){
        final IState startState = new StateMachineStartState("startState");
        final Event triggerEvent = new Event("triggerEvent");
        final IGuardCondition guardConditionA = new GuardCondition("guardCondA", GuardType.A2, true);
        final IGuardCondition guardConditionB = new GuardCondition("guardCondB", GuardType.A2, true);

        final IState eventState = new StateMachineEventState("eventState");
        final IState transitionState = new EventState("transitionState");
        final Event newEvent = new Event("event");

        /* guard conditions should be a part of guardConditions
        * 1.  When all conditions evaluate to true
        * 2.  triggered state is set */
        assertTrue("conditions should be in an event's guards", Transition.willTrigger(newStateMachineState,newEvent));
        assertTrue("conditions should be in a started event state", Transition.willTrigger(eventState,newEvent));
        assertTrue("conditions should be in an " + transitionState, Transition.willTrigger(transitionState,newEvent));
        assertTrue("new event states in event are all events",newEvent.equals(new Event("event")));
        assertTrue("guardConditionA evaluates to true", guardConditionA.evaluate(triggerEvent));
        assertTrue("guardConditionB evaluates to true", guardConditionB.evaluate(triggerEvent));

        /* guard conditions should have been used to create a start state */
        final IState startingState = newStateMachineState;
      
        assertEquals("states are equal", startingState, newStateMachineState);
        assertTrue("start State should not be set as trigger state", newStateMachineState.equals(triggerState));
        assertTrue("new events in new transition should be the event", newEvent.equals(newTransitionState));
        assertTrue("new event states in transitions should be all events",newEvent.equals(newTransitionState));
        assertTrue("new event states in new event should be equal to starting state",newEvent.equals(startingState));

        /* 2.1. guardConditions are the same as the ones at the start state
        * 1.  trigger state should equal the trigger state at event event */
        assertEquals("guardConditions are the same", guardConditionA.getGuardCondition(), guardConditionB.getGuardCondition());
   
        /* 2.2. guardCondition should be different if all conditions at all are
        *    False  = No Guard Conditions - default = always true
        * 1.  trigger state is set and the initial state does not
        * 2.1. guardConditions are the same as the ones at the start state
        * 2.2. guardCondition should not be set if all conditions at all are False
        * 2.3. when true evaluates to true but guardConditions are different
        * 2.3. evaluate guarded state condition
        * 3.  guard condition should be set as this is a started event */
        final IGuardCondition stateGuardCondition = new GuardCondition("stateGuardCondition", GuardType.A2, false);
        final IStateStateCondition transformedStateCondition = stateGuardCondition.transformEquals(new GuardStateConditionFactory(newStateMachineState).getRuleState().createStateStateConditionFromState());
        assertFalse("guardConditionA evaluates to false if guard conditions are different at all",guardConditionA.evaluate(triggerEvent));
        assertFalse("guardConditions are different at all - default TRUE",guardConditionA.evaluate(newEvent));
        assertFalse("guardConditionB evaluates to false if guard conditions are different at all",guardConditionB.evaluate(triggerEvent));
        assertFalse("guardConditions are different at all - false true", guardConditionA.evaluate(newEvent));
        assertFalse("guardConditions are different at all - false false", guardConditionB.evaluate(newEvent));
    }
}
// Transition_1Test.java