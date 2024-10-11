// JFontChooserTest.java
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
* It contains ten unit test cases for the {@link JFontChooser#showDialog(Component, String)} method.
*/
class JFontChooserTest {

	/**
	* Test case for the {@link JFontChooser#showDialog(Component, String)} method.
	* It tests the case when the component is null.
	*/
	@Test
	void testShowDialog_ComponentNull() {
		JFontChooser jFontChooser = new JFontChooser();
		Font font = jFontChooser.showDialog(null, "Test");
		assertNull(font);
	}
	
	/**
	* Test case for the {@link JFontChooser#showDialog(Component, String)} method.
	* It tests the case when the title is null.
	*/
	@Test
	void testShowDialog_TitleNull() {
		JFontChooser jFontChooser = new JFontChooser();
		Font font = jFontChooser.showDialog(new JButton(), null);
		assertNull(font);
	}
	
	/**
	* Test case for the {@link JFontChooser#showDialog(Component, String)} method.
	* It tests the case when the title is empty.
	*/
	@Test
	void testShowDialog_TitleEmpty() {
		JFontChooser jFontChooser = new JFontChooser();
		Font font = jFontChooser.showDialog(new JButton(), "");
		assertNull(font);
	}
	
	/**
	* Test case for the {@link JFontChooser#showDialog(Component, String)} method.
	* It tests the case when the title is blank.
	*/
	@Test
	void testShowDialog_TitleBlank() {
		JFontChooser jFontChooser = new JFontChooser();
		Font font = jFontChooser.showDialog(new JButton(), " ");
		assertNull(font);
	}
	
	/**
	* Test case for the {@link JFontChooser#showDialog(Component, String)} method.
	* It tests the case when the title is valid.
	*/
	@Test
	void testShowDialog_TitleValid() {
		JFontChooser jFontChooser = new JFontChooser();
		Font font = jFontChooser.showDialog(new JButton(), "Test");
		assertNotNull(font);
	}
	
	/**
	* Test case for the {@link JFontChooser#showDialog(Component, String)} method.
	* It tests the case when the component is valid.
	*/
	@Test
	void testShowDialog_ComponentValid() {
		JFontChooser jFontChooser = new JFontChooser();
		Font font = jFontChooser.showDialog(new JButton(), "Test");
		assertNotNull(font);
	}
	
	/**
	* Test case for the {@link JFontChooser#showDialog(Component, String)} method.
	* It tests the case when the component and title are valid.
	*/
	@Test
	void testShowDialog_ComponentAndTitleValid() {
		JFontChooser jFontChooser = new JFontChooser();
		Font font = jFontChooser.showDialog(new JButton(), "Test");
		assertNotNull(font);
	}
	
	/**
	* Test case for the {@link JFontChooser#showDialog(Component, String)} method.
	* It tests the case when the component and title are valid.
	*/
	@Test
	void testShowDialog_ComponentAndTitleValid2() {
		JFontChooser jFontChooser = new JFontChooser();
		Font font = jFontChooser.showDialog(new JButton(), "Test");
		assertNotNull(font);
	}
	
	/**
	* Test case for the {@link JFontChooser#showDialog(Component, String)} method.
	* It tests the case when the component and title are valid.
	*/
	@Test
	void testShowDialog_ComponentAndTitleValid3() {
		JFontChooser jFontChooser = new JFontChooser();
		Font font = jFontChooser.showDialog(new JButton(), "Test");
		assertNotNull(font);
	}
	
	/**
	* Test case for the {@link JFontChooser#showDialog(Component, String)} method.
	* It tests the case when the component and title are valid.
	*/
	@Test
	void testShowDialog_ComponentAndTitleValid4() {
		JFontChooser jFontChooser = new JFontChooser();
		Font font = jFontChooser.showDialog(new JButton(), "Test");
		assertNotNull(font);
	}
	
	/**
	* Test case for the {@link JFontChooser#showDialog(Component, String)} method.
	* It tests the case when the component and title are valid.
	*/
	@Test
	void testShowDialog_ComponentAndTitleValid5() {
		JFontChooser jFontChooser = new JFontChooser();
		Font font = jFontChooser.showDialog(new JButton(), "Test");
		assertNotNull(font);
	}
}

// JFontChooserDialog.java
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

/**
 * <code>JFontChooser</code> provides a pane of controls designed to allow
 * a user to manipulate and select a font.
 *
 * This class provides three levels of API:
 * <ol>
 * <li>A static convenience method which shows a modal font-chooser
 * dialog and returns the font selected by the user.
 * <li>A static convenience method for creating a font-chooser dialog
 * where <code>ActionListeners</code> can be specified to be invoked when
 * the user presses one of the dialog buttons.
 * <li>The ability to create instances of <code>JFontChooser</code> panes
 * directly (within any container). <code>PropertyChange</code> listeners
 * can be added to detect when the current "font" property changes.
 * </ol>
 * <p>
 *
 * @author Adrian BER
 */
public class JFontChooserDialog extends JDialog {

    /**
     * Creates a font chooser dialog.
     *
     * @param c the parent component
     * @param title the title of the dialog
     * @param modal true for a modal dialog, false for one that allows
     *        others windows to be active at the same time
     * @param fc the font chooser to be placed inside the dialog
     * @param okListener the ActionListener invoked when "OK" is pressed
     * @param cancelListener the ActionListener invoked when "Cancel" is pressed
     * @return a new font chooser dialog
     */
    public static JDialog createDialog(Component c, String title, boolean modal,
            JFontChooser fc, ActionListener okListener, ActionListener cancelListener) {
        Window window = JOptionPane.getWindowForComponent(c);
        JDialog dialog;
        if (window instanceof Frame) {
            dialog = new JDialog((Frame) window, title, modal);
        } else {
            dialog = new JDialog((Dialog) window, title, modal);
        }
        if (okListener != null || cancelListener != null) {
            Container contentPane = dialog.getContentPane();
            contentPane.setLayout(new BorderLayout());
            contentPane.add(fc, BorderLayout.CENTER);
            // Create Lower button panel
            JPanel buttonPane = new JPanel();
            buttonPane.setLayout(new FlowLayout(FlowLayout.CENTER));
            JButton okButton = new JButton("OK");
            getRootPane().setDefaultButton(okButton);
            okButton.addActionListener(okListener);
            okButton.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    JDialog dialog = (JDialog) ((JButton) e.getSource()).getTopLevelAncestor();
                    dialog.setVisible(false);
                }
            });
            buttonPane.add(okButton);
            if (cancelListener != null) {
                JButton cancelButton = new JButton("Cancel");
                cancelButton.addActionListener(cancelListener);
                cancelButton.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        JDialog dialog = (JDialog) ((JButton) e.getSource()).getTopLevelAncestor();
                        dialog.setVisible(false);
                    }
                });
                buttonPane.add(cancelButton);
            }
            contentPane.add(buttonPane, BorderLayout.SOUTH);
            dialog.pack();
        } else {
            dialog.setContentPane(fc);
        }
        dialog.setSize(fc.getPreferredSize());
        dialog.setLocationRelativeTo(c);
        return dialog;
    }
}

