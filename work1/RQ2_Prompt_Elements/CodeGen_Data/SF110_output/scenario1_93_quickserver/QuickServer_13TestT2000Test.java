// QuickServer_13Test.java
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
* It contains one unit test case for the {@link QuickServer#getPID()} method.
*/
class QuickServer_13Test {
/**
		 * <p>
		 * Method for initiating the QuickServer.
		 * </p>
		 */
	@Test
	void initialize() throws Exception {
        String pid = System.getProperty("quickserver.quickServer.pid","");
        if (pid!= ""){
            Thread.currentThread().sleep(1000*60*30);
            System.err.println("quickServer.pid="+pid);
        }

        if (ManagementFactory.getRuntimeMXBean().getName().contains("Kernel")) {
            System.err.println("QuickServer can't be run under Linux due to wrong permissions");
            return;
        }
        
        
        quickServer.getPID();
        System.err.println("quickServer.pid = "+quickServer.getPID()+" "+quickServer.getPort());
    }
}
