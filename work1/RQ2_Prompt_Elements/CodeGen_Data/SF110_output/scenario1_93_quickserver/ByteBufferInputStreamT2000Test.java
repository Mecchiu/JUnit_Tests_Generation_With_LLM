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
private final static int BOM = 0xFEFF;
/**
 * This test case reads a buffer with an offset set to the first line of 
 * a server-server conversation.
 *
 * @since 1.4.5
 *
* @throws IOException
*/
@Test
public void testReadLine() throws IOException {

    ClientHandler clientHandler = new ClientHandler(
            new ByteArrayOutputStream(4096), new ClientHandler("test:0"));
    
    Thread thread = new Thread(clientHandler, "");
    clientHandler.setConversation(new Conversation());
    
    String sHeader = clientHandler.readLine();
    ClientHandler.assertNull(sHeader);
    
    byte[] b = new byte[4096];
    ByteBuffer buf = ByteBuffer.wrap(b);
    while (true) {
    try {
        Thread.sleep(1);
      } catch (Exception e) {
        e.printStackTrace();
        throw new Error(e);
      }
      String s = clientHandler.readLine();
      sHeader = s;
      assertEquals(buf.get(), s);
      buf.clear();
    }
}
}
			
	
	
		
