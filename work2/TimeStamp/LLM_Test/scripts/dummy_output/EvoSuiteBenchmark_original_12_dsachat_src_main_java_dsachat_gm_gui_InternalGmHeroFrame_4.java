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
	 * the unit test
	 * @param args
	 */
	public static void main(String[] args) {
		junit.textui.TestRunner.run(InternalGmHeroFrameTest.class);
	}
	
	/**
	 * start an internal frame from the specified path
	 * @param path the path
	 */
	public void startInternalFrameFromPath(TreePath path) {
		startInternalFrame(path);
	}
	
	/**
	 * start an internal frame from the specified path
	 * @param path the path
	 */
	public void startInternalFrame(TreePath path) {
		InternalGmHeroFrameTestFrame t = new InternalGmHeroFrameTestFrame("Test", path);
		t.startInternalFrame();
	}
	
	/**
	 * start an internal frame
	 */
	public void startInternalFrame() {
		InternalGmHeroFrameTestFrame t = new InternalGmHeroFrameTestFrame("Test", null);
		t.startInternalFrame();
	}
	
	/**
	 * initialize the internal frame
	 */
	public void internalFrameSetup() {
		internalFrameSetup();
	}
		
	/**
	 * initialize the internal frame, with an empty gui
	 */
	public void internalFrameSetup() {
		internalFrameSetup("testFrame", new Vector<Hero>());
	}
	
	/**
	 * initialize the internal frame, with an empty gui
	 * @param name the name of the frame
	 * */
	public void internalFrameSetup(String name) {
		internalFrameSetup(name, new Vector(1));
	}
	
	/**
	 * initialize the internal frame
	 * to store the Hero data,
	 * the result of the simulation
	 * @param name the name of the frame
	 * @param users the list of user names
	 */
	public void internalFrameSetup(String name, String[] users) {
		Vector<Hero> h = new Vector<Hero>();
		SpinnerModel hModel = new SpinnerNumberModel(100.0, 10.0, 1000.0, 5);
		hModel.setValue(100);
		hModel.setMaximum(1000);
		
		InternalGmHeroFrameTest frame = new InternalGmHeroFrameTestFrame(name, users);

		internalFrame = new JInternalFrame(frame);
		internalFrame.setSize(new Dimension(400, 300));
		internalFrame.setTitle("Internal Gm Hero Frame");
		internalFrame.setResizable(false);
		internalFrame.add(internalFrame.getContentPane(), BorderLayout.CENTER);		
		cmbUsers = new JComboBox();
		cmbUsers.setModel(hModel);
		internalFrame.getContentPane().add(cmbUsers);
		internalFrame.getContentPane().add(new JLabel("Users: "), 0);
		internalFrame.getContentPane().add(new JSpinner(spnMod), 0);
}
}