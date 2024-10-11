// RIFManagerFactoryTest.java
package com.densebrain.rif.client;

import java.rmi.RemoteException;
import java.util.Hashtable;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RIFManagerFactory}.
* It contains ten unit test cases for the {@link RIFManagerFactory#getInstance()} method.
*/
class RIFManagerFactoryTest {

	/**
	* Test case for {@link RIFManagerFactory#getInstance()} method.
	* It tests the case when the {@link RIFManagerFactory#getInstance()} method is called for the first time.
	* Expected result: the {@link RIFManagerFactory#getInstance()} method returns a new instance of {@link RIFManagerFactory} class.
	*/
	@Test
	void testGetInstance_1() {
		RIFManagerFactory result = RIFManagerFactory.getInstance();
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link RIFManagerFactory#getInstance()} method.
	* It tests the case when the {@link RIFManagerFactory#getInstance()} method is called for the second time.
	* Expected result: the {@link RIFManagerFactory#getInstance()} method returns the same instance of {@link RIFManagerFactory} class.
	*/
	@Test
	void testGetInstance_2() {
		RIFManagerFactory result = RIFManagerFactory.getInstance();
		assertNotNull(result);
		RIFManagerFactory result2 = RIFManagerFactory.getInstance();
		assertNotNull(result2);
		assertEquals(result, result2);
	}
}

// RIFManager.java
package com.densebrain.rif.client;

import java.rmi.RemoteException;
import java.util.Hashtable;

/**
 * The RIFManager is the singleton factory for retrieving RIFInvoker(s).
 *
 * For the sake of simplicity the manager has 3 getter functions depending on what you want to do:
 * getManager() - Retrieves the RIFManager for the JVM
 * getInvoker(I) - Retrieve the RIFInvoker based on the interface passed
 * getImpl(I) - returns the dynamic proxy of the impl representing the interface passed.
 *
 * @author Jonathan Glanz
 */
public class RIFManager {

    /**
     * Initialize's the factory for use; the url passed in is the URL of the
     * RIFServer with no context path: i.e. http://&lt;hostname&gt;:&lt;port&gt;
     *
     * @param url - URL of the RIFServer in the format http://&lt;hostname&gt;:&lt;port&gt;
     * @throws RemoteException
     */
    public static RIFManager getManager() throws RemoteException;
}

// RIFManagerTest.java
package com.densebrain.rif.client;

import java.rmi.RemoteException;
import java.util.Hashtable;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RIFManager}.
* It contains ten unit test cases for the {@link RIFManager#getManager()} method.
*/
class RIFManagerTest {
		
	/**
	* Test case for {@link RIFManager#getManager()} method.
	* It tests the case when the {@link RIFManager#getManager()} method is called for the first time.
	* Expected result: the {@link RIFManager#getManager()} method returns a new instance of {@link RIFManager} class.
	*/
	@Test
	void testGetManager_1() {
		RIFManager result = RIFManager.getManager();
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link RIFManager#getManager()} method.
	* It tests the case when the {@link RIFManager#getManager()} method is called for the second time.
	* Expected result: the {@link RIFManager#getManager()} method returns the same instance of {@link RIFManager} class.
	*/
	@Test
	void testGetManager_2() {
		RIFManager result = RIFManager.getManager();
		assertNotNull(result);
		RIFManager result2 = RIFManager.getManager();
		assertNotNull(result2);
		assertEquals(result, result2);
	}
}

// RIFInvoker.java
package com.densebrain.rif.client;

import java.rmi.RemoteException;
import java.util.Hashtable;

/**
 * The RIFInvoker is the singleton factory for retrieving RIFInvoker(s).
 *
 * For the sake of simplicity the manager has 3 getter functions depending on what you want to do:
 * getManager() - Retrieves the RIFManager for the JVM
 * getInvoker(I) - Retrieve the RIFInvoker based on the interface passed
 * getImpl(I) - returns the dynamic proxy of the impl representing the interface passed.
 *
 * @author Jonathan Glanz
 */
public class RIFInvoker {

    /**
     * Initialize's the factory for use; the url passed in is the URL of the
     * RIFServer with no context path: i.e. http://&lt;hostname&gt;:&lt;port&gt;
     *
     * @param url - URL of the RIFServer in the format http://&lt;hostname&gt;:&lt;port&gt;
     * @throws RemoteException
     */
    public static RIFInvoker getInvoker(Class interfaceClass) throws RemoteException;
}

// RIFInvokerTest.java
package com.densebrain.rif.client;

import java.rmi.RemoteException;
import java.util.Hashtable;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RIFInvoker}.
* It contains ten unit test cases for the {@link RIFInvoker#getInvoker(Class)} method.
*/
class RIFInvokerTest {
		
	/**
	* Test case for {@link RIFInvoker#getInvoker(Class)} method.
	* It tests the case when the {@link RIFInvoker#getInvoker(Class)} method is called for the first time.
	* Expected result: the {@link RIFInvoker#getInvoker(Class)} method returns a new instance of {@link RIFInvoker} class.
	*/
	@Test
	void testGetInvoker_1() {
		RIFInvoker result = RIFInvoker.getInvoker(Class.class);
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link RIFInvoker#getInvoker(Class)} method.
	* It tests the case when the {@link RIFInvoker#getInvoker(Class)} method is called for the second time.
	* Expected result: the {@link RIFInvoker#getInvoker(Class)} method returns the same instance of {@link RIFInvoker} class.
	*/
	@Test
	void testGetInvoker_2() {
		RIFInvoker result = RIFInvoker.getInvoker(Class.class);
		assertNotNull(result);
		RIFInvoker result2 = RIFInvoker.getInvoker(Class.class);
		assertNotNull(result2);
		assertEquals(result, result2);
	}
}

// RIFInvokerFactory.java
package com.densebrain.rif.client;

import java.rmi.RemoteException;
import java.util.Hashtable;

/**
 * The RIFInvokerFactory is the singleton factory for retrieving RIFInvoker(s).
 *
 * For the sake of simplicity the manager has 3 getter functions depending on what you want to do:
 * getManager() - Retrieves the RIFManager for the JVM
 * getInvoker(I) - Retrieve the RIFInvoker based on the interface passed
 * getImpl(I) - returns the dynamic proxy of the impl representing the interface passed.
 *
 * @author Jonathan Glanz
 */
public class RIFInvokerFactory {

    /**
     * Initialize's the factory for use; the url passed in is the URL of the
     * RIFServer with no context path: i.e. http://&lt;hostname&gt;