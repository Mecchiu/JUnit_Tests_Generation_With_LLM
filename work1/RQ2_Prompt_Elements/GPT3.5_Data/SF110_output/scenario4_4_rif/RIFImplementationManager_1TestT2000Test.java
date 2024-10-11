// Here's an implementation of the RIFImplementationManager class with some sample test cases.

// RIFImplementationManager.java
package com.densebrain.rif.server;

import java.lang.reflect.Method;
import java.rmi.RemoteException;
import java.util.Hashtable;
import java.util.Map;

/**
 * Manages all of the interface implementations registered on the service and
 * provides a simple function for invoking a method on a registered interface.
 *
 * The RIFServer decomposes the WebService request sent through the RIFServer to the RIFService
 * and then prepares a call to RIFImplementationManager.invoke to call the actual function.
 *
 * To register an implementation:
 * <code>
 *
 * RIFImplementationManager.getInstance().registerImplementation(YourInterface.class, new YourImpl());
 *
 * </code>
 *
 * @author Jonathan Glanz
 */
public class RIFImplementationManager {

    private static RIFImplementationManager instance = new RIFImplementationManager();

    /**
     * Retrieve the singleton RIFImplementationManager instance.
     *
     * @return
     */
    public static RIFImplementationManager getInstance() {
        return instance;
    }

    private Hashtable<String, Object> implementationMap = new Hashtable<String, Object>();

    private Hashtable<Object, Map<String, Method>> methodsMap = new Hashtable<Object, Map<String, Method>>();

    private RIFImplementationManager() {
    }

    /**
     * Register an implementation to be served from this JVM
     *
     * @param interfaceClazz - The interface that is served by the passed implementation
     * @param implementation - the implementation of the passed interface
     */
    public void registerImplementation(Class interfaceClazz, Object implementation) {
        implementationMap.put(interfaceClazz.getName(), implementation);
        Method[] methods = interfaceClazz.getMethods();
        Map<String, Method> methodMap = new Hashtable<String, Method>();
        for (Method method : methods) {
            methodMap.put(method.getName(), method);
        }
        methodsMap.put(implementation, methodMap);
    }

    /**
     * Invoke a method on a registered implementation.  The iterfaceName passed is used to lookup
     * a registered implementation and then the method is invoked on the registered implementation
     * with the passed parameters.
     *
     * @param interfaceName - name of the registered interface class
     * @param methodName - method to invoke on the registered implementation
     * @param params - parameters to pass to the method, which is to be invoked.
     * @return the return from the method being invoked.
     *
     * @throws RemoteException
     */
    public Object invoke(String interfaceName, String methodName, Object[] params) throws RemoteException {
        Object implementation = implementationMap.get(interfaceName);
        if (implementation == null) {
            throw new RemoteException("No implementation registered for interface " + interfaceName);
        }
        Map<String, Method> methodMap = methodsMap.get(implementation);
        Method method = methodMap.get(methodName);
        if (method == null) {
            throw new RemoteException("No method " + methodName + " found on implementation of interface " + interfaceName);
        }
        try {
            return method.invoke(implementation, params);
        } catch (Exception e) {
            throw new RemoteException("Error invoking method " + methodName + " on implementation of interface " + interfaceName, e);
        }
    }
}

// RIFImplementationManager_1Test.java
package com.densebrain.rif.server;

