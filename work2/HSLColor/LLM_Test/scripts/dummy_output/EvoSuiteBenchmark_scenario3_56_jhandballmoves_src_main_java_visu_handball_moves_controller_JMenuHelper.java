// JMenuHelperTest.java
package visu.handball.moves.controller;

import java.awt.event.*;
import javax.swing.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JMenuHelper}.
* It contains ten unit test cases for the {@link JMenuHelper#addMenuBarItem(JMenuBar, String)} method.
*/
class JMenuHelperTest {
		
	/**
	* Test case for the {@link JMenuHelper#addMenuBarItem(JMenuBar, String)} method.
	* It tests if the method returns a JMenu object.
	*/
	@Test
	public void testAddMenuBarItem() {
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = JMenuHelper.addMenuBarItem(menuBar, "Test");
		assertTrue(menu instanceof JMenu);
	}
}