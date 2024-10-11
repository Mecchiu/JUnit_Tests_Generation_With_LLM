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
	* It tests the case when the component is null.
	*/
	@Test
	void testCreateDialog_ComponentIsNull() {
		JFontChooser jFontChooser = new JFontChooser();
		JDialog dialog = jFontChooser.createDialog(null, "Test", true, null, null);
		assertNotNull(dialog);
	}
	
	/**
	* Test case for the {@link JFontChooser#createDialog(Component, String, boolean, ActionListener, ActionListener)} method.
	* It tests the case when the title is null.
	*/
	@Test
	void testCreateDialog_TitleIsNull() {
		JFontChooser jFontChooser = new JFontChooser();
		JDialog dialog = jFontChooser.createDialog(new JButton(), null, true, null, null);
		assertNotNull(dialog);
	}
	
	/**
	* Test case for the {@link JFontChooser#createDialog(Component, String, boolean, ActionListener, ActionListener)} method.
	* It tests the case when the title is empty.
	*/
	@Test
	void testCreateDialog_TitleIsEmpty() {
		JFontChooser jFontChooser = new JFontChooser();
		JDialog dialog = jFontChooser.createDialog(new JButton(), "", true, null, null);
		assertNotNull(dialog);
	}
	
	/**
	* Test case for the {@link JFontChooser#createDialog(Component, String, boolean, ActionListener, ActionListener)} method.
	* It tests the case when the title is not empty.
	*/
	@Test
	void testCreateDialog_TitleIsNotEmpty() {
		JFontChooser jFontChooser = new JFontChooser();
		JDialog dialog = jFontChooser.createDialog(new JButton(), "Test", true, null, null);
		assertNotNull(dialog);
	}
	
	/**
	* Test case for the {@link JFontChooser#createDialog(Component, String, boolean, ActionListener, ActionListener)} method.
	* It tests the case when the okListener is null.
	*/
	@Test
	void testCreateDialog_OkListenerIsNull() {
		JFontChooser jFontChooser = new JFontChooser();
		JDialog dialog = jFontChooser.createDialog(new JButton(), "Test", true, null, null);
		assertNotNull(dialog);
	}
	
	/**
	* Test case for the {@link JFontChooser#createDialog(Component, String, boolean, ActionListener, ActionListener)} method.
	* It tests the case when the okListener is not null.
	*/
	@Test
	void testCreateDialog_OkListenerIsNotNull() {
		JFontChooser jFontChooser = new JFontChooser();
		JDialog dialog = jFontChooser.createDialog(new JButton(), "Test", true, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			}
		}, null);
		assertNotNull(dialog);
	}
	
	/**
	* Test case for the {@link JFontChooser#createDialog(Component, String, boolean, ActionListener, ActionListener)} method.
	* It tests the case when the cancelListener is null.
	*/
	@Test
	void testCreateDialog_CancelListenerIsNull() {
		JFontChooser jFontChooser = new JFontChooser();
		JDialog dialog = jFontChooser.createDialog(new JButton(), "Test", true, null, null);
		assertNotNull(dialog);
	}
	
	/**
	* Test case for the {@link JFontChooser#createDialog(Component, String, boolean, ActionListener, ActionListener)} method.
	* It tests the case when the cancelListener is not null.
	*/
	@Test
	void testCreateDialog_CancelListenerIsNotNull() {
		JFontChooser jFontChooser = new JFontChooser();
		JDialog dialog = jFontChooser.createDialog(new JButton(), "Test", true, null, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			}
		});
		assertNotNull(dialog);
	}
	
	/**
	* Test case for the {@link JFontChooser#createDialog(Component, String, boolean, ActionListener, ActionListener)} method.
	* It tests the case when the component, title, okListener and cancelListener are not null.
	*/
	@Test
	void testCreateDialog_ComponentTitleOkListenerCancelListenerAreNotNull() {
		JFontChooser jFontChooser = new JFontChooser();
		JDialog dialog = jFontChooser.createDialog(new JButton(), "Test", true, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			}
		}, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			}
		});
		assertNotNull(dialog);
	}
}

// FontChooserDialog.java
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
 * <code>FontChooserDialog</code> provides a dialog window for choosing a font.
 *
 * @author Adrian BER
 */
class FontChooserDialog extends JDialog {

