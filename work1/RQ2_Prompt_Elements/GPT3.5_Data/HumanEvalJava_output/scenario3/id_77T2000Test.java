// Iscube.java
package scenario3;

class Iscube {

    /**
     * * Write a function that takes an integer a and returns True
     * if this integer is a cube of some integer number.
     * Note: you may assume the input is always valid.
     * Examples:
     * iscube(1) ==> True
     * iscube(2) ==> False
     * iscube(-1) ==> True
     * iscube(64) ==> True
     * iscube(0) ==> True
     * iscube(180) ==> False
     *
     * > iscube(1)
     * true
     * > iscube(2)
     * false
     * > iscube(-1)
     * true
     * > iscube(64)
     * true
     * > iscube(180)
     * false
     * > iscube(1000)
     * true
     * > iscube(0)
     * true
     * > iscube(1729)
     * false
     */
    public static Boolean iscube(int a) {
        if (a == 0 || a == 1) {
            return true;
        }
        int cubeRoot = (int) Math.cbrt(a);
        return cubeRoot * cubeRoot * cubeRoot == a;
    }
}

// IscubeTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Iscube}.
* It contains ten unit test cases for the {@link Iscube#iscube(int)} method.
*/
class IscubeTest {
    @Test
    void test1() {
        assertTrue(Iscube.iscube(1));
    }

    @Test
    void test2() {
        assertFalse(Iscube.iscube(2));
    }

    @Test
    void test3() {
        assertTrue(Iscube.iscube(-1));
    }

    @Test
    void test4() {
        assertTrue(Iscube.iscube(64));
    }

    @Test
    void test5() {
        assertFalse(Iscube.iscube(180));
    }

    @Test
    void test6() {
        assertTrue(Iscube.iscube(1000));
    }

    @Test
    void test7() {
        assertTrue(Iscube.iscube(0));
    }

    @Test
    void test8() {
        assertFalse(Iscube.iscube(1729));
    }

    @Test
    void test9() {
        assertTrue(Iscube.iscube(27));
    }

    @Test
    void test10() {
        assertFalse(Iscube.iscube(-8));
    }
}