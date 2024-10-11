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
		static final String s = "+";
		static final String s_ = "-"
		;
		@Test
		public void addMenuBarItem() {
			JMenu menubar = new JMenu();
			String s1 = s + s_;
			JMenuItem item1 = new JMenuItem(s);
			JMenuItem item2 = addMenuItem(new JMenu(), s1+s_);
			assertNull(item1);
			assertNull(item2);
			String s2 = s + s;
			item1 = addMenuItem(new JMenu(), s1+s_);
			item2 = addMenuItem(new JMenu(), s2+s_);
			assertEquals(s+s_, s1+s2);
			assertNull(item1);
			assertNull(item2);
			String s3 = s + s;
			item1 = addMenuItem(new JMenu(), s);
			item2 = addMenuItem(new JMenu(), s+s);
			assertEquals(s+s, s1);
			assertEquals(s+s, s2);
		}
}