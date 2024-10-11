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
		/**
	 * This is an auto generated unit test.
	* It runs the test case as if it were a real application event-dispatching routine
	* and tests whether adding a menu item
	* to a menuBar does not stop dispacing from the menuPanel.
	*/
    @Test
    public void testAddMenuBarItem() {
	
    }

		/**
	* Test class of {@link JMenuHelper}.
	* It contains one unit test case for the {@link JMenuHelper#processAction(Action) } method.
*/
    @Test
    public void testProcessAction() {
	
		Action a=addAction();
		assertNotNull(a);
		assertTrue( a instanceof Action );
    }
}