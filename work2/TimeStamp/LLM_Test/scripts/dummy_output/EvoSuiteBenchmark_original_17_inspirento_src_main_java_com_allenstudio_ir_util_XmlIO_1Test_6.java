// XmlIO_1Test.java
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
* It contains one unit test case for the {@link XmlIO#load(URL)} method.
*/
class XmlIO_1Test {
		
//@Test
//public void testLoadXML1() throws Exception{
//	String[] files={"src/test/resources/xin.xml"};
//	InputStream is=this.getClass().getResourceAsStream("/src/test/resources/"+files[0]);
//	XmlIO s=new XmlIO(files[0]);
//
//	String[] expected={"X1", "X2"};
//	List actual=s.load( is );
//
//	assertEquals( expected.length, actual.size() );
//
//	//assertEquals( expected[0], actual.get(0) );
//}
//
//@Test
//public void testXmlParser1() throws Exception {
//	// create a basic XML document and parse the file
//	String xml=
//		"<![CDATA[<xml>\n"+
//		"	<a>1</a>"
//		"</xml>\n"+
//		"<a><b>2</b></a>"
//		"<b>3</b></xml>\n"+
//		"]]>";
//
//	InputStream is= this.getClass().getResourceAsStream("/src/test/resources/") ;
//
//	XmlIO s=new XmlIO("");
//
//	Reader r=new InputStreamReader( is, "UTF-8" );
//
//	s.parse( r );
//
//	// The result should be "X1"
//	assertEquals("X1", s.getContent() );
//}
//
//private void assertEquals(String expected, String actual) throws Exception {
//	if (!expected.equals(actual) ||!expected.endsWith("xml")) {
//		System.out.println( "actual="+System.lineSeparator()+expected );
//		System.out.println( ""+actual );
//		throw new Exception( "Expected=" + expected + " Got="+actual  );
//	}
//}
//
//
//}