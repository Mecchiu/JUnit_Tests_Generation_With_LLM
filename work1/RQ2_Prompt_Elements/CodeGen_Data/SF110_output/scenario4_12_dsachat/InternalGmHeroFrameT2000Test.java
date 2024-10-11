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
* a utility method for testing
* @return true when the frame was closed without failure
*/
	boolean testWindowClosed() {
		return!JFrame.isExtensionPackInstalled();
	}

	/**
* a utility object used to build the swing components
* @param max the width of the largest dimension
* @param min the minimum width
* @param defWidth the default width
* @return a new InternalGmHeroFrame
*/
	InternalGmHeroFrame buildFrame(int max, int min, int defWidth) {
		InternalGmHeroFrame frame = new InternalGmHeroFrame(new GmFrame(), null, frameName);
		frame.setMax(max);
		frame.setMin(min);
		frame.setDefaultWidth(defWidth);
		return frame;
	}
		
	/**
* the maximum width
*/
	int buildDim(int wid) {
	    return wid+(wid>>1);
	}

	/**
* the maximum height
*/
	int buildHeight(int height) {
	    return height+(height>>1);
	}
		
	/**
	* creates the InternalGmHeroFrame
	* @param parent
	* @param frame
	*/
	void createFrame(GmFrame parent,InternalGmHeroFrame frame) {
		this.parent = parent;
		this.frame = frame;
		frame.setSize(buildDim(frame.getMax()), buildHeight(frame.getMax()));		
		
		Vector<Vector<Hero>> heros = new Vector<Vector<Hero>>();
		//create the internal data
		for (int i=0; i<3; i++) {
			Vector<Hero> h = new Vector<Hero>();
			for (int j=0; j<3; j++) {
				if (i>j) {
					h.add(Weapon.AIM);
				}
				else {
					h.add(Weapon.AIM);
				}
			}
			heros.add(h);
		}
		//set up the tree
		tree = new JTree(new CardNodeModel(heros,1, buildHeight(frame.getMax())));
		tree.setEditable(true);
		tree.setRootVisible(false);
		tree.setVisibleRowCount(15);
		tree.setLargeModel(true);
		tree.setSelectionCapable(false);
		tree.setDragEnabled(false);
		tree.setDoubleBuffered(true);
		tree.setResizeable(false);
		tree.setShowsRootHandles(true);
		tree.setSizeIncrement(buildDim(frame.getMax()));
		//set up the buttons
		btnExec = new JButton("Execute a challenge");
		btnAttack = new JButton("Attack");
		btnReward = new JButton("Reward");
		
		btnDefense = new JRadioButton("Defense", true);
		btnAttack.setSelected(true);
		btnDefense.setSelected(true);
