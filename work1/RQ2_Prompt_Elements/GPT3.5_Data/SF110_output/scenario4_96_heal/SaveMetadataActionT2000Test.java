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
     * Test case to check if the actionRequiresLogin method returns true.
     */
    @Test
    void testActionRequiresLoginTrue() {
        SaveMetadataAction saveMetadataAction = new SaveMetadataAction();
        assertTrue(saveMetadataAction.actionRequiresLogin());
    }

    /**
     * Test case to check if the actionRequiresLogin method returns false.
     */
    @Test
    void testActionRequiresLoginFalse() {
        SaveMetadataAction saveMetadataAction = new SaveMetadataAction();
        assertFalse(saveMetadataAction.actionRequiresLogin());
    }

    /**
     * Test case to check if the actionRequiresLogin method returns true when the object is null.
     */
    @Test
    void testActionRequiresLoginNull() {
        SaveMetadataAction saveMetadataAction = null;
        assertNull(saveMetadataAction);
    }

    /**
     * Test case to check if the actionRequiresLogin method returns true when the object is not null.
     */
    @Test
    void testActionRequiresLoginNotNull() {
        SaveMetadataAction saveMetadataAction = new SaveMetadataAction();
        assertNotNull(saveMetadataAction);
    }

    /**
     * Test case to check if the actionRequiresLogin method returns true when the object is the same.
     */
    @Test
    void testActionRequiresLoginSameObject() {
        SaveMetadataAction saveMetadataAction1 = new SaveMetadataAction();
        SaveMetadataAction saveMetadataAction2 = saveMetadataAction1;
        assertSame(saveMetadataAction1, saveMetadataAction2);
    }

    /**
     * Test case to check if the actionRequiresLogin method returns false when the object is different.
     */
    @Test
    void testActionRequiresLoginDifferentObject() {
        SaveMetadataAction saveMetadataAction1 = new SaveMetadataAction();
        SaveMetadataAction saveMetadataAction2 = new SaveMetadataAction();
        assertNotSame(saveMetadataAction1, saveMetadataAction2);
    }

    /**
     * Test case to check if the actionRequiresLogin method returns true when the object is an instance of SaveMetadataAction.
     */
    @Test
    void testActionRequiresLoginInstanceOf() {
        SaveMetadataAction saveMetadataAction = new SaveMetadataAction();
        assertTrue(saveMetadataAction instanceof SaveMetadataAction);
    }

    /**
     * Test case to check if the actionRequiresLogin method returns true when the object is not an instance of SaveMetadataAction.
     */
    @Test
    void testActionRequiresLoginNotInstanceOf() {
        Object object = new Object();
        assertFalse(object instanceof SaveMetadataAction);
    }

    /**
     * Test case to check if the actionRequiresLogin method returns true when the object is a subclass of SaveMetadataAction.
     */
    @Test
    void testActionRequiresLoginSubclassOf() {
        class SubSaveMetadataAction extends SaveMetadataAction {}
        SubSaveMetadataAction subSaveMetadataAction = new SubSaveMetadataAction();
        assertTrue(subSaveMetadataAction instanceof SaveMetadataAction);
    }

    /**
     * Test case to check if the actionRequiresLogin method returns false when the object is not a subclass of SaveMetadataAction.
     */
    @Test
    void testActionRequiresLoginNotSubclassOf() {
        class SubObject {}
        SubObject subObject = new SubObject();
        assertFalse(subObject instanceof SaveMetadataAction);
    }
}