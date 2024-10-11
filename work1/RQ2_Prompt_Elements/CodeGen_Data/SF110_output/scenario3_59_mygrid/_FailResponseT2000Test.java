// _FailResponseTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _FailResponse}.
* It contains one unit test case for the {@link _FailResponse#getTypeDesc()} method.
*/
class _FailResponseTest {

	/**
	* Test for the {@link _FailResponse#getTypeDesc()} method.
	*/
    @Test
    public void testGetTypeDesc() {
		
    	int i = 1;
    	
    	final org.apache.axis.encoding.Deserializer deserializer = org.apache.axis.encoding.ser.BeanDeserializerFactory.createDeserializer(org.apache.axis.encoding.ser.BeanDeserializerFactory.ROOT_TYPE, null);
    	
    	String ts = "2014-03-27";
    	
        assertEquals("getTypeDesc", deserializer.getTypeDesc(org.apache.axis.encoding.Deserializer.DESERIALIZED_NODE).toString());

    	assertEquals("getTypeDesc", deserializer.getTypeDesc(i).toString());

	}

}
