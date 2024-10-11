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
		
    @Test
    public void test_getCompEnergy(){
        // Create a calculator for the test file 
        Calculator c1 = new Calculator();
        
        // Store one component in the calculator for the test
        SimpleComplex a = new SimpleComplex(6);
        
        @SuppressWarnings("unused")
		double temp;
        
        // Get the total energy of the component
        temp = c1.getTotalEnergy(a);
        
        assertTrue(Double.isInfinite(Double.valueOf(temp)));
    }
	
}

/**
* Main.
* Class containing unit tests.
* @author keithc
*/
@SuppressWarnings("resource")
public final class FileEditor_1 {
	
	// A calculator that prints out the total energy of each focus
	// component in the form of a file.
	private Calculator calculator = new Calculator();
	
	// Test main method of class FileEditor_1.
	@Test
	public void test_getComplex(){
		// Create a calculator for the test file 
		Calculator c1 = new Calculator();
		
		assertTrue(Double.isInfinite(Double.valueOf(c1.getTotalEnergy(new SimpleComplex(6)))));
	}
	
}