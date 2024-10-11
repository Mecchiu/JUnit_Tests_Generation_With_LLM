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
		
    @Test
    public void testAddMenuBarItem() {
    	
    	// JMenuBar m = new JMenuBar();
    	javax.swing.JMenuBar m = new javax.swing.JMenuBar();

        JMenuBar menuBar = new MenuBar();
        JMenu menu = new JMenu();
        JMenuItem menuItem = new JMenuItem("JMenuItem");
        menu = addMenuItem(menu, "Foo", menuItem, "setAction", "jMenuItemAction");
        menuBar.add(menu);
        JMenuItem menuItem2 = new JMenuItem("JMenuItem");
        menu = addMenuBarItem(menu, "Foo", 0x0, menuItem2, "setAction", "jMenuItemAction");
        menuItem = addMenuItem(menu, "Foo", menuItem2, "setAction", "jMenuItemAction");
        menuBubble.add(menu);
        menuBar.add(menuBubble);

        // Füge die Zeile ein, in der drei Zeile ein. Die dritte Zeile sein.

        assertEquals(5, menuBar.getItemCount());

        menuItem.setText("MenuItem");

        menuItem2.setText("MenuItem");

    	menuBubble.removeAll();
    	addMenuItem(menuBubble, "Foo", "C", "jMenuItemAction", null);

    }
		private JMenuBubble menuBubble = new JMenuBubble();

        JMenuBar menuBar = new MenuBar();
        JMenu menu = new JMenu();
        JMenuItem menuItem = new JMenuItem("JMenuItem");
}