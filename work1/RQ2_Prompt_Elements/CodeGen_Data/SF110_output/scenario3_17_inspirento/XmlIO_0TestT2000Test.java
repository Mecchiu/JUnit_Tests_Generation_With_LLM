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
	 * Test case for {@link XmlIO#load(InputStream)} method.
	 */
	@Test
	public final void test_load( ) {
		
   	// Create an Atttributes instance and store it
   	Attributes atttribs = Attributes.getAttributes( "test", "test" );
   	
   	// Create an Atttemptor to handle the XML stream containing a test element
   	//
   	TestXMLAttributeSetter atttress = new TestXMLAttributeSetter("Test" );
   	
   	try {
       	   // Load from the XML stream
               StringBuffer sb = new StringBuffer();
               
               // Print out the XML file
       	    System.out.println("TestXMLFile1 is created");
               XMLReader xmlReader = SAXParserFactory.newInstance()
       			.newSAXParser().getXMLReader( );
               
               sb.append(xmlReader.getFeature( "http://xml.org/sax/features/namespaces" ) );
           	
       	    // Load the test element
   	     		sb.append(atttress.load("test"));
       	
       	   	// Parse the test ee
               System.out.println("TestXMLFile2 is created");
               XMLReader xmlReader11 = SAXParserFactory.newInstance()
       				.newSAXParser().getXMLReader( );
               // Load the test element
               StringBuffer sb11 = new StringBuffer(sb);
               StringBuffer sb2 = ( new StringBuffer(" ") ).append(sb11).append(" ");
               StringBuffer sb22 = new StringBuffer(" ").append(sb).append(" ");
               sb22 = sb22.toString()
               		.substring(sb22.toString().lastIndexOf('"{'),
                       sb22.toString().lastIndexOf('"'));
               System.out.println(sb22);
               
               // Test if the loaded tag is correct
       	    assertTrue(xmlReader11.getNamespaceContext().getPrefix("ns1").equals("ns1"));
       	    System.out.println("");
       	        		
               // Parsed the test element
               sb2.append(atttress.load(sb22));
               // Parsed the test element
       	    sb2.append("\n");
       	    System.out.println("test element2 is created");
       	    final StringBuffer sb3 = new StringBuffer(sb2);
       	    StringBuffer sb4 = sb3
       				.append("\n\n\n\n")
       				.append(atttress.load(sb3));
       	    sb4.append("\n");
       	    System.out.println(sb4.toString());
       	    
       	    // Test if the loaded test element is correct
       	    assertTrue(xmlReader2.getNamespaceContext().getPrefix("ns2").equals("ns2"));
       	    assertEquals(12, sb4.toString().length());
       	
       	    // Test loading some missing elements
       	    sb2.append(
       			   atttress.load(sb4));
       	    StringBuffer sb5 =
       			   new StringBuffer
       			   (
       			   new StringBuilder("\n\n\n\n\n")
       					.append(
       					 		sb4
       							.toString())
       					.toString())
       			  .append("\n");
       	    System.out.println(
       			    new String(
       			    		sb5.toString()
       			    		.replaceAll("\"{ns2\\}\"", "\"test\">ns2</test>"))
       			   .toString());
       	    
       	    try {
       	    // Load the test element
       	    	Object obj = xmlReader.getProperty( "http://xml.org/sax/properties/lang" );
       	    	assertTrue(obj instanceof String);
       	    	// System.out.println(xmlReader2.getLang().getValue());
       	    	assertEquals("XML ParsER - Test",
       	    	( (String)obj) );
       	    } catch (SAXException ex) {
       	        // Ignore the exception
    	    }
       	    try {
       	    // Load the test element
       	    	Object obj = xmlReader.getProperty( "http://xml.org/sax/properties/base" );
       	    	assertTrue(obj instanceof String);
       	    	// System.out.println(xmlReader2.getBaseClass().getValue());
       	    	// assertEquals("Test XmlIO with base class",
       	    	    // ( (String)obj) );
       	    } catch (SAXException ex) {
       	        // Ignore the exception
    	    }
       	    try {
       	    // Load the test element
       	    	Iterator i = xmlReader.getPropertyNames();
       	    	while ( i.hasNext() ) {
       	    	    System.out.println(i.next());
       	    	    String propName = i.next();
       	    	    Object nsObject = xmlReader.getProperty(
       	    	            propName.substring(
       	    	                propName.indexOf("http://xml.org/sax/properties/namespace") + 
       	    	                  propName.indexOf("http://xmlpull.org/)")
       	    	           .split("/")[1]);
       	    	    String ns = ((String)nsObject).split(" ")[0].