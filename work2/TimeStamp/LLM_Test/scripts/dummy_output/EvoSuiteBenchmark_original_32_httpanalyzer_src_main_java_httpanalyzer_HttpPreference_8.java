// HttpPreferenceTest.java
package httpanalyzer;

import java.util.Properties;
import javax.swing.JFrame;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HttpPreference}.
* It contains one unit test case for the {@link HttpPreference#loadPreference(HttpAnalyzerView, JFrame)} method.
*/
class HttpPreferenceTest {
		@Test
	// Create a new JFrame
		public void newJFrame() {

			JFrame f = new JFrame();
  	/*		JTextField textField = new JTextField("A plain text field");
			f.add(textField); -- Create a new JTextField inside frame!

  	// Set new line
  	   	  textField.setLineWrap(true);
  	   		textField.setMargin(10);
  	   		f.setDefaultCloseOperation(JFrame.NO_CLOSE);
 	   		f.setTitle("Untitled test");
  	// Do stuff
  		   f.pack();
  		   f.setVisible(true);
  		}
*/	  @Test
    public void loadPreference() {

    /*  	JTextField textField = new JTextField("A plain text field");
      textField.setLineWrap(false);
	      textField.setMargin(20);
	      f.add(textField); -- Create a new JTextField inside JFrame!

  	// Delete
  	  	  f.pack();
  	  
  	// Set new line
  	  	 f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
  	  f.setTitle("Untitled test");
  	*/	  
			JFrame f = new JFrame();
			f.pack();
			f.setTitle("Untitled test");
			f.setVisible(true);
			
	}

}
// HttpPreferenceAppletTest.java