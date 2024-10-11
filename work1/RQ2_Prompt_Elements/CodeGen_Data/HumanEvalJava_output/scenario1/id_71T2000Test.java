// TriangleArea1Test.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TriangleArea1}.
* It contains one unit test case for the {@link TriangleArea1#triangleArea(int, int, int)} method.
*/
class TriangleArea1Test {

    @Test
    public void test1 () {
        
        Number result = null;
        assertEquals(0,triangleArea(0,1,2));
        assertEquals(0,triangleArea(1,0,2));
        assertEquals(0,triangleArea(1,1,2));
        assertEquals(0,triangleArea(1,1,0));
        assertEquals(100,triangleArea(0,1,2));

    }
    
    @Test
    public void test2 () {
        
        Number result = null;
        assertEquals(1,triangleArea(0,0,0));
        assertEquals(0,triangleArea(0,0,1));
        assertEquals(0,triangleArea(0,1,0));
        assertEquals(0,triangleArea(0,1,1));
        assertEquals(1,triangleArea(0,1,1));
        assertEquals(-1,triangleArea(0,1,1));
    }
    
    @Test
    public void test3 () {
        
        Number result = null;
        assertEquals(-1,triangleArea(-1,0,0));
        assertEquals(0,triangleArea(-1,0,1));
        assertEquals(-1,triangleArea(-1,0,1));
        assertEquals(-1,triangleArea(-1,1,0));
        assertEquals(-1,triangleArea(-1,1,1));
        assertEquals(0,triangleArea(-1,1,1));
        assertEquals(-1,triangleArea(-1,1,1));
    }
}

