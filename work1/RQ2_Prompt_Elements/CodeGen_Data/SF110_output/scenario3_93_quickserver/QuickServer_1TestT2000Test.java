// QuickServer_1Test.java
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
* It contains one unit test case for the {@link QuickServer#getVersionNo()} method.
*/
class QuickServer_1Test {

	private static final Logger log = Logger.getLogger("QuickServer");
	private static final int DEFAULT_PORT = 3123;
	private static final int DEFAULT_LOGLEVEL = 0;
	private static final boolean DEFAULT_REPLYCATE_TO_CLIENT = false;
	
	// This is to test the ability to set DataMode for input.
	final DataMode MODE_SETTING=DataMode.ReadWrite_Binary_Charset_String;
	/**
	 * Creates a QuickServer object that is used to test the functionality of the
	 * {@link #setDataMode(Mode)}.
	 */
	public static QuickServer createQSS(String host, int port) throws AppException {
		// Create a QuickServer object.
		QuickServer res = null;
	    try {
			URL url = new URL("http://"+host+":"+port);
			res = new QuickServer(url);		
		} catch(Exception e) {
			if(log.isLoggable(DEFAULT_LOGLEVEL)) {
				log.logp(DEFAULT_LOGLEVEL, "QuickServer", "createQSS", "Error with the URL : "+e.getLocalizedMessage());
			}
			throw new AppException(e.toString(), e);
		} 

	    return res;
	}
	
	// Set the data mode to Binary_Charset_String.
	public static void setDataModeDataMode(Mode mode) {
		System.setProperty("org.quickserver.net.QSS.dataMode", mode);
	}
	
    /**
     * Test for correct setting of the setDataModeDataMode method.
     * @since 1.4
     */
	@Test
    public void setDataMode_dataMode(){
        // Test if the mode setting is working.
        assertEquals("dataMode",MODE_SETTING,System.getProperty("org.quickserver.net.QSS.dataMode"));

        //setDataMode(Mode.Write_Text_Charset_String);
        mode=Mode.Read_Binary_Data_Charset_String;
        System.setProperty("org.quickserver.net.QSS.dataMode", mode);
        assertEquals("dataMode",mode,System.getProperty("org.quickserver.net.QSS.dataMode"));

        