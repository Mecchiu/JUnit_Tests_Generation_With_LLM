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

// JMenuHelper.java
package visu.handball.moves.controller;

import java.awt.event.*;
import javax.swing.*;

public class JMenuHelper {

    /**
     * Add an element to the menubar.
     *
     * @param menuBar a JMenuBar
     * @param s a String
     * @return added JMenu
     */
    public static JMenu addMenuBarItem(JMenuBar menuBar, String s) {
        JMenu menu = new JMenu(s);
        menuBar.add(menu);
        return menu;
    }
}

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
	
	/**
	* Test case for the {@link JMenuHelper#addMenuBarItem(JMenuBar, String)} method.
	* It tests if the method returns a JMenu object with the correct name.
	*/
	@Test
	public void testAddMenuBarItemName() {
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = JMenuHelper.addMenuBarItem(menuBar, "Test");
		assertEquals("Test", menu.getText());
	}
}

// JMenuHelper.java
package visu.handball.moves.controller;

import java.awt.event.*;
import javax.swing.*;

public class JMenuHelper {

    /**
     * Add an element to the menubar.
     *
     * @param menuBar a JMenuBar
     * @param s a String
     * @return added JMenu
     */
    public static JMenu addMenuBarItem(JMenuBar menuBar, String s) {
        JMenu menu = new JMenu(s);
        menuBar.add(menu);
        return menu;
    }
}

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
	
	/**
	* Test case for the {@link JMenuHelper#addMenuBarItem(JMenuBar, String)} method.
	* It tests if the method returns a JMenu object with the correct name.
	*/
	@Test
	public void testAddMenuBarItemName() {
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = JMenuHelper.addMenuBarItem(menuBar, "Test");
		assertEquals("Test", menu.getText());
	}
	
	/**
	* Test case for the {@link JMenuHelper#addMenuBarItem(JMenuBar, String)} method.
	* It tests if the method returns a JMenu object with the correct name.
	*/
	@Test
	public void testAddMenuBarItemName2() {
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = JMenuHelper.addMenuBarItem(menuBar, "Test2");
		assertEquals("Test2", menu.getText());
	}
}

// JMenuHelper.java
package visu.handball.moves.controller;

import java.awt.event.*;
import javax.swing.*;

public class JMenuHelper {

    /**
     * Add an element to the menubar.
     *
     * @param menuBar a JMenuBar
     * @param s a String
     * @return added JMenu
     */
    public static JMenu addMenuBarItem(JMenuBar menuBar, String s) {
        JMenu menu = new JMenu(s);
        menuBar.add(menu);
        return menu;
    }
}

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
	
	/**
	* Test case for the {@link JMenuHelper#addMenuBarItem(JMenuBar, String)} method.
	* It tests if the method returns a JMenu object with the correct name.
	*/
	@Test
	public void testAddMenuBarItemName() {
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = JMenuHelper.addMenuBarItem(menuBar, "Test");
		assertEquals("Test", menu.getText());
	}
	
	/**
	* Test case for the {@link JMenuHelper#addMenuBarItem(JMenuBar, String)} method.
	* It tests if the method returns a JMenu object with the correct name.
	*/
	@Test
	public void testAddMenuBarItemName2() {
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = JMenuHelper.addMenuBarItem(menuBar, "Test2");
		assertEquals("Test2", menu.getText());
	}
	
	/**
	* Test case for the {@link JMenuHelper#addMenuBarItem(JMenuBar, String)} method.
	* It tests if the method returns a JMenu object with the correct name.
	*/
	@Test
	public void testAddMenuBarItemName3() {
		JMenuBar menuBar = new JMenuBar();
	