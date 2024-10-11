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
		
    private static JMenuBar mbar;
	private JMenu b;
	
    /**
     * 
     */
    JMenuHelperTest() {
        mbar = new JMenuBar();
    }

    /**
     * Test method {@link JMenuHelper#addMenuBarItem(JMenuBar,String)}.
     */
	@Test
	public void addMenuBarItem() {
	if(!mbar.isEmpty()) {
	addMenuBarItem(mbar, "JMenuBarItem");
	} else {
	JMenu m = new JMenu("JMenu");
	mpub.add(m);
        m.setMnemonic(charAt(0));
        m.setText("JMenu");
	m.setPopupVisible(false);
	m.addActionListener(null);
	
	b = new JMenu();
	mpub.add(b);
	
	b.addActionListener(null);
    }

    /**
     * Test method {@link JMenuHelper#getMenuBarItem(int)}.
     */
}
}