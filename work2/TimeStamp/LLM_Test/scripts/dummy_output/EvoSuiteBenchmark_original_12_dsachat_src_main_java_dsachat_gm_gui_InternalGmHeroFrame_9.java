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
		
	/**The data of the tested component **/
	private GmFrame component;
	public InternalGmHeroFrameTest(GmFrame parent){
		component = parent;
	}
	
	/**
	 * Test for silent mode
	 */
	@Test
	public void testSilentMode() {
        component = new GmFrame();
        component.setHidden(true);
		assertTrue(component.isHidden());
	}
	
	/**
	 * Test for a normal operation (parent hidden)
	 */
	@Test
	public void testNormalOperation() {
		this.testNormalOperation(true);
	}

	/**
	 * Test for normal operation
	 */
	@Test @Ignore
	public void testNormalOperation2() {
            this.testNormalOperation(true);
       }
	
	/**
	 * Test for a normal operation
	 */
	private void testNormalOperation(boolean silent) {
         GmFrame frame = null;
		if (silent) {
			frame = new GmFrame();
		} else {
			GmFrame parent = new GmFrame();
			frame = new GmFrame();
			parent.setHidden(true);
			frame.setHidden(true);
		}
		try {
			frame.setContentPane( new JPanel() );
			frame.setSize(new Dimension(200,300));
			frame.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(-1);
		}
		
		assertTrue(frame.isVisible());
		
		if (silent) {
			FrameUtils.dismissButton(frame);
			Thread.sleep(2000);
			
			frame.setVisible(false);
			frame.setSize(new Dimension(500,300));
            
            Vector<String> data = frame.getData();
            assertEquals("Hello World!", data.get(0));
            assertEquals("Hello 0", data.get(1));
            assertTrue(data.size() == 4);
            assertTrue(data.get(3) instanceof String);
			
		} else {
			
			Vector<String> data = frame.getData();
			assertEquals("Hello World!", data.get(0));
			assertEquals("Hello 0", data.get(1));
            assertTrue(data.size() == 4);
			
			assertEquals("Hello 0", data.get(3));
		}
		
		
		assertTrue(component.getData().size() == 4);
		
		assertTrue(component.getParent() == frame);
		assertTrue(frame.getParent() == parent);
		assertTrue(frame instanceof GmFrame);
		assertTrue(parent instanceof GmFrame);
		
		assertTrue(component.valueChanged(( (GmFrame) parent).valueChanged()));
}
}