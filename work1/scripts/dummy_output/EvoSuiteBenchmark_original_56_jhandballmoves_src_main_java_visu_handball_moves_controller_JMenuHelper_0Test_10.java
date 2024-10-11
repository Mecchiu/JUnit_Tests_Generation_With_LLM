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
		/**
	     * Tests the insertion of an item in a menu.
	     */
	    @Test
	    public void testPopup() throws InterruptedException {
	        final JMainPaneMenu jMenuPane = new JMainPaneMenu();
	        final JMainPaneMenuBar wMenuPane = new JMainPaneMenuBar();
	        final JMainPaneMenuItem wMenuItem = new JMenuItem(null, null, null);
	        wMenuItem.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseReleased(MouseEvent e) {
					
				}});
    
	        wMenuPane.add(wMenuItem);
	        jMenuPane.add(wMenuPane);
	        jMenuPane.addMouseListener(new MenuPaneMouseListener(wMenuItem));

		try {
			Thread.sleep(1000);
		} catch(InterruptedException ie) {
			
		}
	        assertTrue( jMenuPane.getCount() > 0 );
	        
	    }

}