// MenuTest.java


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.File;
import java.io.FileWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FilenameFilter;
import java.util.StringTokenizer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Menu}.
* It contains ten unit test cases for the {@link Menu#init()} method.
*/
class MenuTest {

	/**
	* Test case for {@link Menu#init()} method.
	* This test case checks if the {@link Menu#init()} method returns true when the
	* {@link Menu#m_Error} is set to true.
	*/
	@Test
	void testInit_m_Error_true() {
		Menu menu = new Menu();
		menu.m_Error = true;
		assertTrue(menu.init());
	}
	
	/**
	* Test case for {@link Menu#init()} method.
	* This test case checks if the {@link Menu#init()} method returns true when the
	* {@link Menu#m_GUI} is set to null.
	*/
	@Test
	void testInit_m_GUI_null() {
		Menu menu = new Menu();
		menu.m_GUI = null;
		assertTrue(menu.init());
	}
	
	/**
	* Test case for {@link Menu#init()} method.
	* This test case checks if the {@link Menu#init()} method returns true when the
	* {@link Menu#m_Thread} is set to null.
	*/
	@Test
	void testInit_m_Thread_null() {
		Menu menu = new Menu();
		menu.m_Thread = null;
		assertTrue(menu.init());
	}
	
	/**
	* Test case for {@link Menu#init()} method.
	* This test case checks if the {@link Menu#init()} method returns true when the
	* {@link Menu#m_Thread} is set to null.
	*/
	@Test
	void testInit_m_Thread_join_InterruptedException() {
		Menu menu = new Menu();
		menu.m_Thread = new Thread(menu);
		menu.m_Thread.start();
		try {
			menu.m_Thread.join();
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
		assertTrue(menu.init());
	}
	
	/**
	* Test case for {@link Menu#init()} method.
	* This test case checks if the {@link Menu#init()} method returns true when the
	* {@link Menu#m_Thread} is set to null.
	*/
	@Test
	void testInit_m_Thread_join_InterruptedException_m_Error_true() {
		Menu menu = new Menu();
		menu.m_Thread = new Thread(menu);
		menu.m_Thread.start();
		try {
			menu.m_Thread.join();
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
		menu.m_Error = true;
		assertTrue(menu.init());
	}
	
	/**
	* Test case for {@link Menu#init()} method.
	* This test case checks if the {@link Menu#init()} method returns true when the
	* {@link Menu#m_Thread} is set to null.
	*/
	@Test
	void testInit_m_Thread_join_InterruptedException_m_GUI_null() {
		Menu menu = new Menu();
		menu.m_Thread = new Thread(menu);
		menu.m_Thread.start();
		try {
			menu.m_Thread.join();
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
		menu.m_GUI = null;
		assertTrue(menu.init());
	}
	
	/**
	* Test case for {@link Menu#init()} method.
	* This test case checks if the {@link Menu#init()} method returns true when the
	* {@link Menu#m_Thread} is set to null.
	*/
	@Test
	void testInit_m_Thread_join_InterruptedException_m_GUI_ErrorCheck_true() {
		Menu menu = new Menu();
		menu.m_Thread = new Thread(menu);
		menu.m_Thread.start();
		try {
			menu.m_Thread.join();
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
		menu.m_GUI = new GUI();
		menu.m_GUI.strOutputDir = "";
		assertTrue(menu.init());
	}
	
	/**
	* Test case for {@link Menu#init()} method.
	* This test case checks if the {@link Menu#init()} method returns true when the
	* {@link Menu#m_Thread} is set to null.
	*/
	@Test
	void testInit_m_Thread_join_InterruptedException_m_GUI_ErrorCheck_false() {
		Menu menu = new Menu();
		menu.m_Thread = new Thread(menu);
		menu.m_Thread.start();
		try {
			menu.m_Thread.join();
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
		menu.m_GUI = new GUI();
		menu.m_GUI.strOutputDir = "";
		menu.m_GUI.strOutputDir = "";
		assertTrue(menu.init());
	}
	
	/**
	* Test case for {@link Menu#init()} method.
	* This test case checks if the {@link Menu#init()} method returns true when the
	* {@link Menu#m_Thread} is set to null.
	*/
	@Test
	void testInit_m_Thread_join_InterruptedException_m_GUI_ErrorCheck_false_m_Error_true() {
		Menu menu = new Menu();
		menu.m_Thread = new Thread(menu);
		menu.m_Thread.start();
		try {
			menu.m_Thread.join();
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
		menu.m_GUI = new GUI();
		menu.m_GUI.strOutputDir = "";
		menu.m_GUI.strOutputDir = "";
		menu.m_Error = true;
		assertTrue(menu.init());
	}
	
	/**
	* Test case for {@link Menu#init()} method.
	* This test case checks if the {@link Menu#init()} method returns true when the
	* {@link Menu#m_Thread} is set to null.
	*/
	@Test
	void testInit_m_Thread_join_InterruptedException_m_GUI_ErrorCheck_false_m_GUI_null() {
		Menu menu = new Menu();
		menu.m_Thread = new Thread(menu);
		menu.m_Thread.start();
		try {
			menu.m_Thread.join();
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
		menu.m_GUI = new GUI();
		menu.m_GUI.strOutputDir = "";
		menu.m_GUI.strOutputDir = "";
		menu.m_GUI = null;
		assertTrue(menu.init());
	}
	
	/**
	* Test case for {@link Menu#init()} method.
	* This test case checks if the {@link Menu#init()} method returns true when the
	* {@link Menu#m_Thread} is set to null.
	*/
	@Test
	void testInit_m_Thread_join_InterruptedException_m_GUI_ErrorCheck_false_m_GUI_ErrorCheck_true() {
		Menu menu = new Menu();
		menu.m_Thread = new Thread(menu);
		menu.m_Thread.start();
		try {
			menu.m_Thread.join();
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
		menu.m_GUI = new GUI();
		menu.m_GUI.strOutputDir = "";
		menu.m_GUI.strOutputDir = "";
		menu.m_GUI.strOutputDir = "";
		assertTrue(menu.init());
	}
	
	/**
	* Test case for {@link Menu#init()} method.
	* This test case checks if the {@link Menu#init()} method returns true when the
	* {@link Menu#m_Thread} is set to null.
	*/
	@Test
	void testInit_m_Thread_join_InterruptedException_m_GUI_ErrorCheck_false_m_GUI_ErrorCheck_false() {
		Menu menu = new Menu();
		menu.m_Thread = new Thread(menu);
		menu.m_Thread.start();
		try {
			menu.m_Thread.join();
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
		menu.m_GUI = new GUI();
		menu.m_GUI.strOutputDir = "";
		menu.m_GUI.strOutputDir = "";
		menu.m_GUI.strOutputDir = "";
		assertTrue(menu.init());
	}
}