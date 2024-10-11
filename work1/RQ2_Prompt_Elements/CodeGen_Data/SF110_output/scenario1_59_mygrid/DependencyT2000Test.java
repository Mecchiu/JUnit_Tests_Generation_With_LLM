// DependencyTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Dependency}.
* It contains one unit test case for the {@link Dependency#getTypeDesc()} method.
*/
class DependencyTest {
private final static String DUE_NAME = "test_future";
		
		public final static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
                DUP_TYPE);

	@Test
	  void testToString() throws Exception {
	    DUP_TYPE.populateTypeDesc();
	    
	    assertEquals( DUP_TYPE, 
		 	 org.apache.axis.encoding.Deserializer.deserialize( 
		 	   "(type.type=mygrid.web._Dependent)(type.extension=.)"));
	  }
		
	@Test
	  public void testReadResolve() throws Exception {
	  	
	  	new DUP_TYPE().populateTypeDesc();
	  	
	  	org.apache.axis.encoding.Deserializer deserializer = new org.apache.axis.encoding.ser.BeanDeserializer(
	  	   new org.apache.axis.encoding.ser.BeanSerializer(
	  	   typeDesc),
	  	   null);
	  	
	  	DUP_TYPE = null; // Deactivate it.
	  	assertTrue( deserializer.resolveProperty(DUP_NAME) instanceof java.io.Serializable );
	  }

}
