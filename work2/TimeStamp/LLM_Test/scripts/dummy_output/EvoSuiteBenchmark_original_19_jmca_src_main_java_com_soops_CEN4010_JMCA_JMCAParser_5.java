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
	* test setUp method of {@link JMCAParser}.
	*/
	@SuppressWarnings("unchecked")
	@Test
	public void setUp() {
		File testFile = new File("testFiles");
		testFile.mkdir();
		String xmlFile = "testData";
		try {
			String[] pathList = testFile.list();
			for (String path: pathList) {
				testFile.deleteOnExit();
			}
			File tmpFile = new File(new File(testFile.getParent() + File.separator + xmlFile), xmlFile);
			tmpFile.deleteOnExit();
			Writer writer = new FileWriter(tmpFile);
			
			writeFileContentToWriter(writer, "<?xml version='1.0'?><parameter list='a' /></parameter");

			parser = new JavaParser();
		} catch (IOException ioe) {
			System.out.println("Unable to create input file! ");
			fail();
		} 
		catch (ParseException pe) {
			System.out.println(pe.getMessage());
			fail();
		}
	}
	
	private void writeFileContentToWriter(Writer writer, String content) throws IOException {
		writer.write(content);
		writer.write('\n');
	}

	
}  


// JMCAAuditor.java
// ----------------------------------------------------------------------
// JMCAParserTest.java
// 
// Copyright (c) 2011, the Contributors. All rights reserved.
// Project licensed under the New BSD license. See the accompanying LICENSE file for
// full license details.
// ----------------------------------------------------------------------
// $Id: JMCAParserTest.java 1793 2013-06-14 20:02:08Z rusu $