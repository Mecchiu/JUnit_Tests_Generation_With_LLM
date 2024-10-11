// TextureChoiceComponentTest.java
package com.eteks.sweethome3d.swing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import javax.swing.JOptionPane;
import java.util.Locale;

/**
 * Test class of {@link TextureChoiceComponent}.
 * It contains ten unit test cases for the {@link TextureChoiceComponent#confirmDeleteSelectedCatalogTexture()} method.
 */
class TextureChoiceComponentTest {

    /**
     * Test case to verify that the method returns true when user confirms to delete.
     */
    @Test
    void testConfirmDeleteSelectedCatalogTextureReturnsTrueWhenUserConfirms() {
        // Create a mock of JOptionPane to simulate user confirmation
        JOptionPane optionPane = mock(JOptionPane.class);
        when(optionPane.showOptionDialog(any(), any(), any(), anyInt(), anyInt(), any(), any(), any())).thenReturn(JOptionPane.OK_OPTION);

        // Create a TextureChoiceComponent with the mock JOptionPane
        TextureChoiceComponent textureChoiceComponent = new TextureChoiceComponent();
        textureChoiceComponent.preferences = new UserPreferences(Locale.getDefault());
        textureChoiceComponent.optionPane = optionPane;

        // Call the method and verify that it returns true
        assertTrue(textureChoiceComponent.confirmDeleteSelectedCatalogTexture());
    }

    /**
     * Test case to verify that the method returns false when user cancels the deletion.
     */
    @Test
    void testConfirmDeleteSelectedCatalogTextureReturnsFalseWhenUserCancels() {
        // Create a mock of JOptionPane to simulate user cancellation
        JOptionPane optionPane = mock(JOptionPane.class);
        when(optionPane.showOptionDialog(any(), any(), any(), anyInt(), anyInt(), any(), any(), any())).thenReturn(JOptionPane.CANCEL_OPTION);

        // Create a TextureChoiceComponent with the mock JOptionPane
        TextureChoiceComponent textureChoiceComponent = new TextureChoiceComponent();
        textureChoiceComponent.preferences = new UserPreferences(Locale.getDefault());
        textureChoiceComponent.optionPane = optionPane;

        // Call the method and verify that it returns false
        assertFalse(textureChoiceComponent.confirmDeleteSelectedCatalogTexture());
    }

    /**
     * Test case to verify that the method displays the correct message in the dialog.
     */
    @Test
    void testConfirmDeleteSelectedCatalogTextureDisplaysCorrectMessage() {
        // Create a mock of JOptionPane to capture the message displayed in the dialog
        JOptionPane optionPane = mock(JOptionPane.class);
        when(optionPane.showOptionDialog(any(), any(), any(), anyInt(), anyInt(), any(), any(), any())).thenReturn(JOptionPane.CANCEL_OPTION);
        String[] options = new String[] { "Delete", "Cancel" };
        doAnswer(invocation -> {
            String message = (String) invocation.getArguments()[1];
            assertEquals("Do you want to delete the selected texture from catalog?", message);
            return null;
        }).when(optionPane).showOptionDialog(any(), any(), any(), anyInt(), anyInt(), any(), any(), any());

        // Create a TextureChoiceComponent with the mock JOptionPane
        TextureChoiceComponent textureChoiceComponent = new TextureChoiceComponent();
        textureChoiceComponent.preferences = new UserPreferences(Locale.getDefault());
        textureChoiceComponent.optionPane = optionPane;

        // Call the method and verify that it displays the correct message
        textureChoiceComponent.confirmDeleteSelectedCatalogTexture();
        verify(optionPane).showOptionDialog(any(), any(), any(), anyInt(), anyInt(), any(), any(), any());
    }

    /**
     * Test case to verify that the method displays the correct title in the dialog.
     */
    @Test
    void testConfirmDeleteSelectedCatalogTextureDisplaysCorrectTitle() {
        // Create a mock of JOptionPane to capture the title displayed in the dialog
        JOptionPane optionPane = mock(JOptionPane.class);
        when(optionPane.showOptionDialog(any(), any(), any(), anyInt(), anyInt(), any(), any(), any())).thenReturn(JOptionPane.CANCEL_OPTION);
        String[] options = new String[] { "Delete", "Cancel" };
        doAnswer(invocation -> {
            String title = (String) invocation.getArguments()[2];
            assertEquals("Confirm Deletion", title);
            return null;
        }).when(optionPane).showOptionDialog(any(), any(), any(), anyInt(), anyInt(), any(), any(), any());

        // Create a TextureChoiceComponent with the mock JOptionPane
        TextureChoiceComponent textureChoiceComponent = new TextureChoiceComponent();
        textureChoiceComponent.preferences = new UserPreferences(Locale.getDefault());
        textureChoiceComponent.optionPane = optionPane;

        // Call the method and verify that it displays the correct title
        textureChoiceComponent.confirmDeleteSelectedCatalogTexture();
        verify(optionPane).showOptionDialog(any(), any(), any(), anyInt(), anyInt(), any(), any(), any());
    }

