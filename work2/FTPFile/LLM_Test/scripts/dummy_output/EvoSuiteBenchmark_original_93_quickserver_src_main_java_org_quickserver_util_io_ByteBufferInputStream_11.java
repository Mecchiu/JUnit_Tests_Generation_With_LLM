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
   * The logger to log operations.
   */
  private static final Logger LOGGER = Logger.getLogger(ByteBufferInputStreamTest.class.getName());
  /**
   * The buffer to be read.
   */
  private ByteBuffer buffer;
  /**
   * The name of the client.
   */
  private byte[] client;
  /**
   * The name of the server.
   */
  private byte[] server;
  /**
   * The thread that will process the data read from the socket.
   */
  private InputStream currentIn;
  /**
   * The name used to track read of current read
   */
  private byte[] currentName;
}