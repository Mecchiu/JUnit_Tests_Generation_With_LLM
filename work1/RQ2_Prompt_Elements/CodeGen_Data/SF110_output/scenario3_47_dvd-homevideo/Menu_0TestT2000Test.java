// Menu_0Test.java


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.File;
import java.io.FileWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FilenameFilter;
import java.util.StringTokenizer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Menu}.
* It contains one unit test case for the {@link Menu#init()} method.
*/
class Menu_0Test {

	/**
	* Test with a background picture created
	*
	* @throws java.io.IOException
	*/
	@Test
    public void test01() throws IOException {
        try {
			BufferedWriter tmp = new BufferedWriter(new FileWriter("menu_test"));
			tmp.write("Title 0 test");
			tmp.newLine();
			tmp.newLine();
			tmp.write("Title 0 test");
		try {
			tmp.flush();
		} catch (IOException e) {
			assertEquals(
				"Error writing into a file",
				e.getMessage());
		}
		// Test default background file.
		tmp.write("Title 0 test");
			tmp.newLine();
			tmp.flush();
		tmp.write("Title 0 test");
		tmp.flush();
        } catch (FileNotFoundException e) {
			assertTrue(
				"Menu does not contain the correct title 0 test",
				false);
		}
	}
	
	/**
	* Builds a menu from a set of titles
	*
	* @param titles The set of titles to create
	*/ 
	public void buildMenu(String[] titles) throws IllegalArgumentException, NullPointerException {
        
		// Create our menu object
		File file = new File("menu_test");
		Menu m;
		
		// Build a menu object
		InputStreamReader isr =
			new InputStreamReader(
                new FileInputStream("menu_test_isr"));
        BufferedReader rdr =
            new BufferedReader(isr);
        String line;
        
		// Read until we stop reading
		while ((line = rdr.readLine())!= null) {
			// Add a new line to the menu object
            m = new Menu();
            
            // Use the last line of the header and set the correct title 0
			//for each title and add a new line to the menu object
			StringTokenizer st = new StringTokenizer(line);
			while (st.hasMoreTokens()) {
				String title = st.nextToken();
				
				st = new StringTokenizer(title);
				int titleID = Integer.parseInt(st.nextToken());
				String titleTitle0 = st.nextToken();
				int titleVolume0 = Integer.parseInt(titleTitle0);

				// Check if title ID is valid
                if (this.isValidTitleID(titleID)) {
                    m.addTitle(titleID, titleTitle0, titleVolume0);
				} else {
					System.out.println("Invalid title ID");
					assertEquals(
						"Invalid title ID",
						0,
						titleID);				
				}
				
			}
			m.buildMenu();
			
			// Check if we have a menu object
			file = m.getMenuFile();
			System.out.println("Menu file is " + file);
			
			if (file.exists()) {
                m.setTitleID(0, null, 0);
			} else {
				System.out.println("Error: Missing menu file for " +
                		"title ID = 0");
				assertEquals(
					"Menu object does not contain a title 0 text!",
					0,
					0);
			}
			
		}
		
        assertTrue("No exception", true);
	}
        
        /**
	* Tests if a title ID falls within a valid range.
	* Does so by checking if one of the three is an even digit
	*/
	private boolean isValidTitleID(int titleID) {
                    
		// Test if title ID is a digit
                if (titleID < 0 || titleID >= 10) {
                    System.out.println("Title ID out of range");
                    assertTrue(
                        "invalid title ID", false);
                }
                
                // Test if the fourth digit is an even integer
		int volumeInt = titleID
                    * 256
                    + (titleID / 256)
                    * 256
                    + (titleID / 256)
                    * 256
                    ;
		if (!(volumeInt % 10 == 0)) {
                    System.out.println("odd");
		}
		return true;
	}
	
}