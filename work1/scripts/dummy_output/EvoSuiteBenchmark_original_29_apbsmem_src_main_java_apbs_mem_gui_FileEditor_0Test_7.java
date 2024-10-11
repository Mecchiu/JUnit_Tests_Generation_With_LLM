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
		private static final String filename1 = "file_1_1.log";
        private static final String filename2 = "file_2.log";
	private static final int numberOfTimesteps1 = 1;
        private static final int numberOfTimesteps2 = 24;
    private static final int numberOfCalories1 = 7;
    private static final int numberOfCalories2 = 23;
    private static final float k1 = 1.00f;
    private static final float k2 = 1.00f;
    private static final float k = 1.00f;
    private static final float P_1 = 2.00f;
    private static final float P_2 = 2.00f;
        
    // file-read test
    @Test
	public void readerTest() {
		//read output file into array of energies
        String file_name = "reader_file_0_run_1.txt";
        String[] energies = FileEditor.getEnergy(file_name);
        assertEquals(numberOfCalories2, energies.length);
        assertEquals(numberOfCalories1 - numberOfCalories2, energies[0]);
    }
    
    // file-save test
    @Test
	public void writerTest() {
		String filename = "writer_file_0_run_1.txt";
        File formatFilename = new File(System.getProperty("user.home") + '/'+filename);
        FileOutputStream fos = null;
        try {
            Scanner lineReader = new Scanner(new BufferedReader(new FileReader(formatFilename)));
            for( int i=0; i<numberOfCalories1; i++ ) {
                fos = new FileOutputStream(filename);
                for( int j=0; j<numberOfTimesteps1; j++ ) {
                    float P = (float)P_1 * (float)i / (float)numberOfCalories1;
                    int index = 0;
                    for (int k=0; k<numberOfCalories2; k++) {
                            float P2 = (float)P_2 * (float)k / (float)numberOfCalories2;
                            fos.write((index == i? "\n" : " ") +
                                     Float.toString(P) + " - " +
                                     Float.toString(P2) + " - " +
                                     Float.toString(k));
                            index++;
                    }
                    fos.write("\n");
                }
                lineReader.close();
            }
            lineReader.close();
            fos.close();
            //read the file back without using ReaderOutputStream
            String line;
            BufferedReader br = null;
            try {
                br = new BufferedReader(new FileReader(filename));
                //System.out.println("reader read " + filename);
                line = br.readLine();
                //System.out.println("reader read " + line);
                String line1 = br.readLine();
                //System.out.println("reader read " + line1);

            }
            catch (IOException io) {
                io.printStackTrace();
            }
            finally {
               if (br!= null) {
                    try {
                        br.close();
                    }
                    catch (IOException io) {
                    }
               }
            }
            //print results
            String[] energies = FileEditor.getEnergy(filename);
            assertEquals(numberOfCalories1, energies.length);
            assertEquals(numberOfCalories1-numberOfCalories2, energies[0]);
        }
        catch (FileNotFoundException f) {
//             System.err.println("file_3_1 failed:" + f.getMessage());
            f.printStackTrace(); 
        }
        finally {
            if (fos!= null) {
                try {
                    fos.close();
                }
                catch (IOException io) {
                }
            }
        }
    }
   
}