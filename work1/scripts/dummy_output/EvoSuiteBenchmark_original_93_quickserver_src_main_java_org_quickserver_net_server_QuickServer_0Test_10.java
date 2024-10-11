// QuickServer_0Test.java
package org.quickserver.net.server;

import java.io.*;
import java.lang.management.ManagementFactory;
import java.net.*;
import org.quickserver.net.*;
//v1.1
import org.quickserver.net.qsadmin.*;
//v1.2
import java.util.logging.*;
//v1.3
import org.quickserver.util.pool.*;
import org.quickserver.util.pool.thread.*;
import org.apache.commons.pool.*;
import org.quickserver.util.xmlreader.*;
import org.quickserver.sql.*;
//v1.3.1
import java.util.logging.Formatter;
import java.util.*;
//v1.3.2
import org.quickserver.util.*;
//v1.3.3
import org.quickserver.security.*;
//v1.4.0
import javax.net.ssl.*;
import javax.net.*;
import java.security.*;
import java.security.cert.*;
//v1.4.5
import java.nio.channels.*;
import org.quickserver.net.server.impl.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link QuickServer}.
* It contains one unit test case for the {@link QuickServer#getVersion()} method.
*/
class QuickServer_0Test {
		
	File testFile = new File("QuickServer_0_Test.xml");

	/**
* Returns the version of the library.
*/
	public static final String getVersion();
	
        public boolean runUnitTest() throws Exception {
        
	
		if (testFile.isFile()) {
			    String version = testFile.getAbsolutePath();
    		
		    if (version.endsWith(".xml") && version.substring(0, version.lastIndexOf(".")) == getVersion()) {
		    	return true;
		    } else {
		    	fail("Unable to parse version "+version);
		    }
		} else {
		    fail("Unable to find test file : "+testFile.getAbsoluteFile().toString());
		}
		return false;
	}


    public void verifyXMLXMLString(String xmlString) throws Exception {

/**/	    if (xmlString.length() == 0 ||
	     	    xmlString.length() <= 0) {
		fail("Unable to parse XML : "+xmlString);
	    }

	    Document doc = XmlReader.xmlStringToDomDocument(xmlString, "UTF-8");
	    assertNotNull(doc);

//        Document doc = XmlReader.xmlStringToDomDocument(new BinaryReader("aBinaryString").getDataAsStream(), "ISO-8859-1");
       assertNotNull(doc);

	    Element root = (Element) doc.getRootElement();
	    assertNotNull(root);
	    assertEquals("Version", root.getTagName());
	}

	public void doTest() throws Exception {

	assertTrue(runUnitTest());
	}

	public void verifyBinaryData(String binaryData, String target) throws Exception {
	    
	    byte[] testBinData = "test binary data".getBytes();
	    DataInputStream din = new DataInputStream(new ByteArrayInputStream(testBinData));
	    byte[] testBinData2 = din.readRemainingBytes();

	    assertArrayEquals(testBinData, testBinData2);

	    din.close();

	    File file = new File("QuickServer_0_Test.xml");

	    OutputStream dos = new BinaryOutputStream(new FileOutputStream(file));

	    dos.write(testBinData);
	    dos.close();
}
}