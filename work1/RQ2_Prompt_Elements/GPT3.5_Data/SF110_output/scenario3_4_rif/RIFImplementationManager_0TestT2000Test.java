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

    private static RIFImplementationManager instance;
    private Map<Class<?>, Object> implementations;

    private RIFImplementationManager() {
        implementations = new Hashtable<>();
    }

    /**
     * Retrieve the singleton RIFImplementationManager instance.
     *
     * @return the singleton instance of RIFImplementationManager
     */
    public static synchronized RIFImplementationManager getInstance() {
        if (instance == null) {
            instance = new RIFImplementationManager();
        }
        return instance;
    }

    /**
     * Registers an implementation for a given interface.
     *
     * @param interfaceClass the interface class to register
     * @param implementation the implementation object to register
     */
    public void registerImplementation(Class<?> interfaceClass, Object implementation) {
        implementations.put(interfaceClass, implementation);
    }

    /**
     * Invokes a method on a registered interface implementation.
     *
     * @param interfaceClass the interface class to invoke the method on
     * @param methodName the name of the method to invoke
     * @param args the arguments to pass to the method
     * @return the result of the method invocation
     * @throws RemoteException if there is an error invoking the method
     */
    public Object invoke(Class<?> interfaceClass, String methodName, Object[] args) throws RemoteException {
        Object implementation = implementations.get(interfaceClass);
        if (implementation == null) {
            throw new RemoteException("No implementation registered for interface " + interfaceClass.getName());
        }
        try {
            Method method = interfaceClass.getMethod(methodName, getParameterTypes(args));
            return method.invoke(implementation, args);
        } catch (Exception e) {
            throw new RemoteException("Error invoking method " + methodName + " on interface " + interfaceClass.getName(), e);
        }
    }

    /**
     * Returns an array of parameter types for the given arguments.
     *
     * @param args the arguments to get the parameter types for
     * @return an array of parameter types
     */
    private Class<?>[] getParameterTypes(Object[] args) {
        Class<?>[] parameterTypes = new Class<?>[args.length];
        for (int i = 0; i < args.length; i++) {
            parameterTypes[i] = args[i].getClass();
        }
        return parameterTypes;
    }
}

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
* It contains ten unit test cases for the {@link RIFImplementationManager#getInstance()} method.
*/
class RIFImplementationManager_0Test {
    
    @Test
    void testGetInstanceReturnsSameInstance() {
        RIFImplementationManager instance1 = RIFImplementationManager.getInstance();
        RIFImplementationManager instance2 = RIFImplementationManager.getInstance();
        assertSame(instance1, instance2);
    }
    
    @Test
    void testGetInstanceReturnsNonNullInstance() {
        RIFImplementationManager instance = RIFImplementationManager.getInstance();
        assertNotNull(instance);
    }
    
    @Test
    void testRegisterImplementationAddsImplementation() {
        RIFImplementationManager instance = RIFImplementationManager.getInstance();
        instance.registerImplementation(TestInterface.class, new TestImplementation());
        assertTrue(instance.implementations.containsKey(TestInterface.class));
    }
    
    @Test
    void testInvokeReturnsExpectedResult() throws RemoteException {
        RIFImplementationManager instance = RIFImplementationManager.getInstance();
        instance.registerImplementation(TestInterface.class, new TestImplementation());
        Object result = instance.invoke(TestInterface.class, "testMethod", new Object[] { "test" });
        assertEquals("test", result);
    }
    
    @Test
    void testInvokeThrowsRemoteExceptionForUnregisteredInterface() {
        RIFImplementationManager instance = RIFImplementationManager.getInstance();
        assertThrows(RemoteException.class, () -> {
            instance.invoke(TestInterface.class, "testMethod", new Object[] { "test" });
        });
    }
    
    @Test
    void testInvokeThrowsRemoteExceptionForInvalidMethodName() {
        RIFImplementationManager instance = RIFImplementationManager.getInstance();
        instance.registerImplementation(TestInterface.class, new TestImplementation());
        assertThrows(RemoteException.class, () -> {
            instance.invoke(TestInterface.class, "invalidMethod", new Object[] { "test" });
        });
    }
    
    @Test
    void testInvokeThrowsRemoteExceptionForInvalidArguments() {
        RIFImplementationManager instance = RIFImplementationManager.getInstance();
        instance.registerImplementation(TestInterface.class, new TestImplementation());
        assertThrows(RemoteException.class, () -> {
            instance.invoke(TestInterface.class, "testMethod", new Object[] { 123 });
        });
    }
    
    @Test
    void testInvokeThrowsRemoteExceptionForMethodsWithoutArguments() {
        RIFImplementationManager instance = RIFImplementationManager.getInstance();
        instance.registerImplementation(TestInterface.class, new TestImplementation());
        assertThrows(RemoteException.class, () -> {
            instance.invoke(TestInterface.class, "testMethodWithoutArguments", new Object[] {});
        });
    }
    
    @Test
    void testInvokeThrowsRemoteExceptionForMethodsWithoutReturnValue() {
        RIFImplementationManager instance = RIFImplementationManager.getInstance();
        instance.registerImplementation(TestInterface.class, new TestImplementation());
        assertThrows(RemoteException.class, () -> {
            instance.invoke(TestInterface.class, "testMethodWithoutReturnValue", new Object[] { "test" });
        });
    }
    
    private interface TestInterface {
        String testMethod(String arg);
        void testMethodWithoutReturnValue(String arg);
        void testMethodWithoutArguments();
    }
    
    private class TestImplementation implements TestInterface {
        public String testMethod(String arg) {
            return arg;
        }
        public void testMethodWithoutReturnValue(String arg) {
            // do nothing
        }
        public void testMethodWithoutArguments() {
            // do nothing
        }
    }
}