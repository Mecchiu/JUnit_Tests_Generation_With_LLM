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
		* Unit test for {@link JMCAParser#parse(Reader)}.
		* @throws IOException
		* @throws ParseException
		*/
	@Test
	void testParse() throws IOException, ParseException {
		File file = new File(intermediateFile);
		FileInputStream fis = new FileInputStream(file);
		
		Parser p = new Parser();
		parser = p.parse(new Reader(fis));
		
		reader = new Reader();
		parser.parse(reader);
	}
	
	@Test
	void testIntermediateFile() throws IOException, ParseException {
	File inter = new File("testIntermediateFile");
		FileInputStream fis = new FileInputStream(inter);
		
		Parser p = new Parser();
		parser = p.parse(new Reader(fis));
		
		reader = new Reader();
		parser.parse(reader);
	}
	
	private SaxProcessor parser;
	private boolean error = false;
	private FileInputStream fis;
	private JavaParser parser;
	private Reader reader;
}