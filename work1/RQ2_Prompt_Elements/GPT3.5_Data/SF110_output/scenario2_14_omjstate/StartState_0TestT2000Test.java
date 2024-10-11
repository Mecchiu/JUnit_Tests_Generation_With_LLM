// Source code for StartState_0Test.java

package uk.me.jockmacmad.jstate.state;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link StartState}.
 * It contains ten unit test cases for the {@link StartState#getSingleton()} method.
 */
class StartState_0Test {

    /**
     * Test case to verify that the getSingleton() method returns a non-null object.
     */
    @Test
    void testGetSingletonReturnsNonNull() {
        assertNotNull(StartState.getSingleton());
    }

    /**
     * Test case to verify that the getSingleton() method returns the same object every time it is called.
     */
    @Test
    void testGetSingletonReturnsSameObject() {
        StartState firstInstance = StartState.getSingleton();
        StartState secondInstance = StartState.getSingleton();
        assertSame(firstInstance, secondInstance);
    }

    /**
     * Test case to verify that the getSingleton() method returns an instance of the StartState class.
     */
    @Test
    void testGetSingletonReturnsInstanceOfStartState() {
        assertTrue(StartState.getSingleton() instanceof StartState);
    }

    /**
     * Test case to verify that the getSingleton() method returns a singleton object.
     */
    @Test
    void testGetSingletonReturnsSingleton() {
        assertTrue(StartState.getSingleton() == StartState.getSingleton());
    }

    /**
     * Test case to verify that the getSingleton() method returns an object that is equal to itself.
     */
    @Test
    void testGetSingletonReturnsObjectEqualToItself() {
        StartState instance = StartState.getSingleton();
        assertTrue(instance.equals(instance));
    }

    /**
     * Test case to verify that the getSingleton() method returns an object that is equal to another instance of the StartState class.
     */
    @Test
    void testGetSingletonReturnsObjectEqualToAnotherInstance() {
        StartState firstInstance = StartState.getSingleton();
        StartState secondInstance = new StartState();
        assertTrue(firstInstance.equals(secondInstance));
    }

    /**
     * Test case to verify that the getSingleton() method returns an object that has the same hash code as itself.
     */
    @Test
    void testGetSingletonReturnsObjectWithSameHashCode() {
        StartState instance = StartState.getSingleton();
        assertEquals(instance.hashCode(), instance.hashCode());
    }

    /**
     * Test case to verify that the getSingleton() method returns an object that has the same hash code as another instance of the StartState class.
     */
    @Test
    void testGetSingletonReturnsObjectWithSameHashCodeAsAnotherInstance() {
        StartState firstInstance = StartState.getSingleton();
        StartState secondInstance = new StartState();
        assertEquals(firstInstance.hashCode(), secondInstance.hashCode());
    }

    /**
     * Test case to verify that the getSingleton() method returns an object that has a different hash code than another object.
     */
    @Test
    void testGetSingletonReturnsObjectWithDifferentHashCode() {
        StartState instance = StartState.getSingleton();
        Object otherObject = new Object();
        assertNotEquals(instance.hashCode(), otherObject.hashCode());
    }

    /**
     * Test case to verify that the getSingleton() method returns an object that is not equal to null.
     */
    @Test
    void testGetSingletonReturnsObjectNotEqualToNull() {
        StartState instance = StartState.getSingleton();
        assertNotNull(instance);
    }
}