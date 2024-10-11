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
		private static final int MAX_ITEMS = 100;
		private static final int MAX_ITEM_SIZE = 30;
		private static final int ICON = 16;
		private static final int DEFAULT_FONT = 16;
		private static final int WIDTH = 250;
		private static final String TITLE = "Title";

		private static final JCheckBox CHECKBOX = new JCheckBox("CheckBox");
		private static final JList BUTTONS = new JList();
		private static final JPanel PANEL = new JPanel();
		private static final JButton BUTTON_OK = new JButton();
		private static final JButton BUTTON_CANCEL = new JButton();
		private static final JButton BUTTON_RESET_FONT = new JButton("Reset");

	// JOptionPane.
    private final Action defaultAction = new AbstractAction("Default Action") {
		    private static final long serialVersionUID = 1L;
		    public void actionPerformed(ActionEvent e) {
		    	doActionPerformed(e);
		    }
    	};
    private final Action okAction = new AbstractAction("Ok Action") {
        private static final long serialVersionUID = 1L;
        public void actionPerformed(ActionEvent e) {
        	doActionPerformed(e);
        }
    	};
    private final Action cancelAction = new AbstractAction("Cancel Action") {
        private static final long serialVersionUID = 1L;
        public void actionPerformed(ActionEvent e) {
        	doActionPerformed(e);
        }
    	};
    private final Action resetAction = new AbstractAction("Reset Action") {
        private static final long serialVersionUID = 1L;
        public void actionPerformed(ActionEvent e) {
        	doActionPerformed(e);
        }
    	};
    public static junit.framework.Test suite() {
    	return new JFontChooser_1Test();
    }

		private JDialog dialog;
}