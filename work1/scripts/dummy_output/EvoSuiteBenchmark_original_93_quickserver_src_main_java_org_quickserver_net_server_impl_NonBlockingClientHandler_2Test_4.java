// NonBlockingClientHandler_2Test.java
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
* It contains one unit test case for the {@link NonBlockingClientHandler#getMaxThreadAccessCount()} method.
*/
class NonBlockingClientHandler_2Test {
		
	private static String getHost() throws UnknownHostException { return null;  }

	public static void main (String aArgs[]) {
		(new NonBlockingClientHandler_2Test()).run();
	}
	
	class NonBlockingClientHandler_2TestThread extends Thread {
        int index = 0;

        NonBlockingClientHandler_2TestThread(int index) {
                this.index = index;
        }
				
        @Override public void run() {
                                doTasks();
                                super.run();
        }
				
		protected void doTasks() { //main class
                    try {
                        long currentTime = System.currentTimeMillis();
                        while(true) { //main thread loop
                            writeByteBuffer(index);
                            writeByteBuffer(index+1);
                            writeByteBuffer(index*2);
                            writeByteBuffer(index*2+1);
                            writeByteBuffer(index*3);
                            writeByteBuffer(index*3+1);
                            writeByteBuffer(index*3+2);
                            handleGotDataInBuffers();
                            handleGotDataInBuffers();
                            handleGotDataInBuffers();
                            handleGotDataInBuffers();
                        }
                        handleGotDataInBuffers();
                        handleGotDataInBuffers();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
		}
	}
}