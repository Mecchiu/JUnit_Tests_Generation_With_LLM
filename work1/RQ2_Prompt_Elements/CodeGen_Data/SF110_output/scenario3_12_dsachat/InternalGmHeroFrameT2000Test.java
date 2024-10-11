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
		* Tests that no changes should be made after creation.
		* 
		* @throws java.lang.Exception
		*/
		@Test
    void nothingMade()
    {
        final InternalGmHeroFrame f = new InternalGmHeroFrame();
        assertTrue(f.getVisible());
    }
		/**
		* Tests that a changes made after creation should invalidate existing tests.
		*
		*/
		@Test
    void testCreationChange()
    {
        final InternalGmHeroFrame f = new InternalGmHeroFrame();
        f.creating(
            true,
            null, // we never pass a selectionModel as it will never be used
            null, // we DON'T pass a treeSelectionModel as it is used for testing.
            new Dimension(200,200)); // we DON'T pass a contentPanel to test.
    }
		/**
		* Tests that only one unit test for this test class should be run for each iteration of the "for loop".
		*
		* @throws java.lang.Exception
		*/
		@Test
    void singleUnitTest() {
        
        final InternalGmHeroFrame f = new InternalGmHeroFrame();
        final boolean[] done = new boolean[1];
        
        for(int i = 0; i < 100; i++)
        {
            done[0] = true;
            f.creating(true, null, null, new Dimension(300,300), new Vector<Hero>());
            assertTrue(done[0]);
            done[0] = true;
            try
            {
                f.creating(true, null, null, new Dimension(300,300), new Vector<Hero>());
                assertFalse(done[0]);
            }
            catch(Exception e)
            {
                done[0] = true;
            }            
        }
    }
		/**
		* Tests that the contentPane is updated with the changes
		* after creating a game and asking for some changes.
		*
		* @throws java.lang.Exception
		*/
	@Test
    void update()
	    throws Exception
    {
        final InternalGmHeroFrame f = new InternalGmHeroFrame();
        f.creating(true, null, null, new Dimension(300,300), new Vector<Hero>());
        final JPanel panel = f.getContentPane();
        final JPanel contentPanel = ((JPanel)panel.getContentPane());
        final JLabel label1 = new JLabel(">1.0");
        final JLabel label2 = new JLabel(">=1.0");
        final JLabel label3 = new JLabel(">0.4");
        
        final GridBagLayout gridBagLayout = new GridBagLayout();
        final GridBagConstraints gridBagConstraints;
        
        
        contentPanel.setLayout(gridBagLayout);
        contentPanel.add(label1, null); 
        //contentPanel.add(label2, null);
        contentPanel.add(label3, null);
        contentPanel.add(new JLabel(""), null);
        //contentPanel.add(new JLabel(""), null);
        contentPanel.add(new JSpinner(new SpinnerNumberModel(1.0, 2.0, 10.0, 1.0)), null);
        contentPanel.add(new JCheckBox(), null);
        contentPanel.add(new JRadioButton(""), null);
        contentPanel.add(new JTree(new MyJTree()), null);
        contentPanel.add(new JScrollPane(new MyJScrollPane()), null);
        contentPanel.add(new JPanel(new GridLayout(1, 2)), null);
        
        gridBagConstraints = new GridBagConstraints();
        contentPanel.add(panel, gridBagConstraints);
        f.contentPaneChanged();
        
        final JPanel panelChanged = f.getContentPane();
        
        panelChanged.add(new JButton("Ok"), null);
        panelChanged.add(new JButton("Next"), null);
        panelChanged.add(new JButton("Previous"), null);
        
        assertEquals(3, panelChanged.getComponentCount());
        
        f.update(false);
        f.update(true);
        
        f.deleting(new TreePath(new Object[]{5}));
        assertEquals(12, panelChanged.getComponentCount());
        assertEquals(12, contentPanel.getComponentCount());
    }
	/**
	* This contains a combobox with buttons.
	* 
	* @author berns
	*/
	
	public class MyJComboBox extends JComboBox
    {
		/* (non-Javadoc)
         * @see javax.swing.JComboBox#addItem(java.lang.Object)
         */
        public void addItem( Hero p )
        {
            addItem( new Vector<Hero>(1, p));
        }

        /* (non-Javadoc)
         * @see javax.swing.JComboBox#removeItemAt(int)
         */         
        public boolean removeItemAt( int index )
        {
            return removeItem( new Vector<Hero