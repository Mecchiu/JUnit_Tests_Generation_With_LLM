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
	void testShowDialog_ComponentIsNull() {
		JFontChooser jFontChooser = new JFontChooser();
		Font font = jFontChooser.showDialog(null, "Test");
		assertNull(font);
	}
	
	/**
	* Test case for the {@link JFontChooser#showDialog(Component, String)} method.
	* It tests the case when the title is null.
	*/
	@Test
	void testShowDialog_TitleIsNull() {
		JFontChooser jFontChooser = new JFontChooser();
		Font font = jFontChooser.showDialog(new JButton(), null);
		assertNull(font);
	}
	
	/**
	* Test case for the {@link JFontChooser#showDialog(Component, String)} method.
	* It tests the case when the title is empty.
	*/
	@Test
	void testShowDialog_TitleIsEmpty() {
		JFontChooser jFontChooser = new JFontChooser();
		Font font = jFontChooser.showDialog(new JButton(), "");
		assertNull(font);
	}
	
	/**
	* Test case for the {@link JFontChooser#showDialog(Component, String)} method.
	* It tests the case when the title is blank.
	*/
	@Test
	void testShowDialog_TitleIsBlank() {
		JFontChooser jFontChooser = new JFontChooser();
		Font font = jFontChooser.showDialog(new JButton(), " ");
		assertNull(font);
	}
	
	/**
	* Test case for the {@link JFontChooser#showDialog(Component, String)} method.
	* It tests the case when the title is valid.
	*/
	@Test
	void testShowDialog_TitleIsValid() {
		JFontChooser jFontChooser = new JFontChooser();
		Font font = jFontChooser.showDialog(new JButton(), "Test");
		assertNotNull(font);
	}
	
	/**
	* Test case for the {@link JFontChooser#showDialog(Component, String)} method.
	* It tests the case when the component is valid and the title is null.
	*/
	@Test
	void testShowDialog_ComponentIsValid_TitleIsNull() {
		JFontChooser jFontChooser = new JFontChooser();
		Font font = jFontChooser.showDialog(new JButton(), null);
		assertNull(font);
	}
	
	/**
	* Test case for the {@link JFontChooser#showDialog(Component, String)} method.
	* It tests the case when the component is valid and the title is empty.
	*/
	@Test
	void testShowDialog_ComponentIsValid_TitleIsEmpty() {
		JFontChooser jFontChooser = new JFontChooser();
		Font font = jFontChooser.showDialog(new JButton(), "");
		assertNull(font);
	}
	
	/**
	* Test case for the {@link JFontChooser#showDialog(Component, String)} method.
	* It tests the case when the component is valid and the title is blank.
	*/
	@Test
	void testShowDialog_ComponentIsValid_TitleIsBlank() {
		JFontChooser jFontChooser = new JFontChooser();
		Font font = jFontChooser.showDialog(new JButton(), " ");
		assertNull(font);
	}
	
	/**
	* Test case for the {@link JFontChooser#showDialog(Component, String)} method.
	* It tests the case when the component is valid and the title is valid.
	*/
	@Test
	void testShowDialog_ComponentIsValid_TitleIsValid() {
		JFontChooser jFontChooser = new JFontChooser();
		Font font = jFontChooser.showDialog(new JButton(), "Test");
		assertNotNull(font);
	}
}

// FontChooserDialog.java
package osa.ora.server.client.ui.utils;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.Serializable;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JRootPane;
import javax.swing.KeyStroke;

/**
 * A class that displays a font chooser dialog.
 *
 * @author Adrian BER
 */
class FontChooserDialog extends JDialog {

    /**
     * The font chooser that is contained in this dialog.
     */
    private JFontChooser chooserPane;

    /**
     * The string that is shown in the approve button.
     */
    private String approveButtonText;

    /**
     * The string that is shown in the cancel button.
     */
    private String cancelButtonText;

    /**
     * The <code>Locale</code> that is used for locating the strings.
     */
    private java.util.Locale locale;

    /**
     * The value that is returned if the approve button is pressed.
     */
    private int returnValue = ERROR_OPTION;

    /**
     * Return value from class method if cancel is chosen.
     */
    public static final int CANCEL_OPTION = 1;

    /**
     * Return value if approve (yes, ok) is chosen.
     */
    public static final int APPROVE_OPTION = 0;

    /**
     * Return value if an error occured.
     */
    public static final int ERROR_OPTION = -1;

    /**
     * Creates a new instance of <code>FontChooserDialog</code>.
     *
     * @param parent the parent frame
     * @param title the title of the dialog
     * @param modal true for a modal dialog, false for one that allows
     *              others windows to be active at the same time
     * @param chooserPane the font chooser that is contained in this dialog
     * @param approveListener the listener that is notified when the user
     *                        presses the approve button
     * @param cancelListener the listener that is notified when the user
     *                        presses the cancel button
     * @throws HeadlessException if GraphicsEnvironment.isHeadless() returns true.
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
    public FontChooserDialog(Frame parent, String title, boolean modal,
            JFontChooser chooserPane, ActionListener approveListener,
            ActionListener cancelListener) throws HeadlessException {
        super(parent, title, modal);
        this.chooserPane = chooserPane;
        init(approveListener, cancelListener);
    }

    /**
     * Creates a new instance of <code>FontChooserDialog</code>.
     *
     * @param parent the parent dialog
     * @param title the title of the dialog
     * @param modal true for a modal dialog, false for one that allows
     *              others windows to be active at the same time
     * @param chooserPane the font chooser that is contained in this dialog
     * @param approveListener the listener that is notified when the user
     *                        presses the approve button
     * @param cancelListener the listener that is notified when the user