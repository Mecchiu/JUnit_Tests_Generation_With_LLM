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
		public final static void test() {
                InternalGmHeroFrame test = new InternalGmHeroFrame();
                Vector<Hero> test_data = new Vector<Hero>();
                test.setFrameName("test internal frame");
                test_data = new Vector<Hero>();
                test_data.add(new Hero("Elder Fogg"));
                test_data.add(new Hero("The Elder Skywalker"));
                test_data.add(new Hero("Lord Michael Fella"));
                test_data.add(new Hero("Darius Morny"));
                test_data.add(new Hero("The Dark Commander"));

                Vector<Hero> test_data2 = new Vector<Hero>();
                test_data2 = new Vector<Hero>();
                test_data2.add(new Hero("Lord Michael P. Kram"));
                test_data2.add(new Hero("Darius Morny"));
                test_data2.add(new Hero("Lord Michael Fella"));
                test_data2.add(new Hero("Lord Michael P. Kram"));
                test_data2.add(new Hero("The Dark Commander"));

                Vector<Hero> test_data3 = new Vector<Hero>();
                test_data3 = new Vector<Hero>();
                test_data3.add(new Hero("Lord Michael P. Kram"));
                test_data3.add(new Hero("The Dark Commander"));

//                test_data.retainAll(test_data2);
//                Vector<Hero> expected = new Vector<Hero>(3);

}
}