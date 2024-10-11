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
		* Test cases of the energy extraction.
		*
		* @throws FileNotFoundException test case 1.
		* @throws IOException test case 2.
		* @throws NullPointerException test case 3.
		* @throws IllegalArgumentException test case 4.
		* @throws ParseException test case 5.
		* @throws ArrayIndexOutOfBoundsException test case 6.
		*/
		@Test
		public void testcase1() throws FileNotFoundException,
        IOException, NullPointerException, ParseException, ArrayIndexOutOfBoundsException {
		Scanner scan = new Scanner(System.in);
		String in = scan.next();
     FileReader f = new FileReader(in);
     String[] result = new String[8]; // result[8] = file name
     StringBuilder str = new StringBuilder();
     
     f.close();
     System.out.print(in);
     // result[0] = filename
     // result[1] = file name  (extension)
     // result[2] = energy in kJ
     // result[3] = energy in kB
     // result[4] = energy in kC
     // result[5] = energy in kT
     // result[6] = kC/T
     // result[7] = file name (ext)
         
     System.out.println(str.toString()); // output file
     result[0] = new FileEditor().getEnergy(result[0]); // get energy of first file (file-to-file conversion)
     System.out.println(str.toString()); // output file
     result[1] = result[0];
     System.out.println(str.toString()); // output file
     result[2] = result[0];
     System.out.println(str.toString()); // output file
     result[3] = new
     EnergyConverter().convertToKilocalories(result[1],100); // convert from kilo (units) to kB
     System.out.println(str.toString()); // output file
     result[4] = result[1];
     System.out.println(str.toString()); // output file
     result[5] = result[1];
     System.out.println(str.toString()); // output file
     result[6] = result[1];
     System.out.println(str.toString()); // output file
     result[7] = result[1];
     }

/**
 * Test cases of the energy extraction without test case 1.
 *
 * @throws FileNotFoundException test case 1.
 * @throws IOException test case 2.
 * @throws NullPointerException test case 3.
 * @throws NumberFormatException test case 4.
 * @throws ParseException test case 5.
 * @throws ArrayIndexOutOfBoundsException test case 6.
 */
	@Test
		public void testcase2() throws FileNotFoundException,
         IOException, NullPointerException, NumberFormatException, ParseException, ArrayIndexOutOfBoundsException {
		FileReader f = new FileReader(System.in);
		String[] result = new String[8]; // result[8] = file name
        FileInputStream fis = new FileInputStream(System.in);
        try {
        int num = fis.read();
        String line = fis.readLine();     
        result[0] = String.valueOf(num);
        result[1] = line;
        }finally{
        fis.close();
        f.close();
        }
         StringBuilder str = new StringBuilder();
    // Output result[8] = file name (extension)
        System.out.print(result[0]);
        
        System.out.println(str.toString()); // output file
        result[2] = new
         EnergyConverter().convertToKilocalories(result[1],100); // convert from kilo (units) to kB
        System.out.println(str.toString()); // output file
             
         
        result[3] = result[0];
        System.out.println(str.toString()); // output file
         result[4] = result[1];
         System.out.println(str.toString()); // output file
        result[5] = result[1];
         System.out.println(str.toString()); // output file
        result[6] = result[1];
         System.out.println(str.toString()); // output file
        result[7] = result[1];
         
        }
    }

/**
 * Test cases of the energy extraction without test case 1. 
 *
 * @throws FileNotFoundException test case 1.
 * @throws IOException test case 2.
 * @throws NullPointerException test case 3.
 * @throws NumberFormatException test case 4.
 * @throws ParseException test case 5.
 * @throws ArrayIndexOutOfBoundsException test case 6.
 */
	@Test
		public void testcase3() throws FileNotFoundException,
         IOException, NullPointerException, NumberFormatException, ParseException, ArrayIndexOutOfBoundsException {
		FileReader f = new FileReader(System.in);
        FileWriter fw = new FileWriter(System.out);
        try {
        int num = f.read();
        String line = f.readLine();     
        fw.append(num);
        fw.append("\n");
        fw.append(line);
        fw.flush();
        fw.close();
        }finally{
        f.close();
        fw.close();
        }
         StringBuilder str = new StringBuilder();
    // Output result[8] = file name (extension)
            System.out.print(result[0]);
        System.out.println(str.toString()); // output file
    }