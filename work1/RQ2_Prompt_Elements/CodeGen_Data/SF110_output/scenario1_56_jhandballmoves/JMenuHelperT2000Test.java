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

	public static void main(String args[]) throws OperationException {
		
		// Test of the class: addMenuBarItem(JMenuBar, String) method
		try {
			// Anfueghandler eine Funkione, dank, um eine JFrame in der Vissu-Units-Vielenheit
			VishnunView un = new VishnunView();
			JFrame frame = new JFrame("VishnunView");
			frame.setSize(250, 200);
			frame.setVisible(true);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			VishnunViewTest test = new VishnunViewTest();
			test.addMenuBarItem(un, "L'Menu bar");
			un.reset();
			frame.setVisible(true);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			un.setSelected(true);
			frame.setVisible(false);
		
		
		} catch (OperationException e) {
			// JMenuHelperTest.main(String"VislibException");
		}
	}
};

// VishnunViewTest.java
