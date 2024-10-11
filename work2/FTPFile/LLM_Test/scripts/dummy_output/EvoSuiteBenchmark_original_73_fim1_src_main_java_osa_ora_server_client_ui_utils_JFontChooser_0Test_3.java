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
		* A value to use for the "OK" button.
		*/
	private final static String OK = "OK";
	/**
	* A value to use for the "Cancel" button.
	*/
	private final static String CANCEL = "Cancel";
	/**
	* A value to use for the "font" property.
	*/
	private final static char FONT ='s';
	/**
	* The array of actions for the font chooser.
	*/
	private final static Action[] fontActionArray = {
		new AbstractAction(CANCEL) {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		}
	};
	/**
	* A list of listeners for the "font" property.
	*/
	private final static EventListenerList fontPropertyChangeListenerList = new EventListenerList();
	/**
	* A list of the fonts for which the font chooser has been created.
	*/
}