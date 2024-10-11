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
		assertFalse(JMenuHelper.addMenuBarItem(JMenuBarItem.class, "m(a,nicholas)", 'a', addMenuAction(m));
	}

	/**
	 * Test method for {@link visu.Handball.engine.actions.controller.JMenuHelper#addMenuBarItem(JMenuBar, String, ActionListener, boolean)}.
	 */
	@Test
	public void testAddMenuBarItem_2() {
		final JMenuBar m = addMenuBarItem("m");
		assertNotNull(m);
		assertTrue(JMenuHelper.addMenuBarItem(JMenuBar.class, "m[a,nicholas)", 'a', addMenuAction(m)));
		assertTrue(JMenuHelper.addMenuBarItem(JMenuBarItem.class, "m(a,nicholas)", 'a', addMenuAction(m)));
		assertTrue(JMenuHelper.addMenuBarItem(JPanel.class, "m(a,nicholas)", 'a', addMenuAction(m)));
		assertTrue(JMenuHelper.addMenuBarItem(JMenuBarItem.class, "m(a,nicholas)", 'a', addMenuAction(m)));
		assertFalse(JMenuHelper.addMenuBarItem(JMenuBarItem.class, "m(a,nicholas)", 'a', addMenuAction(m)));
	}

	/**
	 * Test method for {@link visu.Handball.engine.actions.controller.JMenuHelper#addMenuBarItem(JMenu, String)}.
	 */
	@Test
	public void testAddMenuBarItem_3() {
		assertNull(JMenuHelper.addMenuBarItem(JMenu.class, "nicholas"));
	}

	/**
	 * Test method for {@link visu.Handball.engine.actions.controller.JMenuHelper#addMenuBarItem(JMenu, String, ActionListener)}.
	 */
	@Test
	public void testAddMenuBarItem_4() {
		final JMenuItem m = addMenuItem("m");
		assertNotNull(m);
		assertTrue(JMenuHelper.addMenuBarItem(JMenu.class, "m(item, a, nicholas)", addMenuAction(m)));
		assertTrue(JMenuHelper.addMenuBarItem(JMenuItem.class, "m(item, a, nicholas)", addMenuAction(m)));
		assertTrue(JMenuHelper.addMenuBarItem(JPanel.class, "m(item, a, nicholas)", addMenuAction(m)));
		assertTrue(JMenuHelper.addMenuBarItem(JMenu.class, "m(item, a, nicholas)", addMenuAction(m)));
		assertFalse(JMenuHelper.addMenuBarItem(JMenuBarItem.class, "m(item, a, nicholas)", addMenuAction(m)));
	}

	/**
	 * Test method for {@link visu.Handball.engine.actions.controller.JMenuHelper#addMenuBarItem(String, char)}.
	 */
	@Test
	public void testAddMenuBarItem_5() {
		assertNull(JMenuHelper.addMenuBarItem(JMenuItem.class, 'a'));
	}

	/**
	 * Test method for {@link visu.Handball.engine.actions.controller.JMenuHelper#addMenuBarItem(String, char, ActionListener)}.
	 */
	@Test
	public void testAddMenuBarItem_6() {
		final JMenuItem m = addMenuItem("m");
		assertNotNull(m);
		final JMenuHelper.addMenuBarItem(JMenuItem.class, 'a', addMenuAction(m));
		assertTrue(JMenuHelper.addMenuBarItem(JMenuItem.class, 'a', addMenuAction(m)));
		assertTrue(JMenuHelper.addMenuBarItem(JP