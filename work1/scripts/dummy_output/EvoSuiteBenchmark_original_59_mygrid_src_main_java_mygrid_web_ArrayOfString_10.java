// ArrayOfStringTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfString}.
* It contains one unit test case for the {@link ArrayOfString#getTypeDesc()} method.
*/
class ArrayOfStringTest {
		@Test
	    public void test() {
	    	ArrayOfString arrayOfString = new ArrayOfString();
	        int[] ints =  {1,2,5,6,7,8,9};
	        String[] strings = {"a", "b", "c", "d", "e"};
	        arrayOfString.setString(strings);
	        
	        int[] vals = {6,8,10};
	        String[] valstrs = {"d", "e"};
	        arrayOfString.setValStr(vals);
	        
	        String[] vals2 = {"c", "f", "g"};
	        String[] valstrs2 = {"a", "c"};
	        arrayOfString.setValStr(vals2);
	        
	        assertEquals("Array of String", 2, ints.length);
	        assertEquals("Array of String value", 2, ints[0]);
	        assertEquals("Array of String", "a", ints[1]);
	        assertEquals("Array of String type-descriptor", 2, arrayOfString.getTypeDesc());
	        assertEquals("Array of String array-descriptor", 2, arrayOfString.getString().length);
	        assertEquals("Array of String value-descriptor", 2, ints[0]);
	        assertEquals("Array of String type-descriptor", 1, arrayOfString.getTypeDesc().getComponentType());
	        assertEquals("Array of String type-descriptor", valstrs.length, arrayOfString.getTypeDesc().getComponentType().getPrimitiveType().getValue().intValue());
	        
	        assertEquals("Array of String value-descriptor", 2, vals2.length);
	        assertEquals("Array of String type-descriptor", 3, arrayOfString.getTypeDesc().getComponentType().getPrimitiveType().getValue().intValue());
	        assertEquals("Array of String value-descriptor", 4, vals2[0]);
	        assertEquals("Array of String type-descriptor", 5, arrayOfString.getTypeDesc().getComponentType().getPrimitiveType().getValue().intValue());
	        assertEquals("Array of String value-descriptor", 12, vals2[1]);
	        assertEquals("Array of String type-descriptor", 13, arrayOfString.getTypeDesc().getComponentType().getPrimitiveType().getValue().intValue());
	        assertEquals("Array of String value-descriptor", 5, arrayOfString.getTypeDesc().getComponentType().getPrimitiveType().getValue().intValue());
	        assertEquals("ArrayOfString value-descriptor", 7, arrayOfString.getTypeDesc().getPrimitiveType().getValue().intValue());
	        assertEquals("Array of String value-descriptor", 8, arrayOfString.getTypeDesc().getComponentType().getPrimitiveType().getValue().intValue());
	        
	        assertEquals("Array of String type-descriptor", 11, arrayOfString.getTypeDesc().getComponentType().getPrimitiveType().getPrimitiveType().getValue().intValue());
	        //Test with a nested array of ints[1].
	        
	        assertEquals("Array of String type-descriptor", 11, arrayOfString.getTypeDesc().getComponentType().getPrimitiveType().getPrimitiveType().getValue().intValue());
	        
	        assertEquals("Array of String", 12, string.length);
	        assertEquals("Array of String", 12, string[0]);
	        
	        assertEquals("Array of String type-descriptor", 12, arrayOfString.getTypeDesc().getComponentType().getPrimitiveType().getValue().intValue());
        }
}