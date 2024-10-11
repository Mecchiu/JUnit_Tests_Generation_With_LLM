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
		* Creates a new instance.
		*/
		public GUI_1Test() {
		}

		/**
		* Creates a GUIValue object, and shows a message box with it.
		* @param message A string representing the message box text
		* @param ok If the OK button was clicked or not
		*/
		public int MessageBox(String message, int ok_but_clicked)
		{
				GUI.getInstance().MessageBox(message,ok_but_clicked);
				JOptionPane.showMessageDialog(null, message, "Test", JOptionPane.INFORMATION_MESSAGE);
				//assertTrue((message.length()>0),"Test is not working yet");
				return 0;
		}

}