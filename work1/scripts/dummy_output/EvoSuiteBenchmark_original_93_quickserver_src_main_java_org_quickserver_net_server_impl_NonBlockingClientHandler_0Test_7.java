// NonBlockingClientHandler_0Test.java
package org.quickserver.net.server.impl;

import org.quickserver.net.server.*;
import org.quickserver.net.*;
import org.quickserver.util.*;
import org.quickserver.util.io.*;
import java.io.*;
import java.net.*;
import java.util.*;
import java.util.logging.*;
import java.nio.*;
import java.nio.channels.*;
import javax.net.ssl.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link NonBlockingClientHandler}.
* It contains one unit test case for the {@link NonBlockingClientHandler#getWakeupSelectorAfterRegisterWrite()} method.
*/
class NonBlockingClientHandler_0Test {
		
private static void testNonBlockingClientHandler_0() throws Exception {
		int i = 0;
		int j = 0;           

        // v1.4.1
        Connection conn = connect0();
        conn.pump("GET / HTTP/1.1\rVersion: \r\n\r\n", i, false);
        Thread.sleep(100);

        InputStream input = conn.getInputStream();

        Object o = conn.getContent();

        assertNotNull(o);
        conn.close();

        Thread.sleep(100);

        assertNull(conn.getContent());
        Thread.sleep(100);
        assertNotNull(conn.getContent());

        if (conn.getInputStream().read()<0) conn.close();

        Thread.sleep(100);

        o = conn.getContent();

        assertNull(o);
        conn.close();

        Thread.sleep(100);

        conn = null;

        i = 0;
        j = 0;
        testNonBlockingClientHandler_0();
}

public static void main(String args[]) throws Exception {
    NonBlockingClientHandler_0Test test = new NonBlockingClientHandler_0Test();
    test.testNonBlockingClientHandler();
}
}