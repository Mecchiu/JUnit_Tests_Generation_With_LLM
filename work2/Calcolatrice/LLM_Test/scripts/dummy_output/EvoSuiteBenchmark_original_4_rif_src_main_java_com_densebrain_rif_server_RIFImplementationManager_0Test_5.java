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
		
	private static final String TEST_KEY = "my-key";

	@Test
	void test_getInstance_NoRegiste() throws RemoteException, RemoteInvocationException;
	void test_getInstance_registeFound_NoRegiste();
	void test_getInstance_registeNotFound();
	
	@Test
	void test_invoke_GetName_WithParams_NoMethod() throws RemoteException, RemoteInvocationException;
	void test_invoke_GetName_WithParams(String methodName,Object[] params);
	void test_invoke_GetName_WithParams_Name();
	void test_invoke_GetName_WithParams_ReturnType();

}

/**
 * @test Test class of {@link RIFImplementationManager}
 * @jira_ticket JENKINS-10382
 * @author Jonathan Glanz
 */
public class RIFImplementationManager_0Test_0Test {
    
    public void test_test_GetName_WithParams_NoMethod() throws RemoteException, RemoteInvocationException {
        Object result=RIFImplementationManager.invoke(TEST_KEY, "test_invoke_GetName_WithParams", new Object[]{});
        assertEquals(new Hashtable<String, Object>(), result);
	}
    
    public void test_test_GetName_WithParams_NonRegistering() throws RemoteException, RemoteInvocationException {
        Object result=RIFImplementationManager.invoke(TEST_KEY, "test_invoke_GetName_WithParams_NonRegistering", new Object[]{});
        assertEquals(new Hashtable<String, Object>(), result);
    }
    
    public void test_test_GetName_WithParams_NotFound() throws RemoteException, RemoteInvocationException {
        Object result=RIFImplementationManager.invoke(TEST_KEY, "getName_NonRegistering", new Object[]{});
        assertNotNull(result);
    }
    public void test_test_GetName_WithParams_ReturnParameter() throws RemoteException, RemoteInvocationException {
        Object resultSet=RIFImplementationManager.invoke(TEST_KEY, "getName_ReturnParameter", new Object[]{TEST_KEY});
        assertNotNull(resultSet);
        assertEquals(TEST_KEY, resultSet);
    }
    
    public void test_test_invoke_ToString_WithParams() throws RemoteException, RemoteInvocationException {
        Object result=RIFImplementationManager.invoke(TEST_KEY, "toString_WithParams", new Object[]{TEST_KEY});
        assertNotNull(result);
        assertEquals(TEST_KEY, result);
	}
    
}