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
		Font font = JFontChooser.showDialog(null, "Test");
		assertNull(font);
	}
	
	/**
	* Test case for the {@link JFontChooser#showDialog(Component, String)} method.
	* It tests the case when the title is null.
	*/
	@Test
	void testShowDialog_TitleNull() {
		Font font = JFontChooser.showDialog(new JButton(), null);
		assertNull(font);
	}
	
	/**
	* Test case for the {@link JFontChooser#showDialog(Component, String)} method.
	* It tests the case when the title is empty.
	*/
	@Test
	void testShowDialog_TitleEmpty() {
		Font font = JFontChooser.showDialog(new JButton(), "");
		assertNull(font);
	}
	
	/**
	* Test case for the {@link JFontChooser#showDialog(Component, String)} method.
	* It tests the case when the title is blank.
	*/
	@Test
	void testShowDialog_TitleBlank() {
		Font font = JFontChooser.showDialog(new JButton(), " ");
		assertNull(font);
	}
	
	/**
	* Test case for the {@link JFontChooser#showDialog(Component, String)} method.
	* It tests the case when the title is valid.
	*/
	@Test
	void testShowDialog_TitleValid() {
		Font font = JFontChooser.showDialog(new JButton(), "Test");
		assertNotNull(font);
	}
}