// GUI_1Test.java


//import com.sun.corba.se.impl.protocol.giopmsgheaders.Message;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileFilter;
import java.awt.Color;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.util.StringTokenizer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GUI}.
* It contains one unit test case for the {@link GUI#MessageBox(String)} method.
*/
class GUI_1Test {
		
    /**
     * This unit test case displays a message box with the supplied text.
     * @param message 	The message to display in the box
     */
	@Test
	public void Test1 (String message)
	{
		JFileChooser fcFileChooser = new JFileChooser();
		int i = fcFileChooser.showOpenDialog (null);

		if (i == JFileChooser.APPROVE_OPTION) {
			File file = fcFileChooser.getSelectedFile();
			int i1 = fcFileChooser.getSelectedIndex();	
		}
		else
		{
			System.out.println("No input");
		}
	}

    /**
	* Tests the method {@link GUI#MessageBox(String)}.
	*/
	@Test
	public void Test2() {
		String s = "Unknow message";
		int i = 1;
		StringTokenizer tok = new StringTokenizer(s, " ");
		boolean b = (tok.hasMoreElements() == false );
		String msg = i + "";
		
		
		assertEq("message box should be blank", 0);
		
		String message = MessageBox(s);	
		assertEq("s should be blank after displaying the message box", message);
	}

	@Test
	public void Test3() {
		String s = "s should be blank after displaying the message box";
		String msg = MessageBox(s);	
		assertEq("s should be blank after displaying the message box", "s should be blank after displaying the message box");
	}
}