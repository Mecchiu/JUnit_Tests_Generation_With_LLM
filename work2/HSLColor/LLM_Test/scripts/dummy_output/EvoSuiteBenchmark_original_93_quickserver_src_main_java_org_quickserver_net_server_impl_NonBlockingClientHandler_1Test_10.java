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
		
    private final int instanceCount = 100;
    
    public int getThreadAccessCount() {
		return threadAccessCount;
    }

    //public static void main(
    //		String[] args)
    //		throws IOException, InterruptedException, ClassNotFoundException, ChannelInUseException, IOException {
    //		// TODO Auto-generated method stub
    //		System.out.println(Thread.currentThread().getName()+":");
    //
    //		NonBlockingClientHandler instance = new NonBlockingClientHandler_1Test();
    //		instance.init();
    //		instance.start();
    //
    //	}
}