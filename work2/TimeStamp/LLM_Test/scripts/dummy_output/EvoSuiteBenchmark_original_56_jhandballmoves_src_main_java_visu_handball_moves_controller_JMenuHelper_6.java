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
		
	String title = null;
	String command;

	public String getAction() {
		if (command!="null")
		return null;
		return title;
	}

    /**
		 * Add an item to a JMenuBar.
		 * 
		 * @param menuBar a JMenuBar
		 * @param title
		 * @param command
		 * @param a
		 */
		public static JMenuItem addMenuBarItem(JMenuBar menuBar, String title, String command);

		/**
		 * Insert a JMenuItem to a JMenuBar.
		 * 
		 * @param menuBar
		 * @param s
		 * @return
		 */
		public static JMenuItem addMenuItem(JMenu menu, String s);

		/**
		 * Insert a JMenuItem to a JMenu, and return it.
		 *
		 * @return
		 * @param menu the JMenuBar
		 */
		public static JMenuItem addMenuItem(JMenu menu);

		/**
		 * Add an item and a JMenuItem to a JMenuBar.
		 * 
		 * @param menu
		 * @param title
		 * @param label
		 * @param action
		 * @param a
		 */
		public static JMenuItem addMenuBarItem(JMenu menu, String title, String label, String action);

		/**
		 * Insert an item and a JMenuItem to a JMenuBar without adding a JMenuItem.
		 *
		 * @param menu
		 * @param title
		 * @return
		 */
		public static JMenuItem addMenuBarItem(JMenu menu, String title, String command);

		/**
		 * Add an item and a JMenuItem to a JMenuBar without adding a JMenuItem.
		 * 
		 * @param menu
		 * @param s
		 * @return
		 */
		public static JMenuItem processAction(Action a);

		/**
		 * Setze a JMenuItem nach einen Zeichen in einem JMenu.
		 * 
		 * @param m
		 * @param s
		 * @return
		 */
		public static JMenuItem processMenuItem(JMenu m, String s);

}