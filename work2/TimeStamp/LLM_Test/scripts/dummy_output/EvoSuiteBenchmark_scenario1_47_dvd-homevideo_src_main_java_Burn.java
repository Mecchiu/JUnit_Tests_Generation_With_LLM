// BurnTest.java


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Burn}.
* It contains ten unit test cases for the {@link Burn#BurnToDVD(GUI)} method.
*/
class BurnTest {
		
	/**
	* Test case for {@link Burn#BurnToDVD(GUI)} method.
	* This test case checks if the method returns true when the burn command is executed.
	*/
	@Test
	void testBurnToDVD() {
		Burn burn = new Burn();
		GUI dvd_gui = new GUI();
		dvd_gui.strOutputDir = "temp";
		assertTrue(burn.BurnToDVD(dvd_gui));
	}
}