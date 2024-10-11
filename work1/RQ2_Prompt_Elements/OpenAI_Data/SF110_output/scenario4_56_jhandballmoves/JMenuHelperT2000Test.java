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
		* Test case for {@link JMenuHelper#addMenuBarItem(JMenuBar, String)}
		*
		* @throws Exception
		*/
		@Test
		void testAddMenuBarItem() throws Exception {
				JMenuBar menuBar = new JMenuBar();
				JMenu menu = JMenuHelper.addMenuBarItem(menuBar, "Test");
				assertEquals(1, menuBar.getMenuCount());
				assertEquals(menu, menuBar.getMenu(0));
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
     *
     * @return added JMenu
     */
    public static JMenu addMenuBarItem(JMenuBar menuBar, String s) {
        JMenu menu = new JMenu(s);
        menuBar.add(menu);
        return menu;
    }

    private static JMenuItem processAction(Action a) {
        JMenuItem menuItem = new JMenuItem(a);
        return menuItem;
    }

    /**
     * Setze das Zeichen nach '_' als Mnemonic des MenuItems
     * @param s
     */
    private static void processMnemonic(JMenuItem menuItem, String s) {
        int index = s.indexOf('_');
        if (index != -1) {
            menuItem.setMnemonic(s.charAt(index + 1));
        }
    }

    /**
     * Insert a JMenuItem to a given JMenu.
     *
     * @param m
     *            a JMenu
     * @param s
     *            a String
     * @param keyChar
     *            a char
     * @param al
     *            an ActionListener
     *
     * @return a JMenuItem
     */
    public static JMenuItem addMenuItem(JMenu m, String s, char keyChar, Action a, ActionListener al) {
        JMenuItem menuItem = processAction(a);
        menuItem.setText(s);
        menuItem.setMnemonic(keyChar);
        menuItem.addActionListener(al);
        m.add(menuItem);
        return menuItem;
    }

    public static JMenuItem addMenuItem(JMenu m, String s, char c) {
        JMenuItem menuItem = new JMenuItem(s, c);
        m.add(menuItem);
        return menuItem;
    }

    public static JMenuItem addMenuItem(JMenu m, String s) {
        JMenuItem menuItem = new JMenuItem(s);
        m.add(menuItem);
        return menuItem;
    }

    public static JMenuItem addMenuItem(JMenu m, String s, ActionListener al) {
        JMenuItem menuItem = new JMenuItem(s);
        menuItem.addActionListener(al);
        m.add(menuItem);
        return menuItem;
    }

    public static JMenuItem addMenuItem(JMenu m, String s, Action a) {
        JMenuItem menuItem = processAction(a);
        menuItem.setText(s);
        m.add(menuItem);
        return menuItem;
    }

    public static JMenuItem addMenuItem(JMenu m, String s, char c, Action a) {
        JMenuItem menuItem = processAction(a);
        menuItem.setText(s);
        menuItem.setMnemonic(c);
        m.add(menuItem);
        return menuItem;
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
		* Test case for {@link JMenuHelper#addMenuBarItem(JMenuBar, String)}
		*
		* @throws Exception
		*/
		@Test
		void testAddMenuBarItem() throws Exception {
				JMenuBar menuBar = new JMenuBar();
				JMenu menu = JMenuHelper.addMenuBarItem(menuBar, "Test");
				assertEquals(1, menuBar.getMenuCount());
				assertEquals(menu, menuBar.getMenu(0));
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
     *
     * @return added JMenu
     */
    public static JMenu addMenuBarItem(JMenuBar menuBar, String s) {
        JMenu menu = new JMenu(s);
        menuBar.add(menu);
        return menu;
    }

    private static JMenuItem processAction(Action a) {
        JMenuItem menuItem = new JMenuItem(a);
        return menuItem;
    }

    /**
     * Setze das Zeichen nach '_' als Mnemonic des MenuItems
     * @param s
     */
    private static void processMnemonic(JMenuItem menuItem, String s) {
        int index = s.indexOf('_');
        if (index != -1) {
            menuItem.setMnemonic(s.charAt(index + 1));
        }
    }

    /**
     * Insert a JMenuItem to a given JMenu.
     *
     * @param m
     *            a JMenu
     * @param s
     *            a String
     * @param keyChar
     *            a char
     * @param al
     *            an ActionListener
     *
     * @return a JMenuItem
     */
    public static JMenuItem addMenuItem(JMenu m, String s, char keyChar, Action a, ActionListener al) {
        JMenuItem menuItem = processAction(a);
        menuItem.setText(s);
        menuItem.setMnemonic(keyChar);
        menuItem.addActionListener(al);
        m.add(menuItem);
        return menuItem;
    }

    public static JMenuItem addMenuItem(JMenu m, String s, char c) {
        JMenuItem menuItem = new JMenuItem(s, c);
        m.add(menuItem);
        return menuItem;
    }

    public static JMenuItem addMenuItem(JMenu m, String s) {
        JMenuItem menuItem = new JMenuItem(s);
        m.add(menuItem);
        return menuItem;
    }

    public static JMenuItem addMenuItem(JMenu m, String s, ActionListener al) {
        JMenuItem menuItem = new JMenuItem(s);
        menuItem.addActionListener(al);
        m.add(menuItem);
        return menuItem;
    }

    public static JMenuItem addMenuItem(JMenu m, String s, Action a) {
        JMenuItem menuItem = processAction(a);
        menuItem.setText(s);
        m.add(menuItem);
        return menuItem;
    }

    public static JMenuItem addMenuItem(JMenu m, String s, char c, Action a) {
        JMenuItem menuItem = processAction(a);
        menuItem.setText(s);
