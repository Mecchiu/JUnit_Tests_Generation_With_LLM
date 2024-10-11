// MetadataRecordModifierTest.java
package org.heal.servlet.cataloger;

import org.heal.servlet.Action;
import org.junit.jupiter.api.Test;

import javax.servlet.ServletRequest;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class of {@link MetadataRecordModifier}.
 * It contains ten unit test cases for the {@link MetadataRecordModifier#getNextAction(ServletRequest)} method.
 */
class MetadataRecordModifierTest {

    @Test
    void testGetNextActionWithValidKey() {
        MetadataRecordModifier modifier = new MetadataRecordModifier();
        ServletRequest request = new MockServletRequest("nextAction", "save");
        Action expected = Action.SAVE_METADATA;
        Action actual = modifier.getNextAction(request);
        assertEquals(expected, actual);
    }

    @Test
    void testGetNextActionWithInvalidKey() {
        MetadataRecordModifier modifier = new MetadataRecordModifier();
        ServletRequest request = new MockServletRequest("nextAction", "invalid");
        Action expected = Action.NEXT_ACTION_DEFAULT;
        Action actual = modifier.getNextAction(request);
        assertEquals(expected, actual);
    }

    @Test
    void testGetNextActionWithNullKey() {
        MetadataRecordModifier modifier = new MetadataRecordModifier();
        ServletRequest request = new MockServletRequest("nextAction", null);
        Action expected = Action.NEXT_ACTION_DEFAULT;
        Action actual = modifier.getNextAction(request);
        assertEquals(expected, actual);
    }

    @Test
    void testGetNextActionWithEmptyKey() {
        MetadataRecordModifier modifier = new MetadataRecordModifier();
        ServletRequest request = new MockServletRequest("nextAction", "");
        Action expected = Action.NEXT_ACTION_DEFAULT;
        Action actual = modifier.getNextAction(request);
        assertEquals(expected, actual);
    }

    @Test
    void testGetNextActionWithWhitespaceKey() {
        MetadataRecordModifier modifier = new MetadataRecordModifier();
        ServletRequest request = new MockServletRequest("nextAction", "   ");
        Action expected = Action.NEXT_ACTION_DEFAULT;
        Action actual = modifier.getNextAction(request);
        assertEquals(expected, actual);
    }

    @Test
    void testGetNextActionWithMissingKey() {
        MetadataRecordModifier modifier = new MetadataRecordModifier();
        ServletRequest request = new MockServletRequest("otherParam", "value");
        Action expected = Action.NEXT_ACTION_DEFAULT;
        Action actual = modifier.getNextAction(request);
        assertEquals(expected, actual);
    }

    @Test
    void testGetNextActionWithMultipleKeys() {
        MetadataRecordModifier modifier = new MetadataRecordModifier();
        ServletRequest request = new MockServletRequest("nextAction", "save", "nextAction", "publish");
        Action expected = Action.SAVE_METADATA;
        Action actual = modifier.getNextAction(request);
        assertEquals(expected, actual);
    }

    @Test
    void testGetNextActionWithCaseInsensitiveKey() {
        MetadataRecordModifier modifier = new MetadataRecordModifier();
        ServletRequest request = new MockServletRequest("nextAction", "SaVe");
        Action expected = Action.SAVE_METADATA;
        Action actual = modifier.getNextAction(request);
        assertEquals(expected, actual);
    }

    @Test
    void testGetNextActionWithCustomKey() {
        MetadataRecordModifier modifier = new MetadataRecordModifier();
        modifier.setNextActionMap(Collections.singletonMap("custom", Action.CUSTOM_ACTION));
        ServletRequest request = new MockServletRequest("nextAction", "custom");
        Action expected = Action.CUSTOM_ACTION;
        Action actual = modifier.getNextAction(request);
        assertEquals(expected, actual);
    }

    @Test
    void testGetNextActionWithCustomKeyAndInvalidDefault() {
        MetadataRecordModifier modifier = new MetadataRecordModifier();
        modifier.setNextActionMap(Collections.singletonMap("custom", Action.CUSTOM_ACTION));
        modifier.setNextActionDefault(Action.SAVE_METADATA);
        ServletRequest request = new MockServletRequest("nextAction", "invalid");
        Action expected = Action.CUSTOM_ACTION;
        Action actual = modifier.getNextAction(request);
        assertEquals(expected, actual);
    }
}