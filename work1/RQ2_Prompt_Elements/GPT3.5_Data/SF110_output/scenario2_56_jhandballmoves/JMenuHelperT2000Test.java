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
    void testAddMenuBarItemWithoutMnemonic() {
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = JMenuHelper.addMenuBarItem(menuBar, "File");
        assertEquals("File", menu.getText());
        assertEquals(0, menu.getMenuComponentCount());
    }
    
    @Test
    void testAddMenuBarItemWithMnemonic() {
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = JMenuHelper.addMenuBarItem(menuBar, "F_ile");
        assertEquals("File", menu.getText());
        assertEquals(KeyEvent.VK_I, menu.getMnemonic());
        assertEquals(0, menu.getMenuComponentCount());
    }
    
    @Test
    void testAddMenuBarItemWithMultipleMnemonics() {
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = JMenuHelper.addMenuBarItem(menuBar, "F_ile_Exit");
        assertEquals("FileExit", menu.getText());
        assertEquals(KeyEvent.VK_I, menu.getMnemonic());
        assertEquals(0, menu.getMenuComponentCount());
    }
    
    @Test
    void testAddMenuBarItemWithNoText() {
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = JMenuHelper.addMenuBarItem(menuBar, "");
        assertEquals("", menu.getText());
        assertEquals(0, menu.getMenuComponentCount());
    }
    
    @Test
    void testAddMenuBarItemWithNullText() {
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = JMenuHelper.addMenuBarItem(menuBar, null);
        assertNull(menu);
    }
    
    @Test
    void testAddMenuBarItemToNullMenuBar() {
        JMenu menu = JMenuHelper.addMenuBarItem(null, "File");
        assertNull(menu);
    }
    
    @Test
    void testAddMenuBarItemWithSubMenu() {
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = JMenuHelper.addMenuBarItem(menuBar, "File");
        JMenu subMenu = JMenuHelper.addMenuBarItem(menu, "New");
        assertEquals("New", subMenu.getText());
        assertEquals(0, subMenu.getMenuComponentCount());
        assertEquals(1, menu.getMenuComponentCount());
    }
    
    @Test
    void testAddMenuBarItemWithMultipleSubMenus() {
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = JMenuHelper.addMenuBarItem(menuBar, "File");
        JMenu subMenu1 = JMenuHelper.addMenuBarItem(menu, "New");
        JMenu subMenu2 = JMenuHelper.addMenuBarItem(menu, "Open");
        assertEquals("New", subMenu1.getText());
        assertEquals("Open", subMenu2.getText());
        assertEquals(0, subMenu1.getMenuComponentCount());
        assertEquals(0, subMenu2.getMenuComponentCount());
        assertEquals(2, menu.getMenuComponentCount());
    }
    
    @Test
    void testAddMenuBarItemWithSubMenuAndMnemonic() {
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = JMenuHelper.addMenuBarItem(menuBar, "F_ile");
        JMenu subMenu = JMenuHelper.addMenuBarItem(menu, "N_ew");
        assertEquals("File", menu.getText());
        assertEquals(KeyEvent.VK_I, menu.getMnemonic());
        assertEquals("New", subMenu.getText());
        assertEquals(KeyEvent.VK_N, subMenu.getMnemonic());
        assertEquals(0, subMenu.getMenuComponentCount());
        assertEquals(1, menu.getMenuComponentCount());
    }
    
    @Test
    void testAddMenuBarItemWithSubMenuAndMultipleMnemonics() {
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = JMenuHelper.addMenuBarItem(menuBar, "F_ile_Exit");
        JMenu subMenu = JMenuHelper.addMenuBarItem(menu, "N_ew");
        assertEquals("FileExit", menu.getText());
        assertEquals(KeyEvent.VK_I, menu.getMnemonic());
        assertEquals("New", subMenu.getText());
        assertEquals(KeyEvent.VK_N, subMenu.getMnemonic());
        assertEquals(0, subMenu.getMenuComponentCount());
        assertEquals(1, menu.getMenuComponentCount());
    }
}