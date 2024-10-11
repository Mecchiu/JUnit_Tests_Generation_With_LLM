// TextureChoiceComponentTest.java
package com.eteks.sweethome3d.swing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link TextureChoiceComponent}.
 * It contains ten unit test cases for the {@link TextureChoiceComponent#confirmDeleteSelectedCatalogTexture()} method.
 */
class TextureChoiceComponentTest {

    /**
     * Test case to confirm deletion of selected catalog texture.
     * Expected result is true.
     */
    @Test
    void testConfirmDeleteSelectedCatalogTexture_confirm() {
        TextureChoiceComponent textureChoiceComponent = new TextureChoiceComponent();
        boolean result = textureChoiceComponent.confirmDeleteSelectedCatalogTexture();
        assertTrue(result);
    }

    /**
     * Test case to cancel deletion of selected catalog texture.
     * Expected result is false.
     */
    @Test
    void testConfirmDeleteSelectedCatalogTexture_cancel() {
        TextureChoiceComponent textureChoiceComponent = new TextureChoiceComponent() {
            @Override
            public int showConfirmDialog(Object message, String title, int optionType, int messageType) {
                return JOptionPane.NO_OPTION;
            }
        };
        boolean result = textureChoiceComponent.confirmDeleteSelectedCatalogTexture();
        assertFalse(result);
    }

    /**
     * Test case to confirm deletion of selected catalog texture with null message.
     * Expected result is true.
     */
    @Test
    void testConfirmDeleteSelectedCatalogTexture_nullMessage_confirm() {
        TextureChoiceComponent textureChoiceComponent = new TextureChoiceComponent() {
            @Override
            public int showConfirmDialog(Object message, String title, int optionType, int messageType) {
                assertNull(message);
                return JOptionPane.YES_OPTION;
            }
        };
        boolean result = textureChoiceComponent.confirmDeleteSelectedCatalogTexture();
        assertTrue(result);
    }

    /**
     * Test case to cancel deletion of selected catalog texture with null message.
     * Expected result is false.
     */
    @Test
    void testConfirmDeleteSelectedCatalogTexture_nullMessage_cancel() {
        TextureChoiceComponent textureChoiceComponent = new TextureChoiceComponent() {
            @Override
            public int showConfirmDialog(Object message, String title, int optionType, int messageType) {
                assertNull(message);
                return JOptionPane.NO_OPTION;
            }
        };
        boolean result = textureChoiceComponent.confirmDeleteSelectedCatalogTexture();
        assertFalse(result);
    }

    /**
     * Test case to confirm deletion of selected catalog texture with empty message.
     * Expected result is true.
     */
    @Test
    void testConfirmDeleteSelectedCatalogTexture_emptyMessage_confirm() {
        TextureChoiceComponent textureChoiceComponent = new TextureChoiceComponent() {
            @Override
            public int showConfirmDialog(Object message, String title, int optionType, int messageType) {
                assertEquals("", message);
                return JOptionPane.YES_OPTION;
            }
        };
        boolean result = textureChoiceComponent.confirmDeleteSelectedCatalogTexture();
        assertTrue(result);
    }

    /**
     * Test case to cancel deletion of selected catalog texture with empty message.
     * Expected result is false.
     */
    @Test
    void testConfirmDeleteSelectedCatalogTexture_emptyMessage_cancel() {
        TextureChoiceComponent textureChoiceComponent = new TextureChoiceComponent() {
            @Override
            public int showConfirmDialog(Object message, String title, int optionType, int messageType) {
                assertEquals("", message);
                return JOptionPane.NO_OPTION;
            }
        };
        boolean result = textureChoiceComponent.confirmDeleteSelectedCatalogTexture();
        assertFalse(result);
    }

    /**
     * Test case to confirm deletion of selected catalog texture with custom message.
     * Expected result is true.
     */
    @Test
    void testConfirmDeleteSelectedCatalogTexture_customMessage_confirm() {
        TextureChoiceComponent textureChoiceComponent = new TextureChoiceComponent() {
            @Override
            public int showConfirmDialog(Object message, String title, int optionType, int messageType) {
                assertEquals("Are you sure you want to delete this texture?", message);
                return JOptionPane.YES_OPTION;
            }
        };
        boolean result = textureChoiceComponent.confirmDeleteSelectedCatalogTexture("Are you sure you want to delete this texture?");
        assertTrue(result);
    }

    /**
     * Test case to cancel deletion of selected catalog texture with custom message.
     * Expected result is false.
     */
    @Test
    void testConfirmDeleteSelectedCatalogTexture_customMessage_cancel() {
        TextureChoiceComponent textureChoiceComponent = new TextureChoiceComponent() {
            @Override
            public int showConfirmDialog(Object message, String title, int optionType, int messageType) {
                assertEquals("Are you sure you want to delete this texture?", message);
                return JOptionPane.NO_OPTION;
            }
        };
        boolean result = textureChoiceComponent.confirmDeleteSelectedCatalogTexture("Are you sure you want to delete this texture?");
        assertFalse(result);
    }

    /**
     * Test case to confirm deletion of selected catalog texture with custom message and title.
     * Expected result is true.
     */
    @Test
    void testConfirmDeleteSelectedCatalogTexture_customMessageAndTitle_confirm() {
        TextureChoiceComponent textureChoiceComponent = new TextureChoiceComponent() {
            @Override
            public int showConfirmDialog(Object message, String title, int optionType, int messageType) {
                assertEquals("Delete Texture", title);
                assertEquals("Are you sure you want to delete this texture?", message);
                return JOptionPane.YES_OPTION;
            }
        };
        boolean result = textureChoiceComponent.confirmDeleteSelectedCatalogTexture("Delete Texture", "Are you sure you want to delete this texture?");
        assertTrue(result);
    }

    /**
     * Test case to cancel deletion of selected catalog texture with custom message and title.
     * Expected result is false.
     */
    @Test
    void testConfirmDeleteSelectedCatalogTexture_customMessageAndTitle_cancel() {
        TextureChoiceComponent textureChoiceComponent = new TextureChoiceComponent() {
            @Override
            public int showConfirmDialog(Object message, String title, int optionType, int messageType) {
                assertEquals("Delete Texture", title);
                assertEquals("Are you sure you want to delete this texture?", message);
                return JOptionPane.NO_OPTION;
            }
        };
        boolean result = textureChoiceComponent.confirmDeleteSelectedCatalogTexture("Delete Texture", "Are you sure you want to delete this texture?");
        assertFalse(result);
    }
}