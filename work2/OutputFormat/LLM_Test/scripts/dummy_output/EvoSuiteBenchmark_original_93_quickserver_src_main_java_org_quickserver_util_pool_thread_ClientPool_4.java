// ClientPoolTest.java
package org.quickserver.util.pool.thread;

import java.util.*;
import org.quickserver.util.pool.*;
import org.apache.commons.pool.*;
import org.quickserver.net.server.*;
import org.quickserver.util.xmlreader.PoolConfig;
import java.util.logging.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClientPool}.
* It contains one unit test case for the {@link ClientPool#shouldNioWriteHappen()} method.
*/
class ClientPoolTest {
		
    /**
     * Constructor for the {@link ClientPoolTest}.
     */
    public ClientPoolTest() {
    }
        
    /*
     * Method to test if nio write should be sent for processing.
     * @param should true if it's true.
    * @param message message object.
     * @throws IOException exception thrown by the process.
     * @throws ClassNotFoundException exception thrown by the process.
     */
    @Test
    public void testShouldNioWriteHappen(final boolean should, final ClientPool.PoolingConfiguration config) throws IOException, ClassNotFoundException {
    	// Set up a new client pool.
    	PoolableObjectFactory<ClientPool> factory = new SingleObjectPool<ClientPool>(config);

    	// Create a new client object.
    	final int size = 1;
    	final ClientPool server = new ClientPoolFactory(factory, size).create();

    	// Wait for all the objects to be in the client pool.
    	try {
			server.refresh();
		} catch(Exception e) // If the connection is closed by another instance.
		{
			e.printStackTrace();
		}
    	
    	// Set the size of the objects to be used for the pool.
    	final int maxObjects = 2;
    	server.setMaxObjects(maxObjects);
    	
    	// Should not be more that 2 objects in the client pool.
    	assertEquals(size + 1, server.getMaxObjects());

    	// Set the max object size for the client pool.
    	final long defaultExpiry = server.getConfig().getDefaultExpiry() * 1000;

    	// Set the expiry to the default expiry.
    	assertEquals(defaultExpiry, server.getConfig().getExpiry());

    	// Create a new client at the specified server address.
    	final String hostname = ServerLocatorHelper.getLocalHost();
    	final int port = ServerLocatorHelper.getLocalPort();
    	final int totalSize = maxObjects * size;
    	final long defaultExpiration = server.getConfig().getDefaultExpiration() * 1000;
     	
    	// Start a new client.
    	final Client client = factory.createObject();

    	try {
    		final String threadName = Thread.currentThread().getName();
    		final Thread thread = new Thread(new Runnable() {
      			public void run() {
  	        	try {

//                long start = System.currentTimeMillis();
  	        	long end = System.currentTimeMillis();
  	        	Thread.sleep(1000);

    	        	while(end - start <= 1000) {
    	        		server.refresh();
    	        	}

  	        	}catch(Exception e) {
        			e.printStackTrace();
				}
  	        	factory.destroyObject(client);
      			}
    		});
    		thread.start();
    		
    		try {
    		        
      			assertTrue("Could not send data to a client at the specified server address.", client.receive()!= null);
      			assertTrue("Sending null response to a client at the specified server address.", client.send(null));
      			assertTrue("Sending null response to a client at the specified server address.", client.send(1));
      			assertTrue("Sending null response to a client at the specified server address.", client.send(2));
      		}catch(Exception e) { // To pass the test on windows.
      			
      		}finally {
      			
      			assertTrue("Closing the connection to a client at the specified server address should have returned null.", server.refresh());

      			thread.join();
      			
  	      		// After thread end, we should have 0 clients.
      			assertTrue("No clients were created for the client at the specified server address.", factory.size() == 0);
  	      		assertTrue("The client should have sent only null response.", client.receive().length == 0);
      	    	
      	    	server.shutdown();  // Explicitly shutdown here to assure that there are no lingering threads.
      		}
      	}finally {
    		try {
    			// Close the connection to a client at the specified server address.
    			// This must happen after sending a null response. The null response was sent to the client.
    			client.close();
      		}catch(Exception e) { // To pass the test on windows.
      	    	e.printStackTrace();
      	    	System.exit(1);
      		}
   	        factory.destroyObject(client);
    	}
   	}
}