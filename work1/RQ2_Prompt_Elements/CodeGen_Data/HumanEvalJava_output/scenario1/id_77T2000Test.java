// IscubeTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Iscube}.
* It contains one unit test case for the {@link Iscube#iscube(int)} method.
*/
class IscubeTest {

    @Test
    public void testIscube() {
        int[] arr = new int[]{};
        assertTrue(iscube(1));
        assertTrue(iscube(2));
        assertTrue(iscube(3));
        assertTrue(iscube(7));
        assertFalse(iscube(4));
        
        assertTrue(iscube(-1));
        assertTrue(iscube(-2));
        assertTrue(iscube(-3));
        assertTrue(iscube(-6));
        assertFalse(iscube(-4));
    
        assertTrue(iscube(1), 0);
    }

    @Test
    public void testArray() {        
        int[] arr = new int[]{0, 1, 2};
        assertTrue(iscube(arr));
        assertTrue(iscube(arr), arr.length == 4);
        
        arr = null;
        assertTrue(iscube(arr));
    }

	
}