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

	protected static int nServer = 1;

    protected RIFManager mgr;

    private String host;
    private int port;

    protected void setUp() throws RemoteException {
        mgr = new RIFManager("http://" + host + ":" + port + "/RIFService?" + "application/json");
        ServiceFactory.init(mgr.getClass().toString(), classLoader);
        mgr.getClassLoader().loadClass("com.densebrain.rif.client.Service");

        RIFServiceStub stub = new RIFServiceStub();
        stub.setRIFService(new RIFService());
        stub.setRIFService(new RIFService());
    }

    @Test
    public void testRiceService() throws RemoteException {
        assertTrue(mgr.getClass().equals(service.getClass()));
        assertFalse(service.hasServer());
        assertFalse(service.hasClient());


    }
    
    /**
     * Test if the RIFManager is able to successfully establish a client to a remote web service.
     */
    @Test
    public void testRiceClient() throws RemoteException {
    	assertTrue(mgr.getRiceService().hasServer());
    	assertFalse(mgr.getClass().equals(RIFManager.class));
    	assertTrue(mgr.getRiceService().hasClient());
    }


    /**
     * Tests what happens when the client of a remote server registers with their RIFInvoker.
     * This test assumes the server is registered with the first RIFInvoker in it.
     * Because its a remote call a RemoteInvoker is added to the mgr.
     */
    @Test
    public void testRiceServer() throws RemoteException {
        assertFalse(mgr.getRiceService().hasServer());
        assertTrue(mgr.getRiceService().hasClient());

        RIFInvoker invoker = mgr.getClass().newInstance().new RIFInvoker("invoker1");
        invoker.addMethod(RIFClassLoader.class.getName(), "callRiceHello");
        invoker.init();
        invokerMap.put(RIFClassLoader.class, invoker);

        assertTrue(((RIFContextInvoker) invoker.getContext().classLoader()).getContext().isClient());
        assertTrue(mgr.getRiceService().hasServer());

        Class cls = mgr.getClass().newInstance();
        int nInvoker = InvokerFactory.getInstance().getInvokerCount();
        assertEquals(nInvoker + 1, mgr.getRiceService().getNInvokers());

    }


    /**
     * Test if the class loader is correctly loaded and used when the RIFInvoker
     * is retrieved from the service.
     */


    public void testLoadRiceClassLoader() throws RemoteException {

        RIFClassLoader cl = getClassLoader();

        int nInvoker = InvokerFactory.getInstance().getInvokerCount();

        assertNotNull(cl);
        RIFInvoker invoker = mgr.getClass().newInstance().new RIFInvoker("invoker1");
        invoker.addMethod(cl.getName(), "callRiceHello");
        invoicee.addInvoker(invoker);
        assertEquals(nInvoker + 1, InvokerFactory.getInstance().getInvokerCount());

        invoker = mgr.getClass().newInstance();

        invoker.addMethod(cl.getName(), "callRiceHello");
        invoicee.addInvoker(invoker);
        assertEquals(nInvoker + 1, InvokerFactory.getInstance().getInvokerCount());

        invoker.setServerClassLoader(cl);
        assertEquals(0, InvokerFactory.getInstance().getInvokerCount());

        ServiceFactory.init(getClass().getName(), classLoader);



    }


    @Test
    public void testCache() throws RemoteException {

        assertTrue(invokerMap.isEmpty());

        RIFInvoker invoker = mgr.getClass().newInstance().new RIFInvoker("invoker1");
        invoker.addMethod(RIFClassLoader.class.getName(), "callRiceHello");
        invoicee.addInvoker(invoker);
        mgr.getClass().newInstance();

        invoker = mgr.getClass().newInstance();

        invoker.addMethod(RIFClassLoader.class.getName(), "callRiceHello");
        invoicee.addInvoker(invoker);
        assertEquals(nInvoker + 1, InvokerFactory.getInstance().getInvokerCount());

        invokerMap.put(invoker.getClass(), invoker);

        assertEquals(nInvoker + 1, InvokerFactory.getInstance().getInvokerCount());



    }

    public RIFManager(String url) throws RemoteException {
        setUp();
        mgr = new RIFManager(url);

        invokerMap = new Hashtable<Class, RIFInvoker>();

    }

}
