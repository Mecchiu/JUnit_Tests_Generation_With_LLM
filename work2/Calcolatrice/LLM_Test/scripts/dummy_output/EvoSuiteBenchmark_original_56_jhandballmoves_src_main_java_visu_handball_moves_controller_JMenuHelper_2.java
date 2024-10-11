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
	 * Test method for {@link visu.Handball.engine.actions.controller.JMenuHelper#addMenuBarItem(JMenuBar, String)}.
	*/
	@Test
	public void testAddMenuBarItem() {
		// Check:
		assertNotNull(JMenuHelper.addMenuBarItem(null, null));
		assertNotNull(JMenuHelper.addMenuBarItem(null, "nicholas"));
		assertNotNull(JMenuHelper.addMenuBarItem(null, "nicholas"));
		assertNotNull(JMenuHelper.addMenuBarItem(null));
		assertNull(JMenuHelper.addMenuBarItem(null, null));
	}

	/**
	 * Test method for {@link visu.Handball.engine.actions.controller.JMenuHelper#addMenuBarItem(JMenu, String)}.
     */
	@Test
	public void testAddMenuBarItem() {
		final JMenu item = addMenuItem("item");
		assertNotNull(item);
		assertEquals(item, JMenuHelper.addMenuBarItem(JMenu.class, "item", 'a', addMenuAction(item)));
		assertNull(JMenuHelper.addMenuBarItem(JMenuItem.class, "item(nicholas)", 'a', addMenuAction(item)));
		assertNull(JMenuHelper.addMenuBarItem(JMenu.class, "item(nicholas)", 'a', addMenuAction(item)));
		assertNull(JMenuHelper.addMenuBarItem(null, "item"));
	}

	/**
	 * Test method for {@link visu.Handball.engine.actions.controller.JMenuHelper#addMenuBarItem(JMenuBar, String, ActionListener)}.
	 */
	@Test
	public void testAddMenuBarItem_1() {
		final JMenuItem m = addMenuItem("m");
		assertNotNull(m);
		assertFalse(JMenuHelper.addMenuBarItem(JMenuBar.class, "m(a,nicholas)", 'a', addMenuAction(m)));
		assertTrue(JMenuHelper.addMenuBarItem(JMenuBarItem.class, "m(a,nicholas)", 'a', addMenuAction(m)));
		assertTrue(JMenuHelper.addMenuBarItem(JPanel.class, "m(a,nicholas)", 'a', addMenuAction(m)));
}
}