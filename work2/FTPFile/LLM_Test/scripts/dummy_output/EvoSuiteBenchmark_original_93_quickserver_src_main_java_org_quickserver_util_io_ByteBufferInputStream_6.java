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
		
private static final Logger LOGGER = Logger.getLogger(ByteBufferInputStreamTest.class.getName());

    public static void main(String[] args) throws IOException {
        LOGGER.setLevel(Level.FINE);

        File f = new File("testfile");
        f.getParentFile().mkdir();
        f.createNewFile();
        FileOutputStream fos = new FileOutputStream(new File("testfile"));
        fos.getChannel().close();
        fos.close();
    }

    static final TestProperties  properties = TestProperties.createTest("FileChannel Test");
    
    static final TestCase.Case  case1 = new TestCase.Case() {
        public void execute(final ClientHandler chr) throws Exception {
            assertTrue(case1.isTriggered());
            
            if (!case1.isDone()) {
                LOGGER.severe("Test 1 failed!");
                throw new Exception();
            }
        }
    };
    
    protected static void testInputStream(String filename) throws Exception {
        LOGGER.log(Level.INFO, "File [{0}] was read... ", filename);

        String content = readFile(filename);

        // TODO: Verify that readLine and isLineReady can read the input stream:

        assertTrue(case1.isTriggered());

        // The line is ready at this point:

        assertEquals(content, case1.getContent());

        if (!case1.isDone()) {
            assertTrue(case1.isTriggered());
            throw new Exception();
        }
    }
    
        /** Returns a string representation of the file with the given name. */ 
    public static String readFile(String name) throws Exception {
        InputStream file = getFileInputStream(name);
        
        // Read in the entire file

        InputStreamReader reader = new InputStreamReader((InputStream)file);

        byte[] buff = new byte[4 * 1024];
        int maxCharsRead = 0;
        while ((maxCharsRead = reader.read(buff)) > 0) {
            System.out.println(Arrays.toString(buff));
            if (maxCharsRead < buff.length) {
                String nl = System.lineSeparator();
                for (int i = 0; nl!= null && i < maxCharsRead; i++) {
                    System.out.print(nl);
                }
            }
        }
        
        reader.close();
        file.close();

        return null;
    } 

    final private InputStream getFileInputStream(String name) throws Exception {
        InputStream is =  getClass().getResourceAsStream(name);

        if (is == null) {
            throw new RuntimeException("could not find "+name);
        }

        if (is instanceof FileInputStream) {
            return ((FileInputStream) is);
        } 
        if (is instanceof SocketInputStream) {
            SocketInputStream sockis = (SocketInputStream) is;
            readLine(); // readLine should have been called for the first line
            return sockis;
        }

        Class<?> readClass = null;
        try {
            readClass = Class.forName("java.io.BufferedDataInputStream$1");
        } catch (ClassNotFoundException e) {
            LOGGER.severe("java.io.BufferedDataInputStream not found. Could not continue.");
            throw new RuntimeException(e);
        }
        return ((InputStream)readClass.newInstance());
    }
}