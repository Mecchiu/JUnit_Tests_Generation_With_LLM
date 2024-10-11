// XmlIO_0Test.java
package com.allenstudio.ir.util;

import java.io.BufferedWriter;
import java.io.CharArrayWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.URL;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link XmlIO}.
* It contains one unit test case for the {@link XmlIO#load(InputStream)} method.
*/
class XmlIO_0Test {
		
    /**
    * Tests the {@link XmlIO#load(InputStream)} method.
    *
    * @throws Exception should not appear in the end.
    */
    @Test
    public void testLoad() throws Exception {
    	XMLReader parser = new SAXParserFactory().newXMLReader();
    	parser.parse(new FileInputStream("src/test/resources/XmlFileIO.xml"));
    	ParserData data = new ParserData();
    	data.parser = parser;
    	StringBuilder buffer = new StringBuilder();
    	buffer.append("<item>");
    	parser.contentHandler = new PrintHandler(buffer.toString());
    	XmlIO xmlIO = new XmlIO(data);
    	int count = 0;
    	while (xmlIO.load(new InputStream()) > 0) {
    		count++;
	    }
    	System.out.println(count);
        StringBuilder sb = new StringBuilder();
        sb.append("</item>");
        parser.parse(new StringReader(sb.toString()));
    }
    
    /**
    * Parses XML from the StringBuilder.
    */
    private static class Token {
    	int tokenType;
    	int contentTypeMask;
    	int contentType;
    	int value;
    	String valueString;
    	String textString;
    	int name;
    	
    	public Token(int tokenType, int contentTypeMask, int contentType, int value, String textValue, int name) {
    		super();
    		this.tokenType = tokenType;
    		this.contentTypeMask = contentTypeMask;
    		this.contentType = contentType;
    		this.value = value;
    		this.textValue = textValue;
    		this.name = name;
    	}
    }

    /**
    * Parses XML from a List of tokens.
    */
    public void parseTokens(List<Token> tokens) {
        for (Token token : tokens) {
    		token.setTextValue("token");
    	}
    	int tokenType;
    	int contentTypeMask;
    	int contentType;
    	int value;
    	String textValue;
    	int name;

}
}