    private static final long serialVersionUID = 1L;
    private static final String uiClassID = "FontChooserDialogUI";
    private static final String CANCEL_ACTION_KEY = "cancel-key";
    private static final String OK_ACTION_KEY = "ok-key";
    private static final String CLOSE_ACTION_KEY = "close-key";
    private static final String CANCEL_ACTION_NAME = "cancel-action";
    private static final String OK_ACTION_NAME = "ok-action";
    private static final String CLOSE_ACTION_NAME = "close-action";
    private static final String CANCEL_COMMAND = "cancel-command";
    private static final String OK_COMMAND = "ok-command";
    private static final String CLOSE_COMMAND = "close-command";
    private static final String DEFAULT_CANCEL_BUTTON_TEXT = "Cancel";
    private static final String DEFAULT_OK_BUTTON_TEXT = "OK";
    private static final String DEFAULT_CLOSE_BUTTON_TEXT = "Close";
    private static final String DEFAULT_CANCEL_BUTTON_MNEMONIC = "C";
    private static final String DEFAULT_OK_BUTTON_MNEMONIC = "O";
    private static final String DEFAULT_CLOSE_BUTTON_MNEMONIC = "C";
    private static final String DEFAULT_CANCEL_BUTTON_ACTION_COMMAND = "cancel";
    private static final String DEFAULT_OK_BUTTON_ACTION_COMMAND = "ok";
    private static final String DEFAULT_CLOSE_BUTTON_ACTION_COMMAND = "close";
    private static final String DEFAULT_TITLE = "Font Chooser";
    private static final String DEFAULT_FONT_NAME = "Dialog";
    private static final int DEFAULT_FONT_STYLE = Font.PLAIN;
    private static final int DEFAULT_FONT_SIZE = 12;
    private static final int DEFAULT_FONT_SIZE_MIN = 6;
    private static final int DEFAULT_FONT_SIZE_MAX = 72;
    private static final int DEFAULT_FONT_SIZE_STEP = 1;
    private static final int DEFAULT_FONT_SIZE_VISIBLE_ROW_COUNT = 8;
    private static final int DEFAULT_FONT_SIZE_COLUMN_COUNT = 4;
    private static final int DEFAULT_FONT_SIZE_ROW_COUNT = 4;
    private static final int DEFAULT_FONT_SIZE_WIDTH = 50;
    private static final int DEFAULT_FONT_SIZE_HEIGHT = 20;
    private static final int DEFAULT_FONT_SIZE_GAP = 5;
    private static final int DEFAULT_FONT_SIZE_GAP_WIDTH = 5;
    private static final int DEFAULT_FONT_SIZE_GAP_HEIGHT = 5;
    private static final int DEFAULT_FONT_SIZE_GAP_X = 5;
    private static final int DEFAULT_FONT_SIZE_GAP_Y = 5;
    private static final int DEFAULT_FONT_SIZE_GAP_X_WIDTH = 5;
    private static final int DEFAULT_FONT_SIZE_GAP_Y_HEIGHT = 5;
    private static final int DEFAULT_FONT_SIZE_GAP_X_WIDTH_HEIGHT = 5;
    private static final int DEFAULT_FONT_SIZE_GAP_X_HEIGHT = 5;
    private static final int DEFAULT_FONT_SIZE_GAP_Y_WIDTH = 5;
    private static final int DEFAULT_FONT_SIZE_GAP_X_Y = 5;
    private static final int DEFAULT_FONT_SIZE_GAP_X_Y_WIDTH = 5;
    private static final int DEFAULT_FONT_SIZE_GAP_X_Y_HEIGHT = 5;
    private static final int DEFAULT_FONT_SIZE_GAP_X_Y_WIDTH_HEIGHT = 5;
    private static final int DEFAULT_FONT_SIZE_GAP_X_Y_HEIGHT_WIDTH = 5;
    private static final int DEFAULT_FONT_SIZE_GAP_X_Y_WIDTH_HEIGHT_HEIGHT = 5;
    private static final int DEFAULT_FONT_SIZE_GAP_X_Y_WIDTH_HEIGHT_WIDTH = 5;
    private static final int DEFAULT_FONT_SIZE_GAP_X_Y_WIDTH_HEIGHT_WIDTH_HEIGHT = 5;
    private static final int DEFAULT_FONT_SIZE_GAP_X_Y_WIDTH_HEIGHT_WIDTH_HEIGHT_HEIGHT = 5;
    private static final int DEFAULT_FONT_SIZE_GAP_X_Y_WIDTH_HEIGHT_WIDTH_HEIGHT_WIDTH = 5;
    private static final int DEFAULT_FONT_SIZE_GAP_X_Y_WIDTH_HEIGHT_WIDTH_HEIGHT_WIDTH_HEIGHT = 5;
    private static final int DEFAULT_FONT_SIZE_GAP_X_Y_WIDTH_HEIGHT_WIDTH_HEIGHT_WIDTH_HEIGHT_HEIGHT = 5;
    private static final int DEFAULT_FONT_SIZE_GAP_X_Y_WIDTH_HEIGHT_WIDTH_HEIGHT_WIDTH_HEIGHT_WIDTH = 5;
    private static final int DEFAULT_FONT_SIZE_GAP_X_Y_WIDTH_HEIGHT_WIDTH_HEIGHT_WIDTH_HEIGHT_WIDTH_HEIGHT = 5;
    private static final int DEFAULT_FONT_SIZE_GAP_X_Y_WIDTH_HEIGHT_WIDTH_HEIGHT_WIDTH_HEIGHT_WIDTH_HEIGHT_HEIGHT = 5;
    private static final int DEFAULT_FONT_SIZE_GAP_X_Y_WIDTH_HEIGHT_WIDTH_HEIGHT_WIDTH_HEIGHT_WIDTH_HEIGHT_WIDTH = 5;
    private static final int DEFAULT_FONT_SIZE_GAP_X_Y_WIDTH_HEIGHT_WIDTH_HEIGHT_WIDTH_HEIGHT_WIDTH_HEIGHT_WIDTH_HEIGHT = 5;
    private static final int DEFAULT_FONT_SIZE_GAP_X_Y_WIDTH_HEIGHT_WIDTH_HEIGHT_WIDTH_HEIGHT_WIDTH_HEIGHT_WIDTH_HEIGHT_HEIGHT = 5;
    private static final int DEFAULT_FONT_SIZE_GAP_X_Y_WIDTH_HEIGHT_WIDTH_HEIGHT_WIDTH_HEIGHT_WIDTH_HEIGHT_WIDTH_HEIGHT_WIDTH = 5;
    private static final int DEFAULT_FONT_SIZE_GAP_X_Y_WIDTH_HEIGHT_WIDTH_HEIGHT_WIDTH_HEIGHT_WIDTH_HEIGHT_WIDTH_HEIGHT_WIDTH_HEIGHT = 5;
    private static final int DEFAULT_FONT_SIZE_GAP_X_Y_WIDTH_HEIGHT_WIDTH_HEIGHT_WIDTH_HEIGHT_WIDTH_HEIGHT_WIDTH_HEIGHT_WIDTH_HEIGHT_HEIGHT = 5;
    private static final int DEFAULT_FONT_SIZE_GAP_X_Y_WIDTH_HEIGHT_WIDTH_HEIGHT_WIDTH_HEIGHT_WIDTH_HEIGHT_WIDTH_HEIGHT_WIDTH_HEIGHT_WIDTH = 5;
    private static final int DEFAULT_FONT_SIZE_GAP_X_Y_WIDTH_HEIGHT_WIDTH_HEIGHT_WIDTH_HEIGHT_WIDTH_HEIGHT_WIDTH_HEIGHT_WIDTH_HEIGHT_WIDTH_HEIGHT = 5;
    private static final int DEFAULT_FONT_SIZE_GAP_X_Y_WIDTH_HEIGHT_WIDTH_HEIGHT_WIDTH_HEIGHT_WIDTH_HEIGHT_WIDTH_HEIGHT_WIDTH_HEIGHT_WIDTH_HEIGHT_HEIGHT = 5;
    private static final int DEFAULT_FONT_SIZE_GAP_X_Y_WIDTH_HEIGHT_WIDTH_HEIGHT_WIDTH_HEIGHT_WIDTH_HEIGHT_WIDTH_HEIGHT_WIDTH_HEIGHT_WIDTH_HEIGHT_WIDTH = 5;
    private static final int DEFAULT_FONT_SIZE_GAP_X_Y_WIDTH_HE