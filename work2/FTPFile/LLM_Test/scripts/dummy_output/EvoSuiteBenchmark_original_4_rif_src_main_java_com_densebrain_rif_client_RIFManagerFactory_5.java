// RIFManagerFactoryTest.java
package com.densebrain.rif.client;

import java.rmi.RemoteException;
import java.util.Hashtable;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RIFManagerFactory}.
* It contains one unit test case for the {@link RIFManagerFactory#getInstance()} method.
*/
class RIFManagerFactoryTest {
		
}
//@Test
public class RIFManagerFactoryTest {
	
	/**
	* Unit test of {@link RIFManagerFactory#getManager(String)}, i.e. creating or finding a manager that is being used for the RIF
	* server.
	*
	* @throws MalformedURLException - throws when the url passed in is not in a form.
	* @throws RemoteException - throws if there is an error creating a manager.
	*/
	@Test
	public void getManager() throws MalformedURLException, RemoteException {
		String[] urls = new String[] {"http://server.com:9000/RIF"};
		assertNotNull(new RIFManager(urls));
	}

	/**
	* Unit test of {@link RIFManagerFactory#getManager(String, Class)}}.
	*
	* @throws MalformedURLException - throws when the url passed in is not in a form.
	* @throws RemoteException - throws if there is an error creating a manager.
	*/
	@Test
	public void getManager_NoDomain() throws MalformedURLException, RemoteException {
		String url =  "http://server.com:9000/RIF";
		assertNull(new RIFManager(url));
	}

    @SuppressWarnings("rawtypes")
	@Test
    public void getManager_Inheritance() throws MalformedURLException, RemoteException {
		String url = "http://test/inheritance";
		managerMap.put(url, new RIFManager(""));
		RIFManager manager = new RIFManager(url);
		assertTrue(manager.isAnInterface());
		assertNotNull(new RIFManager(url));
	}

	/**
	* Unit test of {@link RIFManagerFactory#getInvoker(String, Class)}}.
	*
	* @throws MalformedURLException - throws when the url passed in is not in a form.
	* @throws RemoteException - throws if there is an error creating a manager.
	*/
	@Test
	public void getInvoker() throws RemoteException, MalformedURLException {
		Class theClass = java.rmi.server.UnicastRemoteObject.class;

		String[] urls = new String[] {"http://server.com:9000/RIF", "http://anotherserver.com/RIF"};
                assertNotNull(new RIFManager(urls));
		assertEquals(urls.length, 2);
		assertNotNull(new RIFInvoker(urls));
		assertEquals(urls.length, 2);	
		assertNull(new RIFInvoker(urls));
		assertNull(new RIFInvoker(urls));
	}
}