// ArrayOfDependency_2Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfDependency}.
* It contains one unit test case for the {@link ArrayOfDependency#getTypeDesc()} method.
*/
class ArrayOfDependency_2Test {
		
	/**
	 * This test checks the method {@link ArrayOfDependency#getTypeDesc()} returns the correct value.
	 */
    @Test
    public void testGetTypeDesc() {
        String expectedValue = Integer.toString(Double.class.getCanonicalName());
        
        ArrayOfDependency ret = new ArrayOfDependency();
        java.lang.reflect.Type[] type = new java.lang.reflect.Type[]
                {
                        Double.TYPE
                };
        java.lang.reflect.Type[] expected = new java.lang.reflect.Type[]
                {
                        java.lang.Class.class
                };
        assertEquals("getTypeDesc() return value is not correct", expectedValue, ret.getTypeDesc().getValue());
        
        Object[] values = new Object[]
        {
                new Double(3.14159265)
                {
                },
                new Double(6.0)
                {
                }
        };
        
        assertEquals("getTypeDesc() ArrayOfDependency.getTypeDesc() is not equal", expectedValue, ret.getTypeDescByValue().getValue());
    }
	
}