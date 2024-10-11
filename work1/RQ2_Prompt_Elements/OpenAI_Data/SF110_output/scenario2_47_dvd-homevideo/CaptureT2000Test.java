// CaptureTest.java


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Capture}.
* It contains ten unit test cases for the {@link Capture#init()} method.
*/
class CaptureTest {

	/**
	* Test case for the {@link Capture#init()} method.
	* This test case checks if the {@link Capture#init()} method returns true when the thread is selected.
	*/
	@Test
	void testInit_threadSelected() {
		Capture capture = new Capture();
		capture.m_GUI.menuChkThread.setSelected(true);
		assertTrue(capture.init());
	}
	
	/**
	* Test case for the {@link Capture#init()} method.
	* This test case checks if the {@link Capture#init()} method returns false when the thread is not selected.
	*/
	@Test
	void testInit_threadNotSelected() {
		Capture capture = new Capture();
		capture.m_GUI.menuChkThread.setSelected(false);
		assertFalse(capture.init());
	}
	
	/**
	* Test case for the {@link Capture#init()} method.
	* This test case checks if the {@link Capture#init()} method returns true when the thread is selected and the error is true.
	*/
	@Test
	void testInit_threadSelected_errorTrue() {
		Capture capture = new Capture();
		capture.m_GUI.menuChkThread.setSelected(true);
		capture.m_Error = true;
		assertTrue(capture.init());
	}
	
	/**
	* Test case for the {@link Capture#init()} method.
	* This test case checks if the {@link Capture#init()} method returns false when the thread is selected and the error is false.
	*/
	@Test
	void testInit_threadSelected_errorFalse() {
		Capture capture = new Capture();
		capture.m_GUI.menuChkThread.setSelected(true);
		capture.m_Error = false;
		assertFalse(capture.init());
	}
	
	/**
	* Test case for the {@link Capture#init()} method.
	* This test case checks if the {@link Capture#init()} method returns true when the thread is not selected and the error is true.
	*/
	@Test
	void testInit_threadNotSelected_errorTrue() {
		Capture capture = new Capture();
		capture.m_GUI.menuChkThread.setSelected(false);
		capture.m_Error = true;
		assertTrue(capture.init());
	}
	
	/**
	* Test case for the {@link Capture#init()} method.
	* This test case checks if the {@link Capture#init()} method returns false when the thread is not selected and the error is false.
	*/
	@Test
	void testInit_threadNotSelected_errorFalse() {
		Capture capture = new Capture();
		capture.m_GUI.menuChkThread.setSelected(false);
		capture.m_Error = false;
		assertFalse(capture.init());
	}
	
	/**
	* Test case for the {@link Capture#init()} method.
	* This test case checks if the {@link Capture#init()} method returns true when the thread is selected and the error is true and the error check is true.
	*/
	@Test
	void testInit_threadSelected_errorTrue_errorCheckTrue() {
		Capture capture = new Capture();
		capture.m_GUI.menuChkThread.setSelected(true);
		capture.m_Error = true;
		capture.m_GUI.ErrorCheck(capture.m_GUI.strOutputDir + "/log/dvgrab.log");
		assertTrue(capture.init());
	}
	
	/**
	* Test case for the {@link Capture#init()} method.
	* This test case checks if the {@link Capture#init()} method returns false when the thread is selected and the error is true and the error check is false.
	*/
	@Test
	void testInit_threadSelected_errorTrue_errorCheckFalse() {
		Capture capture = new Capture();
		capture.m_GUI.menuChkThread.setSelected(true);
		capture.m_Error = true;
		capture.m_GUI.ErrorCheck(capture.m_GUI.strOutputDir + "/log/dvgrab.log");
		assertFalse(capture.init());
	}
	
	/**
	* Test case for the {@link Capture#init()} method.
	* This test case checks if the {@link Capture#init()} method returns true when the thread is selected and the error is false and the error check is true.
	*/
	@Test
	void testInit_threadSelected_errorFalse_errorCheckTrue() {
		Capture capture = new Capture();
		capture.m_GUI.menuChkThread.setSelected(true);
		capture.m_Error = false;
		capture.m_GUI.ErrorCheck(capture.m_GUI.strOutputDir + "/log/dvgrab.log");
		assertTrue(capture.init());
	}
	
	/**
	* Test case for the {@link Capture#init()} method.
	* This test case checks if the {@link Capture#init()} method returns false when the thread is selected and the error is false and the error check is false.
	*/
	@Test
	void testInit_threadSelected_errorFalse_errorCheckFalse() {
		Capture capture = new Capture();
		capture.m_GUI.menuChkThread.setSelected(true);
		capture.m_Error = false;
		capture.m_GUI.ErrorCheck(capture.m_GUI.strOutputDir + "/log/dvgrab.log");
		assertFalse(capture.init());
	}
}