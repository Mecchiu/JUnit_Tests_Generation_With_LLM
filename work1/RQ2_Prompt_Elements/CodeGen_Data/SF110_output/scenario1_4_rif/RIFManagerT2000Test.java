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
RIFManagerTest() {
    }

    @Test
		public void getInvoker_Method() throws RemoteException {

			Class interfazee = RIFService.class;
			final RIFInvoker invoker = new RIFInvoker(this, interfazee);
			assertNotNull(invoker);
			assertTrue(RIFInvoker.class.isAssignableFrom(interfazee));
			assertTrue(RIFInvoker.class.isAssignableFrom(interferableInterfazee(interfoe)));
			assertTrue(RIFInvoker.class.isAssignableFrom(interfoe));

			RIFInvoker anotherInvoker = new RIFInvoker(this, interfazee);


			Hashtable ht = new Hashtable();
			ht.put(interfazee, anotherInvoker);
			assertFalse(RIFInvoker.class.isAssignableFrom(interfoe));
			assertFalse(RIFInvoker.class.isAssignableFrom(anotherInvoker));

			assertEquals(anotherInvoker, ht.get(interfazee));
		}

	}
