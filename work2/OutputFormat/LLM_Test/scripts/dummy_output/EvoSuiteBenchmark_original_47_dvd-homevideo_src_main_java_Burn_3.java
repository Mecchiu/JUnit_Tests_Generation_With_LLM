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
		private BufferedReader theReader;

		private BufferedWriter theFile;

		public void setUp() throws IOException {
			File theFileTemp = File.createTempFile("TestFile", "tmp");
			theFile = new BufferedWriter(new FileWriter(theFileTemp));
			theReader = new BufferedReader(new InputStreamReader(System.in));
			Thread.sleep(250);
		}

		public void tearDown() throws IOException {
			theFile.close();
			theFileTemp.delete();
		}
		
	/**
	    A method for burning to the DVD
	    
	    @param   DVD_GUI    
	    
	    @return   This returns the error flag, false if success,
	    
	*/
	public boolean BurnToDVD(GUI DVD_GUI) {

		System.err.println("Burn to DVD");

// write the test to the file...

		theFile.close();
		final File theFileTemp = File.createTempFile("TestFile", "tmp");
		theFile = new BufferedWriter(new FileWriter(theFileTemp));

		while (m_Burn == true && (DVD_GUI.getButtonYes().isPressed() == true)) {

			String test = null;
				
			while (m_Burn == true && (DVD_GUI.getButtonYes().isPressed() == true)) {

				theFile.write(test);
				test = null;
			}
		}

		// read back the file...

		String[] array = theFile.readLine().split("\\s+");
		String theResult = array[array.length - 1];
		theFile.close();

		if (theResult.substring(0, 3).trim().toLowerCase().equals("error")) {
			return false;
		}

		System.out.println("Burn to DVD successfully");
		return true;

	}	// BurnTest.BurnToDVD

	/**
	    A Member Variables
	    
	        private static final int testLength = 2;      // Length of the test
	        
	    public int getTestLength() {
	        return testLength;	// Return the length of the test
	    }	// BurnTest.getTestLength
	
	    public static void main(String[] args) {

	        final int testLength = 4;                   // Length of the test
	        
	        assertThat(testLength, is(equalTo(1024)));   // Compare our test length to 1024
	        
	        {
	            final GUI HDD2 = new GUI();
	            assertThat(HDD2.getButtonYes().isPressed(), is(equalTo(true)));
	        }       // End of assertThat
	    }	// End of main
	

	    
}	// BurnTest