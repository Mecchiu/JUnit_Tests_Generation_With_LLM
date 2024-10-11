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
     * Test method for {@link apbs_mem_gui#FileEditor_0Test#FileEditor_0Test()}.
     */
    @Test
    public void test_0_constructor() {
                
        FileEditor test = new FileEditor();
        String[] arr1 = test.getEnergy("./apbs_mem_gui/tests/results/run1.json");
        String expectedOutput = "{'k_BT':2.3378755866406674, 'k_BT_avg':0.1335758529189966}";
		
		assertEquals(expectedOutput, arr1[0], "The line number 1 was not correct. It should have been output from test 0.");

                String[] arr2 = test.getEnergy("./apbs_mem_gui/tests/results/run2.json");
                String lineNumber = arr2[2];
                String lineOfOutput1 = arr1[1];
                String lineOfOutput2 = arr1[2];
                assertEquals(LineNumber.valueOf(lineNumber), LineNumber.valueOf(lineOfOutput1), "There was a lineNumber in file2");
                assertEquals(LineNumber.valueOf(lineNumber), LineNumber.valueOf(lineOfOutput2), "There was a lineNumber in file2");
    }

    /**
     * Test method for {@link apbs_mem_gui#FileEditor_0Test#FileEditor_0Test(java.io.InputStream)}.
     */
    @Test
    public void test_0_getEnergy_inputStreamFalse() {
		FileEditor test = new FileEditor(new Scanner(System.in));
		String[] arr1 = test.getEnergy("./apbs_mem_gui/tests/results/run1.json");
		String expectedOutput = "{'k_BT':2.3378755866406674, 'k_BT_avg':0.1335758529189966}";
		
		assertEquals(expectedOutput, arr1[0], "The line number 1 was not correct. It should have been output from test 0.");

                String[] arr2 = test.getEnergy("./apbs_mem_gui/tests/results/run2.json");
                String lineNumber = arr2[2];
                String lineOfOutput1 = arr1[1];
                String lineOfOutput2 = arr1[2];
                assertEquals(LineNumber.valueOf(lineNumber), LineNumber.valueOf(lineOfOutput1), "There was a lineNumber in file2");
                assertEquals(LineNumber.valueOf(lineNumber), LineNumber.valueOf(lineOfOutput2), "There was a lineNumber in file2");
            }

}