// FileEditor_0Test.java
package apbs_mem_gui;

/**
 * @author keithc
 */
import java.io.*;
import java.util.Scanner;
import java.text.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FileEditor}.
* It contains one unit test case for the {@link FileEditor#getEnergy(String)} method.
*/
class FileEditor_0Test {

	/**
	 * Get energy from the input file, and return the result in kcal/mol.
	* @throws FileNotFoundException throws an {@link FileNotFoundException} if file is not found.
	* @throws IOException throws if there is I/O error.
	* @throws ParsingException throws if parsing error occurs.
	*/
	@Test
	public void getEnergy() throws FileNotFoundException, IOException, ParsingException {
		//returns [0] energy in kJ/mol, then [1] is in kcal/mol
		File filename = new File("src/test/resources/FileEditor_Test/Energy/final_filename.txt");
		
        String[] energies1 = getEnergy(filename);
        System.out.println(energies1);
		if (energies1[1]!= "final_filename.txt")
			System.err.println("Wrong value in final_filename.txt");
        assertNotNull(energies1);
	}
	
	// FileEditor_1DTest.java
	/**
	* Test of getFinalIndex method, of class FileEditor.
	* It contains all the method that are tested in other class FileEditor_0Test.
	*/
	@Test
	public void getFinalIndex() {
		
	}
	
	// FileEditor_2DTest.java
	/**
	* Test of getFinalIndex and getMaxInt method, of class FileEditor.
	* It contains all the method that are tested in other class FileEditor_0Test.
	*/
	@Test
	public void getFinalIndexAndMaxInt() {
		File out = new File("dest/result");
		//File out = new File("result.txt");
		//File out = new File("result.txt");
		//File out = new File("result.txt");

		File fOut = testOutputOutput(out, false);
		assertTrue(fOut.exists());

		int iMax = FileEditor.getMaxInt(fOut);
		//assertEquals(iMax, Integer.parseInt(out.getName()));
		//assertEquals(iMax, FileEditor.getMaxInt(out));
	}


	// FileEditor_3DTest.java
	/**
	* Test of getMaxInt and getFinalIndex method, of class FileEditor.
	* It contains all the method that are tested in other class FileEditor_0Test.
	*/
	@Test
	public void getMaxIntAndFinalIndex() {
		File out = new File("dest/result");
		//File out = new File("result.txt");
		//File out = new File("result.txt");

		File fOut = testOutputOutput(out, false);
		assertTrue(fOut.exists());

		int iMax = FileEditor.getMaxInt(fOut);
		//assertEquals(iMax, Integer.parseInt(out.getName()));
		//assertEquals(iMax, FileEditor.getMaxInt(out));
	}
	

	// FileEditor_4DTest.java
	/**
	* Test of getMaxInt method, of class FileEditor.
	* It contains all the method that are tested in other class FileEditor_0Test.
	*/
	@Test
	public void getMaxInt() {
		File out = new File("dest/result.txt");
		//File out = new File("result.txt");

		File fOut = testOutputOutput(out, false);
		//assertFalse(fOut.exists());
		//assertFalse("no test set", fOut.exists());
	}



	// FileEditor_5DTest.java
	/**
	* Test of getFinalIndex, of class FileEditor.
	* It contains all the method that are tested in other class FileEditor_0Test.
	*/
	@Test
	public void getFinalIndex() {
		File out = new File("dest/result");
		//File out = new File("result.txt");

		File fOut = testOutputOutput(out, true);
		
		String[] energies1 = getEnergy(fOut);
		
		assertNotNull(energies1);
		Integer iMax = FileEditor.getMaxInt(fOut);
		assertNotNull(iMax);
		assertEquals(iMax, Integer.parseInt(energies1[1] ));
	}
	
	private String toDoubleNeg(String val) {
		return val.substring(0,val.length()-2);
	}
	
	private String toDoublePos(String val) {
		return val.substring(2,val.length()-1);
	}

	private String testOutputOutput(File out, boolean showText) {
		if (showText) {
			FileOutputStream outFile = null;
			try {
				outFile = new FileOutputStream(out);
				outFile.write("final_filename.txt".getBytes( "UTF-8" ));
				outFile.close();
			} catch (FileNotFoundException err) {
				System.err.println(err);
				assertFalse("no test set", out.exists());
			}

			String out_string = new Scanner(outFile).useDelimiter("\n").next();
			return out_string;
		} else {
			return out.getName();
		}
	}
}
