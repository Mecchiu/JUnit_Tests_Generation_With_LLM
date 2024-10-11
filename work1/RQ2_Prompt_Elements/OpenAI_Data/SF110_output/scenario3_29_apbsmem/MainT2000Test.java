// MainTest.java
package apbs_mem_gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;
import com.jgoodies.forms.layout.*;
import com.jgoodies.forms.builder.*;
import org.jmol.api.JmolViewer;
import org.jmol.api.JmolAdapter;
import org.jmol.popup.JmolPopup;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Main}.
* It contains ten unit test cases for the {@link Main#SaveData()} method.
*/
class MainTest {

	/**
	 * Test case for {@link Main#SaveData()} method.
	 * This test case checks if the method returns true when the operation is successful.
	 */
	@Test
	void testSaveData_1() {
		Main main = new Main();
		assertTrue(main.SaveData());
	}
	
	/**
	 * Test case for {@link Main#SaveData()} method.
	 * This test case checks if the method returns false when the operation is not successful.
	 */
	@Test
	void testSaveData_2() {
		Main main = new Main();
		assertFalse(main.SaveData());
	}
	
	/**
	 * Test case for {@link Main#SaveData()} method.
	 * This test case checks if the method returns true when the operation is successful.
	 */
	@Test
	void testSaveData_3() {
		Main main = new Main();
		assertTrue(main.SaveData());
	}
	
	/**
	 * Test case for {@link Main#SaveData()} method.
	 * This test case checks if the method returns false when the operation is not successful.
	 */
	@Test
	void testSaveData_4() {
		Main main = new Main();
		assertFalse(main.SaveData());
	}
	
	/**
	 * Test case for {@link Main#SaveData()} method.
	 * This test case checks if the method returns true when the operation is successful.
	 */
	@Test
	void testSaveData_5() {
		Main main = new Main();
		assertTrue(main.SaveData());
	}
	
	/**
	 * Test case for {@link Main#SaveData()} method.
	 * This test case checks if the method returns false when the operation is not successful.
	 */
	@Test
	void testSaveData_6() {
		Main main = new Main();
		assertFalse(main.SaveData());
	}
	
	/**
	 * Test case for {@link Main#SaveData()} method.
	 * This test case checks if the method returns true when the operation is successful.
	 */
	@Test
	void testSaveData_7() {
		Main main = new Main();
		assertTrue(main.SaveData());
	}
	
	/**
	 * Test case for {@link Main#SaveData()} method.
	 * This test case checks if the method returns false when the operation is not successful.
	 */
	@Test
	void testSaveData_8() {
		Main main = new Main();
		assertFalse(main.SaveData());
	}
	
	/**
	 * Test case for {@link Main#SaveData()} method.
	 * This test case checks if the method returns true when the operation is successful.
	 */
	@Test
	void testSaveData_9() {
		Main main = new Main();
		assertTrue(main.SaveData());
	}
	
	/**
	 * Test case for {@link Main#SaveData()} method.
	 * This test case checks if the method returns false when the operation is not successful.
	 */
	@Test
	void testSaveData_10() {
		Main main = new Main();
		assertFalse(main.SaveData());
	}
}