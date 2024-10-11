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
		
	public QuickServer_0Test() {
	}
	
	/**
	 * @return the version of the library.
	 */
	public static String getVersion();

	/**
	 * Main routine of the server. It checks whether QuickServer has been loaded into the processor pool or not.
	 * @throws ClassNotFoundException Throws ClassNotFoundException which will be thrown if QuickServer hasn't loaded into the processor pool.
	 */
	@Test
	void test() throws ClassNotFoundException {
    	   System.out.println(
    	     "Start QuickServer test.\n" +
    	     "QuickServer v. "+ getVersion()+" - Version"+getVersion()+"\n");
       
        System.out.println("Loading QuickServer v. "+getVersion()+"\n");

        if (!ManagementFactory.getPlatformMBeanServer()
            .isRegistered(QuickServer.class.getCanonicalName())) {
            try {
                System.out.println("QuickServer not present in the JVM.\n");
                throw new UnsupportedOperationException("QuickServer has not " +
                		"been loaded into the JVM.");
            } catch(MBeanException mbe) {
                    throw new RuntimeException("Problem while loading " +
                    		"QuickServer into JVM", mbe);
            } catch (InvalidParameterException mbe) {
                    log.warning("QuickServer doesn't loaded in the JVM!");
            } catch (Exception e) {
                    System.out.println("Unexpected exception occurred:\n");
            }
            System.exit(1);
        }
	
		System.out.println("QuickServer is loaded into the processor pool");

		boolean stop = false;
}
}