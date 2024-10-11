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
		
	@Test
	public void testAddMenuBarItemString() {
		JMenuBar menuBar = new JMenuBar();
		menuBar.add(new JMenu("Menu"));
	}
	
	@Test
	public void testAddMenuBarItemCharacter() {
		JMenu menuBar = new JMenu("Menu");
		menuBar.add(new JMenu("Menu"));
	}

	@Test
	public void testAddMenuBarItemStringAction() {
		JMenu menuBar = new JMenu("Menu");
		menuBar.add(new JMenuItem("Menu", new AbstractAction("Action 1")));
	}

	@Test
	public void testAddMenuBarItemCharacterAction() {
		JMenu menuBar = new JMenu("Menu");
		menuBar.add(new JMenuItem("Menu", new AbstractAction("Action 1")));
	}
	
	@Test
	public void testAddMenuBarItem() {
		JMenu menuBar = new JMenu("Menu");
		menuBar.add(new JMenu("Menu"));
	}
}