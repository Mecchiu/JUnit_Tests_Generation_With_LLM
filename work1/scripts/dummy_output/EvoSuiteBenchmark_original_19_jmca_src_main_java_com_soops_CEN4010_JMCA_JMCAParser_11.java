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
		
    @Test
    void testParse() {
        System.out.println("testParse()");
        Reader reader = null; 
        ASTNode ast_node = null;
        Writer output = null;
        try {
            String file_name="default_xml1.xml";
            File file = new File(System.getProperty("user.dir")+"/"+file_name);
            Reader inputStream = new FileInputStream(file);
            reader = inputStream;
            ast_node = parse(reader);
            output = new FileWriter("xmllist.xml");
            
            byte[] xmlByte = SaxProcessor.toXML(ast_node);
            output.write(xmlByte);
            expected = "1";
            assertEquals( expected, ParseUtility.decryptedXML(xmlByte)); 
            
            expected = "2";
            assertEquals( expected, ParseUtility.decryptedXML(SaxProcessor.toXML(ast_node.getChild2()))); 
        }
        catch (Exception e) {
            fail();
        }
        finally {
            try {
                 if (output!= null)
                    output.close();
            }
            catch(Exception e) {
                 e.printStackTrace();
                 assertNotNull( output);
            }
            try {
                if (reader!= null)
                    reader.close();
            }
            catch(Exception e) {
                fail();
            }
            file_name = "xmllist.xml";
            finally {
        			File file = new File(System.getProperty("user.dir")+"/"+file_name);
        			Reader inputStream = new FileInputStream(file);
        			reader = inputStream;
             		expected = "xmllist_2.xml";
                 expected = ParseUtility.decryptedXML(SaxProcessor.toXML(ast_node.getChild2())); 
                 fail();
            }
        }
    }
    
    /**
     * Method {@link JMCAParser#parse(Reader)} does not return ASTNode
     * precondondisition is the ASTNode object has already be parsed
     * @param reader
     * @return ASTNode
     * @throws Exception
     */
    public ASTNode parse(Reader reader) throws Throwable {

        assertNotNull("ASTNode is Null", ast_node);
        assertNotNull("ASTNode is Null", reader);
        
        return JMCAParser.test(ast_node, reader);
    }
}