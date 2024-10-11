// TextureChoiceComponentTest.java
package com.eteks.sweethome3d.swing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import javax.swing.JOptionPane;

/**
 * Test class of {@link TextureChoiceComponent}.
 * It contains ten unit test cases for the {@link TextureChoiceComponent#confirmDeleteSelectedCatalogTexture()} method.
 */
class TextureChoiceComponentTest {

    /**
     * Test case when user clicks OK button.
     */
    @Test
    void testConfirmDeleteSelectedCatalogTexture_OK() {
        // Create mock user preferences
        UserPreferences preferences = mock(UserPreferences.class);
        when(preferences.getLocalizedString(any(), any())).thenReturn("");

        // Create mock JOptionPane
        JOptionPane optionPane = mock(JOptionPane.class);
        when(optionPane.showOptionDialog(any(), any(), any(), anyInt(), anyInt(), any(), any(), any())).thenReturn(JOptionPane.OK_OPTION);

        // Create TextureChoiceComponent with mock objects
        TextureChoiceComponent textureChoiceComponent = new TextureChoiceComponent(preferences);
        textureChoiceComponent.setOptionPane(optionPane);

        // Test method
        assertTrue(textureChoiceComponent.confirmDeleteSelectedCatalogTexture());
    }

    /**
     * Test case when user clicks Cancel button.
     */
    @Test
    void testConfirmDeleteSelectedCatalogTexture_Cancel() {
        // Create mock user preferences
        UserPreferences preferences = mock(UserPreferences.class);
        when(preferences.getLocalizedString(any(), any())).thenReturn("");

        // Create mock JOptionPane
        JOptionPane optionPane = mock(JOptionPane.class);
        when(optionPane.showOptionDialog(any(), any(), any(), anyInt(), anyInt(), any(), any(), any())).thenReturn(JOptionPane.CANCEL_OPTION);

        // Create TextureChoiceComponent with mock objects
        TextureChoiceComponent textureChoiceComponent = new TextureChoiceComponent(preferences);
        textureChoiceComponent.setOptionPane(optionPane);

        // Test method
        assertFalse(textureChoiceComponent.confirmDeleteSelectedCatalogTexture());
    }

    /**
     * Test case when user closes the dialog.
     */
    @Test
    void testConfirmDeleteSelectedCatalogTexture_Close() {
        // Create mock user preferences
        UserPreferences preferences = mock(UserPreferences.class);
        when(preferences.getLocalizedString(any(), any())).thenReturn("");

        // Create mock JOptionPane
        JOptionPane optionPane = mock(JOptionPane.class);
        when(optionPane.showOptionDialog(any(), any(), any(), anyInt(), anyInt(), any(), any(), any())).thenReturn(JOptionPane.CLOSED_OPTION);

        // Create TextureChoiceComponent with mock objects
        TextureChoiceComponent textureChoiceComponent = new TextureChoiceComponent(preferences);
        textureChoiceComponent.setOptionPane(optionPane);

        // Test method
        assertFalse(textureChoiceComponent.confirmDeleteSelectedCatalogTexture());
    }

    /**
     * Test case when user clicks X button.
     */
    @Test
    void testConfirmDeleteSelectedCatalogTexture_X() {
        // Create mock user preferences
        UserPreferences preferences = mock(UserPreferences.class);
        when(preferences.getLocalizedString(any(), any())).thenReturn("");

        // Create mock JOptionPane
        JOptionPane optionPane = mock(JOptionPane.class);
        when(optionPane.showOptionDialog(any(), any(), any(), anyInt(), anyInt(), any(), any(), any())).thenReturn(JOptionPane.CLOSED_OPTION);

        // Create TextureChoiceComponent with mock objects
        TextureChoiceComponent textureChoiceComponent = new TextureChoiceComponent(preferences);
        textureChoiceComponent.setOptionPane(optionPane);

        // Simulate user clicking X button
        textureChoiceComponent.getOptionPane().setValue(JOptionPane.CLOSED_OPTION);

        // Test method
        assertFalse(textureChoiceComponent.confirmDeleteSelectedCatalogTexture());
    }

    /**
     * Test case when user clicks Delete button.
     */
    @Test
    void testConfirmDeleteSelectedCatalogTexture_Delete() {
        // Create mock user preferences
        UserPreferences preferences = mock(UserPreferences.class);
        when(preferences.getLocalizedString(any(), any())).thenReturn("");

        // Create mock JOptionPane
        JOptionPane optionPane = mock(JOptionPane.class);
        when(optionPane.showOptionDialog(any(), any(), any(), anyInt(), anyInt(), any(), any(), any())).thenReturn(JOptionPane.OK_OPTION);

        // Create TextureChoiceComponent with mock objects
        TextureChoiceComponent textureChoiceComponent = new TextureChoiceComponent(preferences);
        textureChoiceComponent.setOptionPane(optionPane);

        // Simulate user clicking Delete button
        textureChoiceComponent.getOptionPane().setValue(JOptionPane.OK_OPTION);

        // Test method
        assertTrue(textureChoiceComponent.confirmDeleteSelectedCatalogTexture());
    }

