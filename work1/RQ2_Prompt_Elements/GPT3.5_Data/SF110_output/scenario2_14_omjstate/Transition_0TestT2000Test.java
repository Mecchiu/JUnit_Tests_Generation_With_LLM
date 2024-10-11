// Here's an example implementation of the Transition_0Test class:

package uk.me.jockmacmad.jstate.state;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Transition_0Test {

    @Test
    void testTrigger_noGuardConditions() {
        // Given
        IState initialState = new State("Initial");
        IState outcomeState = new State("Outcome");
        Event triggerEvent = new Event("Trigger");
        Transition transition = new Transition(initialState, outcomeState, triggerEvent);

        // When
        IState result = transition.trigger(initialState, triggerEvent);

        // Then
        assertEquals(outcomeState, result);
    }

    @Test
    void testTrigger_withGuardConditions_passes() {
        // Given
        IState initialState = new State("Initial");
        IState outcomeState = new State("Outcome");
        Event triggerEvent = new Event("Trigger");
        Transition transition = new Transition(initialState, outcomeState, triggerEvent);
        transition.addGuardCondition(new GuardCondition() {
            @Override
            public boolean evaluate(Event event) {
                return true;
            }
        });

        // When
        IState result = transition.trigger(initialState, triggerEvent);

        // Then
        assertEquals(outcomeState, result);
    }

    @Test
    void testTrigger_withGuardConditions_fails() {
        // Given
        IState initialState = new State("Initial");
        IState outcomeState = new State("Outcome");
        Event triggerEvent = new Event("Trigger");
        Transition transition = new Transition(initialState, outcomeState, triggerEvent);
        transition.addGuardCondition(new GuardCondition() {
            @Override
            public boolean evaluate(Event event) {
                return false;
            }
        });

        // When
        IState result = transition.trigger(initialState, triggerEvent);

        // Then
        assertEquals(initialState, result);
    }

    @Test
    void testTrigger_wrongInitialState() {
        // Given
        IState initialState = new State("Initial");
        IState outcomeState = new State("Outcome");
        Event triggerEvent = new Event("Trigger");
        Transition transition = new Transition(initialState, outcomeState, triggerEvent);

        // When
        IState result = transition.trigger(new State("Wrong"), triggerEvent);

        // Then
        assertEquals(initialState, result);
    }

    @Test
    void testTrigger_wrongTriggerEvent() {
        // Given
        IState initialState = new State("Initial");
        IState outcomeState = new State("Outcome");
        Event triggerEvent = new Event("Trigger");
        Transition transition = new Transition(initialState, outcomeState, triggerEvent);

        // When
        IState result = transition.trigger(initialState, new Event("Wrong"));

        // Then
        assertEquals(initialState, result);
    }

    @Test
    void testTrigger_multipleGuardConditions_passes() {
        // Given
        IState initialState = new State("Initial");
        IState outcomeState = new State("Outcome");
        Event triggerEvent = new Event("Trigger");
        Transition transition = new Transition(initialState, outcomeState, triggerEvent);
        transition.addGuardCondition(new GuardCondition() {
            @Override
            public boolean evaluate(Event event) {
                return true;
            }
        });
        transition.addGuardCondition(new GuardCondition() {
            @Override
            public boolean evaluate(Event event) {
                return true;
            }
        });

        // When
        IState result = transition.trigger(initialState, triggerEvent);

        // Then
        assertEquals(outcomeState, result);
    }

    @Test
    void testTrigger_multipleGuardConditions_oneFails() {
        // Given
        IState initialState = new State("Initial");
        IState outcomeState = new State("Outcome");
        Event triggerEvent = new Event("Trigger");
        Transition transition = new Transition(initialState, outcomeState, triggerEvent);
        transition.addGuardCondition(new GuardCondition() {
            @Override
            public boolean evaluate(Event event) {
                return true;
            }
        });
        transition.addGuardCondition(new GuardCondition() {
            @Override
            public boolean evaluate(Event event) {
                return false;
            }
        });

        // When
        IState result = transition.trigger(initialState, triggerEvent);

        // Then
        assertEquals(initialState, result);
    }

    @Test
    void testTrigger_multipleGuardConditions_allFail() {
        // Given
        IState initialState = new State("Initial");
        IState outcomeState = new State("Outcome");
        Event triggerEvent = new Event("Trigger");
        Transition transition = new Transition(initialState, outcomeState, triggerEvent);
        transition.addGuardCondition(new GuardCondition() {
            @Override
            public boolean evaluate(Event event) {
                return false;
            }
        });
        transition.addGuardCondition(new GuardCondition() {
            @Override
            public boolean evaluate(Event event) {
                return false;
            }
        });

        // When
        IState result = transition.trigger(initialState, triggerEvent);

        // Then
        assertEquals(initialState, result);
    }

    @Test
    void testTrigger_noGuardConditions_wrongInitialState() {
        // Given
        IState initialState = new State("Initial");
        IState outcomeState = new State("Outcome");
        Event triggerEvent = new Event("Trigger");
        Transition transition = new Transition(initialState, outcomeState, triggerEvent);

        // When
        IState result = transition.trigger(new State("Wrong"), triggerEvent);

        // Then
        assertEquals(initialState, result);
    }

    @Test
    void testTrigger_noGuardConditions_wrongTriggerEvent() {
        // Given
        IState initialState = new State("Initial");
        IState outcomeState = new State("Outcome");
        Event triggerEvent = new Event("Trigger");
        Transition transition = new Transition(initialState, outcomeState, triggerEvent);

        // When
        IState result = transition.trigger(initialState, new Event("Wrong"));

        // Then
        assertEquals(initialState, result);
    }
}