import java.rmi.RemoteException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RIFImplementationManager}.
* It contains ten unit test cases for the {@link RIFImplementationManager#invoke(String, String, Object[])} method.
*/
class RIFImplementationManager_1Test {

    @Test
    void testInvokeWithNullInterfaceName() {
        RIFImplementationManager manager = RIFImplementationManager.getInstance();
        assertThrows(RemoteException.class, () -> manager.invoke(null, "methodName", new Object[] {}));
    }

    @Test
    void testInvokeWithNullMethodName() {
        RIFImplementationManager manager = RIFImplementationManager.getInstance();
        assertThrows(RemoteException.class, () -> manager.invoke("interfaceName", null, new Object[] {}));
    }

    @Test
    void testInvokeWithNullParams() {
        RIFImplementationManager manager = RIFImplementationManager.getInstance();
        assertThrows(RemoteException.class, () -> manager.invoke("interfaceName", "methodName", null));
    }

    @Test
    void testInvokeWithUnregisteredInterface() {
        RIFImplementationManager manager = RIFImplementationManager.getInstance();
        assertThrows(RemoteException.class, () -> manager.invoke("unregisteredInterface", "methodName", new Object[] {}));
    }

    @Test
    void testInvokeWithUnregisteredMethod() {
        RIFImplementationManager manager = RIFImplementationManager.getInstance();
        manager.registerImplementation(TestInterface.class, new TestImplementation());
        assertThrows(RemoteException.class, () -> manager.invoke(TestInterface.class.getName(), "unregisteredMethod", new Object[] {}));
    }

    @Test
    void testInvokeWithCorrectParams() throws RemoteException {
        RIFImplementationManager manager = RIFImplementationManager.getInstance();
        manager.registerImplementation(TestInterface.class, new TestImplementation());
        assertEquals("Hello, world!", manager.invoke(TestInterface.class.getName(), "testMethod", new Object[] {"world"}));
    }

    @Test
    void testInvokeWithIncorrectParams() {
        RIFImplementationManager manager = RIFImplementationManager.getInstance();
        manager.registerImplementation(TestInterface.class, new TestImplementation());
        assertThrows(RemoteException.class, () -> manager.invoke(TestInterface.class.getName(), "testMethod", new Object[] {1}));
    }

    @Test
    void testInvokeWithMultipleImplementations() throws RemoteException {
        RIFImplementationManager manager = RIFImplementationManager.getInstance();
        manager.registerImplementation(TestInterface.class, new TestImplementation());
        manager.registerImplementation(TestInterface.class, new TestImplementation2());
        assertEquals("Hello, world!", manager.invoke(TestInterface.class.getName(), "testMethod", new Object[] {"world"}));
    }

    @Test
    void testInvokeWithMultipleMethods() throws RemoteException {
        RIFImplementationManager manager = RIFImplementationManager.getInstance();
        manager.registerImplementation(TestInterface.class, new TestImplementation());
        assertEquals("Hello, world!", manager.invoke(TestInterface.class.getName(), "testMethod", new Object[] {"world"}));
        assertEquals("Goodbye, world!", manager.invoke(TestInterface.class.getName(), "testMethod2", new Object[] {"world"}));
    }

    @Test
    void testInvokeWithMultipleInterfaces() throws RemoteException {
        RIFImplementationManager manager = RIFImplementationManager.getInstance();
        manager.registerImplementation(TestInterface.class, new TestImplementation());
        manager.registerImplementation(TestInterface2.class, new TestImplementation2());
        assertEquals("Hello, world!", manager.invoke(TestInterface.class.getName(), "testMethod", new Object[] {"world"}));
        assertEquals("Goodbye, world!", manager.invoke(TestInterface2.class.getName(), "testMethod", new Object[] {"world"}));
    }

    private interface TestInterface {
        String testMethod(String name);
        String testMethod2(String name);
    }

    private interface TestInterface2 {
        String testMethod(String name);
    }

    private static class TestImplementation implements TestInterface {
        @Override
        public String testMethod(String name) {
            return "Hello, " + name + "!";
        }

        @Override
        public String testMethod2(String name) {
            return "Goodbye, " + name + "!";
        }
    }

    private static class TestImplementation2 implements TestInterface {
        @Override
        public String testMethod(String name) {
            return "Hola, " + name + "!";
        }

        @Override
        public String testMethod2(String name) {
            return "Adios, " + name + "!";
        }
    }
}