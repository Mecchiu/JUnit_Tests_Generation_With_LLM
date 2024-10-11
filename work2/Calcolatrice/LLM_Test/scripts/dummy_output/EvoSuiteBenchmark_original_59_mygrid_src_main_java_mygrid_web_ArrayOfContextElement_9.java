// ArrayOfContextElementTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfContextElement}.
* It contains one unit test case for the {@link ArrayOfContextElement#getTypeDesc()} method.
*/
class ArrayOfContextElementTest {
		
    int[] arrayOfContextElement;
    static int[][] arrayOfObject = new int[0][];
    static int[][] arrayOfArrayOfContextElement = new int[0][];
    static int[][] arrayOfArrayOfObject = new int[0][];
	
    /**
     * Test of getTypeDesc method, of class mygrid.web.ArrayOfContextElement.
     */
    @Test
    public void testGetTypeDesc() {
        System.out.println("getTypeDesc");
        ArrayOfContextElement result = ArrayOfContextElement.getTypeDesc();
    	assertEquals(result, ArrayOfContextElement.class);
    }
    
    /**
     * Test of getObject method, of class mygrid.web.ArrayOfContextElement.
     */
    @Test
    public void testGetObject() {
        System.out.println("getObject");
    }
    
    /**
     * Test of getArrayOfContextElement method, of class mygrid.web.ArrayOfContextElement.
     */
    @Test
    public void testGetArrayOfContextElement() {
        System.out.println("getArrayOfContextElement");
        int[][] result = ArrayOfContextElement.getArrayOfContextElement();
        assertNotNull(result);
        assertEquals(result.length,1);
        assertEquals(1,result[0].length);
    }
    
    /**
     * Test of getArrayOfObject method, of class mygrid.web.ArrayOfContextElement.
     */
    @Test
    public void testGetArrayOfObject() {
        System.out.println("getArrayOfObject");
    }
    
    /**
     * Test of getArrayOfArrayOfContextElement method, of class mygrid.web.ArrayOfContextElement.
     */
    @Test
    public void testGetArrayOfArrayOfContextElement() {
        System.out.println("getArrayOfArrayOfContextElement");
        int[][] result = ArrayOfContextElement.getArrayOfArrayOfContextElement();
        assertNotNull(result);
        assertEquals(result.length,1);
        assertEquals(1,result[0].length);
    }
}