// FTPClient_0Test.java
package nu.staldal.ftp;

import java.io.*;
import java.net.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FTPClient}.
* It contains one unit test case for the {@link FTPClient#store(String)} method.
*/
class FTPClient_0Test {
		
    /**
     * Test method for {@link nu.staldal.ftp.FTPClient#store(java.lang.String)}.
     */
    @Test
    void store() throws IOException, FTPException {
        //create a buffer
        byte[] b = new byte[1024];

        //create an OutputStream
        OutputStream o = new FTPSEchoOut(new PrintStream(b));
        //store two buffers
        FTPClient.store(b);
        FTPClient.store(b);
        assertEquals(o.getBuffer().length, b.length);
        assertEquals(b.length, o.getBuffer().length);
        
        //write everything into the same stream
        o.write(b);
        o.close();

        //test reading the buffer
        byte[] b2 = new byte[b.length];
        InputStream i = new InputStream() {
            public int read() throws IOException {
                return 1;
            }
        };
        //test reading the buffer
        FTPClient.store(b2);
        assertEquals(b2.length, i.read(b2, 0, b.length));
        assertEquals(b.length, i.read(b, 0, b.length));
        assertTrue(Arrays.equals(b, b2));
        i.close();
    }
}