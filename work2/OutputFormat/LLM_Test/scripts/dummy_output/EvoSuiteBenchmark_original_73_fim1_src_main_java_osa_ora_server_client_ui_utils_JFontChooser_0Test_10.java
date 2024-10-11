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
		public static void assertEquals(String str, Font f, Font newf) {
			assertEquals(str, f);
			assertEquals(newf == null? null : f.getName(), newf.getName());
		}
		public static void assertArrayEquals(String str, Font[] f, Font[] newf) {
			if (f.length!= newf.length)
				throw new AssertionFailedError(
						String.format("Inconsistent Font array length: %d!= %d",
							f.length, newf.length));
			for (int i = 0; i < f.length; ++i) {
				assertEquals(f[i], newf[i]);
			}
		}


    @Test
    public void testShowDialog() {
		Font font = showDialog(null, null);
		assertEquals(font.getName(), "Test");
	}


    public static void testShowDialog(Font f, Font newf) {
		final Window testArea = JOptionPane.showInternalFrame(null,
				JOptionPane.UNINITIALIZED_VALUE,
				null,
				null,
				new JLabel("Label #1"),
				JFrame.CENTER_ALIGNMENT
				);
		try {
			showDialog(testArea, null);
			JButton ok = (JButton)testArea.getComponentAt(testArea.getHeight() / 3);
			assertEquals(String.format("Should show dialog '%s'", "Ok"),
					ok.getText(), "Foo Bar");
		}  catch (HeadlessException he) {
    		// Nothing to test here.
		} catch (java.awt.AWTException awt) {
    		fail("Shouldn't happen", awt);
		}
	}


	@Test
	public void testFindWindow() {
		final Window test = JOptionPane.showInternalFrame(null,
				JOptionPane.UNINITALIZED_VALUE,
				null,
				null,
				new JLabel("Bar"),
				JFrame.CENTER_ALIGNMENT
				);
		assertNotNull("Should find a window", test);
	}


    @Test
    public void testCreateJPanel(){
		JPanel control = JOptionPane.createJPanel();
		assertNotNull("Should create a empty JPanel instance", control);
	}
}