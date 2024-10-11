// JMenuHelper_0Test.java
package visu.handball.moves.controller;

import java.awt.event.*;
import javax.swing.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JMenuHelper}.
* It contains one unit test case for the {@link JMenuHelper#addMenuBarItem(JMenuBar, String)} method.
*/
class JMenuHelper_0Test {
		
	/**Test if MenuBarItem is added to a JMenu.
     * @see #addMenuBarItem(JMenuBar, String) 
     */	
	@Test
	public void JMenuHelper_0a_addMenuBarItem_JMenuBarItem() {
			
		JMenuBar mBar = new JMenuBar();

		JMenuItem sb = addMenuBarItem( mBar, "TestMenuItem");
		assertNotNull( sb );
		
		assertTrue( sb instanceof JMenuItem);
		assertFalse( sb.hasActionListeners());
		assertNotNull( sb.getActionListeners());
    }
    
     /**
	 * Test with JMenuBar Item as argument.
	 * 
     * @see #addMenuBarItem(JMenuBar, String) 
     */	
	@Test
	public void JMenuHelper_0b_addMenuBarItem_JMenuBarItem__JMenuBarItem() {
		JMenuBar mBar = new JMenuBar();
		JMenuItem sb = addMenuBarItem( mBar, "TestMenuItem");
	}
}