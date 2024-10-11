// _FailResponseTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _FailResponse}.
* It contains one unit test case for the {@link _FailResponse#getTypeDesc()} method.
*/
class _FailResponseTest {
		
	final static String __serializedName = new org.apache.axis.description.TypeDesc(
    		 _FailResponse.class,
    		 true).getFieldDescs()[0];

	final static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
    		 _FailResponse.class,
    		 true);

	final static String _serializedName = new org.apache.axis.description.TypeDesc(
    		 typeDesc).getFieldDesc(0);

	/**
	* getTypeDesc() method test.
    */
	@Test
    public void testGetTypeDesc() {
        typeDesc.setJavaType(org.apache.axis.types.AtomicType.class);
		assertEquals(typeDesc.toString(), "$T0$");
    }

	/**
	* getTypeDesc() method test.
    */
	@Test
    public void testGetTypeDesc2() {
        typeDesc.setJavaType(java.lang.Integer.class);
		assertEquals(typeDesc.toString(), "I");
    }
	
}