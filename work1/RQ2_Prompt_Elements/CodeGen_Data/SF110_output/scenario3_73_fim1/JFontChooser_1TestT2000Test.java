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
private static String font = "Courier New";
		private static String font_name_from
            = "Font Name";
		private static String font_size_from
            = "Font Font Size";
		private static final Font fontDefault = new Font(Font.DIALOG, Font.PLAIN, 10);
		private Class c = JFontChooser_1Test.class;
		private JComponent component = new JPanel();
		private Container container = new Container();
		private JDialog chooser;
		private JCheckBox fontB;
		private JCheckBox fontS;
		private JCheckBox fontD;
		private JLabel fontL;
		private JTextField fontN;
		private JTextField fontM;
		private JTextField fontDot;
		private JTextField fontSdot;
		private InputMap imm;

		@Test
		public void testFontButton() {
			JFontChooser_1Test.JFontChooser c1 = new JFontChooser_1Test.JFontChooser();
			c1.setFont(font);
			assertEquals(font,c1.getFont());
		}

		@Test
		public void testGetFont_withNullName() {
			assertEquals(c.getFont("Font Name"),c.getComponent("Font Name"));
			assertEquals(c.getComponent("Font Name"),c.getFont("null"));
			c.remove(c.getComponent("Font Name"));
			assertEquals(c.getFont("Font Name"),c.getComponent("null"));
		}

		@Test
		public void testGetFont() {
			fontB = new JCheckBox("Font Bold");
			fontB.addActionListener(getBoldAction("Font Bold"));
			c.put("font",fontB);
			JFontChooser_1Test.JFontChooser c2 = new JFontChooser_1Test.JFontChooser();
			c2.setFont(font);
			assertEquals