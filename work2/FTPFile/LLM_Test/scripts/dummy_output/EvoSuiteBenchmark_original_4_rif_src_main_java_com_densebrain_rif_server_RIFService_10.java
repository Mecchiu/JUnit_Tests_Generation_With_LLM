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
		private String testServiceURI;

		private String testServiceInterface;

        /**
         * Creates a new instance of the test class.
         * @param uri - URL for remote service
         * @param interfaceName- name of the interface to register
         * @param methodName- method to invoke on the implementation
         */
        public RIFServiceTest(String uri, String interfaceName, String methodName) {
            testServiceURI = uri + "?wsdl=" + RIFServiceImpl_QNAME.getWsdlURI() +
                    "&interfaces=" + interfaceName + "&"
                    + EPR_PREFIX + "Method=" + methodName;
            testServiceInterface = WSH_PREFIX + interfaceName;
        }

    /**
     * We can invoke RIFService using either http, https, or https
     */
    @Test
    public void testInvoke_WebService_ServicePort() throws Exception {
        String input = testServiceURI;	
        String input2 = testServiceURI+"/invoke";

       	// Call the remote method
        String resP = RIFServiceImpl.invoke(input, "POST", "param");

        assertEquals("POST", resP);
        
    }
    
    /**
     * We must generate an object that will wrap the input parameters
     */

    @Test
    public void testInvoke_WebService_Serialized_Param() throws Exception {

        // Build the target object.
        Object targetObject =  new Object[]{
            "hello"
        };

        // Pass the call object to the remote implementation.
        String request = "hello";
        String result = RIFServiceImpl.invoke(request, "POST", targetObject);

        assertEquals("hello world", result);
        
    }

    // Unit test class for testInvoke_WebService_Serialized_Param
    static class TestObjectWithSerializedParams_TestInvoke extends TestObjectWithSerializedParams {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = null;

        public TestObjectWithSerializedParams_TestInvoke() {
            super();
        }

    	// testInvoke_WebService_Serialized_Param
        public void testInvoke_WebService_Serialized_Param() throws Exception {
        	String target = base64.encodeBase64(baos.toByteArray());
        	log.info("ByteBuffer: "+target);
            String res = RIFServiceImpl.invoke(request, "POST", target);

            assertTrue(ps.toString(),ps.toString().contains(res));
            assertEquals("POST",res);
            String res2 = new String(baos.toByteArray());
            assertNotSame(res, res2);
        }

    	@Override
		protected Object[] getObjectFromByteArrayInMemory(String str) {
			try {
               ByteArrayInputStream bais = new ByteArrayInputStream(str.getBytes());
               ObjectInputStream ois = new ObjectInputStream(bais);
               Object object = ois.readObject();
               ois.close();
               return new Object[]{object};
            } catch (ClassNotFoundException c) {
                c.printStackTrace();
            }
            return null;
        }

        @Override
        protected String getObjectAsString(Object[] objects) {
            StringBuilder sb = new StringBuilder();
            if(objects.length > 0){
                // String object must be serializable
                sb.append("{s}");
                for(Object obj: objects)
                    sb.append(obj);
                return sb.toString();
            }
            return "";
        }

        @Override
        protected void writeBytesToOutputStream_Objects(Object[] objects,
                String wsEndpoint, String wsPort) throws Exception {
            for(Object obj: objects) {
               ByteArrayOutputStream baos = new ByteArrayOutputStream();
               ObjectOutputStream oos = new ObjectOutputStream(baos);
               oos.writeObject(obj);
               oos.close();
            }
            // Base64 encode (as encoded bytes) the byte array
            log.info("Encoded buffer="+baos.toString(""));
            assertNotSame("Encoded buffer is different", new String(baos.toByteArray()),
                    new String(new Base64().decodeBase64(wsEndpoint+"-"+wsPort+"-"+wsEndpoint+"-")));
            assertNotSame("Encoded buffer is different", new String(baos.toByteArray()),
                    new String(new Base64().decodeBase64(wsEndpoint+"-"+wsPort+"-"+wsEndpoint+"-")));
        }

        @Override
		public Object[] serializeObjectsToBytes(Object object) {
            ObjectOutputStream oos = null;
            ByteArrayOutputStream b = null;
            if (object == null) {
                throw new IllegalArgumentException("Serialization only accepts objects!");
            }
            os = new ObjectOutputStream(b) {
                @Override
                protected void writeObject(java.io.ObjectOutputStream javaObjectOutputStream) {
                    try {
                       ByteArrayOutputStream baos = new ByteArrayOutputStream();
                       ObjectOutputStream oos = new ObjectOutputStream(baos);
                       oos.writeObject(object);
                       ois.close();
                    } catch (Exception e) {
                        log.warn("Exception while serializing object", e);
                    }
                }
            };
            oos.writeObject(object);
            return null;
        }
    }

    // Unit test class for testInvoke_WebService_Serialized_Param
    static class TestObjectWithSerializedParams_TestInvokeWithType_Qname extends TestObjectWithSerializedParams {
        Base64 encoder = new Base64();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = null;
        
        public TestObjectWithSerializedParams_TestInvokeWithType_Qname() {
            super();
        }
        
        public TestObjectWithSerializedParams_TestInvokeWithType_Qname(String t) {
            super(t);
        }

}
}