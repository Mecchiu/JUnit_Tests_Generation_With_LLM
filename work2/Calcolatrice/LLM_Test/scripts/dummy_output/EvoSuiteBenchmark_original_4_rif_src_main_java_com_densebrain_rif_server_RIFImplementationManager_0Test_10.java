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
	 * Test case to verify the getImplementation method of the registered interface
	 * @throws RemoteException
	 */
	@Test
    public void getImplementation_0() throws RemoteException {
        String myInterface = getClass().getDeclaredField("implementationClazz").get(getClass()).getName();
        Object result = RIFImplementationManager.getInstance().getImplementation(myInterface);
        assertEquals(myInterface, result.getClass().getName());
        assertTrue(hasMethod(myInterface, "getImplementation", new Class[] {}));
    }

    /**
	 * Test case to verify the invoke method of the registered interface
	 * @throws RemoteException
	 */
	@Test
    public void invoke_0() throws RemoteException {

        String method = getClass().getDeclaredMethod("invoke").getName();
        Object result = RIFImplementationManager.getInstance().invoke(getClass().getSimpleName(), method, new Object[] {}, new RemoteException(""));
        assertTrue(hasMethod(getClass().getSimpleName(), "invoke", new Class[]{String.class}));
        assertTrue(hasMethod(getClass().getSimpleName(), method, new Object[] {String.class}, RemoteException.class, new String[0]));
        assertTrue(hasMethod(getClass().getSimpleName(), method, new Object[] {String.class}, RemoteException.class, new String[0]));
        assertTrue(hasMethod(getClass().getSimpleName(), method, new Object[] {String.class}, RemoteException.class, new String[0] ));

        if(hasMethod(getClass().getSimpleName(), "invoke", new Class[] {""}, method, null )) assertFalse(hasMethod(getClass().getSimpleName(), method, new Object[] {""}, method, null));

        if(hasMethod(getClass().getSimpleName(), "invoke", new Class[] {"", " "}, method)) {
            result = invoke(getClass().getSimpleName(), method);
        }

        assertTrue(hasMethod(getClass().getSimpleName(), "invoke", new Class[] {"getImplementation"}, method, new Object[] {}));
        assertTrue(hasMethod(getClass().getSimpleName(), "invoke", new Class[] {"getImplementation"}, method, new Object[] {myClass}));
        assertTrue(hasMethod(getClass().getSimpleName(), "invoke", new Class[] {"getImplementation", "getImplementation"}, method, new Object[] {myClass}));
        assertTrue(hasMethod(getClass().getSimpleName(), "invoke", new Class[] {"getImplementation", "getImplementation"}, method, new Object[] {myClass}) &&
                hasMethod(getClass().getSimpleName(), "invoke", new Class[] {"getImplementation", "getImplementation"}, method, new Object[] {myClass}));

        assertTrue(hasMethod(getClass().getSimpleName(), "invoke", new Class[] {"getImplementation", "getImplementation"}, method, new Object[] {myClass, myClass}));
        assertTrue(hasMethod(getClass().getSimpleName(), "invoke", new Class[] {"getImplementation", "getImplementation"}, method, new Object[] {myClass, myClass}) &&
                hasMethod(getClass().getSimpleName(), "invoke", new Class[] {"getImplementation", "getImplementation"}, method, new Object[] {myClass}));
    }

    private boolean hasMethod(String methodName, String methodNameReplacement, Class[] param, Method getImplementation);

	@Test
    public void invokeWithParameters_0(){

        assertThrows(RemoteException.class, methodNameReplacement, getImplementation("com.densebrain.rif.server.RIFServer", "getImplementation", "com.densebrain.rif.server.RIFServer_0Test"));

	}

}