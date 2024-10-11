// NonBlockingClientHandler_2Test.java
package org.quickserver.net.server.impl;

import org.quickserver.net.server.*;
import org.quickserver.net.*;
import org.quickserver.util.*;
import org.quickserver.util.io.*;
import java.io.*;
import java.net.*;
import java.util.*;
import java.util.logging.*;
import java.nio.*;
import java.nio.channels.*;
import javax.net.ssl.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link NonBlockingClientHandler}.
* It contains one unit test case for the {@link NonBlockingClientHandler#getMaxThreadAccessCount()} method.
*/
class NonBlockingClientHandler_2Test {

}
// Class for a test case of NON-BLOCKING client handler.
public class NON_BLOCKING_ClientHandler extends BasicClientHandler {

    /**
     * Returns the maximum count of thread allowed to run objects of this class at a time.
     *
     * @since 1.4.7
     */
    public static int getMaxThreadAccessCount();
    
    @Test
    public void testCtor() throws IOException, SSLHandshakeException {
        int expected= NIO_THREAD_COUNT;
        NON_BLOCKING_ClientHandler handler= new NON_BLOCKING_ClientHandler();
        try {
            // Verify the constructor takes expected and expected threads are passed.
            assertEquals(expected,handler.getMaxThreadAccessCount());
            
            // Ensure getMaxThreadAccessCount() returns correctly.
            assertEquals(expected,handler.getMaxThreadAccessCount());
        } catch (IOException ioe) {
            assertEquals(ioe.getMessage(), "Cannot check the constructor arguments: getMaxThreadAccessCount()=<INVALID>");
        }
        // This is to ensure that we get the right thread count
        return;
    }
}
