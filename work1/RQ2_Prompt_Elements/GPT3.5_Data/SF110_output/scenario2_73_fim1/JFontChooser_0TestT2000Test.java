// JFontChooser_0Test.java
package osa.ora.server.client.ui.utils;

import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link JFontChooser}.
 * It contains ten unit test cases for the {@link JFontChooser#showDialog(Component, String)} method.
 */
class JFontChooser_0Test {

    /**
     * Test case for showing the font chooser dialog and selecting a font.
     * Expected result: the selected font should not be null.
     */
    @Test
    void testShowDialog_selectFont() {
        JFontChooser fontChooser = new JFontChooser();
        Font selectedFont = fontChooser.showDialog(null, "Select a font");
        assertNotNull(selectedFont);
    }

    /**
     * Test case for showing the font chooser dialog and canceling the selection.
     * Expected result: the selected font should be null.
     */
    @Test
    void testShowDialog_cancelSelection() {
        JFontChooser fontChooser = new JFontChooser();
        Font selectedFont = fontChooser.showDialog(null, "Select a font");
        assertNull(selectedFont);
    }

    /**
     * Test case for showing the font chooser dialog with a null parent component.
     * Expected result: the selected font should not be null.
     */
    @Test
    void testShowDialog_nullParentComponent() {
        JFontChooser fontChooser = new JFontChooser();
        Font selectedFont = fontChooser.showDialog(null, "Select a font");
        assertNotNull(selectedFont);
    }

    /**
     * Test case for showing the font chooser dialog with a null title.
     * Expected result: the selected font should not be null.
     */
    @Test
    void testShowDialog_nullTitle() {
        JFontChooser fontChooser = new JFontChooser();
        Font selectedFont = fontChooser.showDialog(null, null);
        assertNotNull(selectedFont);
    }

    /**
     * Test case for showing the font chooser dialog with an empty title.
     * Expected result: the selected font should not be null.
     */
    @Test
    void testShowDialog_emptyTitle() {
        JFontChooser fontChooser = new JFontChooser();
        Font selectedFont = fontChooser.showDialog(null, "");
        assertNotNull(selectedFont);
    }

    /**
     * Test case for showing the font chooser dialog with a long title.
     * Expected result: the selected font should not be null.
     */
    @Test
    void testShowDialog_longTitle() {
        JFontChooser fontChooser = new JFontChooser();
        Font selectedFont = fontChooser.showDialog(null, "This is a very long title for the font chooser dialog");
        assertNotNull(selectedFont);
    }

    /**
     * Test case for showing the font chooser dialog with a custom font.
     * Expected result: the selected font should be the custom font.
     */
    @Test
    void testShowDialog_customFont() {
        JFontChooser fontChooser = new JFontChooser();
        Font customFont = new Font("Arial", Font.PLAIN, 12);
        fontChooser.setSelectedFont(customFont);
        Font selectedFont = fontChooser.showDialog(null, "Select a font");
        assertEquals(customFont, selectedFont);
    }

    /**
     * Test case for showing the font chooser dialog and changing the font size.
     * Expected result: the selected font should have the new size.
     */
    @Test
    void testShowDialog_changeFontSize() {
        JFontChooser fontChooser = new JFontChooser();
        Font selectedFont = fontChooser.showDialog(null, "Select a font");
        int newSize = selectedFont.getSize() + 2;
        fontChooser.setSelectedFont(new Font(selectedFont.getName(), selectedFont.getStyle(), newSize));
        Font newFont = fontChooser.showDialog(null, "Select a font");
        assertEquals(newSize, newFont.getSize());
    }

    /**
     * Test case for showing the font chooser dialog and changing the font style.
     * Expected result: the selected font should have the new style.
     */
    @Test
    void testShowDialog_changeFontStyle() {
        JFontChooser fontChooser = new JFontChooser();
        Font selectedFont = fontChooser.showDialog(null, "Select a font");
        int newStyle = selectedFont.getStyle() == Font.PLAIN ? Font.BOLD : Font.PLAIN;
        fontChooser.setSelectedFont(new Font(selectedFont.getName(), newStyle, selectedFont.getSize()));
        Font newFont = fontChooser.showDialog(null, "Select a font");
        assertEquals(newStyle, newFont.getStyle());
    }

    /**
     * Test case for showing the font chooser dialog and changing the font family.
     * Expected result: the selected font should have the new family.
     */
    @Test
    void testShowDialog_changeFontFamily() {
        JFontChooser fontChooser = new JFontChooser();
        Font selectedFont = fontChooser.showDialog(null, "Select a font");
        String[] fontFamilies = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        String newFamily = fontFamilies[fontFamilies.length - 1];
        fontChooser.setSelectedFont(new Font(newFamily, selectedFont.getStyle(), selectedFont.getSize()));
        Font newFont = fontChooser.showDialog(null, "Select a font");
        assertEquals(newFamily, newFont.getFamily());
    }
}