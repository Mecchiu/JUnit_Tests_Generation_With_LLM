// AddTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Add}.
* It contains ten unit test cases for the {@link Add#add(int, int)} method.
*/
class AddTest {
			// Test case 1
    @Test
    void testAdd1() {
        assertEquals(0, Add.add(0, 0));
    }

    // Test case 2
    @Test
    void testAdd2() {
        assertEquals(1, Add.add(0, 1));
    }

    // Test case 3
    @Test
    void testAdd3() {
        assertEquals(1, Add.add(1, 0));
    }

    // Test case 4
    @Test
    void testAdd4() {
        assertEquals(2, Add.add(1, 1));
    }

    // Test case 5
    @Test
    void testAdd5() {
        assertEquals(0, Add.add(-1, 1));
    }

    // Test case 6
    @Test
    void testAdd6() {
        assertEquals(0, Add.add(1, -1));
    }

    // Test case 7
    @Test
    void testAdd7() {
        assertEquals(-2, Add.add(-1, -1));
    }

    // Test case 8
    @Test
    void testAdd8() {
        assertEquals(0, Add.add(0, -0));
    }

    // Test case 9
    @Test
    void testAdd9() {
        assertEquals(0, Add.add(-0, 0));
    }

    // Test case 10
    @Test
    void testAdd10() {
        assertEquals(0, Add.add(-0, -0));
    }
}