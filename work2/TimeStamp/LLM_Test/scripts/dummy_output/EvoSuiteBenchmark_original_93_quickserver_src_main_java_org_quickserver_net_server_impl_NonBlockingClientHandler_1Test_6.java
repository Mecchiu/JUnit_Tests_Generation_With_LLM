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
		//
    
    //v1.4.3
    //v1.4.4
    //NOTE the 2.2+ versions don't include registerForRead
    //v1.4.5
    //NOTE we only need one instance of the class and one set
    //of selectors for a single thread
    //NOTE at the very least there need to be a blocking socket.
    //NOTE we only need one class as well as the method.
    //NOTE one thread per class
    //NOTE one threads per each class
    //NOTE one thread in the same class
    //NOTE one write thread.
    //NOTE one read thread.
     
    
    
    //protected void doBeforeProcessRead() throws Exception;
    protected void run() throws Exception;
     //NOTE this class and its selector is only run once
  
    
    //private class A
    private class A
    {
		//NOTE that readBuffer does not work for this purpose
	    private ClientWriteHandler clientWriteHandler = ClientWriteHandler.get();
		
		@SuppressWarnings("unused")
	    private ClientReadHandler clientReadHandler = ClientReadHandler.get();
		
		public void doAfterWrite() throws Exception {
			clientWriteHandler.wakeup();
		}
	}
    //END
    //
    
    @Test
    public void test() throws Exception {
    	//NOTE the v1.4.3 version is only supported for a single selector.
    	try {
    		ThreadClient client = (ThreadClient)ThreadClient.create(false);

    		NonBlockingClientHandler nonBlockingClientHandler =
    				(NonBlockingClientHandler) ThreadClient.create(false);
    		
    		assertNotNull(nonBlockingClientHandler);

    		run();
    	}
    	catch (Exception e)
    	{
    		e.printStackTrace();
    		fail("test fail");
    	}
}
}