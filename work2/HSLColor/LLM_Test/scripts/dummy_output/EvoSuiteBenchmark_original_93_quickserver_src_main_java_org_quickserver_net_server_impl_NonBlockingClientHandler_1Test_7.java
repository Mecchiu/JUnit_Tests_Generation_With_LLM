// NonBlockingClientHandler_1Test.java
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
* It contains one unit test case for the {@link NonBlockingClientHandler#getWakeupSelectorAfterRegisterRead()} method.
*/
class NonBlockingClientHandler_1Test {
		
    @Test
    public void testGetWakeupSelectorAfterRegisterRead() throws Exception {
        new NonBlockingClientHandler().getWakeupSelectorAfterRegisterRead();
    }


    @Test
    public void testGetWakeupSelectorAfterRegisterForRead() throws Exception {
        new NonBlockingClientHandler().getWakeupSelectorAfterRegisterForRead();
    }

    /**
     * Test constructor.
     * @exception Exception in case of error
     */
    @Test
    public void testConstructor() throws Exception {
        new NonBlockingClientHandler();
        byte[] data = new byte[100];
        ClientWriteHandler handler = new ClientWriteHandler(0, data);
        ClientChannel channel = new ClientChannel(0, handler, 0);

		NonBlockingClientHandler.NonBlockingStreamingClientHandler_1Test.processGotDataInBuffers(channel);
		NonBlockingClientHandler.NonBlockingStreamingClientHandler_1Test.doHandshake();
        NonBlockingClientHandler.NonBlockingStreamingClientHandler_1Test.processGotDataInBuffers(channel);
    }


    /**
     * Test method for {@link NonBlockingClientHandler#getReadQueueSizes()}
     * @throws IOException
     */
    @Test
    public void testGetReadQueueSizes() throws IOException {
        assertQueueSize(NonBlockingClientHandler.NonBlockingStreamingClientHandler_1Test.getReadQueueSize(), 100);
    }


    /**
     * Test method for {@link NonBlockingClientHandler#getWriteQueueSizes()}
     * @throws IOException
     */
    @Test
    public void testGetWriteQueueSizes() throws IOException {
        assertQueueSize(NonBlockingClientHandler.NonBlockingStreamingClientHandler_1Test.getWriteQueueSize(), 100);
    }


}