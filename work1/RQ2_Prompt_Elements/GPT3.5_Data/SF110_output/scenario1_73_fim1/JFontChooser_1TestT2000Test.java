// JFontChooser_1Test.java
package osa.ora.server.client.ui.utils;

import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link JFontChooser}.
 * It contains ten unit test cases for the {@link JFontChooser#createDialog(Component, String, boolean, ActionListener, ActionListener)} method.
 */
class JFontChooser_1Test {

    /**
     * Test case for creating a font chooser dialog with null parameters.
     * Expects a NullPointerException to be thrown.
     */
    @Test
    void testCreateDialogWithNullParameters() {
        assertThrows(NullPointerException.class, () -> {
            JFontChooser fontChooser = new JFontChooser();
            fontChooser.createDialog(null, null, false, null, null);
        });
    }

    /**
     * Test case for creating a font chooser dialog with a null parent component.
     * Expects a NullPointerException to be thrown.
     */
    @Test
    void testCreateDialogWithNullParentComponent() {
        assertThrows(NullPointerException.class, () -> {
            JFontChooser fontChooser = new JFontChooser();
            fontChooser.createDialog(null, "Title", false, null, null);
        });
    }

    /**
     * Test case for creating a font chooser dialog with a null title.
     * Expects a NullPointerException to be thrown.
     */
    @Test
    void testCreateDialogWithNullTitle() {
        assertThrows(NullPointerException.class, () -> {
            JFontChooser fontChooser = new JFontChooser();
            fontChooser.createDialog(new JFrame(), null, false, null, null);
        });
    }

    /**
     * Test case for creating a font chooser dialog with a null OK listener.
     * Expects a NullPointerException to be thrown.
     */
    @Test
    void testCreateDialogWithNullOkListener() {
        assertThrows(NullPointerException.class, () -> {
            JFontChooser fontChooser = new JFontChooser();
            fontChooser.createDialog(new JFrame(), "Title", false, null, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // do nothing
                }
            });
        });
    }

    /**
     * Test case for creating a font chooser dialog with a null cancel listener.
     * Expects a NullPointerException to be thrown.
     */
    @Test
    void testCreateDialogWithNullCancelListener() {
        assertThrows(NullPointerException.class, () -> {
            JFontChooser fontChooser = new JFontChooser();
            fontChooser.createDialog(new JFrame(), "Title", false, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // do nothing
                }
            }, null);
        });
    }

    /**
     * Test case for creating a font chooser dialog with valid parameters.
     * Expects a non-null JDialog to be returned.
     */
    @Test
    void testCreateDialogWithValidParameters() {
        JFontChooser fontChooser = new JFontChooser();
        JDialog dialog = fontChooser.createDialog(new JFrame(), "Title", false, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // do nothing
            }
        }, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // do nothing
            }
        });
        assertNotNull(dialog);
    }

    /**
     * Test case for creating a font chooser dialog with a valid parent component.
     * Expects the dialog to be centered on the parent component.
     */
    @Test
    void testCreateDialogWithValidParentComponent() {
        JFrame parent = new JFrame();
        parent.setSize(500, 500);
        parent.setVisible(true);
        JFontChooser fontChooser = new JFontChooser();
        JDialog dialog = fontChooser.createDialog(parent, "Title", false, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // do nothing
            }
        }, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // do nothing
            }
        });
        dialog.setVisible(true);
        int parentX = parent.getLocationOnScreen().x;
        int parentY = parent.getLocationOnScreen().y;
        int parentWidth = parent.getWidth();
        int parentHeight = parent.getHeight();
        int dialogX = dialog.getLocationOnScreen().x;
        int dialogY = dialog.getLocationOnScreen().y;
        int dialogWidth = dialog.getWidth();
        int dialogHeight = dialog.getHeight();
        assertEquals(parentX + (parentWidth - dialogWidth) / 2, dialogX);
        assertEquals(parentY + (parentHeight - dialogHeight) / 2, dialogY);
        parent.dispose();
    }

    /**
     * Test case for creating a font chooser dialog with a valid title.
     * Expects the dialog to have the specified title.
     */
    @Test
    void testCreateDialogWithValidTitle() {
        JFontChooser fontChooser = new JFontChooser();
        JDialog dialog = fontChooser.createDialog(new JFrame(), "Title", false, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // do nothing
            }
        }, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // do nothing
            }
        });
        assertEquals("Title", dialog.getTitle());
    }

    /**
     * Test case for creating a font chooser dialog with a valid OK listener.
     * Expects the OK button to invoke the listener when clicked.
     */
    @Test
    void testCreateDialogWithValidOkListener() {
        JFontChooser fontChooser = new JFontChooser();
        final boolean[] okClicked = {false};
        JDialog dialog = fontChooser.createDialog(new JFrame(), "Title", false, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                okClicked[0] = true;
            }
        }, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // do nothing
            }
        });
        JButton okButton = findButton(dialog, "OK");
        okButton.doClick();
        assertTrue(okClicked[0]);
    }

    /**
     * Test case for creating a font chooser dialog with a valid cancel listener.
     * Expects the cancel button to invoke the listener when clicked.
     */
    @Test
    void testCreateDialogWithValidCancelListener() {
        JFontChooser fontChooser = new JFontChooser();
        final boolean[] cancelClicked = {false};
        JDialog dialog = fontChooser.createDialog(new JFrame(), "Title", false, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // do nothing
            }
        }, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cancelClicked[0] = true;
            }
        });
        JButton cancelButton = findButton(dialog, "Cancel");
        cancelButton.doClick();
        assertTrue(cancelClicked[0]);
    }

    /**
     * Helper method to find a button in a dialog by its text.
     *
     * @param dialog the dialog to search in
     * @param buttonText the text of the button to find
     * @return the button with the specified text, or null if not found
     */
    private JButton findButton(JDialog dialog, String buttonText) {
        Component[] components = dialog.getContentPane().getComponents();
        for (Component component : components) {
            if (component instanceof JPanel) {
                JPanel panel = (JPanel) component;
                Component[] panelComponents = panel.getComponents();
                for (Component panelComponent : panelComponents) {
                    if (panelComponent instanceof JButton) {
                        JButton button = (JButton) panelComponent;
                        if (button.getText().equals(buttonText)) {
                            return button;
                        }
                    }
                }
            }
        }
        return null;
    }
}