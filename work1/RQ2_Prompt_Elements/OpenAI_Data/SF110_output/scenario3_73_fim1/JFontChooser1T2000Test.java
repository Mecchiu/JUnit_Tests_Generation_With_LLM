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
* It contains ten unit test cases for the {@link JFontChooser#createDialog(Component, String, boolean, ActionListener, ActionListener)} method.
*/
class JFontChooserTest {

	/**
	* Test case for the {@link JFontChooser#createDialog(Component, String, boolean, ActionListener, ActionListener)} method.
	* It tests the case when the {@code c} parameter is {@code null}.
	*/
	@Test
	void testCreateDialog_NullComponent() {
		JFontChooser fontChooser = new JFontChooser();
		JDialog dialog = fontChooser.createDialog(null, "Test", true, null, null);
		assertNotNull(dialog);
	}
	
	/**
	* Test case for the {@link JFontChooser#createDialog(Component, String, boolean, ActionListener, ActionListener)} method.
	* It tests the case when the {@code title} parameter is {@code null}.
	*/
	@Test
	void testCreateDialog_NullTitle() {
		JFontChooser fontChooser = new JFontChooser();
		JDialog dialog = fontChooser.createDialog(null, null, true, null, null);
		assertNotNull(dialog);
	}
	
	/**
	* Test case for the {@link JFontChooser#createDialog(Component, String, boolean, ActionListener, ActionListener)} method.
	* It tests the case when the {@code title} parameter is empty.
	*/
	@Test
	void testCreateDialog_EmptyTitle() {
		JFontChooser fontChooser = new JFontChooser();
		JDialog dialog = fontChooser.createDialog(null, "", true, null, null);
		assertNotNull(dialog);
	}
	
	/**
	* Test case for the {@link JFontChooser#createDialog(Component, String, boolean, ActionListener, ActionListener)} method.
	* It tests the case when the {@code title} parameter is not empty.
	*/
	@Test
	void testCreateDialog_NotEmptyTitle() {
		JFontChooser fontChooser = new JFontChooser();
		JDialog dialog = fontChooser.createDialog(null, "Test", true, null, null);
		assertNotNull(dialog);
	}
	
	/**
	* Test case for the {@link JFontChooser#createDialog(Component, String, boolean, ActionListener, ActionListener)} method.
	* It tests the case when the {@code okListener} parameter is {@code null}.
	*/
	@Test
	void testCreateDialog_NullOkListener() {
		JFontChooser fontChooser = new JFontChooser();
		JDialog dialog = fontChooser.createDialog(null, "Test", true, null, null);
		assertNotNull(dialog);
	}
	
	/**
	* Test case for the {@link JFontChooser#createDialog(Component, String, boolean, ActionListener, ActionListener)} method.
	* It tests the case when the {@code okListener} parameter is not {@code null}.
	*/
	@Test
	void testCreateDialog_NotNullOkListener() {
		JFontChooser fontChooser = new JFontChooser();
		JDialog dialog = fontChooser.createDialog(null, "Test", true, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Do nothing
			}
		}, null);
		assertNotNull(dialog);
	}
	
	/**
	* Test case for the {@link JFontChooser#createDialog(Component, String, boolean, ActionListener, ActionListener)} method.
	* It tests the case when the {@code cancelListener} parameter is {@code null}.
	*/
	@Test
	void testCreateDialog_NullCancelListener() {
		JFontChooser fontChooser = new JFontChooser();
		JDialog dialog = fontChooser.createDialog(null, "Test", true, null, null);
		assertNotNull(dialog);
	}
	
	/**
	* Test case for the {@link JFontChooser#createDialog(Component, String, boolean, ActionListener, ActionListener)} method.
	* It tests the case when the {@code cancelListener} parameter is not {@code null}.
	*/
	@Test
	void testCreateDialog_NotNullCancelListener() {
		JFontChooser fontChooser = new JFontChooser();
		JDialog dialog = fontChooser.createDialog(null, "Test", true, null, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Do nothing
			}
		});
		assertNotNull(dialog);
	}
	
	/**
	* Test case for the {@link JFontChooser#createDialog(Component, String, boolean, ActionListener, ActionListener)} method.
	* It tests the case when the {@code okListener} and {@code cancelListener} parameters are {@code null}.
	*/
	@Test
	void testCreateDialog_NullOkAndCancelListeners() {
		JFontChooser fontChooser = new JFontChooser();
		JDialog dialog = fontChooser.createDialog(null, "Test", true, null, null);
		assertNotNull(dialog);
	}
	
	/**
	* Test case for the {@link JFontChooser#createDialog(Component, String, boolean, ActionListener, ActionListener)} method.
	* It tests the case when the {@code okListener} and {@code cancelListener} parameters are not {@code null}.
	*/
	@Test
	void testCreateDialog_NotNullOkAndCancelListeners() {
		JFontChooser fontChooser = new JFontChooser();
		JDialog dialog = fontChooser.createDialog(null, "Test", true, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Do nothing
			}
		}, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Do nothing
			}
		});
		assertNotNull(dialog);
	}
}

// JFontChooser.java
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
 * <code>JFontChooser</