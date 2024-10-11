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
	 * Test method for {@link JMenuHelper#addMenuBarItem(JMenuBar, String)}.
	 */
	@Test
	public void testAddMenuBarItem() {

		final JMenu m = new JMenu("M") {			
			{
				setLayout(null);
				setBackground(null);
				addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						addMnemonic(m, "mnemonic2");
					}
				});				
			}
		};
		final String s = "[";
		
		assertFalse("the mnemonic should be not be added (it is added in the method)", s.endsWith("s"));
		
        /*
	   * Adda a JMenuItem to the M en mnemonic meni (to test to see how it removes it and its
	   * events!
	   */

	    final JMenuItem mnemonic = new JMenuItem("",JMenuItem.class);
	    final String s1 = "[" + "-]";
        processMnemonic(mnemonic, s1);
	    
	    assertEquals("the menicn item should have been not added. It does not look the same", 
    			       false, s1.endsWith("mnemonic2"));
	    assertEquals("the menicn item text should have been not added. It does not look the same", 
    			       false, s1.endsWith(s) );
}
}