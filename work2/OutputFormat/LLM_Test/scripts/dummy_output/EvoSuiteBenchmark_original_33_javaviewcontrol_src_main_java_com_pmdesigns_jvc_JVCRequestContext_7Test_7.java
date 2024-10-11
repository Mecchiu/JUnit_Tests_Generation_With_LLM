// JVCRequestContext_7Test.java
package com.pmdesigns.jvc;

import java.io.*;
import java.util.*;
import java.net.HttpURLConnection;
import javax.servlet.*;
import javax.servlet.http.*;
import org.apache.commons.fileupload.*;
import org.apache.commons.fileupload.util.Streams;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JVCRequestContext}.
* It contains one unit test case for the {@link JVCRequestContext#makeLink(String, String)} method.
*/
class JVCRequestContext_7Test {
		
    /**
     * Makes an image link to a file in a directory.
    * The following is used to test the link target:
    * <pre>
    *        GET /jvc-test-images/file/
        URL     = file:///jvc-test-images/file
    * </pre>
    * @throws IOException if some IO operations fail.
     */
    static void doFileInDirectory() throws IOException {
        InputStream dataInputStream =
            new JVCRequestContext_7Test().makeLink("examplefile.txt", "file:///jvc-test-images/file/examples/jvc-test/another-example-file.txt");
        DataInputStream in = new DataInputStream(dataInputStream);
        BufferedInputStream fInput = new BufferedInputStream(in);

        BufferedInputStream out = new BufferedInputStream( new FileInputStream ("java.res"));
        out = ServletFileUpload.read(ServletFileUpload.openStream(out));
        StringBuilder fileSb = new StringBuilder();
        while( out.available() > 0 ) {
                fileSb.append((char)out.read());
        }
        out.close();

        assertEquals( "Example file\n\n\n", fileSb.toString() );
    }
    
    /**
     * Make sure the link target is a relative URL.
    * @throws IOException if some IO operations fail.
     */
    static void checkResolvedLinkToRelativePath() throws IOException {
        InputStream dataInputStream =
            new JVCRequestContext_7Test().makeLink("examplenavigation.bin", "/jvc-test-images/file/examplenavigation.bin");
        DataInputStream in = new DataInputStream(dataInputStream);
        byte[] bArr = new byte[2048];
        while(in.available() > 0) {
            in.read(bArr);
         }
        
        // assertEquals("The base path for links should be an absolute path.",
        // "/jvc-test-images/file/examplenavigation.bin",
        // new String(bArr).substring(0, 7));
        assertTrue( "link target must be an absolute path.",
                dataInputStream.toString().contains( "/jvc-test-images/file/examplenavigation.bin" ) );
        
    }
    
    @Test
    public void test1() throws IOException {
        doFileInDirectory();
        checkResolvedLinkToRelativePath();
    }
    
}