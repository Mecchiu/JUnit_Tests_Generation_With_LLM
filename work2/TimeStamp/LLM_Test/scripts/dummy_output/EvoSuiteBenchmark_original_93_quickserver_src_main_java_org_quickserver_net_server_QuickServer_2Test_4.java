// QuickServer_2Test.java
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
* It contains one unit test case for the {@link QuickServer#getNewLine()} method.
*/
class QuickServer_2Test {
		
	/**
	* @throws IOException 
	* @throws UnsupportedEncodingException
	* @throws GeneralSecurityException
	* @see <a href="http://www.opensource.apple.com">Apple</a>
	* @see <a href="https://groups.google.com/mail/search?from=QuickServer%2522team%2522</a>
	*/
	@Test
	void getNewLine() throws IOException, UnsupportedEncodingException, GeneralSecurityException, AppException {
		String line = null;
		String lineCopy = getLine();
		
		System.out.println(line.toString());
		
		assertEquals(line, getNewLine());
		
		line = null;
		lineCopy = getLine();
		
		System.out.println(line.toString());
		
		assertEquals(line, getNewLine());
	}
	
	private String getLine() throws IOException {
	    FileInputStream inputStream = null;
	    try {
	    	inputStream = new FileInputStream(QuickServer_2Test.class.getClassLoader().getResourceAsStream("Echo Server.xml"));
		}
	    catch (IOException ie) {	      
	        //do nothing.		   		
            return null;
	    }
	    
	    BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
	    String line = null;
	    try {
	    	try {
		        line = reader.readLine();
			}
		     finally {
		    	     reader.close();
		     }
	    }
	    catch(Exception ex) {ex.printStackTrace();}
	    finally {
	    	if(inputStream!= null)
	    		try {
	    			inputStream.close();
	    		}
	    		catch(IOException ioe) {}
	   }
	   return line;
	}

}

// <p>
// The <code>QuickServer