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
	 * Test case for {@link JFontChooser#createDialog(Component, String, boolean, ActionListener, ActionListener)} method.
	 * Test case for the following requirements:
	 * 
	 * <p>
	 * <b>Description:</b>
	 * <ul>
	 * <li>The method creates a dialog containing the specified <code>ColorChooser</code> pane along with "OK", "Cancel", and "Reset" buttons.
	 * </ul>
	 * <p>
	 * <b>Test Design:</b>
	 * <ul>
	 * <li>The method is invoked with the following parameters:
	 * <ul>
	 * <li>c = null</li>
	 * <li>title = "Test"</li>
	 * <li>modal = true</li>
	 * <li>okListener = null</li>
	 * <li>cancelListener = null</li>
	 * </ul>
	 * </ul>
	 * <p>
	 * <b>Expected Results:</b>
	 * <ul>
	 * <li>The method returns a new dialog containing the font-chooser pane.</li>
	 * </ul>
	 * 
	 * @throws Exception
	 *             if an error occurs
	 */
	@Test
	public void testCreateDialog_1() throws Exception {
		JFontChooser fontChooser = new JFontChooser();
		JDialog dialog = fontChooser.createDialog(null, "Test", true, null, null);
		assertNotNull(dialog);
	}
	
	/**
	 * Test case for {@link JFontChooser#createDialog(Component, String, boolean, ActionListener, ActionListener)} method.
	 * Test case for the following requirements:
	 * 
	 * <p>
	 * <b>Description:</b>
	 * <ul>
	 * <li>The method creates a dialog containing the specified <code>ColorChooser</code> pane along with "OK", "Cancel", and "Reset" buttons.
	 * </ul>
	 * <p>
	 * <b>Test Design:</b>
	 * <ul>
	 * <li>The method is invoked with the following parameters:
	 * <ul>
	 * <li>c = null</li>
	 * <li>title = "Test"</li>
	 * <li>modal = false</li>
	 * <li>okListener = null</li>
	 * <li>cancelListener = null</li>
	 * </ul>
	 * </ul>
	 * <p>
	 * <b>Expected Results:</b>
	 * <ul>
	 * <li>The method returns a new dialog containing the font-chooser pane.</li>
	 * </ul>
	 * 
	 * @throws Exception
	 *             if an error occurs
	 */
	@Test
	public void testCreateDialog_2() throws Exception {
		JFontChooser fontChooser = new JFontChooser();
		JDialog dialog = fontChooser.createDialog(null, "Test", false, null, null);
		assertNotNull(dialog);
	}
	
	/**
	 * Test case for {@link JFontChooser#createDialog(Component, String, boolean, ActionListener, ActionListener)} method.
	 * Test case for the following requirements:
	 * 
	 * <p>
	 * <b>Description:</b>
	 * <ul>
	 * <li>The method creates a dialog containing the specified <code>ColorChooser</code> pane along with "OK", "Cancel", and "Reset" buttons.
	 * </ul>
	 * <p>
	 * <b>Test Design:</b>
	 * <ul>
	 * <li>The method is invoked with the following parameters:
	 * <ul>
	 * <li>c = null</li>
	 * <li>title = null</li>
	 * <li>modal = true</li>
	 * <li>okListener = null</li>
	 * <li>cancelListener = null</li>
	 * </ul>
	 * </ul>
	 * <p>
	 * <b>Expected Results:</b>
	 * <ul>
	 * <li>The method returns a new dialog containing the font-chooser pane.</li>
	 * </ul>
	 * 
	 * @throws Exception
	 *             if an error occurs
	 */
	@Test
	public void testCreateDialog_3() throws Exception {
		JFontChooser fontChooser = new JFontChooser();
		JDialog dialog = fontChooser.createDialog(null, null, true, null, null);
		assertNotNull(dialog);
	}
	
	/**
	 * Test case for {@link JFontChooser#createDialog(Component, String, boolean, ActionListener, ActionListener)} method.
	 * Test case for the following requirements:
	 * 
	 * <p>
	 * <b>Description:</b>
	 * <ul>
	 * <li>The method creates a dialog containing the specified <code>ColorChooser</code> pane along with "OK", "Cancel", and "Reset" buttons.
	 * </ul>
	 * <p>
	 * <b>Test Design:</b>
	 * <ul>
	 * <li>The method is invoked with the following parameters:
	 * <ul>
	 * <li>c = null</li>
	 * <li>title = null</li>
	 * <li>modal = false</li>
	 * <li>okListener = null</li>
	 * <li>cancelListener = null</li>
	 * </ul>
	 * </ul>
	 * <p>
	 * <b>Expected Results:</b>
	 * <ul>
	 * <li>The method returns a new dialog containing the font-chooser pane.</li>
	 * </ul>
	 * 
	 * @throws Exception
	 *             if an error occurs
	 */
	@Test
	public void testCreateDialog_4() throws Exception {
		JFontChooser fontChooser = new JFontChooser();
		JDialog dialog = fontChooser.createDialog(null, null, false, null, null);
		assertNotNull(dialog);
	}
	
	/**
	 * Test case for {@link JFontChooser#createDialog(Component, String, boolean, ActionListener, ActionListener)} method.
	 * Test case for the following requirements:
	 * 
	 * <p>
	 * <b>Description:</b>
	 * <ul>
	 * <li>The method creates a dialog containing the specified <code>ColorChooser</code> pane along with "OK", "Cancel", and "Reset" buttons.
	 * </ul>
	 * <p>
	 * <b>Test Design:</b>
	 * <ul>
	 * <li>The method is invoked with the following parameters:
	 * <ul>
	 * <li>c = null</li>
	 * <li>title = "Test"</li>
	 * <li>modal = true</li>
	 * <li>okListener = new ActionListener() {
	 * 						public void actionPerformed(ActionEvent e) {
	 * 							System.out.println("OK");
	 * 						}
	 * 					}</li>
	 * <li>cancelListener = null</li>
	 * </ul>
	 * </ul>
	 * <p>
	 * <b>Expected Results:</b>
	 * <ul>
	 * <li>The method returns a new dialog containing the font-chooser pane.</li>
	 * </ul>
	 * 
	 * @throws Exception
	 *             if an error occurs
	 */
	@Test
	public void testCreateDialog_5() throws Exception {
		JFontChooser fontChooser = new JFontChooser();
		JDialog dialog = fontChooser.createDialog(null, "Test", true, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("OK");
			}
		}, null);
		assertNotNull(dialog);
	}
	
	/**
	 * Test case for {@link JFontChooser#createDialog(Component, String, boolean, ActionListener, ActionListener)} method.
	 * Test case for the following requirements:
	 * 
	 * <p>
	 * <b>Description:</b>
	 * <ul>
	 * <li>The method creates a dialog containing the specified <code>ColorChooser</code> pane along with "OK", "Cancel", and "Reset" buttons.
	 * </ul>
	 * <p>
	 * <b>Test Design:</b>
	 * <ul>
	 * <li>The method is invoked with the following parameters:
	 * <ul>
	 * <li>c = null</li>
	 * <li>title = "Test"</li>
	 * <li>modal = false</li>
	 * <li>okListener = new ActionListener() {
	 * 						public void actionPerformed(ActionEvent e) {
	 * 							System.out.println("OK");
	 * 						}
	 * 					}</li>
	 * <li>cancelListener = null</li>
	 * </ul>
	 * </ul>
	 * <p>
	 * <b>Expected Results:</b>
	 * <ul>
	 * <li>The method returns a new dialog containing the font-chooser pane.</li>
	 * </ul>
	 * 
	 * @throws Exception
	 *             if an error occurs
	 */
	@Test
	public void testCreateDialog_6() throws Exception {
		JFontChooser fontChooser = new JFontChooser();
		JDialog dialog = fontChooser.createDialog(null, "Test", false, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("OK");
			}
		}, null);
		assertNotNull(dialog);
	}
	
	/**
	 * Test case for {@link JFontChooser#createDialog(Component, String, boolean, ActionListener, ActionListener)} method.
	 * Test case for the following requirements:
	 * 
	 * <p>
	 * <b>Description:</b>
	 * <ul>
	 * <li>The method creates a dialog containing the specified <code>ColorChooser</code> pane along with "OK", "Cancel", and "Reset" buttons.
	 * </ul>
	 * <p>
	 * <b>Test Design:</b>
	 * <ul>
	 * <li>The method is invoked with the following parameters:
	 * <ul>
	 * <li>c = null</li>
	 * <li>title = "Test"</li>
	 * <li>modal = true</li>
	 * <li>okListener = null</li>
	 * <li>cancelListener = new ActionListener() {
	 * 						public void actionPerformed(ActionEvent e) {
	 * 							System.out.println("Cancel");
	 * 						}
	 * 					}</li>
	 * </ul>
	 * </ul>
	 * <p>
	 * <b>Expected Results:</b>
	 * <ul>
	 * <li>The method returns a new dialog containing the font-chooser pane.</li>
	 * </ul>
	 * 
	 * @throws Exception
	 *             if an error occurs
	 */
	@Test
	public void testCreateDialog_7() throws Exception {
		JFontChooser fontChooser = new JFontChooser();
		JDialog dialog = fontChooser.createDialog(null, "Test", true, null, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Cancel");
			}
		});
		assertNotNull(dialog);
	}
	
	/**
	 * Test case for {@link JFontChooser#createDialog(Component, String, boolean, ActionListener, ActionListener)} method.
	 * Test case for the following requirements:
	 * 
	 * <p>
	 * <b>Description:</b>
	 * <ul>
	 * <li>The method creates a dialog containing the specified <code>ColorChooser</code> pane along with "OK", "Cancel", and "Reset" buttons.
	 * </ul>
	 * <p>
	 * <b>Test Design:</b>
	 * <ul>
	 * <li>The method is invoked with the following parameters:
	 * <ul>
	 * <li>c = null</li>
	 * <li>title = "Test"</li>
	 * <li>modal = false</li>
	 * <li>okListener = null</li>
	 * <li>cancelListener = new ActionListener() {
	 * 						public void actionPerformed(ActionEvent e) {
	 * 							System.out.println("Cancel");
	 * 						}
	 * 					}</li>
	 * </ul>
	 * </ul>
	 * <p>
	 * <b>Expected Results:</b>
	 * <ul>
	 * <li>The method returns a new dialog containing the font-chooser pane.</li>
	 * </ul>
	 * 
	 * @throws Exception
	 *             if an error occurs
	 */
	@Test
	public void testCreateDialog_8() throws Exception {
		JFontChooser fontChooser = new JFontChooser();
		JDialog dialog = fontChooser.createDialog(null, "Test", false, null, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Cancel");
			}
		});
		assertNotNull(dialog);
	}
	
	/**
	 * Test case for {@link JFontChooser#createDialog(Component, String, boolean, ActionListener, ActionListener)} method.
	 * Test case for the following requirements:
	 * 
	 * <p>
	 * <b>Description:</b>
	 * <ul>
	 * <li>The method creates a dialog containing the specified <code>ColorChooser</code> pane along with "OK", "Cancel", and "Reset" buttons.
	 * </ul>
	 * <p>
	 * <b>Test Design:</b>
	 * <ul>
	 * <li>The method is invoked with the following parameters:
	 * <ul>
	 * <li>c = null</li>
	 * <li>title = "Test"</li>
	 * <li>modal = true</li>
	 * <li>okListener = new ActionListener() {
	 * 						public void actionPerformed(ActionEvent e) {
	 * 							System.out.println("OK");
	 * 						}
	 * 					}</li>
	 * <li>cancelListener = new ActionListener() {
	 * 						public void actionPerformed(ActionEvent e) {
	 * 							System.out.println("Cancel");
	 * 						}
	 * 					}</li>
	 * </ul>
	 * </ul>
	 * <p>
	 * <b>Expected Results:</b>
	 * <ul>
	 * <li>The method returns a new dialog containing the font-chooser pane.</li>
	 * </ul>
	 * 
	 * @throws Exception
	 *             if an error occurs
	 */
	@Test
	public void testCreateDialog_9() throws Exception {
		JFontChooser