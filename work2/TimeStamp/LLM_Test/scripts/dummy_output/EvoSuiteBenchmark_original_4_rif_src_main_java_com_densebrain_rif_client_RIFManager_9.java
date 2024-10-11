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
	 * Test invocation by name.
	 * @throws RemoteException
	 */
	@Test
	public void getInvoker() throws RemoteException;
	
	/**
	 * A dynamic proxy with a given interface.
	 * @throws RemoteException		
	 * @return				
	 */
	public RIFInvoker getInvoker(Class interfaceClazz){
		testInvoker("getInvoie");
		return new RIFInvokerStub(new RIFObject());
	}
	
	public void testInvoker (String testMethod){
		RIFInvoker invoker = new RIFInvokerStub(new RIFObject());
		RIFInvokerTest class1 = new RIFInvokerTest(invoker);
		invokerMap.put(class1.getInterfaceClazz(), class1);
				
		Hashtable<Class, RIFInvoker> testInvokerMap = new Hashtable<Class, RIFInvoker>();
		testInvokerMap.put(class1.getInterfaceClazz(), class1);
		
		try {
			log.info("Testing the invocation of "+testMethod+"()");
			RIFObject result = class1.testInv(testMethod);
			assertNotNull(result);
			assertNotNull(result.getClassName());
			assertTrue(result instanceof RIFObject);
			
			RIFInvoker invokerTest=invokerMap.get(result.getClassName());
			assertNotNull(invokerTest);
			assertEquals(invokerTest.getInterfaceClazz(), testMethod);
			assertTrue(invokerTest.getMethodName().equals(1));
			
			invokerTest.testInv(testMethod);
			
			RIFInvoker invokerNew=invokerMap.get(invokerTest.getInterfaceClazz());
			assertNotNull(invokerNew);
			assertEquals(invokerNew.getInterfaceClazz(), testMethod);
			assertTrue(invokerNew.getMethodName().equals(1));
		}
		catch (Exception e) {
			e.printStackTrace();
			fail("An exception was thrown by " + testMethod);
		}
	}
}