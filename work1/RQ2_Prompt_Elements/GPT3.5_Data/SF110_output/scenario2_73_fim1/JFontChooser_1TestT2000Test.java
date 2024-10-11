// JFontChooser_1Test.java
package osa.ora.server.client.ui.utils;

import java.awt.Component;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.UIManager;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link JFontChooser}.
 * It contains ten unit test cases for the {@link JFontChooser#createDialog(Component, String, boolean, ActionListener, ActionListener)} method.
 */
class JFontChooser_1Test {

    /**
     * Test case for creating a dialog with null parent component.
     * Expected result: IllegalArgumentException.
     */
    @Test
    void testCreateDialogWithNullParent() {
        assertThrows(IllegalArgumentException.class, () -> {
            JFontChooser fontChooser = new JFontChooser();
            fontChooser.createDialog(null, "Title", true, null, null);
        });
    }

    /**
     * Test case for creating a dialog with null title.
     * Expected result: IllegalArgumentException.
     */
    @Test
    void testCreateDialogWithNullTitle() {
        assertThrows(IllegalArgumentException.class, () -> {
            JFontChooser fontChooser = new JFontChooser();
            fontChooser.createDialog(new JFrame(), null, true, null, null);
        });
    }

    /**
     * Test case for creating a dialog with empty title.
     * Expected result: IllegalArgumentException.
     */
    @Test
    void testCreateDialogWithEmptyTitle() {
        assertThrows(IllegalArgumentException.class, () -> {
            JFontChooser fontChooser = new JFontChooser();
            fontChooser.createDialog(new JFrame(), "", true, null, null);
        });
    }

    /**
     * Test case for creating a dialog with null OK listener.
     * Expected result: IllegalArgumentException.
     */
    @Test
    void testCreateDialogWithNullOkListener() {
        assertThrows(IllegalArgumentException.class, () -> {
            JFontChooser fontChooser = new JFontChooser();
            fontChooser.createDialog(new JFrame(), "Title", true, null, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                }
            });
        });
    }

    /**
     * Test case for creating a dialog with null Cancel listener.
     * Expected result: IllegalArgumentException.
     */
    @Test
    void testCreateDialogWithNullCancelListener() {
        assertThrows(IllegalArgumentException.class, () -> {
            JFontChooser fontChooser = new JFontChooser();
            fontChooser.createDialog(new JFrame(), "Title", true, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                }
            }, null);
        });
    }

    /**
     * Test case for creating a dialog with valid parameters.
     * Expected result: JDialog instance.
     */
    @Test
    void testCreateDialogWithValidParameters() {
        JFontChooser fontChooser = new JFontChooser();
        JDialog dialog = fontChooser.createDialog(new JFrame(), "Title", true, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        }, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
        assertNotNull(dialog);
    }

    /**
     * Test case for creating a dialog with default title.
     * Expected result: JDialog instance.
     */
    @Test
    void testCreateDialogWithDefaultTitle() {
        JFontChooser fontChooser = new JFontChooser();
        JDialog dialog = fontChooser.createDialog(new JFrame(), "", true, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        }, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
        assertNotNull(dialog);
    }

    /**
     * Test case for creating a dialog with default OK listener.
     * Expected result: JDialog instance.
     */
    @Test
    void testCreateDialogWithDefaultOkListener() {
        JFontChooser fontChooser = new JFontChooser();
        JDialog dialog = fontChooser.createDialog(new JFrame(), "Title", true, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        }, null);
        assertNotNull(dialog);
    }

    /**
     * Test case for creating a dialog with default Cancel listener.
     * Expected result: JDialog instance.
     */
    @Test
    void testCreateDialogWithDefaultCancelListener() {
        JFontChooser fontChooser = new JFontChooser();
        JDialog dialog = fontChooser.createDialog(new JFrame(), "Title", true, null, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
        assertNotNull(dialog);
    }

    /**
     * Test case for creating a dialog with default OK and Cancel listeners.
     * Expected result: JDialog instance.
     */
    @Test
    void testCreateDialogWithDefaultListeners() {
        JFontChooser fontChooser = new JFontChooser();
        JDialog dialog = fontChooser.createDialog(new JFrame(), "Title", true, null, null);
        assertNotNull(dialog);
    }
}