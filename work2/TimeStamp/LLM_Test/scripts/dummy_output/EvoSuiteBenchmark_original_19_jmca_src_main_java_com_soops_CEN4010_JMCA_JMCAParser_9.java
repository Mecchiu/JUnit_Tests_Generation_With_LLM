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
		* The method calls parse method
		* precondition is that the intermediatFile is set
		* @throws ParseException
		* @throws IOException
		* @throws org.junit.jupiter.api.Assertions
		*/
    @Test
    public void testParsing() throws ParseException, IOException,
    org.junit.jupiter.api.Assertions {
        final String[] fileContent = {
            "<A/>",
            "<A />"
        };

        FileReader f = null;
        Writer w = null;
        
        f = new FileReader("Default.xml");
        w = new FileWriter("Default.xml");

        // Parses the xml file
        SAXProcessor parser = new XMLParser();
        parser.process(f.getInputStream());

        // It should parse the file
        org.junit.jupiter.api.Assertions.assertEquals(fileContent[0], parser.getXml().toString());
        parser.shutdown();

        /*
        The methods should just return the parsed xml content for the default file. The parsing will continue
        if the method was not successful.
        */
        String expectedContent[] = {
            "<A/>",
            "<A />"
        };
                f = new FileReader("Default.xml");
        w = new FileWriter("Default.xml");
        parser = new XMLParser(expectedContent[0]);
        parser.process(f.getInputStream());
        org.junit.jupiter.api.Assertions.assertArrayEquals(expectedContent, fileContent);
        parser.shutdown();
        
        f.close();
        w.close();
    }

	/**
	 * the Junit test suite for {@link org.junit.jupiter.api.Test}
	 * @return JUnit test case suite
	 */
	public org.junit.jupiter.api.Test suite() {
		return new org.junit.jupiter.api.Test() {
			@Override
			public void run() {
				org.junit.Assert.assertNotNull(parse("NotImplemented.xml"))
				.isError();
			}};
	}
}