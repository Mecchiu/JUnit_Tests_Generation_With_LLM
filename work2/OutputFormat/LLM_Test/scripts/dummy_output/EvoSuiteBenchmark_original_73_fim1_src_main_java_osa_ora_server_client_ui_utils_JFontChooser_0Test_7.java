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
		//
		// Private variables
		//
    private Window w;
    private Container c;

    //
    // Public (naked)
    //
 
    /**
 	Test method for
 	{@link java.awt.JFontChooser#showDialog(java.awt.Component,java.lang.String)}.
 
     * @throws java.awt.HeadlessException
     * @throws ClassNotFoundException
 	 * @throws NoSuchFieldException
 	 * @throws IllegalAccessException
 	 * @throws InvocationTargetException
 	 * @throws SecurityException
 	*/
 	@Test
    public void test_JFontChooser_0_1() throws NoSuchFieldException, SecurityException, IllegalAccessException, NoSuchFieldException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException, HeadlessException{
 		//
 		// Set up test environment
 		System.setProperty("useSystemFontSettings", "true");

 		//
 		// Install the font changes listener on the dialog
 		w.addComponentListener(new ComponentAdapter() {
 			public void componentShown(ComponentEvent e) {
 				TestEventListener listener;
 				ActionMap actionMap;
 				InputMap inputMap;
 				Action action = (Action) e.getAction();
 				Class<?> cls;
 				Object name;
 				action = e.getNewValue();
					cls = action.getClass();
					name = action.getValue(action);
					System.out.println(cls + " : " + name);
 				actionMap = getActionMap(cls);

 				listener = (TestEventListener) actionMap.get("TestComponentListener");
 					
 				assertNotNull(listener);
// 					testAction (e,  "TestComponentListener", (String)listener.getTestArg(0));
 			}
 		}); 

     		//
     		// Set up test environment
     		System.setProperty("useSystemFontSettings", "false");
     		w = new Window();
     		c = new Container();
}
}