    /**
     * Test case to verify that the method displays the correct delete button text in the dialog.
     */
    @Test
    void testConfirmDeleteSelectedCatalogTextureDisplaysCorrectDeleteButtonText() {
        // Create a mock of JOptionPane to capture the delete button text displayed in the dialog
        JOptionPane optionPane = mock(JOptionPane.class);
        when(optionPane.showOptionDialog(any(), any(), any(), anyInt(), anyInt(), any(), any(), any())).thenReturn(JOptionPane.CANCEL_OPTION);
        String[] options = new String[] { "Delete", "Cancel" };
        doAnswer(invocation -> {
            String deleteButtonText = (String) ((Object[]) invocation.getArguments()[5])[0];
            assertEquals("Delete", deleteButtonText);
            return null;
        }).when(optionPane).showOptionDialog(any(), any(), any(), anyInt(), anyInt(), any(), any(), any());

        // Create a TextureChoiceComponent with the mock JOptionPane
        TextureChoiceComponent textureChoiceComponent = new TextureChoiceComponent();
        textureChoiceComponent.preferences = new UserPreferences(Locale.getDefault());
        textureChoiceComponent.optionPane = optionPane;

        // Call the method and verify that it displays the correct delete button text
        textureChoiceComponent.confirmDeleteSelectedCatalogTexture();
        verify(optionPane).showOptionDialog(any(), any(), any(), anyInt(), anyInt(), any(), any(), any());
    }

    /**
     * Test case to verify that the method displays the correct cancel button text in the dialog.
     */
    @Test
    void testConfirmDeleteSelectedCatalogTextureDisplaysCorrectCancelButtonText() {
        // Create a mock of JOptionPane to capture the cancel button text displayed in the dialog
        JOptionPane optionPane = mock(JOptionPane.class);
        when(optionPane.showOptionDialog(any(), any(), any(), anyInt(), anyInt(), any(), any(), any())).thenReturn(JOptionPane.CANCEL_OPTION);
        String[] options = new String[] { "Delete", "Cancel" };
        doAnswer(invocation -> {
            String cancelButtonText = (String) ((Object[]) invocation.getArguments()[5])[1];
            assertEquals("Cancel", cancelButtonText);
            return null;
        }).when(optionPane).showOptionDialog(any(), any(), any(), anyInt(), anyInt(), any(), any(), any());

        // Create a TextureChoiceComponent with the mock JOptionPane
        TextureChoiceComponent textureChoiceComponent = new TextureChoiceComponent();
        textureChoiceComponent.preferences = new UserPreferences(Locale.getDefault());
        textureChoiceComponent.optionPane = optionPane;

        // Call the method and verify that it displays the correct cancel button text
        textureChoiceComponent.confirmDeleteSelectedCatalogTexture();
        verify(optionPane).showOptionDialog(any(), any(), any(), anyInt(), anyInt(), any(), any(), any());
    }

    /**
     * Test case to verify that the method uses the correct locale for the message.
     */
    @Test
    void testConfirmDeleteSelectedCatalogTextureUsesCorrectLocaleForMessage() {
        // Create a mock of UserPreferences to capture the locale used for the message
        UserPreferences preferences = mock(UserPreferences.class);
        when(preferences.getLocalizedString(any(), any())).thenReturn("");
        doAnswer(invocation -> {
            Locale locale = (Locale) invocation.getArguments()[0];
            assertEquals(Locale.FRENCH, locale);
            return null;
        }).when(preferences).getLocalizedString(any(), any());

        // Create a TextureChoiceComponent with the mock UserPreferences
        TextureChoiceComponent textureChoiceComponent = new TextureChoiceComponent();
        textureChoiceComponent.preferences = preferences;

        // Call the method and verify that it uses the correct locale for the message
        textureChoiceComponent.confirmDeleteSelectedCatalogTexture();
        verify(preferences).getLocalizedString(any(), any());
    }

    /**
     * Test case to verify that the method uses the correct locale for the title.
     */
    @Test
    void testConfirmDeleteSelectedCatalogTextureUsesCorrectLocaleForTitle() {
        // Create a mock of UserPreferences to capture the locale used for the title
        UserPreferences preferences = mock(UserPreferences.class);
        when(preferences.getLocalizedString(any(), any())).thenReturn("");
        doAnswer(invocation -> {
            Locale locale = (Locale) invocation.getArguments()[0];
            assertEquals(Locale.FRENCH, locale);
            return null;
        }).when(preferences).getLocalizedString(any(), any());

        // Create a TextureChoiceComponent with the mock UserPreferences
        TextureChoiceComponent textureChoiceComponent = new TextureChoiceComponent();
        textureChoiceComponent.preferences = preferences;

        // Call the method and verify that it uses the correct locale for the title
        textureChoiceComponent.confirmDeleteSelectedCatalogTexture();
        verify(preferences).getLocalizedString(any(), any());
    }

    /**
     * Test case to verify that the method uses the correct locale for the delete button text.
     */
    @Test
    void testConfirmDeleteSelectedCatalogTextureUsesCorrectLocaleForDeleteButtonText() {
        // Create a mock of UserPreferences to capture the locale used for the delete button text
       