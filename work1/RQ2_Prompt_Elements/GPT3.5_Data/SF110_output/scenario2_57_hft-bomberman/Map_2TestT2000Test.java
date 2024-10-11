// Here's an implementation of the Map_2Test class with ten unit test cases for the getStartPoint method:

package common;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Map_2Test {

    @Test
    void testGetStartPointPlayer1() {
        Map map = new Map();
        assertEquals(new Point(30, 30), map.getStartPoint(1));
    }

    @Test
    void testGetStartPointPlayer2() {
        Map map = new Map();
        assertEquals(new Point(50, 50), map.getStartPoint(2));
    }

    @Test
    void testGetStartPointPlayer3() {
        Map map = new Map();
        assertEquals(new Point(70, 70), map.getStartPoint(3));
    }

    @Test
    void testGetStartPointPlayer4() {
        Map map = new Map();
        assertEquals(new Point(90, 90), map.getStartPoint(4));
    }

    @Test
    void testGetStartPointPlayer5() {
        Map map = new Map();
        assertEquals(new Point(110, 110), map.getStartPoint(5));
    }

    @Test
    void testGetStartPointPlayer6() {
        Map map = new Map();
        assertEquals(new Point(130, 130), map.getStartPoint(6));
    }

    @Test
    void testGetStartPointPlayer7() {
        Map map = new Map();
        assertEquals(new Point(150, 150), map.getStartPoint(7));
    }

    @Test
    void testGetStartPointPlayer8() {
        Map map = new Map();
        assertEquals(new Point(170, 170), map.getStartPoint(8));
    }

    @Test
    void testGetStartPointPlayer9() {
        Map map = new Map();
        assertEquals(new Point(190, 190), map.getStartPoint(9));
    }

    @Test
    void testGetStartPointPlayer10() {
        Map map = new Map();
        assertEquals(new Point(210, 210), map.getStartPoint(10));
    }
}