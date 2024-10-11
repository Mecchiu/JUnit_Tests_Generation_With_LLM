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
		* Test for addMenuBarItem(JMenuBar,String).
		*/
		@Test
		public void testAddMenuBarItemStringString() {
			StringMenuItem menuItem = new StringMenuItem("Test");
			JMenuBar menuBar = new JMenuBar();
			JMenuItem item1 = new JMenuItem("A");
			JMenuItem item2 = new JMenuItem("B");
			JMenuItem item3 = new JMenuItem("C");
			menuBar.add(item1);
			menuBar.add(item2);
			menuBar.add(item3);
			menuItem.add(menuBar);
			menuItem.addSeparator();
			menuItem.add(new JMenu());
			assertEquals("A", menuItem.getText());
		}
		
		/**
		* Test for {@link JMenuHelper#addMenuBarItem(JMenuBar,String)} null argument
		*/
		@Test
		public void testAddMenuBarItemString() {
			assertNull(addMenuBarItem(null, "Test"));
		}
}