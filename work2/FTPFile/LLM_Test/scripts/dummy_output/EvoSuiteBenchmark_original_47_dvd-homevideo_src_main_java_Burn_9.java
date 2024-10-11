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
		public BurnTest() {
		}
		
		/**
		* Tests Burn to DVD function.  BurnToDVD with a GUI should get an error
		* if input to growisofs does not end in a DVD filename
		* @throws SecurityException
		* @throws IOException
		* @throws IllegalStateException
		*/
		@Test
		public void testBurnToDVD()
				throws IllegalStateException, SecurityException, IOException {
			// File to work with
                 ArrayList<String> testDVDFile = new ArrayList<>();
                 File outputBase = new File(System.getProperty("user.dir"));

                 for(int i = 0; i <= outputBase.getName().length(); i++) {
                    if (outputBase.getName().charAt(i)!= 'D') {
                       outputBase = outputBase.getParentFile();
                    } 
                 }
                 ArrayList<String> toBurn = new ArrayList<>();
                   toBurn.add("C:\\DVDRoot\\DVDRoot\\DVD.2"); // toBurn DVD file
                   toBurn.add("C:/DVDRoot/DVDRoot/DVD");
                   toBurn.add("C:\\tmp\\DVDRoot\\DVDRoot\\DVD");
                   toBurn.add("/tmp/DVDRoot/DVDRoot");

                 for (String str:toBurn)
                {
                    System.out.println(str);

                    // Create a file Writer which will be used to write the test file to disk.
                    // Output the test file to create it
                    FileWriter outputWriter = new FileWriter(toBurn.get(testDVDFile.size()), true);
                    BufferedWriter bufferWriter = new BufferedWriter(outputWriter);

                    // Get the first one
                    try (
                        // Get a BufferedReader object to read from the input stream
                        BufferedReader reader = new BufferedReader(
                                new InputStreamReader(new FileInputStream(str), "utf-8"))
                     )
                    {
                       // Print the file name
                       bufferWriter.write(str+"\n");

                       // Get output of first line
                       String templine = reader.readLine();
                       System.out.println( templine );
                       System.out.println( templine.length() +"\n");

                       // Move the position to the next line
                       bufferWriter.newLine();

                       // While the reader doesn't end the line, read and store the next line
                       while (!bufferReader.checkEOF())
                    {
                       
                        templine = reader.readLine();
                        tmpstr=templine.replace(str,"");
                       
                        // The file length was exceeded
                        // Add this line to the list of to be burned
                        templine += "\n";
                        
                        // Add the new line to the array for the output to work on
                        toBurn.add(templine);

                        // Get the next line again
                        templine=reader.readLine();
                     }

                    }
                    
                 }
                
                 // Check if they are equal with the size of the array (one element was added to the list)
                 assertTrue("Test to Burn To DVD file created with the same number of lines as the input list" + testDVDFile.size(),"BurnToDVD output file was different with the one for input test file.",
                         testDVDFile.size() == toBurn.size());

                 // BurnToDVD uses growisofs with a GUI to check if the output file is generated to DVR
                 boolean didGrowisofs = BurnToDVD(new GUI.GUIWindow(false, outputBase + "DVDRoot\\DVDRoot\\DVD\\"));

                 // Test was it correctly generated to the DVR
                  if (didGrowisofs)
                 {
                    System.out.println("Burn worked as expected because of ");
                    System.out.println("  the input file was converted from DVR to DVD by ");
                    System.out.println("  burnToDVD()");
                    System.out.println("  This is the test file." + "Burn was correctly created and returned to your GUI.");               
                 }
                 else
                  {
                    System.out.println("Burn failed because of ");
                    System.out.println("  input file not able to appear as a DVR." + " BurnToDVD exited non-zero after error");
                  }
                      
            } // testBurnToDVD

}