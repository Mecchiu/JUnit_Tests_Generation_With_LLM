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
		private static final String testFileName = "pull_comps.c";
		
    @Test
    public void test() {
	double[] comps = FileEditor.getCompEnergy(testFileName);
	assertNotNull(comps,"Test file is empty ");
	assertEquals(6,comps.length);
	for (int i=0; i<comps.length; ++i) {
	    assertTrue(comps[i] < 1+1e-6,"Component energy at " + i + " is greater than 1.");
	}
    }
	
    @Test
    public void test_1() {
	Scanner inputFile = null;
	System.out.println("Reading results of test1..."+(new Date()));
	try {
	    inputFile = new Scanner(new ResourceLoader().open("datasets/pull_comps.c"));
	}
	catch (IOException e) {
	    e.printStackTrace();
	}
	assertNotNull(inputFile,"Test file is empty ");
	if (inputFile!= null){
	    double[] comps = FileEditor.getCompEnergy(testFileName);
	    assertNotNull(comps,"Test file is empty ");
	    assertEquals(6,comps.length);
	    for (int i=0; i<comps.length; ++i) {
		assertTrue(comps[i] < 1+1e-6,"Component energy at " +i + " is greater than 1.");
	    }
	}
    }
	
	public static void main(String[] args) {
		FileEditor_1Test test = new FileEditor_1Test();
		test.test_1();
	}
}
