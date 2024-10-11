// RIFManagerTest.java
package com.densebrain.rif.client;

import java.rmi.RemoteException;
import java.util.Hashtable;
import com.densebrain.rif.client.service.RIFService;
import com.densebrain.rif.client.service.RIFServiceStub;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RIFManager}.
* It contains one unit test case for the {@link RIFManager#getInvoker(Class)} method.
*/
class RIFManagerTest {
		
        /**
		* A static method to create a new test instance and return a shared RIFService.
		* The default (java.util.Hashtable) is populated with a reference to the local
		* class loader of the caller's calling class (from getClassLoader())
		*/
		protected static RIFService create() throws RemoteException {
			Class<?> clazz = new Class<?>[]
                            {
                                RIFServiceStub.class
                            };
			RIFService service = RIFManager.create(clazz);

			return service;
		}

	/**
	 * A static method to create a new test instance.
	 * The hash is populated with an entry, containing an interface,
	 * which is expected to be an interface for which a valid RIFInvoker exists.
	 * This case will invoke a method (invoked via a service method)
	 * which will take advantage of the class loader of the caller of the invoker.
	 * @param clazz - {@link Class} implementation which provides a public interface to RPC methods
	 * @return - a valid remote method call {@link RIFInvoker} for
	 * which a valid RIFInvoker exists
	 * @throws RemoteException
	 */
		protected static RIFInvoker create(Class<?> clazz) throws RemoteException {
			return RIFManager.create(clazz, RIFServiceStub.class.getClassLoader());
		}

	/**
	 * A static method to instantiate a new {@link RIFServiceStub} for the specified interface
	 * @param clazz - {@link Class} which provides an interface for which an RIFInvoker exists
	 * @return - a {@link RIFInvokerStub} associated the specified interface
	 * @throws RemoteException
	 */
		protected static RIFInvokerStub create(Class<?> clazz) throws RemoteException {
			Hashtable<String, Object> ht = new Hashtable<String, Object>();
			ht.put("interface", clazz);
			return RIFManager.create(clazz, ht);
		}

	/**
	 * A static method to instantiate a new {@link RIFServiceStub} for the specified interface
	 * for the case where the class loader for this instance's caller does not
	 * specify the class loader.
	 * @param classLoader - the class loader for this client
	 * @return - a {@link RIFInvokerStub} associated the specified interface
	 * @throws RemoteException
	 */
		protected static RIFInvokerStub create(ClassLoader classLoader) throws RemoteException {
			Hashtable<String, Object> ht = new Hashtable<String, Object>();	
			ht.put("interface", classLoader);
			return RIFManager.create(classLoader, ht);
		}

		protected static RIFInvoker create(Class<?> clazz, ClassLoader classLoader) throws RemoteException {
			Hashtable<String, Object> ht = new Hashtable<String, Object>();
			ht.put("interface", clazz);
			ht.put("classloader", classLoader);
			return RIFManager.create(clazz, ht);
		}

	/**
	 * A static method to instantiate a new {@link RIFServiceStub} for the specified interface
	 * and class loader
	 * @param interfaceClazz - {@link Class} which represents the interface
	 * @param classLoader - the class loader for this client
	 * @return - a {@link RIFInvokerStub} associated the specified interface
	 * and class loader
	 * @throws RemoteException
	 */
		protected static RIFInvokerStub create(Class<?> interfaceClazz, ClassLoader classLoader) throws RemoteException {
			Hashtable<String, Object> ht = new Hashtable<String, Object>();
			ht.put("interface", interfaceClazz);
			ht.put("classloader", classLoader);
			return RIFManager.create(interfaceClazz, ht);
		}

		/**
		 * An static method to create a new {@link RIFInvoker} based on a hashtable.
		 * The hash value is determined by the {@link Class} which provides the interface.
		 * A value of null is represented by the Null value (i.e. an interface which implements no RIFInvoker)
		 *
		 * @param clazz - the class whose interfaces which to use for building the RIFInvoker interfaces
		 * @param ht - the hash table for which an RIFInvoker is to be built
		 * @return a RIFInvoker based on the hashtable
		 * @throws RemoteException
		 */
		public static RIFInvoker create(Class<?> clazz, Hashtable<String, Object> ht) throws RemoteException {
			RIFInvoker invoker = RIFManager.create(clazz, ht);

			return invoker;
		}
}