
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
class JFontChooser_1Test {
  static final String RESULT_COLUMN = "FONTCOLUMN";
  static final String RESULT_PAGE = "ResultPage";
  static final String RESULT_FONT = "font";
        private Container topParent;
        private SwingComponent topSwingComponent;
        private final JDialog resultWindow;
  private ActionListener okListener;
        private ActionListener cancelListener;
  private final Font selectedFont;
  public JFontChooser_1Test(Font font) {
   super();
   this.selectedFont = font;
   resultWindow = new JDialog(null, true);
  }
  public JFontChooser_1Test(Font font, JDialog resultWindow) {
   super(true);
   this.selectedFont = font;
   this.resultWindow = resultWindow;
  }
  @Test
  public void test() {
   Font font = Font.decode(RESULT_FONT);
   topParent = getFrame(font.getFamily().toString());
}
}