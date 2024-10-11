// JFontChooser_1Test.java
package osa.ora.server.client.ui.utils;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.Serializable;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.KeyStroke;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.EventListenerList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JFontChooser}.
* It contains one unit test case for the {@link JFontChooser#createDialog(Component, String, boolean, ActionListener, ActionListener)} method.
*/
class JFontChooser_1Test {
		
    // private variables.
    private boolean b;
    private JFrame bf;

    /**
     * Test method for {@link JFontChooser#
     * createDialog(java.awt.Component, java.lang.String, boolean,
     * java.awt.ActionListener, java.awt.ActionListener)}
     * where the dialog itself is not a JDialog and the "OK" and "Cancel"
     * buttons are buttons.  The dialog is NOT activated.
     */
    @Test
    public void createDialog_NoDefault() {
        // call testmethod-createDialog(Component,String,boolean,ActionListener,ActionListener())
        JDialog d = JFontChooser._createDialog(new JLabel(), null, false, null, null);
        assertNotNull(d);
        assertFalse("d.isVisible() returns false!", d.isVisible());
        assertFalse("d.isModal() returns false!", d.isModal());
        assertNull("d.getContentPane() returns null!", d.getContentPane());
        assertNull("d.getContentPane().getBorder() returns null!", d.getContentPane().getBorder());
        assertNull("d.getContentPane().getLayout() returns null!", d.getContentPane().getLayout());
        assertNull("d.getKeyListeners() returns null",
                    d.getKeyListeners());
        assertNull("d.getOwner() returns null",
                    d.getOwner());
        assertNull("d.getOwner().getUI() returns null",
                    d.getOwner().getUI());
        assertNull("d.getTitle() returns null", d.getTitle());
        assertNull("d.getTitle().getFont() returns null",
                    d.getTitle().getFont());
        assertNull("d.getTitle().getForeground() returns null",
                    d.getTitle().getForeground());
    }

}