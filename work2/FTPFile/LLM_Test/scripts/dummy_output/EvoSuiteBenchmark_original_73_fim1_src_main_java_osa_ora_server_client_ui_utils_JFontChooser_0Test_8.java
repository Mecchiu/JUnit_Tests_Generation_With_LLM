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
		 * Shows a modal font-chooser dialog and blocks until the
		 * dialog is hidden.  If the user presses the "OK" button, then
		 * this method hides/disposes the dialog and returns the selected color.
		 * If the user presses the "Cancel" button or closes the dialog without
		 * pressing "OK", then this method hides/disposes the dialog and returns
		 * <code>null</code>.
		 *
		 * @param component the parent <code>Component</code> for the dialog
		 * @param title the String containing the dialog's title
		 * @exception HeadlessException if GraphicsEnvironment.isHeadless()
		 * returns true.
		 * @see java.awt.GraphicsEnvironment#isHeadless
		 */
		@Test
		public void showDialogTest() throws HeadlessException {
			assertTrue("Headless", GraphicsEnvironment.isHeadless());
			if(GraphicsEnvironment.isHeadless()) {
				fail();
			}
			MainFrameFrame mainFrameFrame = null;
			MainFrameWindow mainFrameWindow = null;
			if (MainFrame.getMainFrame()!=null) {
				mainFrameFrame = MainFrame.getMainFrame();
				mainFrameWindow = mainFrameFrame.getMainFrameWindows().get(0);
			} else {
				throw new HeadlessException();
			}
			mainFrameFrame.removeWindowEventListener(mainFrameWindow);
			//JButton dialogButton = new JButton();
			Font font = new Font("SansSerif", Font.PLAIN, 12);
			final JCheckBox dialogOKButton = new JCheckBox("OK button in dialog");
			final JCheckBox dialogCancelButton = new JCheckBox("Cancel button in dialog");
			final JCheckBox dialogPasswordButton = new JCheckBox("Password button in dialog");
			final JButton cancelButton = new JButton("Cancel");

			ActionListener keyEventHandler = new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent kev) {
					dialogCancelButton.doClick();
				}
			};
}
}