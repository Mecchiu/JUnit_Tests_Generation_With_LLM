// Here's an implementation of the JMenuHelper class and its test class:

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

    @Test
    void testAddMenuBarItem() {
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = JMenuHelper.addMenuBarItem(menuBar, "File");
        assertNotNull(menu);
        assertEquals("File", menu.getText());
        assertEquals(1, menuBar.getMenuCount());
        assertEquals(menu, menuBar.getMenu(0));
    }

    @Test
    void testAddMenuBarItemWithNullMenuBar() {
        assertThrows(IllegalArgumentException.class, () -> {
            JMenuHelper.addMenuBarItem(null, "File");
        });
    }

    @Test
    void testAddMenuBarItemWithNullString() {
        JMenuBar menuBar = new JMenuBar();
        assertThrows(IllegalArgumentException.class, () -> {
            JMenuHelper.addMenuBarItem(menuBar, null);
        });
    }

    @Test
    void testAddMenuBarItemWithEmptyString() {
        JMenuBar menuBar = new JMenuBar();
        assertThrows(IllegalArgumentException.class, () -> {
            JMenuHelper.addMenuBarItem(menuBar, "");
        });
    }

    @Test
    void testAddMenuBarItemWithExistingMenu() {
        JMenuBar menuBar = new JMenuBar();
        JMenu menu1 = JMenuHelper.addMenuBarItem(menuBar, "File");
        JMenu menu2 = JMenuHelper.addMenuBarItem(menuBar, "Edit");
        JMenu menu3 = JMenuHelper.addMenuBarItem(menuBar, "File");
        assertNotNull(menu3);
        assertEquals("File", menu3.getText());
        assertEquals(2, menuBar.getMenuCount());
        assertEquals(menu1, menuBar.getMenu(0));
        assertEquals(menu2, menuBar.getMenu(1));
        assertEquals(menu3, menuBar.getMenu(2));
    }

    @Test
    void testAddMenuBarItemWithManyMenus() {
        JMenuBar menuBar = new JMenuBar();
        for (int i = 0; i < 10; i++) {
            JMenuHelper.addMenuBarItem(menuBar, "Menu " + i);
        }
        assertEquals(10, menuBar.getMenuCount());
    }

    @Test
    void testAddMenuBarItemWithMnemonic() {
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = JMenuHelper.addMenuBarItem(menuBar, "File", KeyEvent.VK_F);
        assertNotNull(menu);
        assertEquals("File", menu.getText());
        assertEquals(KeyEvent.VK_F, menu.getMnemonic());
        assertEquals(1, menuBar.getMenuCount());
        assertEquals(menu, menuBar.getMenu(0));
    }

    @Test
    void testAddMenuBarItemWithAccelerator() {
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = JMenuHelper.addMenuBarItem(menuBar, "File", KeyEvent.VK_F, KeyEvent.VK_N);
        assertNotNull(menu);
        assertEquals("File", menu.getText());
        assertEquals(KeyEvent.VK_F, menu.getMnemonic());
        assertEquals(KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_DOWN_MASK), menu.getAccelerator());
        assertEquals(1, menuBar.getMenuCount());
        assertEquals(menu, menuBar.getMenu(0));
    }

    @Test
    void testAddMenuBarItemWithMnemonicAndAccelerator() {
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = JMenuHelper.addMenuBarItem(menuBar, "File", KeyEvent.VK_F, KeyEvent.VK_N, KeyEvent.CTRL_DOWN_MASK);
        assertNotNull(menu);
        assertEquals("File", menu.getText());
        assertEquals(KeyEvent.VK_F, menu.getMnemonic());
        assertEquals(KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_DOWN_MASK), menu.getAccelerator());
        assertEquals(1, menuBar.getMenuCount());
        assertEquals(menu, menuBar.getMenu(0));
    }

    @Test
    void testAddMenuBarItemWithInvalidMnemonic() {
        JMenuBar menuBar = new JMenuBar();
        assertThrows(IllegalArgumentException.class, () -> {
            JMenuHelper.addMenuBarItem(menuBar, "File", -1);
        });
    }

    @Test
    void testAddMenuBarItemWithInvalidAccelerator() {
        JMenuBar menuBar = new JMenuBar();
        assertThrows(IllegalArgumentException.class, () -> {
            JMenuHelper.addMenuBarItem(menuBar, "File", KeyEvent.VK_F, -1);
        });
    }
}