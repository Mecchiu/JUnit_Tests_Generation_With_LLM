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
		* Create the xml file to pass to dvdauthor
		* @param   m_GUI This is the GUI object used to control the form
		*/
		@Test
		public void testMenu() {
				String outFile = new String("temp");

				String path = System.getProperty("playpath");

				StringTokenizer tokenizer = new StringTokenizer(path, "|");
				while(tokenizer.hasMoreTokens()){
					String token = tokenizer.nextToken();
					StringTokenizer s = new StringTokenizer(token, "|");

					//System.out.println("current token : "+s.nextToken());

					String [] t = s.nextToken().split("-");

					//System.out.println("next token : "+t[0]);

					String[] a = s.nextToken().split("=");

					// System.out.println("next token : "+a[0]);

					String title = a[0];

					//System.out.println(t[0]+"\na:"+a[0]);

					// System.out.println(t[0]+"\ta:"+a[1]);

					t[1] = title.replace("DVD_PICTURE", "");

					//System.out.println(t[0]+"\n\t"+t[1]);

					outFile = outFile.concat(t[0]+"="+t[1]);	
				}

				m_GUI.init();

				assertTrue(new File(outFile).exists());
				
				BufferedWriter buw = null;
				try {
					File temp = new File(outFile);
					File file = new File(temp.getParent());

					// If the file is a directory and doesn't already exist
					if(!file.exists()) {
						File createTemp = File.createTempFile("createTemp", "");
						createTemp.delete();
					}

					FileWriter fw = new FileWriter(file.getPath());
					bw = new BufferedWriter(fw);
					bw.write("<!DOCTYPE menu PUBLIC\n" +
						"\"-//dvdauthor//DTD DVD Menu 1.02//EN\n" +
						"\"http://dvdauthor.org/dvd-menu/dvd-menu/1.02/menu/menu.dtd\">\n" +
						"<menu>\n" +
						"  <chapter title="+t[0]+">\n"+t[1]+"</chapter>\n" +
						"</menu>\n");
					bw.close();

					Menu m = new Menu(t[0], t[1], false, m_GUI);
					m.init();

					//System.out.println("Writing to " + file.getName() + " " + outFile.getName());
					
					} catch (FileNotFoundException fnfe){
						m_GUI.init();

						// Check the error and if the error is invalid the program exits
						checkMenu(outFile, fnfe);
					} catch (IOException ioe){
						m_GUI.init();

						// Check the error and if the error is invalid the program exits
						checkMenu(outFile, ioe);
					}
}
}