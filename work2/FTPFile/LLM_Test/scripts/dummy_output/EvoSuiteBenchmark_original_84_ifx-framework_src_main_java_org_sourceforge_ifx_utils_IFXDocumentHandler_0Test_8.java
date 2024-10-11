// IFXDocumentHandler_0Test.java
package org.sourceforge.ifx.utils;

import java.io.OutputStream;
import java.io.InputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Iterator;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.Namespace;
import org.jdom.input.SAXBuilder;
import org.jdom.output.XMLOutputter;
import org.sourceforge.ifx.basetypes.IFXObject;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IFXDocumentHandler}.
* It contains one unit test case for the {@link IFXDocumentHandler#build(IFXObject, String, String)} method.
*/
class IFXDocumentHandler_0Test {
		private Document doc;
		private final static String XML_STRING = "<test>\n<c>2</c>\n</test>";
		private final static String XML_STRING2 = "<test xmlns=\"http://www.w3.org/2001/XMLSchema\">\n<c>2</c>\n</test>";

		private String lineSeparator = DEFAULT_LINE_SEPARATOR;
		private Namespace namespace = null;
		private String defaultNamespaceUri="http://www.default.com/default-ns";
		
		private String defaultNamespaceUri="";
		public static String CHANNEL=null;
		
		/**
		* Initialization for testing.
		*/
		public IFXDocumentHandler_0Test() throws Exception {
				namespace = Namespace.getNamespace("", defaultNamespaceUri);
	
				doc = new SAXBuilder()
                		.setFeature("http://xml.org/sax/features/validation", false)
                		.build(new InputSource(new StringInputStream(XML_STRING)));

	            //validate against schema
	            validationProperties.put(IFXDocHandler.CHECK_DTD_VALIDITY,"true");
	            validationProperties.put(IFXDocHandler.VALIDATE, "true");
	            validationProperties.put(IFXDocHandler.BOLT, "true");
	        }
		
		/**
		 * Starts the test.
		 * @param inputStream the input stream to read from. Cannot be null.
		 * @param inputStream2 stream to write to. Cannot be null.
		 * @param xmlString the string to be parsed and validated into a DOM model.
		 */
		public void start(InputStream inputStream, InputStream inputStream2, String xmlString) throws Exception {
			start(inputStream, inputStream2, xmlString, null);
	    }

		/**
		 * Starts the test.
		 * @param inputStream the input stream to read from. Cannot be null
		 * @param inputStream2 stream to write to. Cannot be null
		 * @param xmlString the string to be parsed and validated into a DOM model.
		 * @param validationProperties a Map of name value pairs specifying
		 * the schema and the namespace to validate against.
		 */
		public void start(InputStream inputStream, InputStream inputStream2, String xmlString, Map validationProperties) throws Exception {
	        assertNotNull("inputStream cannot be null",inputStream);
	        assertNotNull("inputStream2 cannot be null",inputStream2);
	        assertNull("xmlString cannot be null",xmlString);
	        try {
	            assertEquals("inputStream",inputStream,inputStream2);
				build(doc,namespace,defaultNamespaceUri,validationProperties);
				XMLOutputter outputter = new XMLOutputter();
				XMLOutputter outputter2 = new XMLOutputter();
				outputTxt (outputter.output(doc, xmlString));
				outputTxt (outputter2.output(doc, xmlString));
	            Document result = outputer.output(doc);
	        }
	        catch (Exception e) {
	        	assertEquals("start","start",e.toString());
	            e.printStackTrace();
	            //assertTrue("Exception caught", false);
	        }

	        InputStream istream = new java.io.ByteArrayInputStream(inputString.getBytes());
	        InputStream istream2 = new java.io.ByteArrayInputStream(inputString.getBytes());

	        if (inputStream==null) {
	        	assertNull("inputStream cannot be null",isstream);
	        } else {
	        	assertEquals("inputStream",inputStream,istream);  // should be identical
	        }
	        if (inputStream2==null) {
	        	assertNull("inputStream2 cannot be null",isstream2);
	        } else {
	        	assertEquals("inputStream2",inputStream2,istream2);
	        }
        }

}