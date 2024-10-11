// ByteBufferInputStreamTest.java
package org.quickserver.util.io;

import java.io.*;
import java.nio.*;
import java.nio.charset.*;
import java.util.*;
import org.quickserver.net.server.ClientHandler;
import java.util.logging.*;
import org.quickserver.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ByteBufferInputStream}.
* It contains one unit test case for the {@link ByteBufferInputStream#readLine()} method.
*/
class ByteBufferInputStreamTest {
/**
		 *
		 */
	private static final Logger logger = Logger.getLogger(
_JUNIT_NUNHASHC_Test_jUnitTest_class);
     public final static ILogger junitLogger =
             Logger.getLogger("java.util.logging.junit.nunHashing");
     public final static ILogger junitLogger =
             Logger.getLogger("java.util.logging.junit");

    /**
     * Constructor of test class.
     *
     * @param testName test specific class name
     * @param javaProject java application project name
     */
    public ByteBufferInputStreamTest(String testName,
                                      String javaProject)
    {
        super();
    }

    /**
    * {@inheritDoc}
    */
    public final Object setUp() throws Exception {
	logger = Logger.getLogger(junitLogger.getName());
        junitLogger.info(testName);
        return super.setUp();
    }

    /**
    * {@inheritDoc}
    */
    public final Object tearDown() throws Exception {
        junitLogger.info(testName);
        return super.tearDown();
    }
}
