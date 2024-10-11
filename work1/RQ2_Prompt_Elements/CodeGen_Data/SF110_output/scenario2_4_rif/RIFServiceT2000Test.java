// RIFServiceTest.java
package com.densebrain.rif.server;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.rmi.RemoteException;
import org.apache.axis2.util.Base64;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RIFService}.
* It contains one unit test case for the {@link RIFService#invoke(String, String, String)} method.
*/
class RIFServiceTest {

	/**
	* Test of get implementation of {@link RIFService} to create a new instance of it
	*/
    @Test
    public void testInvoke_RIFService() throws Exception {
        ObjectInput ois;
        ObjectOutput oos;
        String serializedParams = "[[RIFImplementationManager] = [RIFService(ws_uri = " + TestRIFService.TEST_URL + ")]]";
        try {
        	ois = new ObjectInputStream(new ByteArrayInputStream(Base64.encode(serializedParams.getBytes("UTF-8"))));
        	oos = new ObjectOutputStream(new ByteArrayOutputStream());
        	Object o = ois.readObject();
        	assertSame(o, ois.readObject());
        	ois.close();
        	oos.writeObject(o);
        	oos.close();
        	byte[] serializedParams2Bytes = Base64.encode(serializedParams.getBytes("UTF-8"));
        	ois = new ObjectInputStream(new ByteArrayInputStream(serializedParams2Bytes));
        	ois.close();
        	oos = new ObjectOutputStream(new ByteArrayOutputStream());
        	ois.close();
        	ois = new ObjectInputStream(new ByteArrayInputStream(serializedParams2Bytes));
        	ois.close();
        	ois.getClass();// ignore it;
        	assertTrue(ois.readObject() instanceof RIFImplementationManager);
        	ois.getClass();// ignore it;
        	assertTrue(ois.readObject() instanceof RIFService);
        	ois.getClass();// ignore it;
        	assertTrue(ois.readObject() instanceof ObjectOutputStream);
        	ois = new ObjectInputStream(new ByteArrayInputStream("[[RIFService(ws_uri = " + TestRIFService.TEST3_URL + ")]".getBytes("UTF-8")));
        	ois.close();
        	ois = new ObjectInputStream(new ByteArrayInputStream("[[RIFService(ws_uri = " + TestRIFService.TEST3_URL + ")]".getBytes("UTF-8")));
        	ois.close();
        	ois = new ObjectInputStream(new ByteArrayInputStream("[[RIFService] = [RIFService(ws_uri = " + TestRIFService.TEST3_URL + ")]".getBytes("UTF-8")));
        	ois.close();
            assertNotNull(ois.readObject());
        } finally {
            assertTrue(ois.readObject() instanceof ObjectInputStream);
            ois.close();
        }
    }

		/**
	* Test of configure_wspolicy_remote_call_test
	*
	* @throws RemoteException
	*/
    @Test
    public void testConf_RIFServicePolicy_remote() throws RemoteException {
        RIFService rifService = new RIFService();
        // rifService.setWSApplicationConfiguration("https://127.0.0.1:9065");
        rifService.setWSApplicationConfiguration(TestRIFService.TEST3_URL);
        rifService.setWSAddOnService(true);
        String serializedParams = "[[RIFImplementationManager] = [RIFService(ws_uri = " + TestRIFService.TEST3_URL + ")]]";
        String serializedProdParams = "[[RIFImplementationManager] = [RIFService(ws_uri = " + TestRIFService.TEST3_URL + "))]";
        try {
        	serializedParams = serializedParams.replaceAll("([]);", "[]");
        	serializedProdParams = serializedProdParams.replaceAll("([]);", "[]");
        	ObjectInputStream ois;
        	ObjectOutputStream oos;
        	ois = new ObjectInputStream(new ByteArrayInputStream(serializedParams.getBytes("UTF-8")));
        	oos = new ObjectOutputStream(new ByteArrayOutputStream());
        	Object o = ois.readObject();
        	ois.close();
        	ois = new ObjectInputStream(new ByteArrayInputStream(serializedProdParams.getBytes("UTF-8")));
        	ois.close();
        	ois = new ObjectInputStream(new ByteArrayInputStream(serializedParams.getBytes("UTF-8")));
        	ois.close();
        	ois = new ObjectInputStream(new ByteArrayInputStream(serializedProdParams.getBytes("UTF-8")));
        	ois.close();
        	Object o1 = ois.readObject();
        	ois.close();
        	ois = new ObjectInputStream(new ByteArrayInputStream(serializedProdParams.getBytes("UTF-8")));
        	ois.close();
        	ois = new ObjectInputStream(new ByteArrayInputStream(serializedParams.getBytes("UTF-8")));
        	ois.close();
        	ois = new ObjectInputStream(new ByteArrayInputStream(serializedParams.getBytes("UTF-8")));
        	ois.close();
        	ois = new ObjectInputStream(new ByteArrayInputStream(serializedParams.getBytes("UTF-8")));
        	ois.close();
        	ois = new ObjectInputStream(new ByteArrayInputStream(serializedParams.getBytes("UTF-8")));
        	ois.close();