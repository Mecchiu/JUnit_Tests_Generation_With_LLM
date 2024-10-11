
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
class JFontChooser_0Test {
  private static final String TEST_TITLE = "Test Title";
  private static final String TEST_MULTI_SELECT_KEY = "Test Multi-Select Key";
  private static Action action;
  private static ActionListener actionListener;
  static {
   java.util.ObservableList list1 = new java.util.ObservableArrayList();
   list1.add(new Action() {
    private static final long serialVersionUID = -Long.parseLong("8794957486718777825");
    public void actionPerformed(ActionEvent event) {
     action.actionPerformed(event);
    }
   });
   java.util.ObservableList list2 = new java.util.ObservableArrayList();
   list2.add(new Action() {
    private static final long serialVersionUID = Long.parseLong("38152711707628489514");
    public void actionPerformed(ActionEvent event) {
     action.actionPerformed(event);
    }
   });
   actionListener = new ActionListener() {
    public void actionPerformed(ActionEvent event) {
     System.out.println("actionPerformed " + event);
    }
   };
  }
  @Test
  public void testShowDialog() {
   System.out.println("showDialog");
   final Container rootContainer = new JPanel(new BorderLayout());
   final JDialog jDialog = new JDialog(
     rootContainer,
     TEST_TITLE,
     true);
   final JPanel topPanel = new JPanel(
     new BorderLayout());
   final JPanel buttonContainer = new JPanel(new GridBagLayout());
   final JButton okButton = new JButton("OK");
   final JButton cancelButton = new JButton("Cancel");
   final Font labelFont = new Font("Dialog", Font.PLAIN, 16);
   final JCheckBox multiSelectCheckBox = new JCheckBox(
     "Multi-select");
   final JCheckBox multiSelectCheckBox2 = new JCheckBox(
     "Multi-select 2");
}
}