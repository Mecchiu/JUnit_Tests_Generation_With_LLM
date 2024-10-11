// _FailTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Fail}.
* It contains one unit test case for the {@link _Fail#getTypeDesc()} method.
*/
class _FailTest {
		
	
	private static final java.lang.String JAVABEAN = "mygrid.camel.FailedBean";
	private static final boolean VERBOSE = false;
	
    @Test
    public void test(){
        // Get a job instance
        mygrid.web.Job job = new mygrid.web.Job("FailedJob", "Failed");

        // Get the test object
        mygrid.web.Failed fail = new mygrid.web.Failed(job, VERBOSE); 

        // Test serialization of the failed object
        org.apache.axis.message.addressing.EndpointReference obj = new org.apache.axis.message.addressing.EndpointReference();
        obj.setEndpoint(new java.lang.String("FailedEndpoint"));
        obj.getBindingPoint().setBindingAddress("FailedEndpoint");
        org.apache.axis.message.addressing.AddressingContainer eu = new org.apache.axis.message.addressing.AddressingContainer(obj.getBindingPoint().getBindingAddress());

        org.apache.axis.encoding.Serializer serializer = org.apache.axis.encoding.SerializerFactory.getSerializer(
                "java.lang.String");

        try {
            serializer.serialize(fail, org.apache.axis.encoding.Serializer.class);
        } catch (java.lang.Exception ex) {
            throw org.apache.axis.message.ExceptionFactory.make(
                    new java.lang.ExceptionTemplate(
                        ex.getMessage()
                    ));
        }
      
      
        try {
             org.apache.axis.message.addressing.EndpointReference objOut = new org.apache.axis.message.addressing.EndpointReference();
             objOut.setEndpoint(new java.lang.String("FailedEndpoint2"));
             objOut.getBindingPoint().setBindingAddress("FailedEndpoint2");
             eu.getAddressingContainer().setBindingTarget(objOut);
             org.apache.axis.encoding.Deserializer deserializew = org.apache.axis.encoding.DeserializerFactory.getDeserializer(
                        org.apache.axis.encoding.Serializer.class);

             java.lang.String str = deserializew.deserialize(fail, org.apache.axis.encoding.Deserializer.class);
             assertTrue("The javaType is java.lang.String", str.equals(mygrid.camel.FailedBean.class.getName()));
            } catch (java.lang.Exception e) {
               assertTrue(false);
            }
     

    }
}