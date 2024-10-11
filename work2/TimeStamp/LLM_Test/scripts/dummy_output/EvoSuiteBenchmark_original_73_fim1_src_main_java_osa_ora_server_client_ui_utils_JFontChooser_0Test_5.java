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
		
	static final String fontProperties = "My font.";
		
	JFontChooser(Window owner) {
		this.owner = owner;
	}
				
	/**
	 * Ensures that the dialog is shown only with the default selection font.
	 */
	@Test
	void canShowAllFonts() {	
		
//		final String fontName =  Font.createFont( Font.TRUETYPE_FONT, null ).getName();

		
//		final JFontChooser fontChooser = new JFontChooser( null, null, "Default" );
//
//		final JCheckBox cb = new JCheckBox();
//		cb.addActionListener(new ActionListener() {
//			public void actionPerformed( ActionEvent e ) {
//				// We'll get a KeyEvent to indicate the selection was changed by us.
//				KeyStroke ks = JCheckBox.getKeyStrokeForEvent( e );
//
//				// Get the new font from the action listener, setting fontName and cb's current
//				// Font to that same font.
//
//				Font defaultFont = getFrame().getFont();
//				setFrameFont( Font.createFont( defaultFont, fontProperties ) );
//				Font resultFont = new Font( fontName );
//				setFrameFont( resultFont );
//				cb.setSelected( true );
//
//				// We can do nothing now that we have a font
//
//				// Set the component's own font so we can switch back.
//
//				Component component = e.getComponent();
//				component.setFont( defaultFont );
//			}
//		} );

//		fontChooser.showDialog( null, null );
//		assertNotNull( fontChooser.getFont() );
//		assertEquals( fontName, fontChooser.getFont().getName() );
	}
				
	/**
	 * Ensures that the dialog is shown with at least one font selected.
	 */
	@Test
	void canShowSpecificFonts() {	
		
//		final String fontName =  Font.createFont( Font.TRUETYPE_FONT, null ).getName();
		
		final JFontChooser fontChooser = new JFontChooser( null, null, "Some font." );
		
		final JCheckBox cb = new JCheckBox();
}
}