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
		/**
		* Tests whether JFontChooser can create and return a new
		* <code>FontChooser</code> dialog.
		* 
		* <p>
		* This test is not directly unit test - rather a unit
		* test is created using the {@link #testCreateDialogs()}
		* method, which checks the output of the methods
		* below. After this it is possible to create
		* a {@link JFontChooser} at any point to invoke <code>OK</code> -
		* or to create a "Cancel" dialog (either within the JDialog
		* or inside the list by this test)
		* using the {@link #testCreateDialog(String, boolean, boolean)}
		* method.
		* 
		* @see  #testCreateDialog(String, boolean, boolean)
		* @see  JFontChooser
		*/
		@Test
	     public void testCreateDialogs() {
	        JFontChooser chooser = (JFontChooser)(createDialog(null, "", true, null, null));

	        assertTrue("Dialog not created", (chooser!= null)
	                && "JFontChooser".equals(chooser.getClass().toString()));
	        assertEquals("Dialog box not correctly created", "Dialog box", chooser.getTitle());
	        assertTrue("Dialog box not correctly created", "OK".equals(chooser.getTitleDisplayText()));
	        assertNotNull("List not correctly created", (chooser.getComponents())
				  .get(0) instanceof ListSelectionModel);
	        assertEquals("List box not correctly created", "List box", chooser.getList().getSelectedValue().toString());
		}

}