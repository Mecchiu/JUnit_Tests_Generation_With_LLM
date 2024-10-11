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
     * The <code>ActionListener</code> invoked when the user presses
     * the Approve button.
     */
    private ActionListener approveListener;

    /**
     * The <code>ActionListener</code> invoked when the user presses
     * the Cancel button.
     */
    private ActionListener cancelListener;

    /**
     * The <code>Action</code> used for the Approve button.
     */
    private Action approveAction;

    /**
     * The <code>Action</code> used for the Cancel button.
     */
    private Action cancelAction;

    /**
     * The <code>Action</code> used for the Help button.
     */
    private Action helpAction;

    /**
     * The <code>JRootPane</code> provided by the <code>createRootPane</code>
     * method.
     */
    private JRootPane rootPane;

    /**
     * The <code>PropertyChangeListener</code> that listens for changes
     * in the current font.
     */
    private PropertyChangeListener propertyChangeListener;

    /**
     * Returns a new instance of <code>FontChooserDialog</code>
     * that displays the specified <code>JFontChooser</code>.
     *
     * @param chooserPane the <code>JFontChooser</code> to be displayed
     * @exception HeadlessException if GraphicsEnvironment.isHeadless()
     * returns true.
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
    public FontChooserDialog(JFontChooser chooserPane)
            throws HeadlessException {
        this((Frame) null, chooserPane);
    }

    /**
     * Returns a new instance of <code>FontChooserDialog</code>
     * that displays the specified <code>JFontChooser</code>
     * and is owned by the specified <code>Frame</code>.
     *
     * @param owner the <code>Frame</code> from which the dialog is displayed
     * @param chooserPane the <code>JFontChooser</code> to be displayed
     * @exception HeadlessException if GraphicsEnvironment.isHeadless()
     * returns true.
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
    public FontChooserDialog(Frame owner, JFontChooser chooserPane)
            throws HeadlessException {
        super(owner);
        this.chooserPane = chooserPane;
        init(owner);
    }

    /**
     * Returns a new instance of <code>FontChooserDialog</code>
     * that displays the specified <code>JFontChooser</code>
     * and is owned by the specified <code>Dialog</code>.
     *
     * @param owner the <code>Dialog</code> from which the dialog is displayed
     * @param chooserPane the <code>JFontChooser</code> to be displayed
     * @exception HeadlessException if GraphicsEnvironment.isHeadless()
     * returns true.
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
    public FontChooserDialog(Dialog owner, JFontChooser chooserPane)
            throws HeadlessException {
        super(owner);
        this.chooserPane = chooserPane;
        init(owner);
    }

    /**
     * Returns a new instance of <code>FontChooserDialog</code>
     * that displays the specified <code>JFontChooser</code>
     * and is owned by the specified <code>Frame</code>.
     *
     * @param owner the <code>Frame</code> from which the dialog is displayed
     * @param title the title of the dialog
     * @param chooserPane the <code>JFontChooser</code> to be displayed
     * @exception HeadlessException if GraphicsEnvironment.isHeadless()
     * returns true.
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
    public FontChooserDialog(Frame owner, String title, JFontChooser chooserPane)
            throws HeadlessException {
        super(owner, title);
        this.chooserPane = chooserPane;
        init(owner);
    }

    /**
     * Returns a new instance of <code>FontChooserDialog</code>
     * that displays the specified <code>JFontChooser</code>
     * and is owned by the specified <code>Dialog</code>.
     *
     * @param owner the <code>Dialog</code> from which the dialog is displayed
     * @param title the title of the dialog
     * @param chooserPane the <code>JFontChooser</code> to be displayed
     * @exception HeadlessException if GraphicsEnvironment.isHeadless()
     * returns true.
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
    public FontChooserDialog(Dialog owner, String title, JFontChooser chooserPane)
            throws HeadlessException {
        super(owner, title);
        this.chooserPane = chooserPane;
        init(owner);
    }

    /**
     * Returns a new instance of <code>FontChooserDialog</code>
     * that displays the specified <code>JFontChooser</code>
     * and is owned by the specified <code>Frame</code>.
     *
     * @param owner the <code>Frame</code> from which the dialog is displayed
     * @param title the title of the dialog
     * @param modal specifies whether dialog blocks user input to other top-level
     * windows when shown. If <code>true</code>, the modality type property is set to
     * <code>DEFAULT_MODALITY_TYPE</code>, otherwise the dialog is modeless.
     * @param chooserPane the <code>JFontChooser</code> to be displayed
     * @exception HeadlessException if GraphicsEnvironment.isHeadless()
     * returns true.
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
    public FontChooserDialog(Frame owner, String title, boolean modal, JFontChooser chooserPane)
            throws HeadlessException {
        super(owner, title, modal);
        this.chooserPane = chooserPane;
        init(owner);
    }

    /**
     * Returns a new instance of <code>FontChooserDialog</code>
     * that displays the specified <code>JFontChooser</code>
     * and is owned by the specified <code>Dialog</code>.
     *
     * @param owner the <code>Dialog</code> from which the dialog is displayed
     * @param title the title of the dialog
     * @param modal specifies whether dialog blocks user input to other top-level
     * windows when shown. If <code>true</code>, the modality type property is set to
     * <code>DEFAULT_MODALITY_TYPE</code>, otherwise the dialog is modeless.
     * @param chooserPane the <code>JFontChooser</code> to be displayed
     * @exception HeadlessException if GraphicsEnvironment.isHeadless()
     * returns true.
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
    public FontChooserDialog(Dialog owner, String title, boolean modal, JFontChooser chooserPane)
            throws HeadlessException {
        super(owner, title, modal);
        this.chooserPane = chooserPane;
        init(owner);
    }

    /**
     * Returns a new instance of <code>FontChooserDialog</code>
     * that displays the specified <code>JFontChooser</code>
     * and is owned by the specified <code>Frame</code>.
     *
     * @param owner the <code>Frame</code> from which the dialog is displayed
     * @param title the title of the dialog
     * @param modal specifies whether dialog blocks user input to other top-level
     * windows when shown. If <code>true</code>, the modality type property is set to
     * <code>DEFAULT_MODALITY_TYPE</code>, otherwise the dialog is modeless.
     * @param gc the <code>GraphicsConfiguration</code> of the target screen device.
     * If <code>gc</code> is <code>null</code>, the same
     * <code>GraphicsConfiguration</code> as the owning Frame is used.
     * @param chooserPane the <code>JFontChooser</code> to be displayed
     * @exception HeadlessException if GraphicsEnvironment.isHeadless()
     * returns true.
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
    public FontChooserDialog(Frame owner, String title, boolean modal, GraphicsConfiguration gc, JFontChooser chooserPane)
            throws HeadlessException {
        super(owner, title, modal, gc);
        this.chooserPane = chooserPane;
        init(owner);
    }

    /**
     * Returns a new instance of <code>FontChooserDialog</code>
     * that displays the specified <code>JFontChooser</code>
     * and is owned by the specified <code>Dialog</code>.
     *
     * @param owner the <code>Dialog</code> from which the dialog is displayed
     * @param title the title of the dialog
     * @param modal specifies whether dialog blocks user input to other top-level
     * windows when shown. If <code>true</code>, the modality type property is set to
     * <code>DEFAULT_MODALITY_TYPE</code>, otherwise the dialog is modeless.
     * @param gc the <code>GraphicsConfiguration</code> of the target screen device.
     * If <code>gc</code> is <code>null</code>, the same
     * <code>GraphicsConfiguration</code> as the owning Frame is used.
     * @param chooserPane the <code>JFontChooser</code> to be displayed
     * @exception HeadlessException if GraphicsEnvironment.isHeadless()
     * returns true.
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
    public FontChooserDialog(Dialog owner, String title, boolean modal, GraphicsConfiguration gc, JFontChooser chooserPane)
            throws HeadlessException {
        super(owner, title, modal, gc);
        this.chooserPane = chooserPane;
        init(owner);
    }

    /**
     * Initializes the dialog.
     *
     * @param owner the owner of the dialog
     */
    private void init(Component owner) {
        setComponentOrientation(chooserPane.getComponentOrientation());
        setRes