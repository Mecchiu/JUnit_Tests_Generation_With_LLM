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
     * Test 1 - Single transition with only a initial state event
     * Test 2 - Transition with a START_EVENT and an END_EVENT,
     * a combination of START, END and START_EVENT.
     * <p>
     * TODO fix
     * Creation date: (13/03/01 23:10:27 PM)
     * @throws Exception
     */
    @Test
    void test1() throws Exception {
        /**
         * Test Case 1 - Single transition with only a initial state event
         */
        final IState initialState = getInitialState();
        
        // Start state transition
        final IState startState = IState.getStartState();
        final Event triggerEvent = new Event("trigger");
        final IState outputState = new State();
        final boolean willTrigger = initialState.willTrigger(startState, triggerEvent);
        assertTrue(willTrigger);
        final Event checkEvent = new Event("event");
        final IState endState = IState.getEndState();
        final boolean willIgnore = IState.getStartState().willTrigger(endState, checkEvent);
        final boolean transitionWasSuccessful = initialState.isStarted()
               ? initialState.equals(endState)
                : (initialState.isEnded()? initialState.equals(endState) : false);
        assertTrue(transitionWasSuccessful);
        
        // Transition with START_STATE as the first state and a START_EVENT
        final Transition_1 transition = new Transition_1();
        final IState new_initialState = getNewState(initialState, true, false);
        final IState new_startState = new_initialState;
        final IState new_triggerEvent = new Event("TRIGGER");
        final boolean willTrigger = startState.willTrigger(new_startState, new_triggerEvent);
        final boolean transitionWasSuccessful = initialState.isStarted()
               ? initialState.equals(new_startState)
                : (initialState.isEnded()? initialState.equals(new_startState) : false);
        assertTrue("Transition didn't succeed", transitionWasSuccessful);
        
        /**
         * Test Case 2 - Transition with START_STATE, END_EVENT and START_STATE (again)
         */
        final IState new_trigger = new TriggerEvent("TRGERY", startState);
        final boolean transitionWasSuccessful = initialState.isStarted()
               ? initialState.equals(new_trigger)
                : (initialState.isEnded()? initialState.equals(new_trigger) : false);
        assertTrue("Transition didn't succeed", transitionWasSuccessful);
        
        assertTrue(transitionWasSuccessful);
    }
        
    final IState getInitialState() {
        return IState.getStartState();
    }
        
    final IState getNewState(final IState pInitialState, final boolean pTriggersInitialState, final boolean pIsStarted) {
        IState new_state = null;
        if (pIsStarted) {
            new_state = IState.getStartState();
        } else {
            new_state = IState.getEndState();
        }
        if (pTriggersInitialState) {
            new_state = new_state.trigger(pInitialState);            
        }
        return new_state;
    }
        
    transient final IState initialState;
        transient final IState trigger;
        transient final IState triggerEvent;
        transient final Event triggerEvent_type;
        
        transient IState new_initialState;
        transient StateFactory new_trigger;
        transient boolean willTrigger_TRIGGER;
        transient boolean willTrigger_EVENT;
        transient boolean willIgnore_TRIGGER;
    
        transient public static final class StateFactory {

            @Override
            public IState newInitialState(final IState pInState) {
                return pInState;
            }

            @Override
            public IState newTriggerState(final IState pTrigState) {
                return new TriggerState();
            }

            @Override
            public Event newTriggerEvent(final Event pTrigger) {
                return pTrigger;
            }

        }
        
        transient Boolean isStartState;
        transient Boolean isEndState;
        transient Boolean triggered;
        
    }    
    
    class Transition_1 extends Transition {

        
        Transition_1() {
            super(new StateFactory());
        }
        
        public void willTrigger(final IState pCurrentState, final Event pTriggerEvent) {
            this.trigger = pTriggerEvent;
            this.triggerEvent_type = this.trigger.getType();
            this.isStartState = pCurrentState.isStarted();
            this.isEndState = pCurrentState.isEnded();
            this.triggerWasSuccessful = pCurrentState.isTriggerable();
        }
        
        public boolean isTriggerable() {
            return this.trigger!= null;
        }
        
        public Boolean isEndState() {
            return this.isEndState;
        }
    }
        


}

