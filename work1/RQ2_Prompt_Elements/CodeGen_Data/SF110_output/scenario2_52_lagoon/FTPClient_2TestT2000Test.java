// FTPClient_2Test.java
package nu.staldal.ftp;

import java.io.*;
import java.net.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FTPClient}.
* It contains one unit test case for the {@link FTPClient#append(String)} method.
*/
class FTPClient_2Test {
  	
    private String TEST_PATH= "test/ftp/dir";
    
    @Test
    void append() throws FTPException, IOException  {
        new FTPClient_1().append("//www.google.com");
        assertEquals("Wrong reply.", "235 2 \"http://www.google.com\" \"\"",
                new Message().getContentAsString());
    }

    private void new FTPClient_1() throws FTPException, IOException {        
        FTPClient _client = new FTPClient();      
        assertTrue("Wrong protocol version.", _client.isConnected());
        //assertTrue("Wrong protocol server.", _client.getServerProperties().getHost().equals("www.google.com"));
    }
}
/***********************************************************************
*
* Copyright (c) 1999 AT&T
* Copyright (c) 1996-2001, 2002 Sun Microsystems, Inc.
*
* All rights reserved.
*
* Redistribution and use in source and binary forms, with or without
* modification, are permitted provided that the following conditions
* are met:
*
* 1. Redistributions of source code must retain the above copyright
*    notice, this list of conditions and the following disclaimer.
*
* 2. Redistributions in binary form must reproduce the above copyright
*    notice, this list of conditions and the following disclaimer in
*    the documentation and/or other materials provided with the
*    distribution.
*
* 3. All advertising materials mentioning features or use of this
*    software must display the following acknowledgment:
*
*    "This product includes software developed by the Sun Microsystems, Inc."
*    "(http://www.sun.com/)."
*
* 4. Neither the name of Sun Microsystems, Inc. may be used to endorse
*    or promote products derived from this software without specific prior
*    written permission.
*
* THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
* "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
* LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
* A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
* OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
* SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
* LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
* DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
* THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
* (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
* OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*
***********************************************************************/

// This class will test RFC-959 using the new file mechanism.
//
// The main purpose of this test is to make sure that FTP does not
// automatically transfer UTF-8 characters. This tests include:
//   - unicode in the path name
//   - unicode in the username
//   - unicode in the password
// and that a password can be echoed.
public class FTPClient_2Test extends AbstractTest
{
    /**
     * @test     jdk.javadoc.doc.HTML-section.HTML-4
     * @fixme    Unfinished
     * @summary Set of Unicode characters. Also see: <a
     * @run  cmd/javac net.sf.javabk.ftp.Util.JavaFTPClient_2Test -version 1.0
     */

    private String TEST_NAME;

    private static int TEST_COUNT= 100;
    public static void main(String[] args) {
        junit.textui.TestRunner.run(FTPClient_2Test.class);
    }


    /**
     * Perform a simple test, i.e. send a newline at the end of a file.
     * Make sure it is correctly done.
     * Also make sure that non-ASCII characters in the password are still not
     * encoded.
     *
     * @param test
     * @throws Exception
     */
    @Test
    protected void doTest() throws Exception {
        FTPClient client = new FTPClient();
        String PASS = "\r";

        // Test Unicode characters in the path name. (ASCII chars are encoded)
        client.login();
        for (int i= 0; i < TEST_COUNT; i++) {
            String name = String.format ("%d", i);
            String content = PASS + name + PASS + PASS + content;
            assertEquals(content, client.sendFile(TEST_PATH + "/" + name, PASS));
        }
        // Test non-ASCII characters in the path name.
        // (ASCII chars are not encoded)
        assertTrue(client.hasErrorStatus());
        // FIXME: We could send more UTF-8 chars in the PASS field
//        String PASS_UTF = "\\u0000";
//        assertEquals("UTF-8 chars not correctly encoded", TEST_PATH + "/" + PASS,
//                          client.sendFile(TEST_PATH + "/" + PASS + PASS + PASS, PASS));
        // FIXME: We could send more unicode chars in the password
//       assertEquals("UTF-8 chars in password are not correctly encoded", 
//                   TEST_PATH + "/" + PASS + PASS,
//                   client.sendFile(TEST_PATH + "/" + PASS + PASS + PASS + PASS + PASS, PASS + PASS));
    }

    /**
     * Reset the test case.
     * @throws Exception
     */
    protected void setUp() throws Exception {
        super.setUp();

        // Reset the test case.
        TEST_NAME = "setUp";
    }
}
