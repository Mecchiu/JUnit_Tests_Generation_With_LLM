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