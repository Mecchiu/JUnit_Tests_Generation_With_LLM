// ArrayOfContextElementTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfContextElement}.
* It contains one unit test case for the {@link ArrayOfContextElement#getTypeDesc()} method.
*/
class ArrayOfContextElementTest {
		
    private ArrayOfContextElement obj;	
    
    /**
     * Test of getTypeDesc operation; it should return the type desc of the serialized object, which is the descriptor of an object of type "ArrayOfContextElement".
     * It is expected that the tests will give the following expected result:
     *   {@link ArrayOfContextElement#getTypeDesc()} must return "ArrayOfContextElement".
     *@throws java.lang.Exception
     */
    @Test
    public void testGetTypeDesc() throws java.lang.Exception {
        obj = new ArrayOfContextElement();
        assertEquals(ArrayOfContextElement.TYPE, obj.getTypeDesc());
    }
}