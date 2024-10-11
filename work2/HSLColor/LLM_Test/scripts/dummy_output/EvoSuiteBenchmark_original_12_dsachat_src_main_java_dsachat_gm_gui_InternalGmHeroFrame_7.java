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
		
    /**
     * Constructor for InternalGmHeroFrameTest
     * @param parent the parent frame and action listener
     * @param heros    an array of heroes with data
     * @param name    name of the frame
     */
    public InternalGmHeroFrameTest(GmFrame parent, String[] hs, String nam) {
    	frameName=nam;
    	parent.setFrameName(name);
    	parent.setSilentMode();
    	createVector();
    	createData();
    }

    /**
     * create the GmHeroFrame from the vector
     * @param hs the new data
     */
    private void createVector() {
        model=new MultiHeroTreeModel();
        tree = new JTree(model);
        tree.setSelectionModel(new MySelectionModel());
        tree.pack();
        tree.setVisible(true);
        spnMod = new JSpinner(new SpinnerNumberModel(10, 6, 20, 1));
        cmbUsers = new JComboBox();
        cmbUsers.addItem("user0");
        cmbUsers.addItem("user1");
        cmbUsers.addItem("user2");
        radAttack = new JRadioButton("Attack");
        radDefense = new JRadioButton("Defense");
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        panel.add(new JLabel("Attack"), new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
            GridBagConstraints.EAST, GridBagConstraints.NONE,
            new Insets(0, 0, 0, 0), 0, 0));
        JPanel panel2 = new JPanel();
        panel2.setLayout(new GridBagLayout());
        panel2.add(radAttack, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
            GridBagConstraints.NORTH, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 0, 0), 0, 0));
        panel2.add(radDefense, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
            GridBagConstraints.WEST, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 0, 0), 0, 0));
        cmbUsers.setToolTipText("user1|user2");
    }

    /**
     * create the data structure of this object
     */
    private void createData() {
    	if (frameName.compareTo("")!=0)
    		model.setRoot(frameName);
    }


    @Test
    public void test() {
		// this is only applicable to the root frame, so no other test is needed.
		assertTrue(frameName.compareTo("")!=0);
}
}