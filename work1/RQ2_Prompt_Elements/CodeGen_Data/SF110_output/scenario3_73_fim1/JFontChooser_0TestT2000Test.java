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
     * Test method for
     * {@link osa.ora.server.client.ui.util.JFontChooser#showDialog(java.awt.Component, java.lang.String)}.
     * <p>
     * Accuracy: all inputs are checked for validity using default values for
     * the supported font families:
     * {@link java.awt.Font#MONOSPACE font.MONOSPACE}, {@link java.awt.Font#TIMES-BOLD font.TIMES-BOLD}, 
     * {@link java.awt.Font#TIMES-ROMAN font.TIMES-ROMAN}.
     */
    @Test
    public void test_showDialog_String() {
        final JFontChooser dlg = new JFontChooser();        
        final JButton cancelButton = new JButton("Cancel");
        final Action cancelAction = new AbstractAction("Cancel") {
            public void actionPerformed(final ActionEvent e) {
                JFontChooser_0Test.this.dialogNodeHidden();
            }
        };
        final Action okAction = new AbstractAction("OK") {
            public void actionPerformed(final ActionEvent e) {
                JFontChooser_0Test.this.dialogNodeHidden();
                JFontChooser_0Test.this.dialogNodeHidden();
            }
        };
        final JButton okButton = new JButton("OK");
        JButton actionButton = null;
        ActionListener listener = new ActionListener() {
            public void actionPerformed(final ActionEvent e) {
                actionButton.setEnabled("Cancel".equals(e.getActionCommand()));
            }
        };
        String[] fontFamily = {"Monospaced", "Wingdings", "Monotype_Ralcol", "Courier", "Times_Bold", 
                "Helvetica", "Arial", "Times_Roman"};        
        
        for (int i = 0; i < fontFamily.length; ++i) {
            for (int j = 0; j < 10; ++j) {
				dlg.add(okButton);
				dlg.add(cancelButton);
				dlg.add(okAction);
				dlg.add(cancelAction);
				dlg.add(okButton);
				JFontChooser_0Test.this.setFontFamily(fontFamily[i]);
