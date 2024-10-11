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
		
	private static final Logger logger = Logger.getLogger("test.java");

    /*
     * The following test case provides the necessary inputs.
     * The test will use one client to the server and a list of two ByteBuffers.
     * 
     * It will create two buffers (using the same buffer size) and then
     * read the two buffers. The test will verify that the buffer list is
     * correctly set as part of the read operation. The test will then read
     * the line of expected bytes and check if it is as expected. The buffer
     * list will contain the first buffer and the second buffer respectively
     * The test will then create another buffer and insert the two buffers in
     * the beginning of the buffer list. This will do two reads of one line
     * of the expected bytes and the test will then check against the end of
     * the ByteBuffer.
	 */

	private static final int SIZE = 100;

    private static final String SLEEP_TIME = "5";

    //The expected bytes to be received while the test is running.
    private static final List<Integer> BUFFER_LIST =
        Arrays.asList(
            100 * (1 << i) / SIZE,
            100 * (1 << i) / SIZE,
            100 * (1 << i) / SIZE,
            100 * (1 << i) / SIZE);

    private static final List<ByteBuffer> BUFFER_LIST_NEW =
        Collections.unmodifiableList(new ArrayList<ByteBuffer>());

   //Test case: readLine
    /**
     * The method given by the test can be used to test the readLine() method.
     * This should never have to be executed unless the readLine method will
     * not be ever executed before reaching this method.
     */

    @Test
    @SuppressWarnings("PMD.AvoidUsingHardCodedPort")
    public void readLine() throws Exception {
		
		ByteBufferInputStream bufferStream = new ByteBufferInputStream();

		synchronized (logger){
			logger.info("Start test readLine");
            
            List<InputStream> buffers = new ArrayList<InputStream>();
            buffers.add(bufferStream);
        
            returnBuffers(buffers);

            logger.debug("test readLine finished");

        }
    }

    // This method should be called only once when the test is stopped.
    // When the test finishes, the method should be called to notify all
    // observers.

	private void returnBuffers(List<InputStream> buffers) {
	   synchronized (buffers){
	      synchronized (BUFFER_LIST_NEW){
	         if (BUFFER_LIST_NEW.isEmpty()){
	            logger.info("List of ByteBuffers is empty, do not test");
	            return;
	         }
	         
	         Iterator<ByteBuffer> i = buffers.iterator();
	         /*
	         * Read the first buffer into the ByteBufferList.
	         */

         int firstBufferId = ( (Integer) i.next()).intValue();
         
         //Insert buffer into the ByteBufferList.
        bufferStream.setFirstBuffered(firstBufferId);
         
         /*
         * Receive the 2nd buffer from the list.
         */

         int secondBufferId = ( (Integer) i.next()).intValue();
         
         //Insert a new buffer in the list to be retrieved later.
        ByteBuffer returnBuffer = ByteBuffer.allocateDirect(SIZE);
        BUFFER_LIST.add(returnBuffer);
        
        /*
         * Set a line of ByteBuffer to be read.
         * This line can contain any amount of bytes in the expected range where
         * the buffer in this line have to be received.
         * The bytes will be ignored since the line is not yet available.
        */
        
        returnBuffer.put( (byte) 1, (byte) 0xFF);
        
        returnBuffer.position(0);
        
        byte[] buffer = returnBuffer.array();
        
        int bufferLength = returnBuffer.remaining();
        
        byte[] line = buildLine(buffer,bufferLength);
        
        
        i.remove();
	    
        return line;
      }
	}
	
}
}