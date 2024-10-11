// JMCAParserTest.java
package com.soops.CEN4010.JMCA;

import java.io.Reader;
import com.soops.CEN4010.JMCA.JParser.JavaParser;
import java.io.IOException;
import java.io.FileWriter;
import java.io.Writer;
import java.io.FileInputStream;
import java.io.File;
import com.soops.CEN4010.JMCA.JParser.xmlParser.SaxProcessor;
import com.soops.CEN4010.JMCA.JParser.ParseException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JMCAParser}.
* It contains one unit test case for the {@link JMCAParser#parse(Reader)} method.
*/
class JMCAParserTest {
		public static String test = "";
		public static File tmp = File.createTempFile("test", ".tmp");
		public static boolean failed_parse = false;

		//JMCAParserTest.java
		/**
		 * This test is an exact test of the parse method of the class. You can also add a method to this test that checks the return value of the method when parse
	 * is called with expected return value.
	 * For example:
	 * <pre>{@code @Test
	 * public void test() {
	 *    JMCAParser JMCAPparser = new JMCAParser();
	 *    JMCAResponse response = JMCAParser.parse("myfile.xml");
	 *    System.out.println("response:"+response.getMessage());
	 * }
	 *}`
		 */
		
		// JMCAParserTest.java
			public void setTmp() {
				
				try {

					if(tmp.exists()==false) {

						tmp.mkdir();
					}
					if(tmp.exists()==false) {

						failed_parse = true;
						System.out.println("ERROR TEST::tmp does not exist!");
					} else {

						File file = new File(tmp.getAbsolutePath());
						if(file.exists()){
							
							File newfile = new File(file.getAbsolutePath()+".tmp");
							
							failed_parse = false;
							System.out.println("ERROR TEST::tmp is different");
							
							System.out.println("Testing new file.");
							newfile.delete();
							
							//Write the XML file into a temporary file
							Writer writer = null;
							Writer xmp = null;
							try {
								writer = new FileWriter(newfile.getPath());
								xmlProcessor().generateXML(new FileInputStream(file), writer);
							} catch (Exception e) {
								e.printStackTrace();
							}
							System.exit(1);
							
							System.out.println("Writing XML to file "+(newfile.getPath()));
							
							try {
								xmp = new FileWriter(tmp.getPath());
								newfile.deleteOnExit();
								SaxProcessor.generateSax(new FileInputStream(file), xmp);
							} catch (Exception e) {
								e.printStackTrace();
							}

							System.out.println("Writing XMP from the file as a new file.");
							
						}
					}
				} catch (JMCAParser.Exception e) {
					e.printStackTrace();
					failed_parse = true;
				}
			}
			
			 // JMCAParserTest.java
			 // public void setOut(String fileName) {
			 // this.test = fileName;
			 // }
			 
			 // JMCAParserTest
			 public void test (){
				     setTmp();
			 }
		 
			
			//JMCAParserTest.java
		
		//JMCAParserTest.java
						public JParser getJParser() throws Exception {
							
							return new XMLParser(new FileReader(intermediateFile));
						}
 
						public JParser getJParser(String fileName){
							
							System.out.println("FileName:"+tmp.getCanonicalPath());
							return getJParser();
						}
						/* (non-Javadoc)
         * @see org.junit.jupiter.api.Test#setUp()
         */
     public void setUp ( )throws Throwable{
       
				System.out.println("setUp");
				SystemOut.setStandardOut(System.out);
//				setUp();
			}
     public void setUp ()throws Throwable {
			try {
				System.out.println("setUp");
				
				FileInputStream fstream = null;
				File file = new File(tmp.getAbsolutePath()+File.separator+"myfile.xml"+".tmp");
				
				if(file.exists())
						failed_parse = true;
				
				fstream = new FileInputStream(file);
				
			
				 
				FileWriter writer = null;
				writer = new FileWriter(file.getAbsolutePath());
				SaxProcessor processor = new SaxProcessor();
				processor.parse(fstream);
				System.out.println("Fully parsed the file.");
				
				file.deleteOnExit();
				
				//writer = new FileWriter(file);
				xmlProcessor().generateXML(fstream, writer);
				
				fstream.close();
			
			} catch (java.io.IOException e1) {
				
				e1.printStackTrace();
				failed_parse = true;
			} catch (Exception e) {
				e.printStackTrace();
				
				failed_parse = true;
			}
		}
}
					
//end JMCAParserTest.java