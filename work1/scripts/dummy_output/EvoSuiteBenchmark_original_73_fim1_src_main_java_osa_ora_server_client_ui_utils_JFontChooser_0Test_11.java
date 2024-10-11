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
		* Tests that the JFontChooser and its container do not crash within a
		* static method.
		*/
    @Test
    public void testContainsContainer() {
		    Container dialog = new JDialog(new JFrame(), "Test for containsContainer method");
		    dialog.addContainerListener(new Test_1());

		    Object object = dialog.getClass().newInstance();

		    assertFalse(object.getClass().getEnclosingMethod().getDeclaringClass().isInstance(dialog));
		}

		/**
		* Regression test for bug 18674782.
		*/
    @Test
    public void testWindowCloseAction() {
    	JFontChooser jFontChooser = new JFontChooser();
    	JButton button = jFontChooser.getParent();
    	ButtonModel model = button.getModel();
    	if (model!= null) {
    		model.fireAction();
    	}
    	ButtonModel newModel = jFontChooser.getParent().getModel();
    	if (newModel == null) {
    		return;
    	}

    	if ((newModel.isPressed())!= model.isPressed()) {
    		return;
			}
    	newModel.setSelected(true);
		     Container newContainer = new JWindow(new JFrame()).addWindowListener(new Test_0());
		     ActionModel newAction = jFontChooser.getParent().getParent().getActionMap().get("chooserCloseAction");
		     newAction.setDefaultAction(jFontChooser.getParent().getActionListeners().remove(new ActionAdapter() {
		    	public void actionPerformed(ActionEvent e) {
		    		newContainer.dispatchEvent(new ContainerEvent(ContainerEvent.COMMAND_EVENT_ON_CLOSE, e));
		    	}
		    }));
		     newContainer.setSize(100,100);
    }
		
		/**
		* Regression test for bug 192379
		*/
    @Test
    public void testComponentsAddedWhenInModal() {
    	Container dialog = new JDialog(new JFrame(), "Test for componentsAddedWhenInModal method");
    	dialog.addContainerListener(new JComponentAdapter()); 

		  JFontChooser jFontChooser1 = new JFontChooser();
	      JWindow dialog1 = jFontChooser1.getParent();
}
}