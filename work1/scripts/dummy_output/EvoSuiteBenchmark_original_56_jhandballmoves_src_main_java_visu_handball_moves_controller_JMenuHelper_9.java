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
     * Test method for {@link visu.handball.moves.controller.JMenuHelper#addMenuBarItem(JMenuBar, String)}.
     */
    @Test
    public void addMenuBarItemTest(@TempDir final File dir) throws Exception {
        final JMenuBar menuBar = new JMenuBar();
        final JMenu m = new JMenu("Menu Item");
        final JMenuItem submenuItem = new JMenuItem("SubMenu");

        submenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
              menuBar.add(submenuItem);
            }
		});
        menuBar.add(submenuItem);

        final JMenu m1 = new JMenu("Menu Item1");
        submenuItem.add(m1);

        final JMenuItem submenuItem1 = new JMenuItem("SubMenu1");
        submenuItem.add(submenuItem1);
        m1.add(submenuItem);

        final JMenu m2 = new JMenu("Menu Item1");
        submenuItem.add(m2);

        final JMenuItem submenuItem2 = new JMenuItem("SubMenu2");
        submenuItem1.add(submenuItem2);
        m2.add(submenuItem);

        m.add(menuBar);
        menuBar.add(m);

        JMenuItem menuItem = JMenuHelper.addMenuBarItem(menuBar, "Menu Item");
        menuItem.add(menuBar);

        menuItem = JMenuHelper.addMenuBarItem(menuBar, "Menu Item1");
        menuItem.add(menuBar);

        menuItem = JMenuHelper.addMenuBarItem(menuBar, "Menu Item2");
        menuItem.add(menuBar);

        menuItem = JMenuHelper.addMenuBarItem(menuBar, "Menu Item3");
        menuItem.add(menuBar);

        menuItem = JMenuHelper.addMenuBarItem(menuBar, "Menu Item4");
        menuItem.add(menuBar);

        menuItem = JMenuHelper.addMenuBarItem(menuBar, "Menu Item");
        menuItem.add(menuBar);

        menuItem = JMenuHelper.addMenuBarItem(menuBar, "Menu Item1");
        menuItem.add(menuBar);

        assertEquals("Error in adding a JMenu1 instance created", 10, menuItem.getModelIndex());

        JMenu m3 = new JMenu("MenuItem") {
                public Action getAction(int i) {
                    return null;
                }
        };
        menuItem.add(m3);
        assertEquals("Error in adding a JMenuItem instance for JMenuItem.getModelIndex()", 4, m3.getModelIndex());

        JMenuItem item = JMenuHelper.addMenuBarItem(menuBar, "MenuItemTest2");
        assertEquals("Error in adding a JMenu item for JMenu.getModelIndex()", 4, item.getModelIndex());

        menuBar.add(menuBar);
        // adding a simple JMenuItem with a menuBar inside
        menuBar.add(menuBar);

        menuBar.add(menuBar);
        menuBar.add(menuBar);

        m.add(menuBar);

        menuBar.add(menuBar);
        menuItem.add(menuBar);
    }
}