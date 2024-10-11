// GUI_0Test.java


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
* It contains one unit test case for the {@link GUI#checkForModules()} method.
*/
class GUI_0Test {
		/**
    * Main method.
		* It calls {@link #checkForModules()}.
    * @param args
    */
    public static void main(String[] args) {
     GUI_0Test test = new GUI_0Test();
     test.checkForModules();
   }
	class GUI_0Test {
		/**
    * Main method.
		* It returns 1.
    */
		public int testMain() {
			return JOptionPane.showConfirmDialog(null, "Yes, This Test will be run! The raw1394 "
				+ "module is only needed to capture audio and video from the "
				+ "dv camcorder. Do you want to run? Yes "
				+ "No.");
		}
		class GUI {
			/**
    * Main method.
			* It calls {@link #checkForModules()}.
            */
			public static void checkForModules() {
				  assertTrue("Raw1394 is not present ", checkForModules());
			}
    }
    class GUI_1 extends GUI {}
	}
     class GUI_2 extends GUI_0Test {
	     public void testMain() {
           checkForModules();
		}
	}
     class GUI_3 extends GUI_0Test {
		   public void testMain() {
			   this.checkForModules();
		 }
		class GUI_4 extends GUI_1 {
				public void checkMain() {
					 assertFalse("This Test can be run if Raw1394 is not present", checkForModules());
				 }
		 }
}
}