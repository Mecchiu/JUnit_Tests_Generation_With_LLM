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
	* It tests the case when the {@code modal} parameter is {@code true}.
	*/
	@Test
	void testCreateDialog_TrueModal() {
		JFontChooser fontChooser = new JFontChooser();
		JDialog dialog = fontChooser.createDialog(null, "Test", true, null, null);
		assertNotNull(dialog);
	}
	
	/**
	* Test case for the {@link JFontChooser#createDialog(Component, String, boolean, ActionListener, ActionListener)} method.
	* It tests the case when the {@code modal} parameter is {@code false}.
	*/
	@Test
	void testCreateDialog_FalseModal() {
		JFontChooser fontChooser = new JFontChooser();
		JDialog dialog = fontChooser.createDialog(null, "Test", false, null, null);
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
	* It tests the case when all parameters are not {@code null}.
	*/
	@Test
	void testCreateDialog_NotNullParameters() {
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
 * <code>FontChooserDialog</code> is a dialog which allows the user to
 * select a font.
 *
 * @author Adrian BER
 */
class FontChooserDialog extends JDialog {

    /**
     * The font chooser.
     */
    private JFontChooser fontChooser;

    /**
     * The "OK" button.
     */
    private JButton okButton;

    /**
     * The "Cancel" button.
     */
    private JButton cancelButton;

    /**
     * The "Reset" button.
     */
    private JButton resetButton;

    /**
     * The "OK" action.
     */
    private Action okAction;

    /**
     * The "Cancel" action.
     */
    private Action cancelAction;

    /**
     * The "Reset" action.
     */
    private Action resetAction;

    /**
     * The "OK" action command.
     */
    private String okCommand = "OK";

    /**
     * The "Cancel" action command.
     */
    private String cancelCommand = "Cancel";

    /**
     * The "Reset" action command.
     */
    private String resetCommand = "Reset";

    /**
     * The "OK" action listener.
     */
    private ActionListener okListener;

    /**
     * The "Cancel" action listener.
     */
    private ActionListener cancelListener;

    /**
     * Creates a new <code>FontChooserDialog</code> instance.
     *
     * @param c the parent component for the dialog
     * @param title the title for the dialog
     * @param modal a boolean. When true, the remainder of the program
     *                       is inactive until the dialog is closed.
     * @param fontChooser the font chooser
     * @param okListener the ActionListener invoked when "OK" is pressed
     * @param cancelListener the ActionListener invoked when "Cancel" is pressed
     * @exception HeadlessException if GraphicsEnvironment.isHeadless()
     * returns true.
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
    public FontChooserDialog(Component c, String title, boolean modal, JFontChooser fontChooser, ActionListener okListener, ActionListener cancelListener) {
        super(JOptionPane.getFrameForComponent(c), title, modal);
        this.fontChooser = fontChooser;
        this.okListener = okListener;
        this.cancelListener = cancelListener;
        init();
    }

    /**
     * Initializes the dialog.
     */
    private void init() {
        setResizable(false);
        addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                cancelAction.actionPerformed(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, cancelCommand));
            }
        });
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        contentPane.add(fontChooser, BorderLayout.CENTER);
        contentPane.add(createButtonPanel(), BorderLayout.SOUTH);
        pack();
        setLocationRelativeTo(getOwner());
    }

    /**
     * Creates the button panel.
     *
     * @return the button panel
     */
    private JPanel createButtonPanel() {
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        okButton = new JButton(okAction = new OkAction());
        cancelButton = new JButton(cancelAction = new CancelAction());
        resetButton = new JButton(resetAction = new ResetAction());
        buttonPanel.add(okButton);
        buttonPanel.add(cancelButton);
        buttonPanel.add(resetButton);
        return buttonPanel;
    }

    /**
     * Returns the font chooser.
     *
     * @return the font chooser
     */
    public JFontChooser getFontChooser() {
        return fontChooser;
    }

    /**
     * Returns the "OK" button.
     *
     * @return the "OK" button
     */
    public JButton getOkButton() {
        return okButton;
    }

    /**
     * Returns the "Cancel" button.
     *
     * @return the "Cancel" button
     */
    public JButton getCancelButton() {
        return cancelButton;
    }

    /**
     * Returns the "Reset" button.
     *
     * @return the "Reset" button
     */
    public JButton getResetButton() {
        return resetButton;
    }

    /**
     * Returns the "OK" action.
     *
     * @return the "OK" action
     */
    public Action getOkAction() {
        return okAction;
    }

    /**
     * Returns the "Cancel" action.
     *
     * @return the "Cancel" action
     */
    public Action getCancelAction() {
        return cancelAction;
    }

    /**
     * Returns the "Reset" action.
     *
     * @return the "Reset" action
     */
    public Action getResetAction() {
        return resetAction;
    }

    /**
     * Returns the "OK" action command.
     *
     * @return the "OK" action command
     */
    public String getOkCommand() {
        return okCommand;
    }

    /**
     * Sets the "OK" action command.
     *
     * @param okCommand the "OK" action command
     */
    public void setOkCommand(String okCommand) {
        this.okCommand = okCommand;
    }

    /**
     * Returns the "Cancel" action command.
     *
     * @return the "Cancel" action command
     */
    public String getCancelCommand() {
        return cancelCommand;
    }

    /**
     * Sets the "Cancel" action command.
     *
     * @param cancelCommand the "Cancel" action command
     */
    public void setCancelCommand(String cancelCommand) {
        this.cancelCommand = cancelCommand;
    }

    /**
     * Returns the "Reset" action command.
     *
     * @return the "Reset" action command
     */
    public String getResetCommand() {
        return resetCommand;
    }

    /**
     * Sets the "Reset" action command.
     *
     * @param resetCommand the "Reset" action command
     */
    public void setResetCommand(String resetCommand) {
        this.resetCommand = resetCommand;
    }

    /**
     * Returns the "OK" action listener.
     *
     * @return the "OK" action listener
     */
    public ActionListener getOkListener() {
        return okListener;
    }

    /**
     * Sets the "OK" action listener.
     *
     * @param okListener the "OK" action listener
     */
    public void setOkListener(ActionListener okListener) {
        this.okListener = okListener;
    }

    /**
     * Returns the "Cancel" action listener.
     *
     * @return the "Cancel" action listener
     */
    public ActionListener getCancelListener() {
        return cancelListener;
    }

    /**
     * Sets the "Cancel" action listener.
     *
     * @param cancelListener the "Cancel" action listener
     */
    public void setCancelListener(ActionListener cancelListener) {
        this.cancelListener = cancelListener;
    }

    /**
     * The "OK" action.
     */
    private class OkAction extends AbstractAction {

        /**
         * Creates a new <code>OkAction</code> instance.
         */
        public OkAction() {
            super(okCommand);
            int mnemonic = UIMan