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
		
					private static JPanel myView_0 = null;
			
			@Test
						public void nullArrayListTest() {
							assertSame("Should not be null", (List<String>) null, myView_0.getViewport().getView());
					}	
}