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
* It contains one unit test case for the {@link Burn#BurnToDVD(GUI)} method.
*/
class BurnTest {
		
	/**
	 * Test of Burn member method.
	 * 
	 * @throws java.io.IOException
	 */
	@Test
	public void burn() throws IOException {
		System.out.println("Burn start test");
		String dir =  "TEMPDIR";
		FileWriter fileUtils = new FileWriter(dir);
		BufferedWriter buffWrite = new BufferedWriter(fileUtils);
		GUI_GUI.guiUpdate();
		int returnCode;
		int burn_returnCode;
		int totalBurns;
		
		burn_returnCode = BurnToDVD(GUI_GUI);
		assertTrue(burn_returnCode == 0);   
		totalBurns = 0;
}
}