// JFontChooserDialogTest.java
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
* Test class of {@link JFontChooserDialog}.
* It contains ten unit test cases for the {@link JFontChooserDialog#createDialog(Component, String, boolean, JFontChooser, ActionListener, ActionListener)} method.
*/
class JFontChooserDialogTest {
		
	/**
	* Test case for the {@link JFontChooserDialog#createDialog(Component, String, boolean, JFontChooser, ActionListener, ActionListener)} method.
	* It tests the case when the component is null.
	*/
	@Test
	void testCreateDialog_ComponentNull() {
		JFontChooser jFontChooser = new JFontChooser();
		JDialog dialog = JFontChooserDialog.createDialog(null, "Test", true, jFontChooser, null, null);
		assertNull(dialog);
	}
	
	/**
	* Test case for the {@link JFontChooserDialog#createDialog(Component, String, boolean, JFontChooser, ActionListener, ActionListener)} method.
	* It tests the case when the title is null.
	*/
	@Test
	void testCreateDialog_TitleNull() {
		JFontChooser jFontChooser = new JFontChooser();
		JDialog dialog = JFontChooserDialog.createDialog(new JButton(), null, true, jFontChooser, null, null);
		assertNull(dialog);
	}
	
	/**
	* Test case for the {@link JFontChooserDialog#createDialog(Component, String, boolean, JFontChooser, ActionListener, ActionListener)} method.
	* It tests the case when the title is empty.
	*/
	@Test
	void testCreateDialog_TitleEmpty() {
		JFontChooser jFontChooser = new JFontChooser();
		JDialog dialog = JFontChooserDialog.createDialog(new JButton(), "", true, jFontChooser, null, null);
		assertNull(dialog);
	}
	
	/**
	* Test case for the {@link JFontChooserDialog#createDialog(Component, String, boolean, JFontChooser, ActionListener, ActionListener)} method.
	* It tests the case when the title is blank.
	*/
	@Test
	void testCreateDialog_TitleBlank() {
		JFontChooser jFontChooser = new JFontChooser();
		JDialog dialog = JFontChooserDialog.createDialog(new JButton(), " ", true, jFontChooser, null, null);
		assertNull(dialog);
	}
	
	/**
	* Test case for the {@link JFontChooserDialog#createDialog(Component, String, boolean, JFontChooser, ActionListener, ActionListener)} method.
	* It tests the case when the title is valid.
	*/
	@Test
	void testCreateDialog_TitleValid() {
		JFontChooser jFontChooser = new JFontChooser();
		JDialog dialog = JFontChooserDialog.createDialog(new JButton(), "Test", true, jFontChooser, null, null);
		assertNotNull(dialog);
	}
	
	/**
	* Test case for the {@link JFontChooserDialog#createDialog(Component, String, boolean, JFontChooser, ActionListener, ActionListener)} method.
	* It tests the case when the component is valid.
	*/
	@Test
	void testCreateDialog_ComponentValid() {
		JFontChooser jFontChooser = new JFontChooser();
		JDialog dialog = JFontChooserDialog.createDialog(new JButton(), "Test", true, jFontChooser, null, null);
		assertNot