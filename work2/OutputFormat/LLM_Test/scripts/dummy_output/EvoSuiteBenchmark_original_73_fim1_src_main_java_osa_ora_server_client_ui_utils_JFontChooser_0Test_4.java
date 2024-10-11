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
		
    // This class should not be instantiated, the only purpose being to override default behavior.
}

class JFontChooser extends JDialog implements ModelessFontChooser {

    private final String dialogTitle;
    private String font;
    private final boolean allowMultiple;
    private final boolean bold;
    private final boolean italic;
    private final boolean bolditalic;
    private final boolean selectItself;
    private final boolean allowFocus;
    private final boolean allowCaret;
    private final boolean checkboxUseParentComponent;
    private final boolean doubleBuffered;
    private final boolean inForeground;
    private final boolean noText;
    private final boolean dropShadow;
    private final JList fonts;
    private final JComponent fontComponent;
    private final Component colorChooser;
    private final Component colorText;
    private final Component colorTextPane;
    private final Component editorTextField;
    private final Component buttonTextField;
    private final JButton okButton;
    private final JButton cancelButton;
    private final JButton setFontButton;
    private final JButton resetFontButton;
    private final JButton closeButton;
    final EventListenerList listeners = new EventListenerList();
    final Font fontToUse = new Font();
    final boolean fontIsSame;
    final Serializable keyStroke;

    JFontChooser(final Window window, final String title, boolean allowMultiple,
        boolean bold, boolean italic) {
        setResizable(false);
        setUndecorated(true);
        setTitle(title);
        setWindowDecorationStyle(WindowDecorationStyle.Plain);
        setLayout(new BorderLayout());

        // setResizable(false);

        Container parent = getContentPane();
        parent.add(this, BorderLayout.CENTER);

        parent.add(new JPanel(new BorderLayout()), BorderLayout.EAST);

        Font defaultFont = new Font();

        font = "default font";
        fontToUse = new Font(font);
}
}