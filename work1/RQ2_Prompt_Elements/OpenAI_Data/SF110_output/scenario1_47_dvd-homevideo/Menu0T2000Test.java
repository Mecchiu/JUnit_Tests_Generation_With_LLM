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
	* {@link Menu#m_Error} variable is set to true.
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
	* {@link Menu#m_Error} variable is set to false.
	*/
	@Test
	void testInit_m_Error_false() {
		Menu menu = new Menu();
		menu.m_Error = false;
		assertTrue(menu.init());
	}
	
	/**
	* Test case for {@link Menu#init()} method.
	* This test case checks if the {@link Menu#init()} method returns true when the
	* {@link Menu#m_Error} variable is set to true and the {@link Menu#m_GUI} variable
	* is set to null.
	*/
	@Test
	void testInit_m_Error_true_m_GUI_null() {
		Menu menu = new Menu();
		menu.m_Error = true;
		menu.m_GUI = null;
		assertTrue(menu.init());
	}
	
	/**
	* Test case for {@link Menu#init()} method.
	* This test case checks if the {@link Menu#init()} method returns true when the
	* {@link Menu#m_Error} variable is set to false and the {@link Menu#m_GUI} variable
	* is set to null.
	*/
	@Test
	void testInit_m_Error_false_m_GUI_null() {
		Menu menu = new Menu();
		menu.m_Error = false;
		menu.m_GUI = null;
		assertTrue(menu.init());
	}
	
	/**
	* Test case for {@link Menu#init()} method.
	* This test case checks if the {@link Menu#init()} method returns true when the
	* {@link Menu#m_Error} variable is set to true and the {@link Menu#m_GUI} variable
	* is set to a valid object.
	*/
	@Test
	void testInit_m_Error_true_m_GUI_valid() {
		Menu menu = new Menu();
		menu.m_Error = true;
		menu.m_GUI = new GUI();
		assertTrue(menu.init());
	}
	
	/**
	* Test case for {@link Menu#init()} method.
	* This test case checks if the {@link Menu#init()} method returns true when the
	* {@link Menu#m_Error} variable is set to false and the {@link Menu#m_GUI} variable
	* is set to a valid object.
	*/
	@Test
	void testInit_m_Error_false_m_GUI_valid() {
		Menu menu = new Menu();
		menu.m_Error = false;
		menu.m_GUI = new GUI();
		assertTrue(menu.init());
	}
	
	/**
	* Test case for {@link Menu#init()} method.
	* This test case checks if the {@link Menu#init()} method returns true when the
	* {@link Menu#m_Error} variable is set to true and the {@link Menu#m_GUI} variable
	* is set to a valid object and the {@link Menu#m_Thread} variable is set to null.
	*/
	@Test
	void testInit_m_Error_true_m_GUI_valid_m_Thread_null() {
		Menu menu = new Menu();
		menu.m_Error = true;
		menu.m_GUI = new GUI();
		menu.m_Thread = null;
		assertTrue(menu.init());
	}
	
	/**
	* Test case for {@link Menu#init()} method.
	* This test case checks if the {@link Menu#init()} method returns true when the
	* {@link Menu#m_Error} variable is set to false and the {@link Menu#m_GUI} variable
	* is set to a valid object and the {@link Menu#m_Thread} variable is set to null.
	*/
	@Test
	void testInit_m_Error_false_m_GUI_valid_m_Thread_null() {
		Menu menu = new Menu();
		menu.m_Error = false;
		menu.m_GUI = new GUI();
		menu.m_Thread = null;
		assertTrue(menu.init());
	}
	
	/**
	* Test case for {@link Menu#init()} method.
	* This test case checks if the {@link Menu#init()} method returns true when the
	* {@link Menu#m_Error} variable is set to true and the {@link Menu#m_GUI} variable
	* is set to a valid object and the {@link Menu#m_Thread} variable is set to a valid
	* object.
	*/
	@Test
	void testInit_m_Error_true_m_GUI_valid_m_Thread_valid() {
		Menu menu = new Menu();
		menu.m_Error = true;
		menu.m_GUI = new GUI();
		menu.m_Thread = new Thread(menu);
		assertTrue(menu.init());
	}
	
	/**
	* Test case for {@link Menu#init()} method.
	* This test case checks if the {@link Menu#init()} method returns true when the
	* {@link Menu#m_Error} variable is set to false and the {@link Menu#m_GUI} variable
	* is set to a valid object and the {@link Menu#m_Thread} variable is set to a valid
	* object.
	*/
	@Test
	void testInit_m_Error_false_m_GUI_valid_m_Thread_valid() {
		Menu menu = new Menu();
		menu.m_Error = false;
		menu.m_GUI = new GUI();
		menu.m_Thread = new Thread(menu);
		assertTrue(menu.init());
	}
}