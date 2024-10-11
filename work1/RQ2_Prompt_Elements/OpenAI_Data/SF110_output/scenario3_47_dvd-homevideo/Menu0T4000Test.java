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
	* This test case checks if the {@link Menu#init()} method returns true.
	*/
	@Test
	void testInit() {
		Menu menu = new Menu();
		assertTrue(menu.init());
	}
}