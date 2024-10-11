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
/** This method checks the test count is returned by the
		{@link NonBlockingClientHandler#getMaxThreadAccessCount()} method.
		*/
		@Test
		public void testGetMaxThreadAccessCount() {
			assertEquals("The test is equal to the server's client connection.", getMaxThreadAccessCount(), client.getMaxThreadAccessCount(), 0.0);
		}
}

// NonBlockingHandler_2Test.java
class NonBlockingHandler_2Test extends HandlerFactory {
	static {
		SINGLE = true;
	}

	private Queue pendingRequests = null;	// Queue containing pending requests for reading and writing
	private Handler handler;					// Handler currently served
	private final Queue readQueue = new LinkedList(); // Current queue of read requests
	private int maxThreadAccessCount = maxThreadAccessCount;	// The count of current threads allowed to access read requests

	private NonBlockingClientHandler client = null;	// The client that will be used to read request
	private int index = 0;


	NonBlockingHandler_2Test(Handler handler) {
		this.handler = handler;
	}

	void setup() {
		readQueue = new LinkedList();
		client = new NonBlockingClientHandler();
		maxThreadAccessCount = maxThreadAccessCount;
	}

	void teardown() {
		client.stopReading();
		client.stopWriting();
	}

	long getMaxAllowedWrite(long amount) {
		long maxFileLength = client.getMaxFileLength();
		if (maxFileLength > 0)
			return maxFileLength;

		return maxThreadAccessCount;
	}

	long getPendingWrite(long amount) {
		long maxFileLength = client.getMaxFileLength();
		if (maxFileLength > 0)
			return maxFileLength;

		return (long) (pendingRequests.size() * 1.5);
	}

	long getReadQueueLength() {
		return readQueue.size();
	}

	long getMaxReadRequested() {
		return maxReadRequests;
	}

	long getMaxWriteRequested() {
		return maxWriteRequests;
	}

	long getMaxReadWrite(long amount) {
		try {
	       return getMaxWriteRequested();
	    }
		catch (InterruptedException e) {
	       return getMaxReadWrite();
	    }		
	}	

	long getMaxWriteWrite(long amount) {
		long maxFileLength = client.getMaxFileLength();
		if (maxFileLength > 0)
			return maxFileLength;

		return maxThreadAccessCount;
	}

	long getWriteQueueLength() {
		return writeQueue.size();
	}

	public Queue getReadQueue() {
		return readQueue;
	}

	public Handler getHandler() {
		return handler;
	}

	HandlerFactory init(String hostAddress, int port) {
		return new NonBlockingHandler_2Test(new MySocketHandler(hostAddress, port));
	}

	static protected Socket createSocket() throws Exception {
		return new java.net.Socket();
	}

	static public void usage() {
		System.out.println("Usage: ClientHandler #[maxThreadAccessCount] : #"+
			"ClientHandler #[maxThreadAccessCount] <port> <host address>");
	}

	protected void stopRead() throws InterruptedException {
	   new NonBlockingHandler_2Test(readHandler.getHandler()).stopReading();
	}

	protected void stopWrite() throws InterruptedException {
	   new NonBlockingHandler_2Test(writeHandler.getHandler()).stopWriting();
	}

	public Handler createHandler(Queue readQueue, int index, Queue writeQueue, int maxReadRequested, boolean blocking) throws InterruptedException {
		return new NonBlockingHandler_2Test(new MySocketHandler(
				readQueue.remove(), writeQueue.remove(), index, block(blocking)));
	}

	static private Thread newServer() {
		return Thread.currentThread();
	}

	abstract protected Handler writeHandler = new ServerHandler();

	abstract protected Socket createSocket( int port );

	abstract protected Handler readHandler = new ServerHandler();

	private static class MySocketHandler extends SocketHandler {
		private ServerConnection connection;

		public MySocketHandler(String hostAddress, int port) {
			super(hostAddress, port);
			connection = new ServerConnection(this);
			connection.connect();
		}

        public void handleEvent(SocketChannel socketChannel) throws IOException {
            // Note: the send() call here is blocking and will only
            // be done when the write is made in this method.

            // Note: this method is called directly by the write() callback,
            // so that the write is made synchronously
        	SocketChannel connection = SocketChannel.open();
            socketChannel.socket().connect(connection.address());

            // Set socket to a blocking-mode channel
            Socket socket = connection.socket();
            socket.setSoTimeout(10);

            // Prepare the channel's write
            OutputStream outputStream = connection.socket().getOutputStream();
            IOUtils.writeLine(outputStream, "Content-Length: " + outputStream.getChunkCount());
            outputStream.write(Util.array("POST / HTTP/1.1\r\n\r\n"));
            outputStream.flush();

            // Read the content of the request (from a blocking-mode
            // socket) and write it to the socket channel.
        	String requestLine = Util.readLine(socket.getInputStream(),
        		4096, true);
            int expectedLineLength = requestLine.length();

            int readSize = connection.socket().getReceiveBufferSize();
            byte[] readBuffer = new byte[readSize];

            if (readSize <= expectedLineLength) {
                // Read only the requested amount
                int bytesToRead = readSize;
                while (bytesToRead > 0) {
                    int bytesRead = connection.socket().getReceive(readBuffer);
                    if (bytesRead > 0)
                         client.getWriteQueue().addLast(
                             new ByteArrayPartial(readBuffer, 0, bytesRead));

                    bytesToRead -= bytesRead;
                }
            }
            else {
                client.getWriteQueue().addLast(new ByteArrayPartial(requestLine.getBytes(), 0, expectedLineLength));
            }

            // Make sure this writes are finished with the read buffer.
            // If the next write is not the last call of this method,
            // they should not use bytes read already.
        	byte buffer[] = readBuffer;
            for(int i = 0; i < readSize; i ++) {
                client.getReadQueue().addFirst(new ByteArrayPartial(buffer, 0