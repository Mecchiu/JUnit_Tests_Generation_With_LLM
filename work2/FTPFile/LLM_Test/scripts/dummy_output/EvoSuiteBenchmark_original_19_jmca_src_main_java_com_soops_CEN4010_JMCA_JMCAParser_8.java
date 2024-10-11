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
		
    /**
     * Test method for {@link JMCAParser#parse(Reader)}.
     */
    @Test
    public void testParse() {
        try {              
            File tempDir = File.createTempFile("test", ".xml");
            System.out.println(tempDir.toString() + "<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
            File tempFile = new File(tempDir, "file1.xml");
            Reader rdr = new FileInputStream(tempFile);
            ASTNode parsedASTNodes = JMCAParser.parse(rdr);
            
            // TODO the rest checks on the parsed ASTNode
            
            assertTrue(parsedASTNodes instanceof SaxProcessor);
            assertTrue(parsedASTNodes.getNodes()[0] instanceof JavaParser);
        } catch (IOException e) {
            fail("Caught IOException.");
        }
    } 
    
    @Setup
    public void setUp() {
    	Reader reader = new FileReader("C:/data/work/test/tests/src/java/com/soops/CEN4010/JMCA/jmca_parser_xml.xml");
    	FileWriter tempFilePtr = null;
    	FileInputStream fis = null;
    	try {
	    	  tempFilePtr = new FileWriter("C:/data/work/test/tests/src/java/com/soops/CEN4010/JMCA/jmca_parser_tree.xml");
	    	  fis = new FileInputStream(reader);
        	  SaxProcessor processor = new SaxProcessor();
        	  processor.parse(fis);
        } catch (IOException ex) {
            System.out.println("Error in testing");
        }
    	

            try {
            	fis = new FileInputStream(new File("C:/data/work/test/tests/src/java/com/soops/CEN4010/JMCA/jparser_config.jar"));
            	JavaParser parser = new JavaParser(fis);
            	fis.close();

                File tempFile = new File(tempDir, "file1") ;
                fis = new FileInputStream(tempFile);
                //Parser p = new Parser(fis);
                parsedASTNodes = parser.parse(fis);
            } catch (IOException e) {
                fail("Caught IOException.");
            } catch (ParseException e) {
                if (e.getCause() instanceof IOException) {
                    fail();
                } else { }
            }

            try {
            	//try with intermediate file name
            	fis = new FileInputStream(new File("C:/data/work/test/tests/src/java/com/soops/CEN4010/JMCA/jparser_config.jar"));
            	JavaParser parser = new JavaParser(fis);
                fis.close();

                parsedASTNodes = parser.parse(tempDir);
            } catch (IOException e) {
                fail("Caught IOException.");
            } catch (ParseException e) {
                assertTrue(false);
            }
            fis.close();
        }
}