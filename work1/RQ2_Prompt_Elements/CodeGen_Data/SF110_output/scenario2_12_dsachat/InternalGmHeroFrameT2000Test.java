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

    InternalGmHeroFrameTest(String name) { }

    String getName(){ return "InternalGmHeroFrameTest.java"; }

    void setSilent(boolean bool){}
    
    /**
    * Test class constructor of {@link InternalGmHeroFrame}.
    * @throws Exception any exception thrown by {@link InternalGmHeroFrame}
    */
    @Test
    public void constructor(){
    	final InternalGmHeroFrame frame = new InternalGmHeroFrame("InternalGmHeroFrameTest");
    	testName(frame,InternalGmHeroFrame.name());
    }

    /**
    * test {@link InternalGmHeroFrame#internalFrame()} method:
        no parent
        should return null
    */
    @Test
    public void internalFrame(){
    	final InternalGmHeroFrame frame = newInternalGmHeroFrame("InternalGmHeroFrameTest");
    	final JInternalFrame jfb = frame.internalFrame();
		testNull(jfb);
    }

    /**
	* test the other method of {@link InternalGmHeroFrame}
    * @throws Exception any exception thrown by {@link InternalGmHeroFrame}
    */
    @Test
    public void externalFrame(){
        final JInternalFrame jfb = newInternalGmHeroFrame("UnknownFrame");
        final Hero enemy = new Hero("enemy");
        final Hero player = new Hero("player");
        jfb.setSelected(player);
        assertSame(enemy, jfb.getModel().getSelected());
        jfb.setSelected(enemy);
        assertNull(jfb.getModel().getSelected());
        jfb.setSelected(player);
        assertNotNull(jfb.getSelected());
        jfb.setSelected(enemy);
        assertSame(enemy, jfb.getSelected());
        assertNull(jfb.getModel().getSelected());
        assertNull(jfb.tree.getSelectionModel().getLeadSelectionPath());
        assertEquals("player", frame.tree.getSelectionModel().getLeadSelectionPath());
    }

    /**
    * test the other method of {@link InternalGmHeroFrame}
    * @throws Exception any exception thrown by {@link InternalGmHeroFrame}
    */
    @Test
    public void nullSelection(){
		final InternalGmHeroFrame frame = newInternalGmHeroFrame("UnknownFrame");
		final JInternalFrame jfb = frame.internalFrame();
		assertNull(jfb.getSelected());
		assertSame(Hero.class, jfb.getModel().getSelected().getClass());
        assertNull(jfb.tree.getSelectionModel().getLeadSelectionPath());
    }
    
    private void assertEquals(JInternalFrame frame, JInternalFrame expectedJfb){
        assertEquals(expectedJfb.getName(), frame.getName());
        assertEquals("InternalGmHeroFrame", frame.getClass().getName());
        //assertEquals(null, frame.tree.getSelectionModel().getLeadSelectionPath());
        assertTrue(frame.getModel().equals(expectedJfb.getModel()));
        assertFalse(frame.getModel().isSelected());
        assertFalse(frame.getModel().isCollapsed());
        assertEquals(frame.tree.getSelectionModel(), expectedJfb.tree.getSelectionModel());
    }
    
    private JInternalFrame newInternalGmHeroFrame(String nam) {
        InternalGmHeroFrame frame = new InternalGmHeroFrame(nam);
        //System.out.println("newInternalGmHeroFrame " + nam);
        return frame;
    }

    private JInternalFrame newInternalGmHeroFrame(String nam, int min, int max) {
        InternalGmHeroFrame frame = newInternalGmHeroFrame(nam, min, max);
        //System.out.println("newInternalGmHeroFrame " + nam + " -> " + min + ".. " + max);
        return frame;
    }

    private JInternalFrame newInternalGmHeroFrame(String nam, int min, int max,
            boolean isFullScreen) {
        InternalGmHeroFrame frame = newInternalGmHeroFrame(nam, min, max, isFullScreen);
        //System.out.println("new InternalGmHeroFrame " + frame);
        return frame;
    }

    private InternalGmHeroFrame newInternalGmHeroFrame(String nam, int min, int max,
            boolean isFullScreen, int extraSelection) {
        InternalGmHeroFrame frame = newInternalGmHeroFrame(nam, min, max, isFullScreen,
                extraSelection);
        //System.out.println("newInternalGmHeroFrame " + frame);
        return frame;
    }

    private JInternalFrame newInternalGmHeroFrame(String nam, int min, int max,
            boolean isFullScreen, int extraSelection,
            String initialSelection) {
        InternalGmHeroFrame frame = newInternalGmHeroFrame(nam, min, max, isFullScreen,
                extraSelection, initialSelection);
        //System.out.println("newInternalGmHeroFrame " + frame);
        return frame;
    }