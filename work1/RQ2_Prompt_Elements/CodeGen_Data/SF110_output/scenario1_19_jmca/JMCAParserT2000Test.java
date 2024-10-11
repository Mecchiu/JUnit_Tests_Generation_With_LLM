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
		
	/** Test of {@link JMCAParser#parse(Reader)} method. */
	@Test
	public void testParse() throws ParseException, IOException {
		try {
    StringReader is = new StringReader("1");
    ASTNode node = null;
    node = JMCAParser.parse(is);
    if (node == null)
        return;
    String expected = "1\n1";
    assertEquals(expected, node.getText());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/** Test of {@link JMCAParser#saveFile()} method. */
	@Test
    public void testSaveFile() throws ParseException, IOException {
		try {
    StringWriter wtr = null;
    FileOutputStream fos = null;
    File f = new File("test4compilefile.j");
    f.createNewFile();
    Writer w = new FileWriter(f);
    w = new FileWriter(f.getAbsoluteFile(), true);
    FileInputStream fis = new FileInputStream(f);
    fis.read();
    JMCAParser.saveFile(wtr, w, f);
    System.out.println("Java Parser Version 1.x:  Output file was saved.");
    wtr.flush();
    wtr.close();
    System.out.println("Java Parser Version 1.x:  Input file was not saved.");
//		} catch (IOException ie) {
//			System.out.println("IO Error : " + ie.getMessage());
//			return;
//		} catch (ParseException pe) {
//			System.out.println("ParseException : " + pe.getMessage());
//			return;
//		} catch (java.io.IOException ie) {
//			System.out.println("java IO error : " + ie.getMessage());
//			return;
//		} catch (Error ex) {
//			System.out.println("Error : " + ex.getMessage());
//		}
		} catch (ParseException e) {
			System.out.println("Exception parsing : " + e.getClass() + " : " + e.getMessage());
			return;
		} catch (IOException e) {
			System.out.println("IO Exception : " + e.getMessage());
		    e.printStackTrace();
		}
	}

	private static final File intermediateFile = new File("./intermediate.jcat");
	
}
