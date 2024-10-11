// GUI_2Test.java


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
* It contains one unit test case for the {@link GUI#ErrorCheck(String)} method.
*/
class GUI_2Test {
		String str;
		String[] allTokens;

		/**
  * Tests <code>ErrorCheck</code> method
  * with string <code>null</code>  as parameter
  * @throws java.io.IOException
  */
    @Test
    void testErrorCheck() throws FileNotFoundException, IOException {
        str = null;

        allTokens = new String[] {"Error", "Info", "Warning"};

        // check the result
        assertTrue(ErrorCheck(str));
        
        str = new String(allTokens);
        allTokens = new String[] {"Info", "Warning"};
        
        assertTrue(ErrorCheck(str));

        str = new String(allTokens);
        allTokens = new String[] {"Info"};
        
        assertFalse(ErrorCheck(str));

        str = new String(allTokens);
        allTokens = new String[] {};
        
        assertTrue(ErrorCheck(str));

        
        str = new String();
        String s = "", s1 = "Hello", s2 = "Hola";
        str = s;
        allTokens = new String[] {"Error", "Info"};
        allTokens = new String[] {"Warning"};

        System.out.println(str);
        System.out.println(allTokens);
        System.out.println(ErrorCheck(str));
        System.out.println(ErrorCheck(allTokens));


    }

   /**
  * Tests <code>CheckError</code> method
  * with string <code>null</code>
  *  as parameter
  * @throws java.io.IOException
  */
    @Test
    void testCheckError() throws FileNotFoundException, IOException {
        str = null;
        allTokens = new String[] {"Error", "Info", "Warning"};
        

        // check the result
        boolean result = CheckError(str);

        System.out.println(str);
        System.out.println(allTokens);
        System.out.println(result);
    }
    
    /**
  * Tests {@link GUI#CheckError(String)}.
  *
  */
    public void testCheckError() {
        System.out.println(GUI.CheckError("Welcome to Dvd-homevideo!"));
        System.out.println(GUI.CheckError("Welcome to Dvd-homevideo!"));
    }
}

// import com.sun.corba.se.impl.protocol.giopmsgheaders.FileTypeSet;
// import com.sun.corba.se.impl.protocol.giopmsgheaders.FileTypeSet;
// import java.io.EOFException;

//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.FileNotFoundException;
//import java.io.File;
//import java.io.FileWriter;
//import java.io.FileReader;
//import java.io.IOException;
//import java.io.NotBoundException;
//import java.io.Writer;
//import java.io.EOFException;
//import java.io.EOFException;
//import java.io.Reader;
//import java.io.Reader;
//import java.io.FileFilter;
//import java.io.IOException;
//import java.lang.reflect.Method;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//import javax.servlet.ServletException;
//import javax.servlet.ServletContext;
static public class Gui_ErrorTest
    implements Runnable {

    @WebServlet("/ErrorTest")
    public void testErrorInGui() {
        String str;
        String str_1, str_2;
        System.out.println("------ Test Error in Gui (Servlet)");

        str = "Error";
        // System.out.println("Error");

        try {
            //System.out.println("Error in Gui!");
            guiError(str);
        } catch (FileNotFoundException e) {
            //System.out.println("Exception caught:" + e);
            //System.out.println("File not found: " + e.getMessage());
        } catch (FileTypeSet e) {
            //System.out.println("Exception caught:" + e);
            //System.out.println("File type: " + e.toString());
        } catch (Exception e) {
            //System.out.println("Exception caught:" + e);
            //System.out.println("Unknown exception message: " + e.getMessage());
        } catch (ServletException e) {
            //System.out.println("Exception caught:" + e);
            //System.out.println("Exception caught while handling request:" +e.getMessage());
        } catch (IOException e) {
            //System.out.println("Exception caught:" + e);
            //System.out.println("IOException caught while handling request: " +e.getMessage());
        }

    }

    @WebServlet("/ErrorTest")
    public void testGetSession() {
        String str;
        String str_1, str_2;

        //System.out.println("------ Test GetSession");
        str = "Error";
        
        str_1 = guiGetSession();

        str_2 = guiGetSession();

        String s1, s2 = "error", s3 = "error", s4 = "ok";
}
}