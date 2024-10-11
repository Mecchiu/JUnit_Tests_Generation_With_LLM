// XTreeUtil_1Test.java
package nu.staldal.xtree;

import java.util.*;
import java.io.*;
import java.net.URL;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.sax.*;
import javax.xml.transform.stream.StreamResult;
import org.xml.sax.*;
import org.iso_relax.verifier.*;
import nu.staldal.xmlutil.ContentHandlerFixer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link XTreeUtil}.
* It contains one unit test case for the {@link XTreeUtil#parseXMLSequential(InputSource, boolean, String, InputSource, ElementHandler)} method.
*/
class XTreeUtil_1Test {
		
	private static final boolean DEBUG = false;
	
	public static void main(String args[]) throws Exception {
		if (DEBUG) {
			System.out.println("Debug mode activated.");
		} else {
			XTreeUtil.parseXMLSequential(new InputSource("test.xml"),false, null, null, new ElementHandler() {
				
				@Override
				public void startElement(String uri, String localName, String qName, Attributes attr) throws SAXException {
					System.out.println("Test: " + localName + "="+ attr.getValue("value"));
				}
			}); // @Override
		}
	}
}