// ConvertTest.java


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.StringIndexOutOfBoundsException;
import java.util.StringTokenizer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Convert}.
* It contains ten unit test cases for the {@link Convert#init()} method.
*/
class ConvertTest {

	/**
	* Test case for {@link Convert#init()} method.
	* This test case checks if the method returns true when the transcode.log file contains an error.
	*/
	@Test
	void testInit1() {
		Convert convert = new Convert();
		convert.m_GUI.strOutputDir = "test";
		convert.m_GUI.menuChkThread = new JCheckBox();
		convert.m_GUI.menuChkThread.setSelected(false);
		convert.m_GUI.ErrorCheck = (String file) -> {
			return true;
		};
		assertTrue(convert.init());
	}
	
	/**
	* Test case for {@link Convert#init()} method.
	* This test case checks if the method returns true when the mplex.log file contains an error.
	*/
	@Test
	void testInit2() {
		Convert convert = new Convert();
		convert.m_GUI.strOutputDir = "test";
		convert.m_GUI.menuChkThread = new JCheckBox();
		convert.m_GUI.menuChkThread.setSelected(false);
		convert.m_GUI.ErrorCheck = (String file) -> {
			if (file.equals("test/log/transcode.log"))
				return false;
			else
				return true;
		};
		assertTrue(convert.init());
	}
	
	/**
	* Test case for {@link Convert#init()} method.
	* This test case checks if the method returns true when the m_Error variable is set to true.
	*/
	@Test
	void testInit3() {
		Convert convert = new Convert();
		convert.m_GUI.strOutputDir = "test";
		convert.m_GUI.menuChkThread = new JCheckBox();
		convert.m_GUI.menuChkThread.setSelected(false);
		convert.m_GUI.ErrorCheck = (String file) -> {
			return false;
		};
		convert.m_Error = true;
		assertTrue(convert.init());
	}
	
	/**
	* Test case for {@link Convert#init()} method.
	* This test case checks if the method returns false when the transcode.log file does not contain an error.
	*/
	@Test
	void testInit4() {
		Convert convert = new Convert();
		convert.m_GUI.strOutputDir = "test";
		convert.m_GUI.menuChkThread = new JCheckBox();
		convert.m_GUI.menuChkThread.setSelected(false);
		convert.m_GUI.ErrorCheck = (String file) -> {
			return false;
		};
		assertFalse(convert.init());
	}
	
	/**
	* Test case for {@link Convert#init()} method.
	* This test case checks if the method returns false when the mplex.log file does not contain an error.
	*/
	@Test
	void testInit5() {
		Convert convert = new Convert();
		convert.m_GUI.strOutputDir = "test";
		convert.m_GUI.menuChkThread = new JCheckBox();
		convert.m_GUI.menuChkThread.setSelected(false);
		convert.m_GUI.ErrorCheck = (String file) -> {
			if (file.equals("test/log/transcode.log"))
				return false;
			else
				return true;
		};
		assertFalse(convert.init());
	}
	
	/**
	* Test case for {@link Convert#init()} method.
	* This test case checks if the method returns false when the m_Error variable is set to false.
	*/
	@Test
	void testInit6() {
		Convert convert = new Convert();
		convert.m_GUI.strOutputDir = "test";
		convert.m_GUI.menuChkThread = new JCheckBox();
		convert.m_GUI.menuChkThread.setSelected(false);
		convert.m_GUI.ErrorCheck = (String file) -> {
			return false;
		};
		convert.m_Error = false;
		assertFalse(convert.init());
	}
	
	/**
	* Test case for {@link Convert#init()} method.
	* This test case checks if the method returns true when the transcode.log file contains an error and the mplex.log file does not contain an error.
	*/
	@Test
	void testInit7() {
		Convert convert = new Convert();
		convert.m_GUI.strOutputDir = "test";
		convert.m_GUI.menuChkThread = new JCheckBox();
		convert.m_GUI.menuChkThread.setSelected(false);
		convert.m_GUI.ErrorCheck = (String file) -> {
			if (file.equals("test/log/transcode.log"))
				return true;
			else
				return false;
		};
		assertTrue(convert.init());
	}
	
	/**
	* Test case for {@link Convert#init()} method.
	* This test case checks if the method returns true when the mplex.log file contains an error and the transcode.log file does not contain an error.
	*/
	@Test
	void testInit8() {
		Convert convert = new Convert();
		convert.m_GUI.strOutputDir = "test";
		convert.m_GUI.menuChkThread = new JCheckBox();
		convert.m_GUI.menuChkThread.setSelected(false);
		convert.m_GUI.ErrorCheck = (String file) -> {
			if (file.equals("test/log/transcode.log"))
				return false;
			else
				return true;
		};
		assertTrue(convert.init());
	}
	
	/**
	* Test case for {@link Convert#init()} method.
	* This test case checks if the method returns true when the transcode.log file contains an error and the m_Error variable is set to true.
	*/
	@Test
	void testInit9() {
		Convert convert = new Convert();
		convert.m_GUI.strOutputDir = "test";
		convert.m_GUI.menuChkThread = new JCheckBox();
		convert.m_GUI.menuChkThread.setSelected(false);
		convert.m_GUI.ErrorCheck = (String file) -> {
			if (file.equals("test/log/transcode.log"))
				return true;
			else
				return false;
		};
		convert.m_Error = true;
		assertTrue(convert.init());
	}
	
	/**
	* Test case for {@link Convert#init()} method.
	* This test case checks if the method returns true when the mplex.log file contains an error and the m_Error variable is set to true.
	*/
	@Test
	void testInit10() {
		Convert convert = new Convert();
		convert.m_GUI.strOutputDir = "test";
		convert.m_GUI.menuChkThread = new JCheckBox();
		convert.m_GUI.menuChkThread.setSelected(false);
		convert.m_GUI.ErrorCheck = (String file) -> {
			if (file.equals("test/log/transcode.log"))
				return false;
			else
				return true;
		};
		convert.m_Error = true;
		assertTrue(convert.init());
	}
}

// DVD.java
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.StringIndexOutOfBoundsException;
import java.util.StringTokenizer;

/**
 * @author Shane Santner
 * This class is used to create the DVD image.  It
 * explicitly calls the mkisofs command after meticulously
 * preparing the options that can be passed to mkisofs.
 *
 * TODO - Break mkisofs out into its own class.
 *        Figure out how to calculate remaining time even if
 *        video was not captured from the camcorder during the
 *        current session.
 *        Need to handle input, output and error streams
 *        more appropriatly.
 */
public class DVD implements Runnable {

    public boolean init() {
        if (m_GUI.menuChkThread.isSelected()) {
            m_Thread = new Thread(this);
            m_Thread.start();
            try {
                m_Thread.join();
            } catch (InterruptedException ex) {
                SaveStackTrace.printTrace(m_GUI.strOutputDir, ex);
                m_GUI.MessageBox(m_BaseErr + "Could not join DVD.java thread\n" + ex.toString(), 0);
                ex.printStackTrace();
                m_Error = true;
            }
        } else
            MakeISO();
        /* 
         * Check mkisofs.log for any sign of an error.
         * If the file contains an error then return an error.  Also
         * check m_Error to see if it was set while executing the 
         * MakeISO method.
         */
        return (m_Error || m_GUI.ErrorCheck(m_GUI.strOutputDir + "/log/mkisofs.log"));
    }
}

// DVDTest.java


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.StringIndexOutOfBoundsException;
import java.util.StringTokenizer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DVD}.
* It contains two unit test cases for the {@link DVD#init()} method.
*/
class DVDTest {
		
	/**
	* Test case for {@link DVD#init()} method.
	* This test case checks if the method returns true when the mkisofs.log file contains an error.
	*/
	@Test
	void testInit1() {
		DVD dvd = new DVD();
		dvd.m_GUI.strOutputDir = "test";
		dvd.m_GUI.menuChkThread = new JCheckBox();
		dvd.m_GUI.menuChkThread.setSelected(false);
		dvd.m_GUI.ErrorCheck = (String file) -> {
			return true;
		};
		assertTrue(dvd.init());
	}
	
	/**
	* Test case for {@link DVD#init()} method.
	* This test case checks if the method returns true when the m_Error variable is set to true.
	*/
	@Test
	void testInit2() {
		DVD dvd = new DVD();
		dvd.m_GUI.strOutputDir = "test";
		dvd.m_GUI.menuChkThread = new JCheckBox();
		dvd.m_GUI.menuChkThread.setSelected(false);
		dvd.m_GUI.ErrorCheck = (String file) -> {
			return false;
		};
		dvd.m_Error = true;
		assertTrue(dvd.init());
	}
	
	/**
	* Test case for {@link DVD#init()} method.
	* This test case checks if the method returns false when the mkisofs.log file does not contain an error.
	*/
	@Test
	void testInit3() {
		DVD dvd = new DVD();
		dvd.m_GUI.strOutputDir = "test";
		dvd.m_GUI.menuChkThread = new JCheckBox();
		dvd.m_GUI.menuChkThread.setSelected(false);
		dvd.m_GUI.ErrorCheck = (String file) -> {
			return false;
		};
		assertFalse(dvd.init());
	}
	
	/**
	* Test case for {@link DVD#init()} method.
	* This test case checks if the method returns false when the m_Error variable is set to false.
	*/
	@Test
	void testInit4() {
		DVD dvd = new DVD();
		dvd.m_GUI.strOutputDir = "test";
		dvd.m_GUI.menuChkThread = new JCheckBox();
		dvd.m_GUI.menuChkThread.setSelected(false);
		dvd.m_GUI.ErrorCheck = (String file) -> {
			return false;
		};
		dvd.m_Error = false;
		assertFalse(dvd.init());
	}
}

// ErrorCheck.java
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.StringIndexOutOfBoundsException;
import java.util.StringTokenizer;

/**
 * @author Shane Santner
 * This class is used to check the log files for any
 * sign of an error.  It is called by the other classes
 * to determine if an error has occured.
 */
public class ErrorCheck {

    public boolean init(String strFile) {
        boolean bError = false;
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(strFile)));
            String strLine;
            while ((strLine = in.readLine()) != null) {
                if (strLine.indexOf("ERROR") != -1) {
                    bError = true;
                    break;
                }
            }
            in.close();
        } catch (IOException ex) {
            SaveStackTrace.printTrace(m_GUI.strOutputDir, ex);
            m_GUI.MessageBox(m_BaseErr + "Could not open " + strFile + "\n" + ex.toString(), 0);
            ex.printStackTrace();
            bError = true;
        }
        return bError;
    }
}

// ErrorCheckTest.java


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.StringIndexOutOfBoundsException;
import java.util.StringTokenizer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ErrorCheck}.
* It contains two unit test cases for the {@link ErrorCheck#init(String)} method.
*/
class ErrorCheckTest {
		
	/**
	* Test case for {@link ErrorCheck#init(String)} method.
	* This test case checks if the method returns true when the file contains an error.
	*/
	@Test
	void testInit1() {
		ErrorCheck errorCheck = new ErrorCheck();
		assertTrue(errorCheck.init("test/log/test.log"));
	}
	
	/**
	* Test case for {@link ErrorCheck#init(String)} method.
	* This test case checks if the