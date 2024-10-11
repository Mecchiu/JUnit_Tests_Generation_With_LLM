// FileEditor_1Test.java
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
* It contains one unit test case for the {@link FileEditor#getCompEnergy(String)} method.
*/
class FileEditor_1Test {
FileManager filemanager;
		public FileEditor_1Test() {
			filemanager = new FileManager();
		}
		public void testGetCompEnergy(String inputFileName) {
			File[] files = filemanager.listFiles();
			//System.out.print(files.length);
			if (files.length > 0 && files.length == 1)
				filemanager.readFile(files[0], filename);
			System.out.println(filemanager.getCompEnergy(filename));
		}
}

/**
* Unit test class for {@link FileEditor}.
*/
class FileEditor_1 {
	public static final String filename = "";	// the name of the file
	public static final double[] energyFile = Double.NaN;// the arrays with the energy
	public static final FileManager filemanager;
	public static final String fileExt = ".txt";
	public static final String newname = "";	// the new name
}