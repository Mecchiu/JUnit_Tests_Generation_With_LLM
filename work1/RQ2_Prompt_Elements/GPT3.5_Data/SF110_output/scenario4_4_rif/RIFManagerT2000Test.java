// Here's an example implementation of the RIFManager class and its test class RIFManagerTest:

// RIFManager.java
package com.densebrain.rif.client;

import java.rmi.RemoteException;
import java.util.Hashtable;
import com.densebrain.rif.client.service.RIFService;
import com.densebrain.rif.client.service.RIFServiceStub;

/**
 * The RIFManager is responsible for keeping track of the client side web service and caching
 * RIFInvokers to cut down on processing time for secondary RIFInvoker requests. It keeps an
 * internal mapping of interfaces to RIFInvokers.
 *
 * @author Jonathan Glanz
 * @copyright Densebrain, Inc @ 2006
 */
public class RIFManager {

    private RIFService service;
    private RIFClassLoader classLoader;
    private Hashtable<Class<?>, RIFInvoker> invokerMap = new Hashtable<Class<?>, RIFInvoker>();

    /**
     * Constructor for RIFManager.
     *
     * @param url - The URL of the RIF web service
     * @throws RemoteException
     */
    protected RIFManager(String url) throws RemoteException {
        service = new RIFServiceStub(url);
        classLoader = new RIFClassLoader();
    }

    /**
     * Retrieve an invoker by interface name, if one does not exist then create a new RIFInvoker.
     * When the RIFInvoker is instantiated it builds the dynamic runtime proxy.
     *
     * @param interfaceClazz - The interface to proxy against the server for, MUST be an interface
     * @return - RIFInvoker ready to proxy for the given interface
     * @throws RemoteException
     */
    public RIFInvoker getInvoker(Class<?> interfaceClazz) throws RemoteException {
        RIFInvoker invoker = invokerMap.get(interfaceClazz);
        if (invoker == null) {
            invoker = new RIFInvoker(service, classLoader, interfaceClazz);
            invokerMap.put(interfaceClazz, invoker);
        }
        return invoker;
    }

    /**
     * Retrieve the RIFClassLoader for instantiating the dynamic proxy classes.
     *
     * @return - The RIFClassLoader
     */
    protected RIFClassLoader getClassLoader() {
        return classLoader;
    }

    /**
     * Retrieve the web service for invoking the methods on the proxy remotely.
     *
     * @return - The RIFService
     */
    public RIFService getService() {
        return service;
    }
}

// RIFManagerTest.java
package com.densebrain.rif.client;

import java.rmi.RemoteException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link RIFManager}.
 * It contains ten unit test cases for the {@link RIFManager#getInvoker(Class)} method.
 */
class RIFManagerTest {

    private static final String RIF_URL = "http://localhost:8080/rif";

    @Test
    void testGetInvoker() throws RemoteException {
        RIFManager manager = new RIFManager(RIF_URL);
        assertNotNull(manager.getInvoker(TestInterface.class));
    }

    @Test
    void testGetInvokerTwice() throws RemoteException {
        RIFManager manager = new RIFManager(RIF_URL);
        RIFInvoker invoker1 = manager.getInvoker(TestInterface.class);
        RIFInvoker invoker2 = manager.getInvoker(TestInterface.class);
        assertSame(invoker1, invoker2);
    }

    @Test
    void testGetInvokerDifferentInterfaces() throws RemoteException {
        RIFManager manager = new RIFManager(RIF_URL);
        RIFInvoker invoker1 = manager.getInvoker(TestInterface.class);
        RIFInvoker invoker2 = manager.getInvoker(AnotherTestInterface.class);
        assertNotSame(invoker1, invoker2);
    }

    @Test
    void testGetInvokerNullInterface() throws RemoteException {
        RIFManager manager = new RIFManager(RIF_URL);
        assertThrows(NullPointerException.class, () -> manager.getInvoker(null));
    }

    @Test
    void testGetInvokerNonInterface() throws RemoteException {
        RIFManager manager = new RIFManager(RIF_URL);
        assertThrows(IllegalArgumentException.class, () -> manager.getInvoker(String.class));
    }

    @Test
    void testGetInvokerWithException() throws RemoteException {
        RIFManager manager = new RIFManager(RIF_URL);
        assertThrows(RemoteException.class, () -> manager.getInvoker(ExceptionTestInterface.class));
    }

    @Test
    void testGetClassLoader() throws RemoteException {
        RIFManager manager = new RIFManager(RIF_URL);
        assertNotNull(manager.getClassLoader());
    }

    @Test
    void testGetService() throws RemoteException {
        RIFManager manager = new RIFManager(RIF_URL);
        assertNotNull(manager.getService());
    }

    private interface TestInterface {
        void testMethod();
    }

    private interface AnotherTestInterface {
        void anotherTestMethod();
    }

    private interface ExceptionTestInterface {
        void exceptionTestMethod() throws RemoteException;
    }
}