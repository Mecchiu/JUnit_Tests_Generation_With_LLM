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
	 * Test method for {@link visu.handball.moves.controller.JMenuHelper#JMenuHelper(java.awt.Container)}.
	 * Check the default constructor.
	 */
	@Test
	public void testJMenuHelper_01() {
		{
			final JMenuContainer c = new JMenuContainer(null, new DefaultMenuLayoutManager());
			assertEquals(0, c.getMaximumSize());
		}
		
		{
			final JMenuContainer c = new JMenuContainer(null, new DefaultMenuLayoutManager());
			assertNotNull(c);			
			assertEquals(0, c.getMaximumSize().height);
		}
		
		{
			final JMenuContainer c = new JMenuContainer(null, new DefaultMenuLayoutManager());
			assertNotNull(c);					
		}
	}

	/**
	 * Test method for {@link visu.handball.moves.controller.JMenuHelper#JMenuHelper(javax.swing.JMenu)}.
	 * Check the constructor with MenuBar.
	 */
	@Test
	public void testJMenuHelper_02() {
		final JMenuContainer c = new JMenuContainer(null, null);
		assertEquals(0, c.getMaximumSize().height);

		final JMenu m1 = new JMenu("1");
		c.addJMenuItem(m1);

		final JMenu m2 = new JMenu("2");
		final JMenuItem n = new JMenuItem("n");
		final JMenuItem m3 = new JMenuItem("m");
		m1.add(n);
		n.addActionListener(new javax.swing.JMenu.DefaultActionListener() {			
			public void actionPerformed(ActionEvent e) {
				assertEquals(3, c.getMenuCount());
			}
		});
		m2.add(m3);
		m2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				assertEquals(3, c.getMenuCount());
			}			
		});
		n.setEnabled(true);
		m3.setEnabled(false);
		{
			final JMenuMenu m = new JMenuMenu("menu");
			c.addJMenuItem(m);
			assertEquals(0, c.getMenuCount());
		}
		{
			final JMenuMenu m = new JMenuMenu("menu");
			m.add(new JMenuItem("menu item 1"));
			m.add(new JMenuItem("menu item 2"));
			m.add(new JMenuItem("menu item 3"));
			c.addJMenuItem(m);
			assertEquals(2, c.getMenuCount());
			c.setActiveSubMenuIndex(0);
			assertEquals(0, c.getSubMenuIndex(m).intValue());

			final JMenuMenu m = new JMenuMenu("menu");
			c.addJMenuItem(m);
			assertEquals(3, c.getMenuCount());
		}

		{
			final JMenu m = new JMenu("menu");
			javax.swing.JMenu m1 = new javax.swing.JMenu(m, "menu");
			m1.add(new JMenuItem("menu item 1"));
			m1.add(new JMenuItem("menu item 2"));
			m1.add(new JMenuItem("menu item 3"));
			c.addJMenuItem(m1);
			assertEquals(5, c.getMenuCount());
			c.setActiveSubMenuIndex(3);
			assertEquals(0, c.getSubMenuIndex(m1).intValue());
			assertEquals(3, c.getSubMenuIndex(m.getSubMenu(0)).intValue());
			assertEquals(4, c.getSubMenuIndex(m.getSubMenu(1)).intValue());
			assertEquals(5, c.getSubMenuIndex(m.getSubMenu(2)).intValue());
		}	
	}
}