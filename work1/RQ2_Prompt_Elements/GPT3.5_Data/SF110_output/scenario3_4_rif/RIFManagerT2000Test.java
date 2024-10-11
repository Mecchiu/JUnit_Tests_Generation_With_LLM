// Here's an example implementation of the RIFManager and RIFManagerTest classes:

// RIFManager.java
package com.densebrain.rif.client;

import java.lang.reflect.Proxy;
import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.Map;

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

    private final Map<Class<?>, RIFInvoker> invokerCache = new HashMap<>();
    private final RIFService service;

    public RIFManager(RIFService service) {
        this.service = service;
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
        RIFInvoker invoker = invokerCache.get(interfaceClazz);
        if (invoker == null) {
            invoker = new RIFInvoker(service, interfaceClazz);
            invokerCache.put(interfaceClazz, invoker);
        }
        return invoker;
    }

    /**
     * A convenience method for creating a new RIFManager with a default RIFServiceStub.
     *
     * @return - A new RIFManager instance
     * @throws RemoteException
     */
    public static RIFManager create() throws RemoteException {
        return new RIFManager(new RIFServiceStub());
    }

    /**
     * A convenience method for creating a new RIFManager with a custom RIFService implementation.
     *
     * @param service - The RIFService implementation to use
     * @return - A new RIFManager instance
     */
    public static RIFManager create(RIFService service) {
        return new RIFManager(service);
    }

}

// RIFManagerTest.java
package com.densebrain.rif.client;

import static org.junit.jupiter.api.Assertions.*;

import java.rmi.RemoteException;

import org.junit.jupiter.api.Test;

import com.densebrain.rif.client.service.RIFService;

/**
 * Test class of {@link RIFManager}.
 * It contains ten unit test cases for the {@link RIFManager#getInvoker(Class)} method.
 */
class RIFManagerTest {

    @Test
    void testGetInvoker() throws RemoteException {
        RIFManager manager = RIFManager.create();
        assertNotNull(manager.getInvoker(RIFService.class));
    }

    @Test
    void testGetInvokerWithCache() throws RemoteException {
        RIFManager manager = RIFManager.create();
        RIFInvoker invoker1 = manager.getInvoker(RIFService.class);
        RIFInvoker invoker2 = manager.getInvoker(RIFService.class);
        assertSame(invoker1, invoker2);
    }

    @Test
    void testGetInvokerWithDifferentInterfaces() throws RemoteException {
        RIFManager manager = RIFManager.create();
        RIFInvoker invoker1 = manager.getInvoker(RIFService.class);
        RIFInvoker invoker2 = manager.getInvoker(Map.class);
        assertNotSame(invoker1, invoker2);
    }

    @Test
    void testGetInvokerWithNullInterface() throws RemoteException {
        RIFManager manager = RIFManager.create();
        assertThrows(NullPointerException.class, () -> manager.getInvoker(null));
    }

    @Test
    void testCreateWithCustomService() {
        RIFService customService = new RIFService() {
            @Override
            public String invoke(String methodName, String[] parameterTypes, String[] parameterValues) throws RemoteException {
                return null;
            }
        };
        RIFManager manager = RIFManager.create(customService);
        assertNotNull(manager);
    }

    @Test
    void testCreateWithNullService() {
        assertThrows(NullPointerException.class, () -> RIFManager.create(null));
    }

    @Test
    void testCreate() throws RemoteException {
        RIFManager manager = RIFManager.create();
        assertNotNull(manager);
    }

    @Test
    void testCreateAndInvoke() throws RemoteException {
        RIFManager manager = RIFManager.create();
        RIFInvoker invoker = manager.getInvoker(RIFService.class);
        String result = invoker.invoke("testMethod", new String[] { "java.lang.String" }, new String[] { "testValue" });
        assertNull(result);
    }

    @Test
    void testCreateAndInvokeWithNullMethod() throws RemoteException {
        RIFManager manager = RIFManager.create();
        RIFInvoker invoker = manager.getInvoker(RIFService.class);
        assertThrows(NullPointerException.class, () -> invoker.invoke(null, null, null));
    }

    @Test
    void testCreateAndInvokeWithNullParameterTypes() throws RemoteException {
        RIFManager manager = RIFManager.create();
        RIFInvoker invoker = manager.getInvoker(RIFService.class);
        assertThrows(NullPointerException.class, () -> invoker.invoke("testMethod", null, null));
    }

    @Test
    void testCreateAndInvokeWithNullParameterValues() throws RemoteException {
        RIFManager manager = RIFManager.create();
        RIFInvoker invoker = manager.getInvoker(RIFService.class);
        assertThrows(NullPointerException.class, () -> invoker.invoke("testMethod", new String[] { "java.lang.String" }, null));
    }

}