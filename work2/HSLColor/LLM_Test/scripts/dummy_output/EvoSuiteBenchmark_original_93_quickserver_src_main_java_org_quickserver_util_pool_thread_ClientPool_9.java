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
     * Constructor with valid configuration.
     *
     * @since 1.4.6
     */
    public ClientPoolTest() { 
    } 

    /**
     * This constructor is used for test generation.
     *
     * @param config configuration
	 * which are used for the test creation
     * @since 1.4.6
     */
    Object(PoolConfig config) { 
		
		// Configuration
		Configuration cfg = new Configuration();
		cfg.setObjectPool(new TestObjectPool(config));
		cfg.setMinEvictableIdleTimeMillis(60000); // 60 seconds
        cfg.setMaxTotal(); // 60 minutes
    }
	
    /**
     * This function does the actual tests.
     *
     * @since 1.4.6
     */
    @Test
    public void testShouldNioWriteHappen() {
    	PoolConfig config = new PoolConfig();
		pool = new Pool(config, cfg);
		assertFalse(pool.shouldNioWriteHappen());
		config.setMaxTotal(50);
		assertTrue(pool.shouldNioWriteHappen());
    } 
}
/**
 * Object Pool.
 * Object Pool is a pool of objects for storing information of clients who
 * have registered interest.
 */
class TestObjectPool extends BaseObjectPool {

	/**
     * Constructor with valid configuration.  
     *
     * @param config configuration of the pool
	 * @param size number of objects to store
	 * @since 1.3
     */    
    protected TestObjectPool(PoolConfig config, int size) { 
        super(config, size);
    }

	/**
	 * This function is used to create the {@link Client}s in a random
	 * order.
	 *
	 * @param xxx_config configuration of the client pool
     * @since 1.3
     */
		static ArrayList<Object> getGenerator(PoolConfig xxx_config) {
        	ArrayList<Object> xxx_list = new ArrayList<Object>();
        	xxx_list.add(new TestObjectPool(xxxx_config, xxx_config.getMaxSize()));
        	ArrayList<Object> yyy_list = new ArrayList<Object>();
        	yyy_list.add(new TestObjectPool(xxxx_config, xxx_config.getMaxSize()));
    		return xxx_list;
    	}
		
        /**
		 * This method should return the number of objects stored by this
        * thread.
		 *
		 * @since 1.3
		 */
		@Override
		protected int getSizeTotal() {
			return super.getSizeTotal() + 50;
		}

        /**
		 * This method stores the value of the random object into
		 * the data array where its position is indicated, in no
		 * specific order.  It is part of the {@link Pool} interface.
		 *
		 * @param data the value of the object to be stored
		 * @return the size of the object
		 * @since 1.4.6
		 */
		protected int put0(Object data) {
			return getSize().incrementAndGet();
		}

		/**
		 * This method should return the actual size of the object
        	 * pool.
		 *
		 * @since 1.4.6
		 */
		@Override
		protected int getType() {
			return 0;
		}
		
        /**
		 * This method should return the actual size of the object
        	 * pool.
        	 *
        	 * @since 1.4.6
        	 */
		@Override
		protected int getSize() {
			return 4;
		}

}

class TestObjectPool extends BaseObjectPool {

      /**
       * Constructor with valid configuration.
       *
       * @since 1.4.6
       */
	     TestObjectPool(PoolConfig config, int size) {
		super(config, size);
		setTestObject("Test");
		setMinEvictableIdleTimeMillis(60000);
        setMaxTotal();
   }

	 /**
	  * This functions should return the maximum number of objects
	  * that the pool can hold.
	  *
	  * @return the maximum number of objects
	  * @since 1.4.6
	  */
	 public int getMaxSize() { 
          return super.getMaxSize();
	 }

   /**
	 * This functions should return the number of objects stored by this
	 * thread.
	 *
	 * @return the count of objects stored by this thread
	 * @since 1.4.6
	 */
	public int getSize() { 
        if (super.getSize() == 0) return 0;
        return super.getSize();
	}
}