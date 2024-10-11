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
// JMCAParser.java
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

public class JMCAParser implements Parser {

    String intermediateFile = "default.xml";

    /**
     * parse implements parse for Parser
     * precondition is the intermediatFile is set
     * @param rdr Reader
     * @return ASTNode
     */
    public ASTNode parse(Reader rdr) {
        JavaParser parser = new JavaParser(rdr);
        Writer wtr = null;
        try {
            parser.CompilationUnit();
            wtr = new FileWriter(new File(intermediateFile));
            parser.dump(wtr);
            System.out.println("Java Parser Version 1.1:  Java program parsed successfully.");
            wtr.close();
            SaxProcessor saxP = new SaxProcessor(new FileInputStream(new File(intermediateFile)));
            saxP.showFile();
            return saxP.getRootNode();
        } catch (ParseException e) {
            System.out.println(e.getMessage());
            System.out.println("Java Parser Version 1.1:  Encountered errors during parse.");
            return null;
        } catch (IOException ie) {
            System.out.println("IO Error from parse : " + ie.getMessage());
            return null;
        } catch (Error ex) {
            return null;
        } finally {
            try {
                if (wtr!= null)
                    wtr.close();
            } catch (IOException ie) {
                System.err.println("Error while closing intermediate file " + intermediateFile);
                System.err.println(ie.getMessage());
            }
        }
        //           return null;
    }
}

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
    public void testStringProcessing() {

        StringBuilder sb = new StringBuilder();
        sb.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
        sb.append("<a:nodes><a:node nodeType=\"a:Text\">value</a:node></a:nodes>");

        JSONParser parser = new JSONParser(sb);
        ParserResult result = parser.parse();
        assertTrue(((JSONFileTree) result.getTree()).isComplete());
        assertTrue(result.isSuccess());

				
			}
		@Test
    public void testFileParsing() {

        StringBuilder sb = new StringBuilder();
        sb.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
        sb.append("<a:nodes>");
        sb.append("<a:node nodeType=\"a:FileNode\">");
        sb.append("<a:file>");
        sb.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
        sb.append("</a:file></a:node>");
        parser.parse(new ByteArrayReader(sb.toString().getBytes()));
        sb.setLength(0);
        sb.append("</a:node>");
        sb.append("</a:nodes>");
        
        JSONParser parser = new JSONParser(sb);
        ParserResult result = parser.parse(new ByteArrayReader("TestString.xml".getBytes()));
        assertTrue(result.isSuccess());
		}

	@Test
    public void testStringParsing() throws IOException {
	    
        String s = "String";

        StringBuilder sb = new StringBuilder();

        sb.append(s);
        
        parser.parse(new ByteArrayReader(sb.toString().getBytes()));

        //				sb.insert(0, s);
        // System.out.println(new String((byte[])sb.toArray()[0]));
        // File f = new File("C:\\Users\\John\\Documents\\java");
        // System.out.println(f.exists());
        // assertTrue(f.exists());
        //
        // FileInputStream fis = new FileInputStream(f);
        // System.out.println(fis.available());
        // // assertTrue(fis.available() > 0);

        // System.out.println();
    }


	@Test
    public void testArray() throws IOException {
	    
        String s = "[0,1]";
        
        ByteArrayReader br = new ByteArrayReader(s.getBytes());
        ArrayArrayBuilder arrayBuilder = new ArrayArrayBuilder();
        int i = arrayBuilder.build(br);
        assertTrue(i > 0);
        
    }
	
	@Test
    public void testArrayBuild() throws IOException {
	    
        String s = "[0,1]";
	    
        ByteArrayReader br = new ByteArrayReader(s.getBytes());
	    ArrayArrayBuilder arrayBuilder = new ArrayArrayBuilder();
	    int i = arrayBuilder.build(br, 1);
	    assertEquals(2, i);
    }
	
	@Test
    public void testArrayBuilder() throws IOException {

        StringBuilder sb = new StringBuilder();
        sb.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
        sb.append("<a:nodes><a:node nodeType=\"a:Text\">value</a:node></a:nodes>");
	
        ByteArrayReader br = new ByteArrayReader(sb.toString().getBytes());
        
		// parser.parse(new ByteArrayReader(s.getBytes()));
		    parser.parse(br);
		
        File file = new File("C:\\Users\\John\\Documents\\java");
        
        System.out.println(file.exists());
        assertTrue(file.exists());

		assertTrue(((JSONFileTree) br.getTree()).isComplete());
    }
	
	@Test
    public void testArrayGet() throws IOException {
	    

		System.out.println();
        ByteArrayReader br = new ByteArrayReader(
                "<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
        ArrayArrayBuilder arrayBuilder = new ArrayArrayBuilder();
        // arrayBuilder.Build(this);

        // parser.parse(new ByteArrayReader(sb.getBytes()));
		    parser.parse(br);

        File f = new File("C:\\Users\\John\\Documents\\java");
        System.out.println(f.exists());
        assertTrue(f.exists());

		assertTrue(Arrays.equals((Object[]) arrayBuilder.getArray(0), (Object[]) new java.util.ArrayList(Arrays.asList("value"))));

		
		/*
			//assertTrue(((JSONArrayTree)br.getTree())
			.getElementAt(0).equals("value"));
			*/

	}

}
