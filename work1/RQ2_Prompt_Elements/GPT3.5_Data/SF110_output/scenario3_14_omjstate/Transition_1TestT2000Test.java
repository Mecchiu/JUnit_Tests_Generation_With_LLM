// Here's an example implementation of the Transition class and a test class for it.

// Transition.java
package com.example.statemachine;

import java.util.function.Predicate;

public class Transition {
    private final State startState;
    private final Event event;
    private final Predicate<StateMachineContext> guard;
    private final State endState;

    public Transition(State startState, Event event, Predicate<StateMachineContext> guard, State endState) {
        this.startState = startState;
        this.event = event;
        this.guard = guard;
        this.endState = endState;
    }

    public boolean isTriggered(StateMachineContext context) {
        return startState.equals(context.getState()) && event.equals(context.getEvent()) && guard.test(context);
    }

    public State getEndState() {
        return endState;
    }
}

// TransitionTest.java
package com.example.statemachine;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TransitionTest {
    private final State startState = new State("start");
    private final State endState = new State("end");
    private final Event event = new Event("event");
    private final Predicate<StateMachineContext> guard = context -> context.getData() > 0;

    @Test
    public void testIsTriggered_withMatchingStateEventAndGuard_returnsTrue() {
        StateMachineContext context = new StateMachineContext(startState, event, 1);
        Transition transition = new Transition(startState, event, guard, endState);

        assertTrue(transition.isTriggered(context));
    }

    @Test
    public void testIsTriggered_withNonMatchingState_returnsFalse() {
        StateMachineContext context = new StateMachineContext(new State("other"), event, 1);
        Transition transition = new Transition(startState, event, guard, endState);

        assertFalse(transition.isTriggered(context));
    }

    @Test
    public void testIsTriggered_withNonMatchingEvent_returnsFalse() {
        StateMachineContext context = new StateMachineContext(startState, new Event("other"), 1);
        Transition transition = new Transition(startState, event, guard, endState);

        assertFalse(transition.isTriggered(context));
    }

    @Test
    public void testIsTriggered_withNonMatchingGuard_returnsFalse() {
        StateMachineContext context = new StateMachineContext(startState, event, -1);
        Transition transition = new Transition(startState, event, guard, endState);

        assertFalse(transition.isTriggered(context));
    }

    @Test
    public void testGetEndState_returnsEndState() {
        Transition transition = new Transition(startState, event, guard, endState);

        assertEquals(endState, transition.getEndState());
    }
}