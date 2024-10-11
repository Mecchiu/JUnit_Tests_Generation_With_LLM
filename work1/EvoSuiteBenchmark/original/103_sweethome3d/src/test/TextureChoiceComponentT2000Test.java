```java
package com.eteks.sweethome3d.swing;

import com.eteks.sweethome3d.model.UserPreferences;
import com.eteks.sweethome3d.viewcontroller.TextureChoiceController;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class TextureChoiceComponentTest {

    @Test
    void testConfirmDeleteSelectedCatalogTexture_OKOption() {
        // Given
        UserPreferences preferences = mock(UserPreferences.class);
        TextureChoiceController controller = mock(TextureChoiceController.class);
        TextureChoiceComponent textureChoiceComponent = new TextureChoiceComponent(preferences, controller);
        when(preferences.getLocalizedString(TextureChoiceComponent.class, "confirmDeleteSelectedCatalogTexture.message")).thenReturn("Delete texture?");
        when(preferences.getLocalizedString(TextureChoiceComponent.class, "confirmDeleteSelectedCatalogTexture.title")).thenReturn("Confirm Delete");
        when(preferences.getLocalizedString(TextureChoiceComponent.class, "confirmDeleteSelectedCatalogTexture.delete")).thenReturn("Delete");
        when(preferences.getLocalizedString(TextureChoiceComponent.class, "confirmDeleteSelectedCatalogTexture.cancel")).thenReturn("Cancel");
        JOptionPane optionPane = mock(JOptionPane.class);
        when(optionPane.getValue()).thenReturn(JOptionPane.OK_OPTION);
        KeyboardFocusManager keyboardFocusManager = mock(KeyboardFocusManager.class);
        when(KeyboardFocusManager.getCurrentKeyboardFocusManager()).thenReturn(keyboardFocusManager);
        when(keyboardFocusManager.getActiveWindow()).thenReturn(null);
        when(JOptionPane.showOptionDialog(null, "Delete texture?", "Confirm Delete", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[] { "Delete", "Cancel" }, "Cancel")).thenReturn(JOptionPane.OK_OPTION);

        // When
        boolean result = textureChoiceComponent.confirmDeleteSelectedCatalogTexture();

        // Then
        assertTrue(result);
    }

    @Test
    void testConfirmDeleteSelectedCatalogTexture_CancelOption() {
        // Given
        UserPreferences preferences = mock(UserPreferences.class);
        TextureChoiceController controller = mock(TextureChoiceController.class);
        TextureChoiceComponent textureChoiceComponent = new TextureChoiceComponent(preferences, controller);
        when(preferences.getLocalizedString(TextureChoiceComponent.class, "confirmDeleteSelectedCatalogTexture.message")).thenReturn("Delete texture?");
        when(preferences.getLocalizedString(TextureChoiceComponent.class, "confirmDeleteSelectedCatalogTexture.title")).thenReturn("Confirm Delete");
        when(preferences.getLocalizedString(TextureChoiceComponent.class, "confirmDeleteSelectedCatalogTexture.delete")).thenReturn("Delete");
        when(preferences.getLocalizedString(TextureChoiceComponent.class, "confirmDeleteSelectedCatalogTexture.cancel")).thenReturn("Cancel");
        JOptionPane optionPane = mock(JOptionPane.class);
        when(optionPane.getValue()).thenReturn(JOptionPane.CANCEL_OPTION);
        KeyboardFocusManager keyboardFocusManager = mock(KeyboardFocusManager.class);
        when(KeyboardFocusManager.getCurrentKeyboardFocusManager()).thenReturn(keyboardFocusManager);
        when(keyboardFocusManager.getActiveWindow()).thenReturn(null);
        when(JOptionPane.showOptionDialog(null, "Delete texture?", "Confirm Delete", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[] { "Delete", "Cancel" }, "Cancel")).thenReturn(JOptionPane.CANCEL_OPTION);

        // When
        boolean result = textureChoiceComponent.confirmDeleteSelectedCatalogTexture();

        // Then
        assertFalse(result);
    }
}
```
