// SaveMetadataActionTest.java
package org.heal.servlet.cataloger;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link SaveMetadataAction}.
 * It contains ten unit test cases for the {@link SaveMetadataAction#actionRequiresLogin()} method.
 */
class SaveMetadataActionTest {

    /**
     * Test case to check if the method returns true.
     */
    @Test
    void testActionRequiresLoginTrue() {
        SaveMetadataAction saveMetadataAction = new SaveMetadataAction();
        assertTrue(saveMetadataAction.actionRequiresLogin());
    }

    /**
     * Test case to check if the method returns false.
     */
    @Test
    void testActionRequiresLoginFalse() {
        SaveMetadataAction saveMetadataAction = new SaveMetadataAction();
        assertFalse(saveMetadataAction.actionRequiresLogin());
    }

    /**
     * Test case to check if the method returns true when called multiple times.
     */
    @Test
    void testActionRequiresLoginTrueMultipleCalls() {
        SaveMetadataAction saveMetadataAction = new SaveMetadataAction();
        assertTrue(saveMetadataAction.actionRequiresLogin());
        assertTrue(saveMetadataAction.actionRequiresLogin());
        assertTrue(saveMetadataAction.actionRequiresLogin());
    }

    /**
     * Test case to check if the method returns false when called multiple times.
     */
    @Test
    void testActionRequiresLoginFalseMultipleCalls() {
        SaveMetadataAction saveMetadataAction = new SaveMetadataAction();
        assertFalse(saveMetadataAction.actionRequiresLogin());
        assertFalse(saveMetadataAction.actionRequiresLogin());
        assertFalse(saveMetadataAction.actionRequiresLogin());
    }

    /**
     * Test case to check if the method returns true when called after creating a new instance.
     */
    @Test
    void testActionRequiresLoginTrueNewInstance() {
        SaveMetadataAction saveMetadataAction = new SaveMetadataAction();
        assertTrue(saveMetadataAction.actionRequiresLogin());
        saveMetadataAction = new SaveMetadataAction();
        assertTrue(saveMetadataAction.actionRequiresLogin());
    }

    /**
     * Test case to check if the method returns false when called after creating a new instance.
     */
    @Test
    void testActionRequiresLoginFalseNewInstance() {
        SaveMetadataAction saveMetadataAction = new SaveMetadataAction();
        assertFalse(saveMetadataAction.actionRequiresLogin());
        saveMetadataAction = new SaveMetadataAction();
        assertFalse(saveMetadataAction.actionRequiresLogin());
    }

    /**
     * Test case to check if the method returns true when called after creating multiple instances.
     */
    @Test
    void testActionRequiresLoginTrueMultipleInstances() {
        SaveMetadataAction saveMetadataAction1 = new SaveMetadataAction();
        SaveMetadataAction saveMetadataAction2 = new SaveMetadataAction();
        assertTrue(saveMetadataAction1.actionRequiresLogin());
        assertTrue(saveMetadataAction2.actionRequiresLogin());
    }

    /**
     * Test case to check if the method returns false when called after creating multiple instances.
     */
    @Test
    void testActionRequiresLoginFalseMultipleInstances() {
        SaveMetadataAction saveMetadataAction1 = new SaveMetadataAction();
        SaveMetadataAction saveMetadataAction2 = new SaveMetadataAction();
        assertFalse(saveMetadataAction1.actionRequiresLogin());
        assertFalse(saveMetadataAction2.actionRequiresLogin());
    }

    /**
     * Test case to check if the method returns true when called after creating and modifying an instance.
     */
    @Test
    void testActionRequiresLoginTrueModifiedInstance() {
        SaveMetadataAction saveMetadataAction = new SaveMetadataAction();
        assertFalse(saveMetadataAction.actionRequiresLogin());
        saveMetadataAction = new SaveMetadataAction();
        assertTrue(saveMetadataAction.actionRequiresLogin());
    }

    /**
     * Test case to check if the method returns false when called after creating and modifying an instance.
     */
    @Test
    void testActionRequiresLoginFalseModifiedInstance() {
        SaveMetadataAction saveMetadataAction = new SaveMetadataAction();
        assertTrue(saveMetadataAction.actionRequiresLogin());
        saveMetadataAction = new SaveMetadataAction();
        assertFalse(saveMetadataAction.actionRequiresLogin());
    }
}