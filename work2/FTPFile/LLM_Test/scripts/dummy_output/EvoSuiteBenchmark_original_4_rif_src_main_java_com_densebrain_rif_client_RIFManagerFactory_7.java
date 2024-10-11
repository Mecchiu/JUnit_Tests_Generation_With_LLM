// RIFManagerFactoryTest.java
package com.densebrain.rif.client;

import java.rmi.RemoteException;
import java.util.Hashtable;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RIFManagerFactory}.
* It contains one unit test case for the {@link RIFManagerFactory#getInstance()} method.
*/
class RIFManagerFactoryTest {
		
	@Test
	public void whenRegisteringManagerThenGetManagerShouldReturnAValidManager()
	throws RemoteException{
		RIFManagerFactory.getInstance();
	}
	
	@Test
	public void whenRegisteringManagerAndUsingTheFactoryThenItShouldReturnTheSameManager(){
		//When registering the factory in an other thread another thread is calling us.
		RIFManagerFactory.getInstance();
		RIFManager first = RIFManagerFactory.getInstance();
		assertNotNull(first);
		assertEquals(first, RIFManagerFactory.getInstance());
	}
	
	@Test
	public void whenUnregisteringManagerThenManagerShouldReturnNull(){
	
		//When registering the factory in an other thread another thread is calling us.
		RIF.setSystemProperty("rifManagerFactory.doUnRegister", "true");		
		RIFManagerFactory.getInstance();
		RIFManager first = RIFManagerFactory.getInstance();
		assertEquals(null, first);
		assertFalse(RIFManagerFactory.doUnRegister);	
	}
	
	@Test
	public void whenRegisteringMultipleManagersThenManagerShouldCombineDifferentManagers(){
		RIFManager first = RIFManagerFactory.getInstance();
		RIFManager second = RIFManagerFactory.getInstance();
		managerMap.put(first.getManager().getName(), first);
		managerMap.put(second.getManager().getName(), second);
		
		assertTrue(RIFManagerFactory.doUnRegister == second.doUnRegister);
		try {
			first = null;
			managerMap.put(first.getManager().getName(), second);
			assertTrue(RIFManagerFactory.doUnRegister);
		}
		catch (RemoteException rethrown) {
			assertEquals("Unable to unRegister " + rethrown.toString(), rethrown);
		}
	}

}