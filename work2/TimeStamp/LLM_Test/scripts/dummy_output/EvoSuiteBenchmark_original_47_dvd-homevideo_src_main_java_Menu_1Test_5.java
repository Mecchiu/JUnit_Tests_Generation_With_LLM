// Menu_1Test.java


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
* It contains one unit test case for the {@link Menu#createXML()} method.
*/
class Menu_1Test {
		/**
		* Test method for {@link Menu#createXML()} method.
		*/
	@Test
	public void testCreateXML() {
		BufferedWriter out = null;
		try {

			
			String text = "<menu ";

  
		// Create file
  		} catch (FileNotFoundException fex) {
  			System.err.println(fex.getMessage());
      fex.printStackTrace();
		} catch (IOException ioe) {
			System.err.println(ioe.getMessage());
			ioe.printStackTrace();
		}finally{
			if (out!= null) {
				try {
					out.close();
				}  catch (IOException ioe) {
					System.err.println(ioe.getMessage());
					ioe.printStackTrace();
				}
			}
		}// Close open files
			File a = new File("C:\\test.xml");
			File.Create(a);
			
			Menu mMenu = new Menu();
	    mMenu.init();
			out = new BufferedWriter(new FileWriter(a));
			//mMenu.writeXML(out, "utf-8");
			out.close();

			
		}

		assertEquals(1, titles.length);
  
		String[][] tests = new String[][]{
	//		{"cafebabe","a2f"},
        {"cafebabe","Cafebabe"},
        {"w0p0r","0p0r"},
        {"cafebabe","Cafebabe"},
        {"Cafebabe","Cafebabe"}
	};
		String test0[]= (String[])tests[0];
		String test1[]= (String[])tests[1];
		String test2[]= (String[])tests[2];
		
		assertArrayEquals(m_GUI.menu.getText(), test0);
		assertArrayEquals(m_GUI.menu.getText(), test1);
		assertArrayEquals(m_GUI.menu.getText(), test2);

		assertFalse(m_GUI.menu.isSelected());
}