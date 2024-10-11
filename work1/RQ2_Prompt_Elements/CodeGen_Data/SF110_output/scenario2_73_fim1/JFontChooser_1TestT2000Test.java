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
JFontChooser jc;
        private String fontProperty_1 = "MyFont1";
        private String fontProperty_2 = "MyFont2";

        /**
         * Set up the unit test environment
         */
        @Test
        public void createDialog_initializes() throws java.beans.PropertyVetoException {
          jc = new JFontChooser();
        }


        /**
         * Test that the JFontChooser Dialog is visible using a
         * default font, a JPanel with the current font, a JCheckBox for showing
         * a "Do not use default" setting and the "OK" button.
         * @throws java.beans.PropertyVetoException
         * @see java.util.prefs.BackingStoreException
         * @see org.xdi.ide.icons.font.FontChooserDialogDialog
         */
        @Test
		public void createDialog_showsCorrectFont_correctly() throws java.beans.PropertyVetoException {
//			String font = jc.getCurrentFontName();

			// JFontChooser only accepts JFonts, not other kinds of font
			assertTrue("bad current font: "+font+" "+java.text.AttributedCharacterIterator.class.getName());

			// Use a default font so checkboxes appear in proper state
			Font f = UIManager.getFont( "Dialog.font" );
			Font plain = Font.decode( f.getName() );
			System.out.println("Default font name: "+plain.toString());
			Font defaultFont = new Font( plain.getName(), defaultFontName, plain.getSize() );

			assertEquals("Bad current font: "+font+" "+((DefaultListFont) defaultFont).name(), defaultFont, jc.getCurrentFontName());

			// Set the Font to a font that doesn't allow default font (e.g., a Japanese text box)
			