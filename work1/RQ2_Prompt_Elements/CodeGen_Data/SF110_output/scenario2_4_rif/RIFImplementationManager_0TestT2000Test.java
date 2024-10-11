// RIFImplementationManager_0Test.java
package com.densebrain.rif.server;

import java.lang.reflect.Method;
import java.rmi.RemoteException;
import java.util.Hashtable;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RIFImplementationManager}.
* It contains one unit test case for the {@link RIFImplementationManager#getInstance()} method.
*/
class RIFImplementationManager_0Test {

	/**
	 * Get the singleton RIFImplementationManager instance
	 * @return
	 * @throws RemoteException
	 */
	static RIFImplementationManager getInstance() throws RemoteException {
		return instance;
	}
	
	/**
	 * Method for testing the {@link RIFImplementationManager}
	 * @throws RemoteException
	 */
	@Test
    public void testGetInstance() throws RemoteException {

		// Register a new implementation
		return null;
    }



	/**
	 * Retrieve the list of {@link RIFRemoteInterface} implementations registered on the service.
	 * Each implementation contains the name of an <code>implementation.class</code> on the RIF service
	 * it is implemented.  This list is a complete list of {@link RemoteInterface} as well as
	 * implementations and classes.
	 *
	 * @param clz
	 * @return
	 * @throws RemoteException
	 */
	static Map getRegisters(Class<?> clz) throws RemoteException {
		return null;
    }
	
	/**
	 * Retrieve the list of <code>RemoteInterface</code> implementations registered on the service.
	 * Each implementation contains the name of an <code>implementation.class</code> on the RIF service
	 * it is implemented.  This list is a complete list of <code>RemoteInterface</code> as well as
	 * implementations and classes.
	 *
	 * @return
	 * @throws RemoteException
	 */
	static Map getInterfaceRegisters() throws RemoteException {
		Map rInterface = new Hashtable();
		return rInterface;
    }

	/**
	 * Retrieve the list of <code>RemoteInterface</code> implementations registered on the service.
	 * Each implementation contains the name of an <code>implementation.class</code> on the RIF service
	 * it is implemented.  This list is a complete list of <code>RemoteInterface</code> as well as
	 * implementations and classes.
	 *
	 * @return
	 * @throws RemoteException
	 */
	public static Map getRegisters() throws RemoteException {
		return null;
    }

	/**
	 * Retrieve the list of <code>RemoteInterface</code> implementations not registered on the service.
	 * This list is also null.
	 *
	 * @return
	 * @throws RemoteException
	 */
	public static Map getInterfaceNotRegistered() throws RemoteException {
		return null;
    }

	/**
	 * Retrieve the list of <code>RemoteInterface</code> implementations not registered on the service.
	 * This list is also null.
	 *
	 * @return
	 * @throws RemoteException
	 */
	public static Map getNotRegistered() throws RemoteException {
		return null;
    }
	


	/**
	 * Get the list of implementations registered using the
	 * Java.rIF service.  An implementation contains all of the interfaces that correspond
	 * to an implementation method and the class itself.
	 *
	 * @param interfaceName
	 * @param impl
	 * @return
	 * @throws RemoteException
	 */
	public static Map getImplementations(String interfaceName, Object impl) 
			throws RemoteException{
    	Map rImplements = getImplementations(interfaceName);
    	for (Map.Entry<Object, Hashtable> entry : rImplements.entrySet()) {
			Object value = entry.getValue().get("implementation"); 
			Method method = (Method)value;
			assertEquals(true, impl.getClass().isAssignableFrom(method.getDeclaringClass()));
			if (impl.getClass().equals(entry.getKey())) {
				if (null == method) {
					throw new RemoteException("Missing implementation method: "+entry.getKey());
				}
				else {
					return method.invoke(impl, null);
				}
			}
		}
		return null;
	}
	
    /**
     * Get the list of registered interfaces using the
     * Java.rIF service.  An interface contains all of the interfaces that correspond
     * to an interface.
     *
     * @param interfaceName
     * @return
     * @throws RemoteException
     */
    public static Map getUnregisteredImplementations(String interfaceName) throws RemoteException {
        return null;
    }
    
    /**
     * Get the list of implementations
     * @param interfaceName
     * @return
     * @throws RemoteException
     */
    public static Map getImplementations(String interfaceName) throws RemoteException {
        return null;
    }
    
    /**
     * @param clz
     * @return
     * @throws RemoteException
     */
    static Map getImplementations(Class<?> clz) throws RemoteException {
        return null;
    }

}
