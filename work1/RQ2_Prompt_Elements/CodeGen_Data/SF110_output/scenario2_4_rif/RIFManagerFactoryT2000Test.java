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
private RIFManagerFactory instance;
		
		private static RIFManagerFactory instance = null;
		
		public RIFManagerFactoryTest(){
			if (instance == null)
				instance = RIFManagerFactory.getInstance();
		}

		@Test
		public void testGetManager_Null(){	
			assertEquals(instance.getManager(), null);
		}
	
		@Test
		public void testGetManager(){	
			assertNotNull(instance.getManager());
			RIFManagerManager manager= instance.getManager();
			assertTrue(manager instanceof RIFManagerProxy);
			manager.setUrl("http://www.google.com");
			assertEquals(manager.getURL(), "http://www.google.com");
		}
	
		@Test
		public void testGetInvoker_Null(){	
			assertEquals(instance.getInvoker(), null);
		}
	
		@Test
		public void testGetInvoker_Null_Null(){	
			assertNotNull(instance.getInvoker());
			assertNull(instance.getInvoker().getRifManager());
			assertNull(instance.getManager().getRifInvoker(new IUnknown()));
			assertNull(((RIFInvokerManager)instance.getManager().getRifInvoker(new IUnknown())).getRifManager());
		}
	
		@Test
		public void testGetImpl_Null(){	
			assertEquals(instance.getImpl(null), null);
			assertEquals(instance.getImpl(null).getRifManager(), null);
			assertEquals(instance.getManager().getRifInvoker(new IUnknown()).getRifManager(), null);
			assertEquals(instance.getManager().getRifInvoker(new IUnknown()).getRifManager().getRifManager(), null);
		}
	
		@Test
		public void testGetManagerAndImpl_Null(){	
			assertNotSame(instance, instance.getManager());
			assertEquals(instance.getManager().getRifManager(), null);
			Hashtable<Class, RIFManager> mgrs =  new Hashtable<Class, RIFManager>();
			RIFManagerManager manager = instance.getManager();
			mgrs.put(RIFManager.class, manager);
			
			assertEquals(mgrs, instance.getImpl(null));
			RIFInvokerManager rifinvokermgr = instance.getInvoker();
			assertEquals(rifinvokermgr.getRifManager(), manager.getRifManager());
			RIFInvokerManager rifinvokermgrimpl = instance.getInvoker();
			assertEquals(rifinvokermgrimpl.getRifManager(), manager.getRifManager());
		}
	
		/**
		* Used in place of the method getManager and getImpl.  As is the case in the constructor,
		* there is nothing in this test.
		*/
		@Test
		public void testGetManagerAndImpl_SingleImpl(){	
			assertNotSame(instance, instance.getManager());
			assertEquals(instance.getManager().getRifManager(), null);
			Hashtable<Class, RIFManager> mgrs =  new Hashtable<Class, RIFManager>();
			RIFManagerManager manager = instance.getManager();
			mgrs.put(RIFManager.class, manager);
			
			assertEquals(mgrs, instance.getImpl(null));
			RIFInvokerManager rifinvokermgr = instance.getInvoker();
			assertEquals(rifinvokermgr.getRifManager(), manager.getRifManager());
			RIFInvokerManager rifinvokermgrimpl = instance.getInvoker();
			assertEquals(rifinvokermgrimpl.getRifManager(), manager.getRifManager());
			
		}
}
