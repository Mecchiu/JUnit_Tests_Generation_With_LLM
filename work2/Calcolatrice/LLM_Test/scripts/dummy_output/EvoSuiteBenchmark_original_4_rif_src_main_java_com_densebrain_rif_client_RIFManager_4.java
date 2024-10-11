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
		
    int count = 0;
        
    @Test
    public void testInvoker() {
        RIFManager rm = new RIFManager("http://localhost:1234");
    
        RIFServiceStub serviceProxy = null;
        try{
            serviceProxy = (RIFServiceStub)rm.getService();
        }catch (RemoteException e) {
            e.printStackTrace();
            fail();
        }
        final int numFailed = count+1;
        final int numCalled = 0;
        Thread callThread = new Thread(){
            public void run(){
                count = 0;
                try {
                    RIFService.bindMethod(getClassLoader(), "invoke", null);
                    assertFalse("invoke was never called ", numCalled >= 10);
                    RIFInvoker invoker = rm.getService().getInvoker("com.densebrain.TestClass");
                    assertEquals("invoke was called exactly twice ", numCalled, 1);
                    assertNotNull("should not be null for non-proxy invoker", invoker);
                    assertTrue("should be a proxy invoker", invoker instanceof  RIFInvoker);
                    assertFalse("call method was never set as a proxy method", ((RIFInvoker)invoker).isCallMethod());
                } catch (RemoteException e) {
                    e.printStackTrace();
                    fail();
                }
            }
        };
        callThread.start();
        waitForStart();
        System.out.println("Invoked "+numFailed);
        assertEquals("incorrect number of calls ", numCalled, numFailed);
    }

    @Test
    public void testInvokerMultipleFail() throws Exception {
        final RIFManager rm = new RIFManager("https://localhost:1234");
        
        RIFServiceStub serviceProxy = null;
        try {
            serviceProxy = (RIFServiceStub)rm.getService();
        }catch (RemoteException e) {
            e.printStackTrace();
            fail();
        }
        final int numCalled = 0; 
        final int numFailed = 0;
        Thread callThread = new Thread(){
            public void run(){
                count = 0;
                try {
                    RIFService.bindMethod(getClassLoader(), "invoke", null);
                    assertFalse("invoke was never called ", count>10);
                    RIFInvoker invoker = rm.getService().getInvoker("com.densebrain.TestClass");
                    assertEquals("invoke was called exactly twice ", count, 1);
                    assertNotNull("should not be null for non-proxy invoker", invoker);
                    assertFalse("call method was never set as a proxy method", ((RIFInvoker)invoker).isCallMethod());
                } catch (RemoteException e) {
                    e.printStackTrace();
                    fail();
                }
            }
        };
        callThread.start();
        waitForStart();
        waitForStart();
        System.out.println("Invoking "+numFailed);
        assertEquals("incorrect number of calls ", count, numFailed);
    }

    /**
     * Creates a client's client stub object.
     */
    private RIFService getService() throws RemoteException {
        String serviceStr = "";
        serviceStr = "unable create service object";
        System.out.println("\n"+serviceStr);
        classLoader = new RIFClassLoader();
        classLoader.importClass("com.densebrain.rif.client.RIFServiceStub");

        service = (RIFService) classLoader.createInstance(serviceStr);
        assertNotNull("RIFService Stub object could not be created", service);
        return service;
    }
    
    private void waitForStart() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
}