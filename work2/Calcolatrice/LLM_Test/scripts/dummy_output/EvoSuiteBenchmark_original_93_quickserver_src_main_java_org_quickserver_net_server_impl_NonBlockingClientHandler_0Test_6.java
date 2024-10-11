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
		
    @Test
    public void testWakeupSelectorAfterRegisterWrite() throws Exception {
        NonBlockingClientHandler.setWakeupSelectorAfterRegisterWrite(true);
        Thread thread = new Thread(new NonBlockingClientHandler(1));
        thread.start();
        Thread.sleep(10000);
        threads.add(thread);                        
        doAfterRegisterForWrite();
        Thread.sleep(10000);
        assertFalse(thread.isAlive());
        assertTrue(thread.isAlive());
        doTasks();
        assertTrue(!thread.isAlive());
        //
        NonBlockingClientHandler.setWakeupSelectorAfterRegisterWrite(false);
    }
    
    public static void doAfterRegisterForWrite() throws Exception {
        final Thread[] threads = Thread.getAllStackTraces().keySet().toArray(new Thread[0]);
        int writeCounter = 0;
        for (Thread thread : threads) {
            if (!thread.isInterrupted() && (thread.getName()).equals("write_thread") && (!Thread.currentThread().isDaemon()) && (!thread.isDaemon())) {
                writeCounter++;
                doOnRegisterForWrite(writer);
            }
        }
        for (Thread thread : threads) {
            thread.interrupt();
            synchronized (writes) {
                if ((writeCounter > 1) && (!writes.isEmpty())) {
     				
                    throw new ConnectionLostException("write_thread: After writing, this thread is already taken as a writer");
                }
                writes.add(thread.getName());
            }
        }
    }

    private void doOnRegisterForWrite(Writer writer) throws Exception {
        
}
}