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
static final String TITLE            = "Misc.FontChooserTest.TestName_0";
		private final static String HELP_TEXT = 
"<html>\n" +
".<br>\n"
"A check box allows the user to select a font from the list of configured fonts.\n"
"<p>A button that allows the user to choose one font from the list of fonts has the following\n"
"behaviour:\n"
" <ul>\n"
"<li>The button's state changes if the list of fonts changes.\n"
"<li>The option's default value changes if the list of fonts changes.\n"
"</ul>\n"
"<p>One of the buttons can be selected by the user.\n"
"<p>See {@link JFontChooser_0Test.Button_0}</p>\n"
"</p>";
	
		private static class Button_0 extends JButton implements Serializable {

			private static final long serialVersionUID = 1L;
		
			private static final FontTracker ok = new ButtonTracker(this);
		
			private static final Container Pane = getPane(1);
	
			protected Button_0(Action action) {
				super(action);
				
				setHorizontalAlignment(SwingConstants.RIGHT);
				setIcon(0);
				putClientProperty("JButton.focusTraversable", true);
				putClientProperty("JButton.rolloverEnabled", true);
			}
		
			@Override
			public ActionListener getActionListener() {
				return new actionListener();
			}

			private class actionListener implements ActionListener {
				private static final long serialVersionUID = 1L;

				@Override
				public void actionPerformed(ActionEvent e) {
					Container pane = getPane(0);
					ActionMap map;
					ListSelectionModel sm = pane.getSelectionModel();
					int count;
					
					try {
						sm.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
						ActionMap newMap = (ActionMap) getClass().newInstance();
						ListSelectionModel newSm = new Sm();
						
						map = newMap;
						Action[] actions = map.getActions();
						for (int i = 0; i < actions.length; i++) {
							if (actions[i].getValue(Action.NAME) == "OK") {
								newSm.addSelectionInterval(i, i);
							}
						}
						count = sm.getSize();
						if (sm.getSize() == 0) {
							map.remove("OK");
						}
					} catch (Exception exc) {
						exc.printStackTrace();
					}
					
					// Change all button