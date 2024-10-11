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
		
	@Test
	void testReadLine() throws IOException {
		ByteBufferInputStream byteBufferInputStream = ByteBufferInputStream.newInstance();
		// Create a client
		ClientHandler client = ClientHandler.newInstance();
		InputStream clientInputStream = new ByteBufferedInputStream(byteBufferInputStream.getBufs());
		String line = clientInputStream.readLine();
		byte[] encodedLine = line.getBytes(StandardCharsets.UTF_8);
	
		// Write the line
		outputLine(encodedLine, client);
		
		// Read to end
		clientInputStream.reset();
		assertNull(clientInputStream.readLine());
	}
	
	
	
	/** Output the line */
	private void outputLine(byte[] encodedLine, ClientHandler client) {
		// Write the line
		client.sendLine(encodedLine);
	}

}

// End ByteBufferInputStreamTest.java