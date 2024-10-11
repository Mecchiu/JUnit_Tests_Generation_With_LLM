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

	/** The component where the test dialog is placed. */
	private Container container;
	private MouseListenerContainer mcp;
	/** The text label which has been made visible at the top of the dialog */
	private javax.swing.JLabel fl;
	
	/**
	 * Provides the test dialog that gets set up by the test.
	 *
	 * @param modal Whether or not the dialog is modal.
	 * @param okListener The listener to be called when the OK button is
	 *	      clicked.
	 * @param cancelListener The listener to be called when the Cancel button is
	 *	      clicked.
	 * @param ok The action to be called.
	 * @param cancel The action to be called.
	 */
	void createDialog(boolean modal, ActionListener okListener, ActionListener cancelListener, Action ok, Action cancel) {
		ActionMap aMap = getContext().getActionMap(getClass());
		ActionMap aMap_1 = getContext().getActionMap(getClass());
		Action action = aMap;
		InputMap im = getContext().getInputMap(getClass());
		
		mcp = new MouseListenerContainer(modal);
		
		container = new JWindow();
		mcp.setContainer(container);
		
		/* Create the dialog  and return it. */
		JDialog dialog = new JFontChooser(mcp, modal);
		
		/* Return the current value of the dialog's button box. */
		Button bb = ((JList)dialog.getContentPane()).getSelectedValue();
		
		/* Set the title of the dialog as the parameter for the
		* default Action.
		*/
		JLabel label = new JLabel("Dialog");
		
		/* Select the first element contained in the list */
		JList list = (JList)factory.getComponent();
		
		/* Check that it is not the first one in the list. */
		assert!list.getModel().contains(list.getModel().get(0));
		/* Check that the list has an element inside. */
		assert list.getModel().get(0)!= null;
		
		/* Fill in the element referenced by the button. */
		JList.Element jel = list.convertIndexToModel(list.indexOf(bb));
		
		/* Select the element referenced by the button. */
		new ListSelectionListener(){
			JList list;
			
			public void valueChanged(ListSelectionEvent e) {
				list = (JList) e.widget;
				newListElement(jel);
			}
		}.install(list);
		
		/* Put a listener to update the label that shows the current font. */
		new ComponentAdapter(lcd);
		
		dialog.setLocationRelativeTo(getApp());
		dialog.setSize(400, 200);
		dialog.addWindowListener(getApp());
		container.add(new JScrollPane(dialog), BorderLayout.CENTER);
		dialog.setVisible(modal);