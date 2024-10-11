// FizzBuzz.java
package scenario3;

class FizzBuzz {

    /**
     * Return the number of times the digit 7 appears in integers less than n which are divisible by 11 or 13.
     *
     * > fizzBuzz(50)
     * 0
     * > fizzBuzz(78)
     * 2
     * > fizzBuzz(79)
     * 3
     * > fizzBuzz(50)
     * 0
     * > fizzBuzz(78)
     * 2
     * > fizzBuzz(79)
     * 3
     * > fizzBuzz(100)
     * 3
     * > fizzBuzz(200)
     * 6
     * > fizzBuzz(4000)
     * 192
     * > fizzBuzz(10000)
     * 639
     * > fizzBuzz(100000)
     * 8026
     */
    public static int fizzBuzz(int n) {
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (i % 11 == 0 || i % 13 == 0) {
                String str = String.valueOf(i);
                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(j) == '7') {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}

// FizzBuzzTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FizzBuzz}.
* It contains ten unit test cases for the {@link FizzBuzz#fizzBuzz(int)} method.
*/
class FizzBuzzTest {
    @Test
    void testFizzBuzz1() {
        assertEquals(0, FizzBuzz.fizzBuzz(50));
    }

    @Test
    void testFizzBuzz2() {
        assertEquals(2, FizzBuzz.fizzBuzz(78));
    }

    @Test
    void testFizzBuzz3() {
        assertEquals(3, FizzBuzz.fizzBuzz(79));
    }

    @Test
    void testFizzBuzz4() {
        assertEquals(0, FizzBuzz.fizzBuzz(50));
    }

    @Test
    void testFizzBuzz5() {
        assertEquals(2, FizzBuzz.fizzBuzz(78));
    }

    @Test
    void testFizzBuzz6() {
        assertEquals(3, FizzBuzz.fizzBuzz(79));
    }

    @Test
    void testFizzBuzz7() {
        assertEquals(3, FizzBuzz.fizzBuzz(100));
    }

    @Test
    void testFizzBuzz8() {
        assertEquals(6, FizzBuzz.fizzBuzz(200));
    }

    @Test
    void testFizzBuzz9() {
        assertEquals(192, FizzBuzz.fizzBuzz(4000));
    }

    @Test
    void testFizzBuzz10() {
        assertEquals(639, FizzBuzz.fizzBuzz(10000));
    }

    @Test
    void testFizzBuzz11() {
        assertEquals(8026, FizzBuzz.fizzBuzz(100000));
    }
}