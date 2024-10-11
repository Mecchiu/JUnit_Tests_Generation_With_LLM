// Source code for StartState_1Test.java

package uk.me.jockmacmad.jstate.state;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link StartState}.
 * It contains ten unit test cases for the {@link StartState#toObject()} method.
 */
class StartState_1Test {

    /**
     * Test case to verify that the toObject() method returns an instance of java.lang.Object.
     */
    @Test
    void testToObjectReturnsObject() {
        StartState startState = StartState.getSingleton();
        Object object = startState.toObject();
        assertTrue(object instanceof Object);
    }

    /**
     * Test case to verify that the toObject() method returns an instance of StartState.
     */
    @Test
    void testToObjectReturnsStartState() {
        StartState startState = StartState.getSingleton();
        Object object = startState.toObject();
        assertTrue(object instanceof StartState);
    }

    /**
     * Test case to verify that the toObject() method returns the same instance of StartState every time it is called.
     */
    @Test
    void testToObjectReturnsSameInstance() {
        StartState startState = StartState.getSingleton();
        Object object1 = startState.toObject();
        Object object2 = startState.toObject();
        assertSame(object1, object2);
    }

    /**
     * Test case to verify that the toObject() method returns an instance of java.lang.Object with the same hash code as the StartState instance.
     */
    @Test
    void testToObjectReturnsObjectWithSameHashCode() {
        StartState startState = StartState.getSingleton();
        Object object = startState.toObject();
        assertEquals(startState.hashCode(), object.hashCode());
    }

    /**
     * Test case to verify that the toObject() method returns an instance of java.lang.Object that is equal to the StartState instance.
     */
    @Test
    void testToObjectReturnsObjectThatIsEqual() {
        StartState startState = StartState.getSingleton();
        Object object = startState.toObject();
        assertEquals(startState, object);
    }

    /**
     * Test case to verify that the toObject() method returns an instance of java.lang.Object that is not equal to null.
     */
    @Test
    void testToObjectReturnsObjectThatIsNotNull() {
        StartState startState = StartState.getSingleton();
        Object object = startState.toObject();
        assertNotNull(object);
    }

    /**
     * Test case to verify that the toObject() method returns an instance of java.lang.Object that is not equal to a different instance of StartState.
     */
    @Test
    void testToObjectReturnsObjectThatIsNotEqualDifferentInstance() {
        StartState startState1 = StartState.getSingleton();
        StartState startState2 = StartState.getSingleton();
        Object object1 = startState1.toObject();
        Object object2 = startState2.toObject();
        assertNotEquals(object1, object2);
    }

    /**
     * Test case to verify that the toObject() method returns an instance of java.lang.Object that is equal to a different instance of StartState that was converted to an object.
     */
    @Test
    void testToObjectReturnsObjectThatIsEqualDifferentInstance() {
        StartState startState1 = StartState.getSingleton();
        StartState startState2 = StartState.getSingleton();
        Object object1 = startState1.toObject();
        Object object2 = startState2.toObject();
        assertEquals(object1, object2);
    }

    /**
     * Test case to verify that the toObject() method returns an instance of java.lang.Object that is not equal to a different object.
     */
    @Test
    void testToObjectReturnsObjectThatIsNotEqualDifferentObject() {
        StartState startState = StartState.getSingleton();
        Object object = new Object();
        assertNotEquals(object, startState.toObject());
    }

    /**
     * Test case to verify that the toObject() method returns an instance of java.lang.Object that is not equal to a null value.
     */
    @Test
    void testToObjectReturnsObjectThatIsNotEqualNull() {
        StartState startState = StartState.getSingleton();
        assertNotEquals(null, startState.toObject());
    }
}