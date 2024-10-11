// Component3DManager_0Test.java
package com.eteks.sweethome3d.j3d;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link Component3DManager}.
 * It contains ten unit test cases for the {@link Component3DManager#getInstance()} method.
 */
class Component3DManager_0Test {

    /**
     * Test case: getInstance() returns a non-null instance of Component3DManager.
     */
    @Test
    void testGetInstance() {
        Component3DManager instance = Component3DManager.getInstance();
        assertNotNull(instance);
    }

    /**
     * Test case: getInstance() returns the same instance of Component3DManager when called multiple times.
     */
    @Test
    void testGetInstanceReturnsSameInstance() {
        Component3DManager instance1 = Component3DManager.getInstance();
        Component3DManager instance2 = Component3DManager.getInstance();
        assertSame(instance1, instance2);
    }

    /**
     * Test case: getInstance() returns an instance of Component3DManager that is a singleton.
     */
    @Test
    void testGetInstanceIsSingleton() {
        Component3DManager instance1 = Component3DManager.getInstance();
        Component3DManager instance2 = new Component3DManager();
        assertSame(instance1, instance2);
    }

    /**
     * Test case: getInstance() returns an instance of Component3DManager that is not null.
     */
    @Test
    void testGetInstanceNotNull() {
        Component3DManager instance = Component3DManager.getInstance();
        assertNotNull(instance);
    }

    /**
     * Test case: getInstance() returns an instance of Component3DManager that is of type Component3DManager.
     */
    @Test
    void testGetInstanceType() {
        Component3DManager instance = Component3DManager.getInstance();
        assertTrue(instance instanceof Component3DManager);
    }

    /**
     * Test case: getInstance() returns an instance of Component3DManager that is not equal to null.
     */
    @Test
    void testGetInstanceNotEqualToNull() {
        Component3DManager instance = Component3DManager.getInstance();
        assertNotEquals(null, instance);
    }

    /**
     * Test case: getInstance() returns an instance of Component3DManager that is not equal to a new instance of Component3DManager.
     */
    @Test
    void testGetInstanceNotEqualToNewInstance() {
        Component3DManager instance1 = Component3DManager.getInstance();
        Component3DManager instance2 = new Component3DManager();
        assertNotEquals(instance1, instance2);
    }

    /**
     * Test case: getInstance() returns an instance of Component3DManager that is equal to itself.
     */
    @Test
    void testGetInstanceEqualsItself() {
        Component3DManager instance = Component3DManager.getInstance();
        assertEquals(instance, instance);
    }

    /**
     * Test case: getInstance() returns an instance of Component3DManager that is not equal to a String object.
     */
    @Test
    void testGetInstanceNotEqualToString() {
        Component3DManager instance = Component3DManager.getInstance();
        assertNotEquals(instance, "string");
    }

    /**
     * Test case: getInstance() returns an instance of Component3DManager that is not equal to a null object.
     */
    @Test
    void testGetInstanceNotEqualToNullObject() {
        Component3DManager instance = Component3DManager.getInstance();
        assertNotEquals(instance, null);
    }
}