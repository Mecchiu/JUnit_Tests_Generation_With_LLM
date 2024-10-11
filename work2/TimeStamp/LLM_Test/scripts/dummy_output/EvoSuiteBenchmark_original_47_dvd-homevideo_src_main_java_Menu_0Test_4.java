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
	 * Initialise a menu with titles, menu picture path and audio path passed as parameters.
	 * @see
	 *      {@link Menu#getTitle()}
	 * @throws Exception
	 *      These test cases are not to be interrupted/resumed/started as they are run in the
	 *      constructor
	 */
	@Test
    @SuppressWarnings("unchecked")
    public void testGetTitle() throws Exception {
		Menu m = new Menu();
		assertTrue("The title field should be the default.", m.getTitle().equals("Menu Title"));
		assertTrue("The title should only have spaces.", m.getTitle().startsWith(""));
		assertTrue("The titles should start with the menu title.", m.getTitle().startsWith(m.getTitle()));
		assertEquals("Title should not have two spaces.", 2, m.getTitle().length());
		String title = menuTitle();
		assertTrue("The titles should have spaces.", m.getTitle().startsWith(title));
		assertNotEquals("Title should have two spaces.", 3, title.length());
		String title2 = menuTitle();
		assertNotEquals("Title should have spaces.", title, title2);
		
		assertFalse("The titles should not have a space.", title.startsWith(" "));
		assertTrue("The titles should always end with the menu title.", title.endsWith(m.getTitle()));
		title = menuTitle();
		assertTrue("The titles should have spaces.", title.endsWith(menuTitle()));
	}
	
	/**
	 * Initialise a menu with optional picture passed as parameter.
	 * @see
	 *      {@link Menu#getPicture()}
	 */
	@Test
    @SuppressWarnings("unchecked")
    public void testGetPicture() throws Exception {
		Menu m = new Menu();
		InputStreamReader isr = new InputStreamReader(new FileInputStream("file1.txt"));
        BufferedReader br = new BufferedReader(isr);
        String token = null;
        FileInputStream fis = null;
        try {
            br = new BufferedReader(isr);
            String inputLine;
            int i=1;
            while ((inputLine = br.readLine())!= null) {
                // TODO the following while-statement should be used 
                // instead of looping through the file every time loop here.
                // if (!(i % 2 == 0)) { 
                // is not implemented :-)
                token = inputLine.replace("\r", "");
                if (token.startsWith("#")) {
                    Tokenizer tw = new Tokenizer(new StringTokenizer(inputLine.replace("\r", "")));
                    tokens = new String[tw.count()];
                    for (int j = 0; j < tokens.length; j++) {
                        
                        // TODO replace with next line when that comes into the scope of the test
                        tokens [j]= null;
                    }
                    
                } else if (token.startsWith(dvd_menu)) {
                    
                } else if (token.endsWith(dvd_menu)) { 
                    
                }
                
                
            }
            
            br.close();
            fis = new FileInputStream(new File("file1.txt"));
            FileWriter fw = new FileWriter(new File("file1.txt"));
            fw.write("This is a test line\r"+ "\n"+ inputLine);
            fw.close();

        } catch (FileNotFoundException ex) {
            
        } catch (IOException ex) {
            
        }
        br.close();
        fis.close();
        
        
        isr.close();
        
        String title = menuTitle();
        assertTrue("The title should have a space.", m.getTitle().startsWith(title));
        assertNotEquals("Title should have two spaces.", 2, title.length());
        String title2 = menuTitle();
        assertNotEquals("Title should have two spaces.", title, title2);
        
    }
    
}