// InternalGmHeroFrameTest.java
package dsachat.gm.gui;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.Vector;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTree;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.TreePath;
import javax.swing.tree.TreeSelectionModel;
import dsachat.share.hero.Hero;
import dsachat.share.hero.Weapon;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link InternalGmHeroFrame}.
* It contains one unit test case for the {@link InternalGmHeroFrame#silent()} method.
*/
class InternalGmHeroFrameTest {

	public static void main(String[] args) {
        InternalGmHeroFrameTest test = new InternalGmHeroFrameTest();
        try {
            JFrame frame = new InternalGmHeroFrame();
            frame.setLocationRelativeTo(null);
       		frame.setVisible(true);
       		frame.setTitle("InternalGmHeroFrameTest1");
               
       		JButton ok = new JButton("OK");
       		ok.addActionListener(test);
       		ok.setActionCommand("OK");
       		btn.add(ok);
               
       		ok.setEnabled(false);
       		frame.setComponentAt(ok, btn);
               
       		JButton cancel = new JButton("Cancel");
       		cancel.addActionListener(test);
       		cancel.setActionCommand("Cancel");
       		btn.add(cancel);
               
        } catch (Exception e) {
               
        	String text = e.getMessage().replaceAll("\\r|\\n", "\n");
        	throw new RuntimeException(text);
        }
	}
}