    /**
     * Test case when user clicks another button.
     */
    @Test
    void testConfirmDeleteSelectedCatalogTexture_OtherButton() {
        // Create mock user preferences
        UserPreferences preferences = mock(UserPreferences.class);
        when(preferences.getLocalizedString(any(), any())).thenReturn("");

        // Create mock JOptionPane
        JOptionPane optionPane = mock(JOptionPane.class);
        when(optionPane.showOptionDialog(any(), any(), any(), anyInt(), anyInt(), any(), any(), any())).thenReturn(-1);

        // Create TextureChoiceComponent with mock objects
        TextureChoiceComponent textureChoiceComponent = new TextureChoiceComponent(preferences);
        textureChoiceComponent.setOptionPane(optionPane);

        // Simulate user clicking another button
        textureChoiceComponent.getOptionPane().setValue(-1);

        // Test method
        assertFalse(textureChoiceComponent.confirmDeleteSelectedCatalogTexture());
    }

    /**
     * Test case when user clicks OK button with non-English locale.
     */
    @Test
    void testConfirmDeleteSelectedCatalogTexture_NonEnglish_OK() {
        // Create mock user preferences with non-English locale
        UserPreferences preferences = mock(UserPreferences.class);
        when(preferences.getLocalizedString(any(), any())).thenReturn("Supprimer", "Annuler");

        // Create mock JOptionPane
        JOptionPane optionPane = mock(JOptionPane.class);
        when(optionPane.showOptionDialog(any(), any(), any(), anyInt(), anyInt(), any(), any(), any())).thenReturn(JOptionPane.OK_OPTION);

        // Create TextureChoiceComponent with mock objects
        TextureChoiceComponent textureChoiceComponent = new TextureChoiceComponent(preferences);
        textureChoiceComponent.setOptionPane(optionPane);

        // Test method
        assertTrue(textureChoiceComponent.confirmDeleteSelectedCatalogTexture());
    }

    /**
     * Test case when user clicks Cancel button with non-English locale.
     */
    @Test
    void testConfirmDeleteSelectedCatalogTexture_NonEnglish_Cancel() {
        // Create mock user preferences with non-English locale
        UserPreferences preferences = mock(UserPreferences.class);
        when(preferences.getLocalizedString(any(), any())).thenReturn("Supprimer", "Annuler");

        // Create mock JOptionPane
        JOptionPane optionPane = mock(JOptionPane.class);
        when(optionPane.showOptionDialog(any(), any(), any(), anyInt(), anyInt(), any(), any(), any())).thenReturn(JOptionPane.CANCEL_OPTION);

        // Create TextureChoiceComponent with mock objects
        TextureChoiceComponent textureChoiceComponent = new TextureChoiceComponent(preferences);
        textureChoiceComponent.setOptionPane(optionPane);

        // Test method
        assertFalse(textureChoiceComponent.confirmDeleteSelectedCatalogTexture());
    }

    /**
     * Test case when user clicks Delete button with non-English locale.
     */
    @Test
    void testConfirmDeleteSelectedCatalogTexture_NonEnglish_Delete() {
        // Create mock user preferences with non-English locale
        UserPreferences preferences = mock(UserPreferences.class);
        when(preferences.getLocalizedString(any(), any())).thenReturn("Supprimer", "Annuler");

        // Create mock JOptionPane
        JOptionPane optionPane = mock(JOptionPane.class);
        when(optionPane.showOptionDialog(any(), any(), any(), anyInt(), anyInt(), any(), any(), any())).thenReturn(JOptionPane.OK_OPTION);

        // Create TextureChoiceComponent with mock objects
        TextureChoiceComponent textureChoiceComponent = new TextureChoiceComponent(preferences);
        textureChoiceComponent.setOptionPane(optionPane);

        // Simulate user clicking Delete button
        textureChoiceComponent.getOptionPane().setValue(JOptionPane.OK_OPTION);

        // Test method
        assertTrue(textureChoiceComponent.confirmDeleteSelectedCatalogTexture());
    }

    /**
     * Test case when user clicks another button with non-English locale.
     */
    @Test
    void testConfirmDeleteSelectedCatalogTexture_NonEnglish_OtherButton() {
        // Create mock user preferences with non-English locale
        UserPreferences preferences = mock(UserPreferences.class);
        when(preferences.getLocalizedString(any(), any())).thenReturn("Supprimer", "Annuler");

        // Create mock JOptionPane
        JOptionPane optionPane = mock(JOptionPane.class);
        when(optionPane.showOptionDialog(any(), any(), any(), anyInt(), anyInt(), any(), any(), any())).thenReturn(-1);

        // Create TextureChoiceComponent with mock objects
        TextureChoiceComponent textureChoiceComponent = new TextureChoiceComponent(preferences);
        textureChoiceComponent.setOptionPane(optionPane);

        // Simulate user clicking another button
        textureChoiceComponent.getOptionPane().setValue(-1);

        // Test method
        assertFalse(textureChoiceComponent.confirmDeleteSelectedCatalogTexture());
    }
}