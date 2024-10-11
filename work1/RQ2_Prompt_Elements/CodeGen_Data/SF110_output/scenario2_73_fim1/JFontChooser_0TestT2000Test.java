// JFontChooser_0Test.java
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
* It contains one unit test case for the {@link JFontChooser#showDialog(Component, String)} method.
*/
class JFontChooser_0Test {
/**
		 * The action to invoke when the OK button is pressed.
		 */
		public static final Action OK = new AbstractAction("Ok") { public void actionPerformed(ActionEvent e) { System.exit(0); } };
	
        /**
         * The action to invoke when the Cancel button is pressed.
         * Sets the value of <code>getOk()</code> to <code>false</code>.
         */
        public static final Action CANCEL = new AbstractAction("Cancel") { public void actionPerformed(ActionEvent e) { getOk(); } };
    
	/**
	* Creates a dialog with the specified parent and title.
	* @param parent the parent <code>Container</code>
	* @param title the <code>String</code> containing the dialog title
	* @param modal <code>boolean</code> specifying whether the dialog
	* should block for event or not. Default is <code>false</code>
	* @param okListener the {@link ActionListener} to invoke when the
	* OK button is pressed
	* @param cancelListener the {@link ActionListener} to invoke when the
	* Cancel button is pressed
	* @see #showDialog
	*/
	public static JDialog createDialog(Container parent, String title, boolean modal, ActionListener okListener, ActionListener cancelListener) {
		return createDialog(parent, title, modal, okListener, cancelListener, null);
	}

	/**
	* Creates a dialog with the specified parent and title.
	* @param parent the parent <code>Container</code>
	* @param title the <code>String</code> containing the dialog title
	* @param modal <code>boolean</code> specifying whether the dialog
	* should block for event or not. Default is <code>false</code>
	* @param okListener the {@link ActionListener} to invoke when the
	* OK button is pressed
	* @param cancelListener the {@link