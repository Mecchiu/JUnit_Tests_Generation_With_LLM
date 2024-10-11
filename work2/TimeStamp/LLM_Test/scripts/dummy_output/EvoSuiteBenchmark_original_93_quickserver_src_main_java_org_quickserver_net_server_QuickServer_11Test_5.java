// QuickServer_11Test.java
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
* It contains one unit test case for the {@link QuickServer#getSSLContext(String)} method.
*/
class QuickServer_11Test {
		
    /**
     * This method creates an XMLElement object, which will be added to
     * the XML configuration.
     *
     * @param in the XML element for client data.
     * @param out the XML element, which will be added as the child of the
     * XMLElement and attached to the XML configuration.
     *
     * @return the XML Element after the XMLElement and child elements are added.
     *
     * @throws XMLParseException
     */
    protected synchronized static XMLElement createXML(String in, XMLElement out)
    	throws XMLParseException {
    	XMLElement inElement = null;
    	XMLElement outElement = null;
    	if (in == null) {
    		inElement = new XMLElement();
    	} else {
    		inElement = (XMLElement)XMLReader.createXMLEnvObj(in, "XML Element");
    	}
    	if (out!= null) {
    		outElement = new XMLElement(out);
    		outElement.addChild(inElement);
    	}
    	return outElement;
    }
	
    /**
     * This method creates an XMLElement object of the same type,
     * attached to the XML configuration.
     *
     * @param in the XML Element for client data.
     * @param out the XMLElement, which will be added as a child node of the XML
     * Element and attached to the configuration.
     *
     * @return the XML Element after the XML Element and child element are added.
     */
    protected synchronized static XMLElement createXMLE(XMLElement in, XMLElement out) {
    	XMLElement inElement = in;
    	XMLElement outElement = null;
    	if (in == null) {
    		outElement = new XMLElement();
    	}
}
}