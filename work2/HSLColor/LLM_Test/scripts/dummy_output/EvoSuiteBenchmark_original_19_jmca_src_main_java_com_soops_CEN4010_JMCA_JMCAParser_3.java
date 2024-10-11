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
	* {@inheritDoc}
	*/
	@Override
	public ASTNode parse(String fileName, String sFileName)
	throws ParseException, IOException {
		Reader myFile = null;
		try {
			// try read the content
			myFile = new FileInputStream(fileName);
			String sContent = new String(myFile.readAllBytes(), "UTF-8");
			String sIntermediateFile = sFileName.trim().replaceAll(" ", "");
			myFile = new FileInputStream(sIntermediateFile  + sContent.substring(1, sContent.length()));
			
	        MyParser parser = new MyParser(myFile);
	        return parser.parse();
		}
		catch(IOException ex) {
			//log.error("",ex);
			//System.exit(1);
			return null;
		}
	}

	@Override
    public String toString() {
        return "JMAxParserTest";
    }
}