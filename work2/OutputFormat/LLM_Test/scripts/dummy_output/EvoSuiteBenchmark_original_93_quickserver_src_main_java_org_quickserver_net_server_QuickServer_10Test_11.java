// QuickServer_10Test.java
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
* It contains one unit test case for the {@link QuickServer#findAllClient()} method.
*/
class QuickServer_10Test {
		
    private static final String CLASS_NAME = "org.quickserver.net.Server";
    //the class instance to test
    private static QuickServer_10Test thisOne;
    
    //the method tests
    /**
    * Set the value into the quick server object.
    * The method should set the value into the quick server object, it can only be set once
    *
    * @since 1.4.1
    */
    public static void setupTest() {
        //clear out reference
        thisOne = null;
    };
    
    /**
     * Returns the class object of the class
     * used to create the quick server.
     *
     * @since 1.4.1
     */
    public static QuickServer_10Test getTest() {
        return thisOne;
    };

    /**
     * Main method of the class.
     *
     * @param args command line arguments
     */
}