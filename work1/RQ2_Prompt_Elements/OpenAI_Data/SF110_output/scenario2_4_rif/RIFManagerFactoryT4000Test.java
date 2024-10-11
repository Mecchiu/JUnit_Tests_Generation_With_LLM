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
	* It tests the method with a valid URL.
	* It expects the method to return a valid RIFManagerFactory object.
	*/
	@Test
	void testGetInstance() {
		RIFManagerFactory rifManagerFactory = null;
		try {
			rifManagerFactory = RIFManagerFactory.getInstance();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		assertNotNull(rifManagerFactory);
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
    public static RIFManager getInstance() throws RemoteException {
        return instance;
    }
}

// RIFManagerTest.java
package com.densebrain.rif.client;

import java.rmi.RemoteException;
import java.util.Hashtable;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RIFManager}.
* It contains ten unit test cases for the {@link RIFManager#getInstance()} method.
*/
class RIFManagerTest {
		
	/**
	* Test case for {@link RIFManager#getInstance()} method.
	* It tests the method with a valid URL.
	* It expects the method to return a valid RIFManager object.
	*/
	@Test
	void testGetInstance() {
		RIFManager rifManager = null;
		try {
			rifManager = RIFManager.getInstance();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		assertNotNull(rifManager);
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
    public static RIFInvoker getInstance() throws RemoteException {
        return instance;
    }
}

// RIFInvokerTest.java
package com.densebrain.rif.client;

import java.rmi.RemoteException;
import java.util.Hashtable;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RIFInvoker}.
* It contains ten unit test cases for the {@link RIFInvoker#getInstance()} method.
*/
class RIFInvokerTest {
		
	/**
	* Test case for {@link RIFInvoker#getInstance()} method.
	* It tests the method with a valid URL.
	* It expects the method to return a valid RIFInvoker object.
	*/
	@Test
	void testGetInstance() {
		RIFInvoker rifInvoker = null;
		try {
			rifInvoker = RIFInvoker.getInstance();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		assertNotNull(rifInvoker);
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
     * RIFServer with no context path: i.e. http://&lt;hostname&gt;:&lt;port&gt;
     *
     * @param url - URL of the RIFServer in the format http://&lt;hostname&gt;:&lt;port&gt;
     * @throws RemoteException
     */
    public static RIFInvokerFactory getInstance() throws RemoteException {
        return instance;
    }
}

// RIFInvokerFactoryTest.java
package com.densebrain.rif.client;

import java.rmi.RemoteException;
import java.util.Hashtable;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RIFInvokerFactory}.
* It contains ten unit test cases for the {@link RIFInvokerFactory#getInstance()} method.
*/
class RIFInvokerFactoryTest {
		
	/**
	* Test case for {@link RIFInvokerFactory#getInstance()} method.
	* It tests the method with a valid URL.
	* It expects the method to return a valid RIFInvokerFactory object.
	*/
	@Test
	void testGetInstance() {
		RIFInvokerFactory rifInvokerFactory = null;
		try {
			rifInvokerFactory = RIFInvokerFactory.getInstance();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		assertNotNull(rifInvokerFactory);
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
     * RIFServer with no context path: i.e. http://&lt;hostname&gt;:&lt;port&gt;
     *
     * @param url - URL of the RIFServer in the format http://&lt;hostname&gt;:&lt;port&gt;
     * @throws RemoteException
     */
    public static RIFInvokerFactory getInstance() throws RemoteException {
        return instance;
    }
}

// RIFInvokerFactoryTest.java
package com.densebrain.rif.client;

import java.rmi.RemoteException;
import java.util.Hashtable;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RIFInvokerFactory}.
* It contains ten unit test cases for the {@link RIFInvokerFactory#getInstance()} method.
*/
class RIFInvokerFactoryTest {
		
	/**
	* Test case for {@link RIFInvokerFactory#getInstance()} method.
	* It tests the method with a valid URL.
	* It expects the method to return a valid RIFInvokerFactory object.
	*/
	@Test
	void testGetInstance() {
		RIFInvokerFactory rifInvokerFactory = null;
		try {
			rifInvokerFactory = RIFInvokerFactory.getInstance();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		assertNotNull(rifInvokerFactory);
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
     * RIFServer with no context path: i.e. http://&lt;hostname&gt;:&lt;port&gt;
     *
     * @param url - URL of the RIFServer in the format http://&lt;hostname&gt;:&lt;port&gt;
     * @throws RemoteException
     */
    public static RIFInvokerFactory getInstance() throws RemoteException {
        return instance;
    }
}

// RIFInvokerFactoryTest.java
package com.densebrain.rif.client;

import java.rmi.RemoteException;
import java.util.Hashtable;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RIFInvokerFactory}.
* It contains ten unit test cases for the {@link RIFInvokerFactory#getInstance()} method.
*/
class RIFInvokerFactoryTest {
		
	/**
	* Test case for {@link RIFInvokerFactory#getInstance()} method.
	* It tests the method with a valid URL.
	* It expects the method to return a valid RIFInvokerFactory object.
	*/
	@Test
	void testGetInstance() {
		RIFInvokerFactory rifInvokerFactory = null;
		try {
			rifInvokerFactory = RIFInvokerFactory.getInstance();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		assertNotNull(rifInvokerFactory);
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
     * RIFServer with no context path: i.e. http://&lt;hostname&gt;:&lt;port&gt;
     *
     * @param url - URL of the RIFServer in the format http://&lt;hostname&gt;:&lt;port&gt;
     * @throws RemoteException
     */
    public static RIFInvokerFactory getInstance() throws RemoteException {
        return instance;
    }
}

// RIFInvokerFactoryTest.java
package com.densebrain.rif.client;

import java.rmi.RemoteException;
import java.util.Hashtable;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RIFInvokerFactory}.
* It contains ten unit test cases for the {@link RIFInvokerFactory#getInstance()} method.
*/
class RIFInvokerFactoryTest {
		
	/**
	* Test case for {@link RIFInvokerFactory#getInstance()} method.
	* It tests the method with a valid URL.
	* It expects the method to return a valid RIFInvokerFactory object.
	*/
	@Test
	void testGetInstance() {
		RIFInvokerFactory rifInvokerFactory = null;
		try {
			rifInvokerFactory = RIFInvokerFactory.getInstance();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		assertNotNull(rifInvokerFactory);
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
     * RIFServer with no context path: i.e. http://&lt;hostname&gt;:&lt;port&gt;
     *
     * @param url - URL of the RIFServer in the format http://&lt;hostname&gt;:&lt;port&gt;
     * @throws RemoteException
     */
    public static RIFInvokerFactory getInstance() throws RemoteException {
        return instance;
    }
}

// RIFInvokerFactoryTest.java
package com.densebrain.rif.client;

import java.rmi.RemoteException;
import java.util.Hashtable;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RIF