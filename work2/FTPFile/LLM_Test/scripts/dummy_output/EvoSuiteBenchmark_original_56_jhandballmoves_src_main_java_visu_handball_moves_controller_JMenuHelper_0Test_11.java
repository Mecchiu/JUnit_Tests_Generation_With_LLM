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
	 * Standard Java main().
	 */
	public static void main(String args[]) {
		String s = JMenuHelper_0Test.class.getSimpleName();
		JMenuHelper_0Helper.addMenuBarItem(null, s);
	}

	/**
	 * Simple test to make sure that the addMenuItem() method returns the current menuitem.
	 */
	@Test
	public void testAddMenuBarItem() {
		JMenu m_null = new JMenu();
		s_jApp.setMenuBar(m_null);
		JMenu m_null_1 = new JMenu();
		s_jApp.setMenuBar(m_null_1);
		JMenuItem m_Item1 = new JMenuItem();
		JMenuItem m_Item2 = new JMenuItem();
		String s_Item1 = "MenuItem1";
		String s_Item2 = "MenuItem2";
		return;
	}

	/**
	 * Simple test to make sure that the addMenuBarItem() method returns null when the given JMenuBar is NULL.
	 */
	@Test
	public void testAddMenuBarItemNullJMenuBar() {
	    JMenuHelper_0Test.testAddMenuBarItem(null, s_jApp.getJMenuBar());
	    return;
	}
	
	/**
	 * Simple test to make sure that the addMenuItem() method returns null when the menu bar is NULL.
	 */
	@Test
	public void testAddMenuItemNullMenuBar() {
		String s = JMenuHelper_0Test.class.getSimpleName();
		s_jApp.setMenuBar(null);
		JMenuHelper_0Helper.addMenuBarItem(null, s);
		return;
	}
}