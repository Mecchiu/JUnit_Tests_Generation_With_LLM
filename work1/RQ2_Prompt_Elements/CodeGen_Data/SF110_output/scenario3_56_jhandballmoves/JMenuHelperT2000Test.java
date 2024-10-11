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

    /**
     * A JMenu used for testing.
     */
	JMenu menu;
	
    /**
     * Test constructor.
     */
	public JMenuHelperTest() {
		// Add menu. 
		menu = addMenuBarItem(new JMenu("JMenu"), "JMenu");
	}
	
    /**
     * Test {@code addMenuBarItem} method of {@link JMenuHelper}.
     */
    @Test
    public void testAddMenuBarItem() {
        
        // Call the method of {@link JMenuHelper}.
        final JMenuBar menuBar = new JMenuBar();
        final String testString = "Test string";
        final JMenu menu = AddMenuBarItem.addMenuBarItem(menuBar, testString);

        // Test if the menuBar is added to the menu.
        assertEquals(TestMenu.JMenu, menuBar);
    }
    
}