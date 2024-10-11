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
public GUI_0Test(boolean moduleCheck) {
             if (moduleCheck) {
                    String fileName = "VLC_HOMEVIDEO.IF";
                    File file = new File(fileName);
                    file = file.getParentFile();
                    if (file.exists()) {
                        checkForModules();
                    }
                    else
                        System.out.println("Module checking " + fileName + " not found ");
             }
             /* This test should always pass */
        }
}

//class Gui_1Test extends GUI_0Test {



