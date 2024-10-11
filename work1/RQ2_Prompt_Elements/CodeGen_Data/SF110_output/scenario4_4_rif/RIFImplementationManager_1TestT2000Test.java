// RIFImplementationManager_1Test.java
package com.densebrain.rif.server;

import java.lang.reflect.Method;
import java.rmi.RemoteException;
import java.util.Hashtable;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RIFImplementationManager}.
* It contains one unit test case for the {@link RIFImplementationManager#invoke(String, String, Object[])} method.
*/
class RIFImplementationManager_1Test {

    @Test 
    void testInvoke1() {
        String methodName = "testInvoke1";
        RIFImplementationManager_1Test.invoke("org.test.interface1", methodName, new Object [] { null, null });
    }
    
    @Test 
    void testInvoke2() {
        String methodName = "testInvoke2";
        RIFImplementationManager_1Test.invoke(null, methodName, new Object [] { null, null });
    }
    
    @Test 
    void testInvoke3() {
        String methodName = "testInvoke3";
        RIFImplementationManager_1Test.invoke(null, methodName, null);
    }
    
    @Test 
    void testInvoke4() {
        String methodName = "testInvoke4";
        assertEquals(1, RIFImplementationManager.getInstance().invoke(null, methodName, new Object [] { null, null }));
    }
    
    @Test 
    void testInvoke5() {
        String methodName = "testInvoke5";
        RIFImplementationManager_1Test.invoke("org.test.unknown", methodName, new Object [] { null });
    }

}

// RIFImplementationManager_1TEST.java
