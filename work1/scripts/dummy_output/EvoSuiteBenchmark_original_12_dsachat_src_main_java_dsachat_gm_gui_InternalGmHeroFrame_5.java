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
		
        private InternalGmHeroFrame gui;
        
        /**
         * create some objects that are used in the test
         * @param test is the test object
         */
        public InternalGmHeroFrameTest(InternalGmHeroFrame test) {
			super();
			gui = test;
        }

		@Test
        public void testSilent() {
				gui.isAttack();
				assertTrue(gui.silent());
        }

		@Test
        public void testUpdate() throws Throwable {
							gui.updateUsers(new String[]{"a","b"});
							assertTrue(gui.silent());
        }
}

public static final class MultiHeroTreeModel extends AbstractTestAdapter {

    /**
     * return the number of roots
     * @return the tree node count
     */
    public int getTreeNodeCount();

    /**
     * create list with all the players
     */
    public List createObjects();
    public List displayObject(List objects);
    public List displayObject(Hero hero);
    public List playerInfo(String player);
	public List allPlayers();
	public List allEnemies();
}