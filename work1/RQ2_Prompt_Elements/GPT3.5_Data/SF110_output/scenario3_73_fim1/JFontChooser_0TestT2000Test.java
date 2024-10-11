// JFontChooser_0Test.java
package osa.ora.server.client.ui.utils;

import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

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
        Font selectedFont = JFontChooser.showDialog(null, "Select a font");
        assertNotNull(selectedFont);
    }

    /**
     * Test case for showing the font chooser dialog and canceling the selection.
     * Expected result: the selected font should be null.
     */
    @Test
    void testShowDialog_cancelSelection() {
        // simulate pressing the escape key to cancel the selection
        Action escapeAction = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JDialog dialog = (JDialog) SwingUtilities.getWindowAncestor((Component) e.getSource());
                dialog.dispatchEvent(new WindowEvent(dialog, WindowEvent.WINDOW_CLOSING));
            }
        };
        JComponent dialog = JFontChooser.createDialog(null, "Select a font", true, escapeAction, null);
        Robot robot = null;
        try {
            robot = new Robot();
            robot.delay(500);
            robot.keyPress(KeyEvent.VK_ESCAPE);
            robot.keyRelease(KeyEvent.VK_ESCAPE);
            robot.delay(500);
        } catch (AWTException e) {
            e.printStackTrace();
        }
        assertNull(JFontChooser.showDialog(dialog, null));
    }

    /**
     * Test case for showing the font chooser dialog and pressing the OK button.
     * Expected result: the selected font should not be null.
     */
    @Test
    void testShowDialog_pressOK() {
        // simulate pressing the OK button
        Action okAction = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JDialog dialog = (JDialog) SwingUtilities.getWindowAncestor((Component) e.getSource());
                dialog.setVisible(false);
            }
        };
        JComponent dialog = JFontChooser.createDialog(null, "Select a font", true, null, okAction);
        assertNotNull(JFontChooser.showDialog(dialog, null));
    }

    /**
     * Test case for showing the font chooser dialog and pressing the Cancel button.
     * Expected result: the selected font should be null.
     */
    @Test
    void testShowDialog_pressCancel() {
        // simulate pressing the Cancel button
        Action cancelAction = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JDialog dialog = (JDialog) SwingUtilities.getWindowAncestor((Component) e.getSource());
                dialog.setVisible(false);
            }
        };
        JComponent dialog = JFontChooser.createDialog(null, "Select a font", true, cancelAction, null);
        assertNull(JFontChooser.showDialog(dialog, null));
    }

    /**
     * Test case for showing the font chooser dialog with a null parent component.
     * Expected result: the selected font should not be null.
     */
    @Test
    void testShowDialog_nullParent() {
        Font selectedFont = JFontChooser.showDialog(null, "Select a font");
        assertNotNull(selectedFont);
    }

    /**
     * Test case for showing the font chooser dialog with a null title.
     * Expected result: the selected font should not be null.
     */
    @Test
    void testShowDialog_nullTitle() {
        Font selectedFont = JFontChooser.showDialog(null, null);
        assertNotNull(selectedFont);
    }

    /**
     * Test case for showing the font chooser dialog with a custom font.
     * Expected result: the selected font should be the custom font.
     */
    @Test
    void testShowDialog_customFont() {
        Font customFont = new Font("Arial", Font.PLAIN, 12);
        Font selectedFont = JFontChooser.showDialog(null, "Select a font", customFont);
        assertEquals(customFont, selectedFont);
    }

    /**
     * Test case for showing the font chooser dialog with a custom font and a null parent component.
     * Expected result: the selected font should be the custom font.
     */
    @Test
    void testShowDialog_customFontNullParent() {
        Font customFont = new Font("Arial", Font.PLAIN, 12);
        Font selectedFont = JFontChooser.showDialog(null, "Select a font", customFont);
        assertEquals(customFont, selectedFont);
    }

    /**
     * Test case for showing the font chooser dialog with a custom font and a null title.
     * Expected result: the selected font should be the custom font.
     */
    @Test
    void testShowDialog_customFontNullTitle() {
        Font customFont = new Font("Arial", Font.PLAIN, 12);
        Font selectedFont = JFontChooser.showDialog(null, null, customFont);
        assertEquals(customFont, selectedFont);
    }

    /**
     * Test case for showing the font chooser dialog with a custom font and pressing the OK button.
     * Expected result: the selected font should be the custom font.
     */
    @Test
    void testShowDialog_customFontPressOK() {
        Font customFont = new Font("Arial", Font.PLAIN, 12);
        // simulate pressing the OK button
        Action okAction = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JDialog dialog = (JDialog) SwingUtilities.getWindowAncestor((Component) e.getSource());
                dialog.setVisible(false);
            }
        };
        JComponent dialog = JFontChooser.createDialog(null, "Select a font", true, null, okAction);
        assertEquals(customFont, JFontChooser.showDialog(dialog, customFont));
    }

    /**
     * Test case for showing the font chooser dialog with a custom font and pressing the Cancel button.
     * Expected result: the selected font should be null.
     */
    @Test
    void testShowDialog_customFontPressCancel() {
        Font customFont = new Font("Arial", Font.PLAIN, 12);
        // simulate pressing the Cancel button
        Action cancelAction = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JDialog dialog = (JDialog) SwingUtilities.getWindowAncestor((Component) e.getSource());
                dialog.setVisible(false);
            }
        };
        JComponent dialog = JFontChooser.createDialog(null, "Select a font", true, cancelAction, null);
        assertNull(JFontChooser.showDialog(dialog, customFont));
    }
}