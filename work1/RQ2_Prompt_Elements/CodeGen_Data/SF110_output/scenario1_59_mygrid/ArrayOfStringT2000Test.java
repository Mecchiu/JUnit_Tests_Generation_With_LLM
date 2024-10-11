// ArrayOfStringTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfString}.
* It contains one unit test case for the {@link ArrayOfString#getTypeDesc()} method.
*/
class ArrayOfStringTest {
/**
		* Tests the getTypeDesc() method of the class.
		*/
	@Test
    public void constructor() {
		ArrayOfString obj = 

            new ArrayOfString();
		
        assertEquals("Type of array of String not equal.",
                    ArrayOfString.class,
                    obj.getTypeDesc().getType());
        
    }
	
}



