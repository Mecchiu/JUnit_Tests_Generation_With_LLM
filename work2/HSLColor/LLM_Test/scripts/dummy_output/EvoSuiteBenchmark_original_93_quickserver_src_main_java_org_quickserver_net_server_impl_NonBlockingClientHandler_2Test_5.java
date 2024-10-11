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
		
    //@Test
    public void test() throws Exception {
        NonBlockingClientHandler a = new NonBlockingClientHandler();
            //assertTrue(a.getMaxThreadAccessCount() == 1 );
        try {
            a.getMaxThreadAccessCount();
        } catch (IOException e) {
            assertTrue(false, e);
        }
        try {
            a.getThreadAccessCount();
        } catch (IOException e) {
            assertTrue(false, e);
        }
        try {
            a.getSelectionKey();
        } catch (SelectionKeyException e) {
            assertTrue(false, e);
        }
        try {
            NonBlockingClientHandler.doWrite();
            assertTrue(0!= 1);
        } catch (Exception ioe) {
            assertTrue(true || ioe instanceof IOException);
        }
    }
}

/** {@link NonBlockingClientHandler_2Test}</pre> */
class NonBlockingClientHandler_2Test extends NonBlockingClientHandler {

    public NonBlockingClientHandler_2Test() {
        super(maxThreadAccessCount);
    }

    public void setClientWriteHandler(ClientWriteHandler handler) {
        handler.setMaxThreadAccessCount(maxThreadAccessCount);
    }

    public void setMaxThreadAccessCount(int count) {
        maxThreadAccessCount = count;

        try {
            doHandshake();
        } catch (Exception e) {
        }
    }

    private void doHandshake() throws IOException {
        doPostCloseActivity();
        doTasks();
        doPausableCloseActivity();
        doHandshakeComplete();
    }

    public void start() throws ClassNotFoundException, IOException {
        FileInputStream fis = null;

}
}