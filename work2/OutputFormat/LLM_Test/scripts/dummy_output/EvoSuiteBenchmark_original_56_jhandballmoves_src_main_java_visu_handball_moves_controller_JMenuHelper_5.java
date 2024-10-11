// JMenuHelperTest.java
package visu.handball.moves.controller;

import java.awt.event.*;
import javax.swing.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JMenuHelper}.
* It contains one unit test case for the {@link JMenuHelper#addMenuBarItem(JMenuBar, String)} method.
*/
class JMenuHelperTest {
		
	static String TITLE;

    @BeforeClass
	public static void setUpClass() {
        TITLE = "TestClass01";
	}

    @AfterClass
	public static void tearDownClass() {
	}

    @Test
    public void testGetMnemonic(){
            assertEquals("", JMenuHelper.processAction(null).getMnemonic());
            assertEquals("_", JMenuHelper.processAction("").getMnemonic());
            assertEquals("a", JMenuHelper.processAction("a").getMnemonic());
            assertEquals("mnem", JMenuHelper.processAction(JMenuItem.class.getName()).getMnemonic());
            assertEquals("mn", JMenuHelper.processAction(MnemonicDispatcher.class.getName()).getMnemonic());
            assertEquals("o", JMenuHelper.processAction(KeyStroke.getKeyStroke(KeyEvent.VK_O, KeyboardEvent.CTRL_MASK)).getMnemonic());
            assertEquals("_a", JMenuHelper.processAction(JMenuBar.class.getName(), String.valueOf(KeyEvent.VK_ESCAPE), ActionListener.class).getMnemonic());
            assertEquals("_", processAction(JMenuHelper.processAction(JMenuItem.class.getName(), String.valueOf("s"), ActionListener.class)));
            assertEquals('_', processAction(JMenuItem.class.getName(), String.valueOf("c"), ActionListener.class));
            assertEquals('o', processAction(JMenuItem.class.getName(), String.valueOf("o"), ActionListener.class));
            assertEquals('a', processAction(JMenuItem.class.getName(), String.valueOf("a"), ActionListener.class));
            assertEquals('_', processAction(JMenuBar.class.getName(), String.valueOf("s"), ActionListener.class, true));
            assertEquals('s', processAction(JMenuBar.class.getName(), String.valueOf("s"), ActionListener.class));
            assertEquals('c', processAction(JMenuItem.class.getName(), String.valueOf("c"), ActionListener.class, true));
            assertEquals('c', processAction(MnemonicDispatcher.class.getName(), String.valueOf("c"), ActionListener.class, true));
            assertEquals('o', processAction(KeyStroke.getKeyStroke(KeyEvent.VK_O, KeyboardEvent.CTRL_MASK, true, true, false, false, false)));
	    assertEquals('_', processAction(JMenuItem.class.getName(), String.valueOf("s"), ActionListener.class, true));            
    }
    
    @Test
    public void testAddMenuItem() {
            
            // JMenuItem.class.getName()
            String s = JMenuItemsRes.class.getName() + ".processAction";
            assertEquals("_s", processAction(s));

            // JMenuItem.class.getName("a")
            s="JMenu.class.getName()";
            assertEquals("s_a", processAction(s, "a"));

            // JMenuBar
            s="JMenuBar.class.getName()";
            assertEquals("s_", processAction(s, s));           

            // MenuItem.class.getName()
            s = JMenuItem.class.getName() + ".processAction";
            assertEquals("_s", processAction(s));             
    }  
    
     private static JMenuItem processAction(String s){
         return (JMenuItem) JMenuItemsRes.processAction(s);
     }  
}