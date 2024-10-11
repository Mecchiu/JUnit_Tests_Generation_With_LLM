// FTPClient_2Test.java
package nu.staldal.ftp;

import java.io.*;
import java.net.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FTPClient}.
* It contains ten unit test cases for the {@link FTPClient#append(String)} method.
*/
class FTPClient_2Test {
    
    /**
     * Test appending to an existing file.
     */
    @Test
    void testAppendExistingFile() throws Exception {
        FTPClient ftp = new FTPClient("localhost", 21, "user", "pass", "/");
        OutputStream out = ftp.append("existing.txt");
        out.write("appended text".getBytes());
        out.close();
        ftp.close();
        
        // Verify that the file was appended to
        URL url = new URL("ftp://user:pass@localhost/existing.txt");
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
        String line;
        StringBuilder sb = new StringBuilder();
        while ((line = in.readLine()) != null) {
            sb.append(line);
        }
        in.close();
        assertEquals("existing textappended text", sb.toString());
    }
    
    /**
     * Test appending to a non-existing file.
     */
    @Test
    void testAppendNonExistingFile() throws Exception {
        FTPClient ftp = new FTPClient("localhost", 21, "user", "pass", "/");
        OutputStream out = ftp.append("nonexisting.txt");
        out.write("appended text".getBytes());
        out.close();
        ftp.close();
        
        // Verify that the file was created and contains the appended text
        URL url = new URL("ftp://user:pass@localhost/nonexisting.txt");
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
        String line;
        StringBuilder sb = new StringBuilder();
        while ((line = in.readLine()) != null) {
            sb.append(line);
        }
        in.close();
        assertEquals("appended text", sb.toString());
    }
    
    /**
     * Test appending to a file in a non-existing directory.
     */
    @Test
    void testAppendNonExistingDirectory() throws Exception {
        FTPClient ftp = new FTPClient("localhost", 21, "user", "pass", "/");
        OutputStream out = ftp.append("nonexistingdir/nonexistingfile.txt");
        out.write("appended text".getBytes());
        out.close();
        ftp.close();
        
        // Verify that the directory and file were created and contains the appended text
        URL url = new URL("ftp://user:pass@localhost/nonexistingdir/nonexistingfile.txt");
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
        String line;
        StringBuilder sb = new StringBuilder();
        while ((line = in.readLine()) != null) {
            sb.append(line);
        }
        in.close();
        assertEquals("appended text", sb.toString());
    }
    
    /**
     * Test appending to a file in a directory with a trailing slash.
     */
    @Test
    void testAppendDirectoryWithTrailingSlash() throws Exception {
        FTPClient ftp = new FTPClient("localhost", 21, "user", "pass", "/");
        OutputStream out = ftp.append("existingdir/existingfile.txt");
        out.write("appended text".getBytes());
        out.close();
        ftp.close();
        
        // Verify that the file was appended to
        URL url = new URL("ftp://user:pass@localhost/existingdir/existingfile.txt");
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
        String line;
        StringBuilder sb = new StringBuilder();
        while ((line = in.readLine()) != null) {
            sb.append(line);
        }
        in.close();
        assertEquals("existing textappended text", sb.toString());
    }
    
    /**
     * Test appending to a file in a directory without a trailing slash.
     */
    @Test
    void testAppendDirectoryWithoutTrailingSlash() throws Exception {
        FTPClient ftp = new FTPClient("localhost", 21, "user", "pass", "/");
        OutputStream out = ftp.append("existingdir2/existingfile.txt");
        out.write("appended text".getBytes());
        out.close();
        ftp.close();
        
        // Verify that the file was appended to
        URL url = new URL("ftp://user:pass@localhost/existingdir2/existingfile.txt");
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
        String line;
        StringBuilder sb = new StringBuilder();
        while ((line = in.readLine()) != null) {
            sb.append(line);
        }
        in.close();
        assertEquals("existing textappended text", sb.toString());
    }
    
    /**
     * Test appending to a file with a space in the name.
     */
    @Test
    void testAppendFileWithSpace() throws Exception {
        FTPClient ftp = new FTPClient("localhost", 21, "user", "pass", "/");
        OutputStream out = ftp.append("file with space.txt");
        out.write("appended text".getBytes());
        out.close();
        ftp.close();
        
        // Verify that the file was appended to
        URL url = new URL("ftp://user:pass@localhost/file%20with%20space.txt");
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
        String line;
        StringBuilder sb = new StringBuilder();
        while ((line = in.readLine()) != null) {
            sb.append(line);
        }
        in.close();
        assertEquals("existing textappended text", sb.toString());
    }
    
    /**
     * Test appending to a file with a non-ASCII character in the name.
     */
    @Test
    void testAppendFileWithNonAscii() throws Exception {
        FTPClient ftp = new FTPClient("localhost", 21, "user", "pass", "/");
        OutputStream out = ftp.append("fíle.txt");
        out.write("appended text".getBytes());
        out.close();
        ftp.close();
        
        // Verify that the file was appended to
        URL url = new URL("ftp://user:pass@localhost/f%C3%ADle.txt");
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
        String line;
        StringBuilder sb = new StringBuilder();
        while ((line = in.readLine()) != null) {
            sb.append(line);
        }
        in.close();
        assertEquals("existing textappended text", sb.toString());
    }
    
    /**
     * Test appending to a file with a non-ASCII character in the path.
     */
    @Test
    void testAppendPathWithNonAscii() throws Exception {
        FTPClient ftp = new FTPClient("localhost", 21, "user", "pass", "/");
        OutputStream out = ftp.append("dír/fíle.txt");
        out.write("appended text".getBytes());
        out.close();
        ftp.close();
        
        // Verify that the file was appended to
        URL url = new URL("ftp://user:pass@localhost/d%C3%ADr/f%C3%ADle.txt");
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
        String line;
        StringBuilder sb = new StringBuilder();
        while ((line = in.readLine()) != null) {
            sb.append(line);
        }
        in.close();
        assertEquals("existing textappended text", sb.toString());
    }
    
    /**
     * Test appending to a file with a newline character in the name.
     */
    @Test
    void testAppendFileWithNewline() throws Exception {
        FTPClient ftp = new FTPClient("localhost", 21, "user", "pass", "/");
        OutputStream out = ftp.append("file\nwith\nnewline.txt");
        out.write("appended text".getBytes());
        out.close();
        ftp.close();
        
        // Verify that the file was appended to
        URL url = new URL("ftp://user:pass@localhost/file%0Awith%0Anewline.txt");
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
        String line;
        StringBuilder sb = new StringBuilder();
        while ((line = in.readLine()) != null) {
            sb.append(line);
        }
        in.close();
        assertEquals("existing textappended text", sb.toString());
    }
    
    /**
     * Test appending to a file with a null character in the name.
     */
    @Test
    void testAppendFileWithNull() throws Exception {
        FTPClient ftp = new FTPClient("localhost", 21, "user", "pass", "/");
        OutputStream out = ftp.append("file\0with\0null.txt");
        out.write("appended text".getBytes());
        out.close();
        ftp.close();
        
        // Verify that the file was appended to
        URL url = new URL("ftp://user:pass@localhost/file%00with%00null.txt");
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
        String line;
        StringBuilder sb = new StringBuilder();
        while ((line = in.readLine()) != null) {
            sb.append(line);
        }
        in.close();
        assertEquals("existing textappended text", sb.toString());
    }
}