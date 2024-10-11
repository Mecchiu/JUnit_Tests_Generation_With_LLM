// AddTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Add}.
* It contains one unit test case for the {@link Add#add(int, int)} method.
*/
class AddTest {

    public static class Input1 {
        
        /**
        * @param args Command line arguments.
        */
        public static void main(String[] args) {
            int p;
            int q;
        }
    }

    /**
    * Unit test for the {@link Add#add(int,int)} method.
    */
    @Test
    void add() {
        Input1 input = new Input1();
        assertEquals((7), add((0),(0)));
        assertEquals((13), add((0),(1)));
        
        assertEquals((16), add((5),(0)));
        assertEquals((16), add((5),(1)));
        
        assertEquals((19), add((3),(0)));
        assertEquals((19), add((3),(1)));
        
        assertEquals((22), add((2),(2)));
        assertEquals((19), add((2),(0)));

        assertFalse(true);
        
    }

}