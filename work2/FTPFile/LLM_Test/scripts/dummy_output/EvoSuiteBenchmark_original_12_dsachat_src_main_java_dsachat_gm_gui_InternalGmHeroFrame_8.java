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
	 * test if a value is false or not
	 * @param c value to check
	 * @return true if the value is false or not
	 */
	private static boolean isFalse(Boolean c) {
		assertNotNull("value should not be null", c);
		return c == false;
	}
			
	/**
	 * test if a value is empty or not
	 * @param c value to check
	 * @return true if the value is empty or not
	 */
	private static boolean isEmpty(String c){
		assertNotNull("value should not be null", c);
		return c.isEmpty();
	}
	
	/**
	 * create a new instance of the unit test class
	 * @return a new instance
	 */
	private InternalGmHeroFrameTest(){
		}
			
	public static void main(String[] args) {
		
	}

	/**
	 * Tests if the value of the execution button is true.
	 * @see TestInternalGmHeroFrame.InternalGmHeroFrameTest#isAttack()
	 */
	@Test
	public void testAttack() {	
	}

	/**
	 * Tests if the value the combo box is used for is false.
	 * @see TestInternalGmHeroFrame.InternalGmHeroFrameTest#cmbUsers()
	 */
	@Test
	public void testUsers(){
	}
	
	/**
	 * Tests if when a user connects to, and the combo box is clicked again the combo box is updated.
	 * @see TestInternalGmHeroFrame.InternalGmHeroFrameTest#model()
	 */
	@Test
	public void testModel() {
	}
	
	/**
	 * Tests if when a user connects to, and the combo box is clicked again the combo box is updated.
	 * @see TestInternalGmHeroFrame.InternalGmHeroFrameTest#spnMod()
	 */
	@Test
	public void testSpnMod(){
	    Vector<Hero> model1 = new Vector<Hero>(); 

	    // update with a new Hero object, with a new mod
	    model1.add(new Hero(1,2));
	    model1.add(new Hero(3,4));
	    model1.add(new Hero(5,6));
	    model1.add(new Hero(7,8));
	    model1.add(new Hero(9,10));

	    //update the combo box used by the model
	    cmbUsers = (JComboBox) model.getSelectedModel();	
	    assertTrue("the combo box should be in the selected model", cmbUsers.isSelected());	
	    cmbUsers.removeAllItems();
	    cmbUsers.addItem("0");
	    cmbUsers.addItem("1");
	    cmbUsers.addItem("2");
	    cmbUsers.addItem("3");	    
	    model.sync();
	}

}