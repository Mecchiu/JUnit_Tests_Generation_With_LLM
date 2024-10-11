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
     * Test case for creating a dialog with null parent component.
     * Expected result: IllegalArgumentException thrown.
     */
    @Test
    void testCreateDialogWithNullParent() {
        assertThrows(IllegalArgumentException.class, () -> {
            JFontChooser.createDialog(null, "Title", true, null, null);
        });
    }

    /**
     * Test case for creating a dialog with null title.
     * Expected result: IllegalArgumentException thrown.
     */
    @Test
    void testCreateDialogWithNullTitle() {
        assertThrows(IllegalArgumentException.class, () -> {
            JFontChooser.createDialog(new JFrame(), null, true, null, null);
        });
    }

    /**
     * Test case for creating a dialog with empty title.
     * Expected result: IllegalArgumentException thrown.
     */
    @Test
    void testCreateDialogWithEmptyTitle() {
        assertThrows(IllegalArgumentException.class, () -> {
            JFontChooser.createDialog(new JFrame(), "", true, null, null);
        });
    }

    /**
     * Test case for creating a dialog with null OK listener.
     * Expected result: IllegalArgumentException thrown.
     */
    @Test
    void testCreateDialogWithNullOkListener() {
        assertThrows(IllegalArgumentException.class, () -> {
            JFontChooser.createDialog(new JFrame(), "Title", true, null, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // do nothing
                }
            });
        });
    }

    /**
     * Test case for creating a dialog with null Cancel listener.
     * Expected result: IllegalArgumentException thrown.
     */
    @Test
    void testCreateDialogWithNullCancelListener() {
        assertThrows(IllegalArgumentException.class, () -> {
            JFontChooser.createDialog(new JFrame(), "Title", true, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // do nothing
                }
            }, null);
        });
    }

    /**
     * Test case for creating a dialog with valid parameters.
     * Expected result: JDialog instance returned.
     */
    @Test
    void testCreateDialogWithValidParameters() {
        JDialog dialog = JFontChooser.createDialog(new JFrame(), "Title", true, new ActionListener() {
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
     * Test case for creating a dialog and checking its modality type.
     * Expected result: Modality type is set to true.
     */
    @Test
    void testCreateDialogModalityType() {
        JDialog dialog = JFontChooser.createDialog(new JFrame(), "Title", true, new ActionListener() {
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
        assertTrue(dialog.isModal());
    }

    /**
     * Test case for creating a dialog and checking its title.
     * Expected result: Title is set to "Title".
     */
    @Test
    void testCreateDialogTitle() {
        JDialog dialog = JFontChooser.createDialog(new JFrame(), "Title", true, new ActionListener() {
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
     * Test case for creating a dialog and checking its content pane.
     * Expected result: Content pane is an instance of JFontChooser.
     */
    @Test
    void testCreateDialogContent() {
        JDialog dialog = JFontChooser.createDialog(new JFrame(), "Title", true, new ActionListener() {
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
        assertTrue(dialog.getContentPane().getComponent(0) instanceof JFontChooser);
    }

    /**
     * Test case for creating a dialog and checking its OK and Cancel buttons.
     * Expected result: OK and Cancel buttons are present.
     */
    @Test
    void testCreateDialogButtons() {
        JDialog dialog = JFontChooser.createDialog(new JFrame(), "Title", true, new ActionListener() {
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
        assertTrue(dialog.getContentPane().getComponent(1) instanceof JPanel);
        JPanel buttonPanel = (JPanel) dialog.getContentPane().getComponent(1);
        assertEquals(2, buttonPanel.getComponentCount());
        assertTrue(buttonPanel.getComponent(0) instanceof JButton);
        assertTrue(buttonPanel.getComponent(1) instanceof JButton);
    }
}