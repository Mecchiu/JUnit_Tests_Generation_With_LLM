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
	* The test case tests the normal case.
	*/
	@Test
	void testAddMenuBarItem_NormalCase() {
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = JMenuHelper.addMenuBarItem(menuBar, "Test");
		assertEquals("Test", menu.getText());
	}
	
	/**
	* Test case for the {@link JMenuHelper#addMenuBarItem(JMenuBar, String)} method.
	* The test case tests the case that the menu bar is null.
	*/
	@Test
	void testAddMenuBarItem_MenuBarIsNull() {
		JMenuBar menuBar = null;
		JMenu menu = JMenuHelper.addMenuBarItem(menuBar, "Test");
		assertNull(menu);
	}
	
	/**
	* Test case for the {@link JMenuHelper#addMenuBarItem(JMenuBar, String)} method.
	* The test case tests the case that the menu bar is empty.
	*/
	@Test
	void testAddMenuBarItem_MenuBarIsEmpty() {
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = JMenuHelper.addMenuBarItem(menuBar, "");
		assertNull(menu);
	}
	
	/**
	* Test case for the {@link JMenuHelper#addMenuBarItem(JMenuBar, String)} method.
	* The test case tests the case that the menu bar is null and the menu is empty.
	*/
	@Test
	void testAddMenuBarItem_MenuBarAndMenuAreEmpty() {
		JMenuBar menuBar = null;
		JMenu menu = JMenuHelper.addMenuBarItem(menuBar, "");
		assertNull(menu);
	}
	
	/**
	* Test case for the {@link JMenuHelper#addMenuBarItem(JMenuBar, String)} method.
	* The test case tests the case that the menu bar is empty and the menu is null.
	*/
	@Test
	void testAddMenuBarItem_MenuBarIsEmptyAndMenuIsNull() {
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = JMenuHelper.addMenuBarItem(menuBar, null);
		assertNull(menu);
	}
	
	/**
	* Test case for the {@link JMenuHelper#addMenuBarItem(JMenuBar, String)} method.
	* The test case tests the case that the menu bar is null and the menu is null.
	*/
	@Test
	void testAddMenuBarItem_MenuBarAndMenuAreNull() {
		JMenuBar menuBar = null;
		JMenu menu = JMenuHelper.addMenuBarItem(menuBar, null);
		assertNull(menu);
	}
	
	/**
	* Test case for the {@link JMenuHelper#addMenuBarItem(JMenuBar, String)} method.
	* The test case tests the case that the menu bar is empty and the menu is null.
	*/
	@Test
	void testAddMenuBarItem_MenuBarIsEmptyAndMenuIsNull() {
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = JMenuHelper.addMenuBarItem(menuBar, null);
		assertNull(menu);
	}
	
	/**
	* Test case for the {@link JMenuHelper#addMenuBarItem(JMenuBar, String)} method.
	* The test case tests the case that the menu bar is null and the menu is empty.
	*/
	@Test
	void testAddMenuBarItem_MenuBarIsNullAndMenuIsEmpty() {
		JMenuBar menuBar = null;
		JMenu menu = JMenuHelper.addMenuBarItem(menuBar, "");
		assertNull(menu);
	}
	
	/**
	* Test case for the {@link JMenuHelper#addMenuBarItem(JMenuBar, String)} method.
	* The test case tests the case that the menu bar is null and the menu is null.
	*/
	@Test
	void testAddMenuBarItem_MenuBarIsNullAndMenuIsNull() {
		JMenuBar menuBar = null;
		JMenu menu = JMenuHelper.addMenuBarItem(menuBar, null);
		assertNull(menu);
	}
	
	/**
	* Test case for the {@link JMenuHelper#addMenuBarItem(JMenuBar, String)} method.
	* The test case tests the case that the menu bar is empty and the menu is empty.
	*/
	@Test
	void testAddMenuBarItem_MenuBarIsEmptyAndMenuIsEmpty() {
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = JMenuHelper.addMenuBarItem(menuBar, "");
		assertNull(menu);
	}
}