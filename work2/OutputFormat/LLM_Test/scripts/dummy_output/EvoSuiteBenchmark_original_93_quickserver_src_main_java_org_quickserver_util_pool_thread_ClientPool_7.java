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
		
    /** This will be sent if nio write should have happened in {@link ClientPool#getNioWriteHappened()}. */
    private boolean shouldNioWriteHappen = false;
    
    /**
     * This will be used in order to send the following messages
     * in {@code Server.send("Hello World"), ClientClient(nio.Server)}.
     * 
     * @since 1.19
     */
    
    private String expectedMessage;
    
    /**
     * This will be used in order to send the following messages
     * in {@code Server.send("Hello World")},
     * {@return Server.send("Hello World")},
     * {@return Server.send("Hello World")}.
     * 
     * @since 1.19
     */
    private Object expectedReturn;
    
    /**
     * This class tests method {@code Server.send(String)} when return value
     * is non null.
     * @since 1.19
     */
    private static class ServerSendCallback implements ServerCallback {

        
        private Object o = null;
        
        // The message sent. 
        public void objectSent(Object result, String message) {
            System.out.println("Object sent" + message);
        }
        
        public Object getObject() {
            // This will be only called by the server
            return o;
        }

        public void setObject(Object obj) {
            System.out.println("Object set"+ obj);
            this.o = obj;            
        }
    }
    
	public void testCanAddAndGetAll() {
		
		this.expectedMessage = 
			"Test.ClientPool.1 add(int) and getAll() all are the same.";
		
		// The callback to be called.
		ServerCallback cb = 
			new ServerSendCallback(); 
		this.expectedReturn = cb;
	//	this.expectedReturn =
	//		new ServerSendCallback();        
		
		// Construct object that will be added to the pool.
		ClientPool pool = this.getPool(this.getConfig());
		pool = new ClientPool(this, this.getConfig());
		
     //   Object o = this.getPool(this.getConfig()).getPool(0);
     //	ClientPoolUtil.print(o);
		
	}
	
	public void testCanAdd() {
		
		this.expectedMessage = 
			"Test.ClientPool.2 add(int) and getAll() all are the same.";
		
		// The callback to be called.
		ServerCallback cb = 
			new ServerSendCallback(); 
		this.expectedReturn = cb;
	//	this.expectedReturn =
	//		new ServerSendCallback();        
		
		// Construct object that will be added to the pool.
		ClientPool pool = this.getPool(this.getConfig());
		pool = new ClientPool(this, this.getConfig());
		
	//	PoolableConfig config = new PoolableConfig(0, true);
	//	ClientPoolUtil.print(pool.add(1, config, cb));
		
	//	PoolableConfig config = new PoolableConfig(-1, true);
	//	ClientPoolUtil.print(pool.add(null, config, cb));
		
	//	PoolableConfig config = new PoolableConfig(1, true);
	//	ClientPoolUtil.print(pool.add(1, config, cb));
	}
	
//	public void testCanAdd() {
//		
//		this.expectedMessage = 
//			"Test.ClientPool.3 add(int) and getAll() all are the same.";
//		
//		// The callback to be called.
//		ServerCallback cb = 
//			new ServerSendCallback(); 
//		this.expectedReturn = cb;
//	//	this.expectedReturn =
//	//		new ServerSendCallback();        
//		
//		// Construct object that will be added to the pool.
//		ClientPool pool = this.getPool(this.getConfig());
//		pool = new ClientPool(this, this.getConfig());
//		
//		// The ClientPool will have one pool entry.
//		ClientPoolUtil.print(pool.add(1, cb)); 
//		
//	}
//
//	public void testCanAdd() {
//		
//		this.expectedMessage = 
//			"Test.ClientPool.4 add(int) and getAll() all are the same.";
//		
//		// The callback to be called.
//		ServerCallback cb = 
//			new ServerSendCallback(); 
//		this.expectedReturn = cb;
//	//	this.expectedReturn =
//	//		new ServerSendCallback();        
//		
//		// Construct object that will be added to the pool.
//		ClientPool pool = this.getPool(this.getConfig());
//		pool = new ClientPool(this, this.getConfig());
//		
//		// The ClientPool will have one pool entry.
//		ClientPoolUtil.print(pool.add(1, cb)); 
//		
//	}

}