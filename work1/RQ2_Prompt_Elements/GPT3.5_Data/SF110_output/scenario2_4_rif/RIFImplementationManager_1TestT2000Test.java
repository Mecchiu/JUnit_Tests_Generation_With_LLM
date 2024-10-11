// Here's the source code for the RIFImplementationManager_1Test class:

package com.densebrain.rif.server;

import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link RIFImplementationManager}.
 * It contains ten unit test cases for the {@link RIFImplementationManager#invoke(String, String, Object[])} method.
 */
class RIFImplementationManager_1Test {

    private RIFImplementationManager manager;

    @BeforeEach
    void setUp() {
        manager = new RIFImplementationManager();
    }

    @Test
    void testInvokeWithNullInterfaceName() {
        assertThrows(RemoteException.class, () -> manager.invoke(null, "methodName", new Object[]{}));
    }

    @Test
    void testInvokeWithNullMethodName() {
        assertThrows(RemoteException.class, () -> manager.invoke("interfaceName", null, new Object[]{}));
    }

    @Test
    void testInvokeWithNullParams() {
        assertThrows(RemoteException.class, () -> manager.invoke("interfaceName", "methodName", null));
    }

    @Test
    void testInvokeWithUnregisteredInterface() {
        assertThrows(RemoteException.class, () -> manager.invoke("interfaceName", "methodName", new Object[]{}));
    }

    @Test
    void testInvokeWithUnknownMethod() {
        manager.registerImplementation(TestInterface.class, new TestImplementation());
        assertThrows(IllegalArgumentException.class, () -> manager.invoke(TestInterface.class.getName(), "unknownMethod", new Object[]{}));
    }

    @Test
    void testInvokeWithValidParams() throws RemoteException {
        manager.registerImplementation(TestInterface.class, new TestImplementation());
        String result = (String) manager.invoke(TestInterface.class.getName(), "testMethod", new Object[]{"param1", "param2"});
        assertEquals("param1param2", result);
    }

    @Test
    void testInvokeWithInvalidParams() {
        manager.registerImplementation(TestInterface.class, new TestImplementation());
        assertThrows(RemoteException.class, () -> manager.invoke(TestInterface.class.getName(), "testMethod", new Object[]{"param1"}));
    }

    @Test
    void testInvokeWithMultipleImplementations() throws RemoteException {
        manager.registerImplementation(TestInterface.class, new TestImplementation());
        manager.registerImplementation(TestInterface.class, new TestImplementation2());
        String result = (String) manager.invoke(TestInterface.class.getName(), "testMethod", new Object[]{"param1", "param2"});
        assertEquals("param1param2", result);
    }

    @Test
    void testInvokeWithMultipleMethods() throws RemoteException {
        manager.registerImplementation(TestInterface.class, new TestImplementation());
        String result1 = (String) manager.invoke(TestInterface.class.getName(), "testMethod", new Object[]{"param1", "param2"});
        assertEquals("param1param2", result1);
        String result2 = (String) manager.invoke(TestInterface.class.getName(), "testMethod2", new Object[]{"param3"});
        assertEquals("param3", result2);
    }

    private interface TestInterface {
        String testMethod(String param1, String param2);
        String testMethod2(String param);
    }

    private static class TestImplementation implements TestInterface {
        @Override
        public String testMethod(String param1, String param2) {
            return param1 + param2;
        }

        @Override
        public String testMethod2(String param) {
            return param;
        }
    }

    private static class TestImplementation2 implements TestInterface {
        @Override
        public String testMethod(String param1, String param2) {
            return param2 + param1;
        }

        @Override
        public String testMethod2(String param) {
            return null;
        }
    }
}