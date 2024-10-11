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
		
    /** Test reader stream. */
    private Reader stream;
    
    /**
     * Test reader stream.
     */
    public static class ReaderTest {
        
    /**
     * This test creates a new stream reader.
     *
     * @param name name of the file for which to load the stream
     */
        protected ReaderTest(String name) {}
        
    /**
     * Creates a new stream reader with given file name.
     *
     * @param name name of the file for which to load the stream
     */
        protected ReaderTest(String name, File f) {
            FileInputStream is;
            try {
                is = new FileInputStream(f);
            } catch (FileNotFoundException ex) {
                throw new RuntimeException("File does not exist!", ex);
            }
            try {
                is.close();
            } catch (IOException ex) {
                throw new RuntimeException("Cannot close file!", ex);
            }
            this.stream = new InputStreamReader(
                          new BufferedInputStream(is),
                          Locale.ENGLISH);
        }

        /**
         * Read the next line of char sequence and store
         * its bytes in a byte array.
         */
        public synchronized String readLine() throws IOException 
        {
            String line;
            try {
                line = (stream.readLine() == -1)? null :"";
            } catch (IOException ex) {
                throw new RuntimeException("Stream closed!", ex);
            }

            return line;
        }
    }
    
    /** A class of unit test cases for {@link ByteBufferInputStream}. */
    public class FileInputStreamTest extends ReaderTest {
        
    /** Test reader stream. */
        class FileReaderTest extends ReaderTest {
            
            /**
             * Constructor.
             * @param fileName name of the specified file
             */
            public FileInputStreamTest(String fileName) {}
            
        /**
         * The constructor.
         */
        public FileInputStreamTest(final File f) {
            super(f);
        }
        
        /**
         * Gets the file's size.
         *
         * @return the file's size in bytes
         */
        public long getSize() {
            if (stream==null) {
               System.out.println("File is closed");
               return 0;
            }
            long fsize = 0;
            try {
                fsize = (long) stream.available();
            } catch (IOException ex) {
                ex.printStackTrace(System.err);
            }
            return fsize;
        }
    }
    
    /**
     * Creates a new stream reader with bytes of a file.
     *
     * @param fileName the name of the file
     */
        protected ByteBufferInputStreamTest(final File f, String charsetName) {
            super(new ReaderTest(f, charsetName));
        }
    
    /**
     * Reads a line of char sequence, with given charsetName specified when
     * the stream is opened with appropriate charsetName.
     */
        public synchronized String readLine() throws IOException {
            if (stream == null) {
               System.out.println("File is closed");
               return null;
            }
            return super.readLine();
        }
    }
    
    @Test
    public void testOpen() throws IOException {
        
        final File f = new File("/tmp");
        final OutputStream os = new ByteArrayOutputStream();
        final ByteBufferInputStream buff = 
                new ByteBufferInputStream(os, f, ByteOrder.BIG_ENDIAN);

        // create a client handler with the InputStream
        final ClientHandler ch = new ClientHandler(buff.getClient(),
                buff.getServer(), 0);
        
        // create new client handler with this InputStream
        final ClientHandler ch2 = new ClientHandler(ch,
                ch.getServerName(), buff.getLineBeginIndex(), false);

        // send file over the ch2 client
        ch2.sendFile(f, new byte[0]);
        
        ch2.loop();
        
        // test the response
        assertNotNull(ch2.getData());
        assertTrue(ch2.getData().length > 0);
        assertEquals(ch2.getStatus(), ClientHandler.SEND_READY);
        ch2.checkReceiveStatus();
        
        assertEquals(ch.getData().length, ch2.getData().length);
        for (int i=0; i< ch.getData().length; i++) {
            assertEquals(ch2.getData()[i].length, ch.getData()[i].length);
            for (int j=0; j< ch2.getData().length; j++) {
                assertEquals(ch2.getData()[i][j].compareTo(ch.getData()[i][j]), 0);
            }
        }
        
        os.close();
        
        // test the receive error code
        assertEquals(ch2.getStatus(), ClientHandler.RECEIVE_READY);
        
        assertEquals(ch.getStatus(), ClientHandler.RECEIVE_READY);
       
    }

    @Test
    public void testReadBufChar() throws IOException {
        
        final File f = new File("/tmp");
        final OutputStream os = new ByteArrayOutputStream();
        final ByteBufferInputStream buff = 
                new ByteBufferInputStream(os, f, ByteOrder.BIG_ENDIAN);

        // create a client handler with the InputStream
        final ClientHandler ch = new ClientHandler(buff.getClient(),
                buff.getServer(), 0);
        
        // create new client handler with this InputStream
        final ClientHandler ch2 = new ClientHandler(ch,
                ch.getServerName(), buff.getLineBeginIndex(), false);

        // send file over the ch2 client
        ch2.sendFile(f, new byte[0]);
        
        ch2.loop();
        
        // test the response
        assertNotNull(ch2.getData());
        assertTrue(ch2.getData().length > 0);
        assertEquals(ch2.getStatus(), ClientHandler.SEND_READY);
        ch2.checkReceiveStatus();
        
        assertEquals(ch.getData().length, ch2.getData().length);
        for (int i=0; i< ch.getData().length; i++) {
            assertEquals(ch2.getData()[i].length, ch.getData()[i].length);
            for (int j=0; j< ch2.getData().length; j++) {
                assertEquals(ch2.getData()[i][j].compareTo(ch.getData()[i][j]), 0);
            }
        }
}
}