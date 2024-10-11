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
		* @see RIFManagerTest#getInvoker(Class) method
		*/
	@Test
	void testGetInvoker() throws RemoteException {
		assertNotNull(getInvoker(RIFService.class));
	}

       /**
		* @see RIFManagerTest#getClassLoader() method
		*/
	@Test
	void testGetClassLoader() throws RemoteException {
		assertEquals(getClassLoader(), getInvoker(RIFService.class).getClassLoader());
	}

    /**
     * Unit test cases for {@link RIFManager#getInvoker(Class)}.
     * They test all methods of each RIFInvoker instance to validate all methods
     * have the same interface as the given interface.
     */
    @Test
    void testGetInvokerAllMethods() {
        assertValidInterface(RIFInvoker.class, "getInvoker");
    }

    @Test
    void testGetInvokerUnknownMethod() throws RemoteException {
        assertNull(getInvoker(UnknownInvoker.class));
    }

    static public class UnknownInvoker implements RIFInvoker{
        @Override
        public Object invoke(Hashtable<String, String> properties) {
        	throw new RemoteException("unknown invoker method");
        }
    }

    /**
     * Unit test cases for {@link RIFManager#getServices()}
     * All methods are expected to return a proper array of services.
     * The array will have at least two elements. The first element
     * is assumed to be the service exposed with the RIFManager.getInvoker service name.
     */
    @Test
    void testServices() throws RemoteException {
        RIFService[] services = new RIFService[2];
        assertTrue("Services should be 2", 2 == services.length);
        services[0] = getClassLoader();
        services[1] = getService();
        assertEquals("All services have same service class", services[0].getClass(), services[1].getClass());
        for(RIFService s : services){
                s.shutdown();
        }
    }


    @Test
	@TestForPerformance()
    void testRIFService() throws RemoteException {

    }

    /**
	 * Unit tests for {@link RIFManager#inject(java.io.InputStream)}
	 */
    @Test

    void testInjectInputStream() throws RemoteException {

    }

    /**
	 * Unit tests for {@link RIFManager#inject(java.io.OutputStream)}
	 */
    @Test

    void testInjectOutputStream() throws RemoteException {

    }

    /**
	 * Unit tests for {@link RIFManager#injectStatic(java.io.InputStream)}
	 */
    @Test

    void testInjectStaticInputStream() throws RemoteException {

    }

    /**
	 * Unit tests for {@link RIFManager#injectStatic(java.io.OutputStream)}
	 */
    @Test

    void testInjectStaticOutputStream() throws RemoteException {

    }

    /**
	 * Invalidate all services and all invokers to ensure the previous tests will run the correct number of times.
	 */
    @Test
    public void tesServicesAndAllInvokers() throws Exception {

    }

	/**
	 * This method will attempt to stop any existing instances for
	 * a given interface or a given interface name.
	 * @param interfaceClazz - the interface to stop
	 */
	public static void stopRIFInvokers(Class interfaceClazz){
		RIFService service = (RIFClassLoader) getClassLoader().getSubsystem(RIFClassLoader.SUBSYSTEM_NAME);
		service.stopService();
		RIFInvoker invoker = getInvoker(interfaceClazz);
		invoker.stopService();
	}
}