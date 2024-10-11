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
* It contains ten unit test cases for the {@link JFontChooser#createDialog(Component, String, boolean, ActionListener, ActionListener)} method.
*/
class JFontChooser_1Test {

	/**
	* Test case for the {@link JFontChooser#createDialog(Component, String, boolean, ActionListener, ActionListener)} method.
	* It tests the case when the {@code c} parameter is {@code null} and expects the {@code NullPointerException}.
	*/
	@Test
	void testCreateDialog_1() {
		JFontChooser fontChooser = new JFontChooser();
		assertThrows(NullPointerException.class, () -> fontChooser.createDialog(null, "", false, null, null));
	}
	
	/**
	* Test case for the {@link JFontChooser#createDialog(Component, String, boolean, ActionListener, ActionListener)} method.
	* It tests the case when the {@code title} parameter is {@code null} and expects the {@code NullPointerException}.
	*/
	@Test
	void testCreateDialog_2() {
		JFontChooser fontChooser = new JFontChooser();
		assertThrows(NullPointerException.class, () -> fontChooser.createDialog(new JDialog(), null, false, null, null));
	}
	
	/**
	* Test case for the {@link JFontChooser#createDialog(Component, String, boolean, ActionListener, ActionListener)} method.
	* It tests the case when the {@code okListener} parameter is {@code null} and expects the {@code NullPointerException}.
	*/
	@Test
	void testCreateDialog_3() {
		JFontChooser fontChooser = new JFontChooser();
		assertThrows(NullPointerException.class, () -> fontChooser.createDialog(new JDialog(), "", false, null, null));
	}
	
	/**
	* Test case for the {@link JFontChooser#createDialog(Component, String, boolean, ActionListener, ActionListener)} method.
	* It tests the case when the {@code cancelListener} parameter is {@code null} and expects the {@code NullPointerException}.
	*/
	@Test
	void testCreateDialog_4() {
		JFontChooser fontChooser = new JFontChooser();
		assertThrows(NullPointerException.class, () -> fontChooser.createDialog(new JDialog(), "", false, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		}, null));
	}
	
	/**
	* Test case for the {@link JFontChooser#createDialog(Component, String, boolean, ActionListener, ActionListener)} method.
	* It tests the case when the {@code c} parameter is {@code null} and expects the {@code NullPointerException}.
	*/
	@Test
	void testCreateDialog_5() {
		JFontChooser fontChooser = new JFontChooser();
		assertThrows(NullPointerException.class, () -> fontChooser.createDialog(null, "", false, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		}, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		}));
	}
	
	/**
	* Test case for the {@link JFontChooser#createDialog(Component, String, boolean, ActionListener, ActionListener)} method.
	* It tests the case when the {@code title} parameter is {@code null} and expects the {@code NullPointerException}.
	*/
	@Test
	void testCreateDialog_6() {
		JFontChooser fontChooser = new JFontChooser();
		assertThrows(NullPointerException.class, () -> fontChooser.createDialog(new JDialog(), null, false, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		}, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		}));
	}
	
	/**
	* Test case for the {@link JFontChooser#createDialog(Component, String, boolean, ActionListener, ActionListener)} method.
	* It tests the case when the {@code okListener} parameter is {@code null} and expects the {@code NullPointerException}.
	*/
	@Test
	void testCreateDialog_7() {
		JFontChooser fontChooser = new JFontChooser();
		assertThrows(NullPointerException.class, () -> fontChooser.createDialog(new JDialog(), "", false, null, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		}));
	}
	
	/**
	* Test case for the {@link JFontChooser#createDialog(Component, String, boolean, ActionListener, ActionListener)} method.
	* It tests the case when the {@code cancelListener} parameter is {@code null} and expects the {@code NullPointerException}.
	*/
	@Test
	void testCreateDialog_8() {
		JFontChooser fontChooser = new JFontChooser();
		assertThrows(NullPointerException.class, () -> fontChooser.createDialog(new JDialog(), "", false, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		}, null));
	}
	
	/**
	* Test case for the {@link JFontChooser#createDialog(Component, String, boolean, ActionListener, ActionListener)} method.
	* It tests the case when the {@code c} parameter is {@code null} and expects the {@code NullPointerException}.
	*/
	@Test
	void testCreateDialog_9() {
		JFontChooser fontChooser = new JFontChooser();
		assertThrows(NullPointerException.class, () -> fontChooser.createDialog(null, "", false, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		}, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		}));
	}
	
	/**
	* Test case for the {@link JFontChooser#createDialog(Component, String, boolean, ActionListener, ActionListener)} method.
	* It tests the case when the {@code title} parameter is {@code null} and expects the {@code NullPointerException}.
	*/
	@Test
	void testCreateDialog_10() {
		JFontChooser fontChooser = new JFontChooser();
		assertThrows(NullPointerException.class, () -> fontChooser.createDialog(new JDialog(), null, false, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		}, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		}));
	}
}

// JFontChooser_2Test.java
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
