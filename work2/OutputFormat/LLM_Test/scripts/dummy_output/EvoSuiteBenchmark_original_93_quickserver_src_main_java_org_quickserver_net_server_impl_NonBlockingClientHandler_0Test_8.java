// NonBlockingClientHandler_0Test.java
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
* It contains one unit test case for the {@link NonBlockingClientHandler#getWakeupSelectorAfterRegisterWrite()} method.
*/
class NonBlockingClientHandler_0Test {
		
    public NonBlockingClientHandler_0Test() {
	}

    public void setup() {
	}

// Test 1 (write)

    public void test1_1_write() throws IOException, InterruptedException {
	// create data buffers
	final ByteBuffer buffer1 = new FastBuffer();
	final ByteBuffer dataBuffer = new NativeByteBuffer(10*1024*1024);
	final ByteBuffer sendBuffer = new FastBuffer();

	// do byteBuffer input and send data 1
	writeInputStreamData(sendBuffer, dataBuffer);

	// test 2.1, when buffer has enough available space left, the event should be read in buffer1
	final BufferedReader reader = readInputStreamNoBlocking();
	waitTillFullyHasData(dataBuffer, dataBuffer.limit());
	assertEquals("write2: read", dataBuffer, reader.read());

	// test 2, use the write method to write with buffer in writeInputStreamNoBlocking.
	final BufferedOutputStream outputStream2 = new BufferedOutputStream(sendBuffer);
	writeInputStreamData(sendBuffer, dataBuffer);
	// test 2, read data using no blocking
	reader.read();
	assertFalse("write2: read", (dataBuffer == null) || (dataBuffer == sendBuffer));
	assertEquals("write2: read", dataBuffer, reader.read());
	assertFalse("write2: read", (dataBuffer == null) || (dataBuffer == sendBuffer));
	// test 2, reenable event
	reader.read();
	assertTrue("write2: reenable event", reader.canRead());
	reader.read();
	assertTrue("write2: reenable event", reader.canRead());
	reader.read();
	assertTrue("write2: reenable event", reader.canRead());
	reader.read();
	reader.read();
	reader.close();
	// test 2, send data to read using the write method
	writeInputStreamData(sendBuffer, dataBuffer);

	//
}
}