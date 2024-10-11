// NonBlockingClientHandler_1Test.java
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
* It contains one unit test case for the {@link NonBlockingClientHandler#getWakeupSelectorAfterRegisterRead()} method.
*/
class NonBlockingClientHandler_1Test {
		public static void main(String[] args) throws Exception
    {
        System.setProperty("java.net.preferIPv4Association", "true");

//            byte[] buffer = new byte[2048];

//	    int nBytes;
//
//	    for (int i=0; i < buffer.length; i++)
//	    {
//	        buffer[i] = (byte)127;
//	    }

//	    FileInputStream fis = new FileInputStream(new File("src/test/resources/byte.bin"));
//	    FileInputStream fis = new FileInputStream(new File("src/test/resources/byte_0F.bin"));
//	    fis.read(buffer, 0, buffer.length);
//	    fis.close();
//
//	    int nBytes = buffer[0] & 0xff;
//	    assertTrue("invalid data in byte", nBytes > 0);
//	    byte[] buffer_0F = new byte[nBytes -4];
//	    fis = new FileInputStream(new File("src/test/resources/byte_0F.bin"));
//	    fis.read(buffer_0F, 0, buffer_0F.length);
//	    fis.close();

    }
}