// Here's an example implementation of the Map_2Test class with ten unit test cases for the getStartPoint method:

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Map_2Test {

    @Test
    public void testGetStartPoint_Player1() {
        Map map = new Map();
        Point startPoint = map.getStartPoint(1);
        assertEquals(new Point(1, 1), startPoint);
    }

    @Test
    public void testGetStartPoint_Player2() {
        Map map = new Map();
        Point startPoint = map.getStartPoint(2);
        assertEquals(new Point(1, 2), startPoint);
    }

    @Test
    public void testGetStartPoint_Player3() {
        Map map = new Map();
        Point startPoint = map.getStartPoint(3);
        assertEquals(new Point(1, 3), startPoint);
    }

    @Test
    public void testGetStartPoint_Player4() {
        Map map = new Map();
        Point startPoint = map.getStartPoint(4);
        assertEquals(new Point(1, 4), startPoint);
    }

    @Test
    public void testGetStartPoint_Player5() {
        Map map = new Map();
        Point startPoint = map.getStartPoint(5);
        assertEquals(new Point(1, 5), startPoint);
    }

    @Test
    public void testGetStartPoint_Player6() {
        Map map = new Map();
        Point startPoint = map.getStartPoint(6);
        assertEquals(new Point(1, 6), startPoint);
    }

    @Test
    public void testGetStartPoint_Player7() {
        Map map = new Map();
        Point startPoint = map.getStartPoint(7);
        assertEquals(new Point(1, 7), startPoint);
    }

    @Test
    public void testGetStartPoint_Player8() {
        Map map = new Map();
        Point startPoint = map.getStartPoint(8);
        assertEquals(new Point(1, 8), startPoint);
    }

    @Test
    public void testGetStartPoint_Player9() {
        Map map = new Map();
        Point startPoint = map.getStartPoint(9);
        assertEquals(new Point(1, 9), startPoint);
    }

    @Test
    public void testGetStartPoint_Player10() {
        Map map = new Map();
        Point startPoint = map.getStartPoint(10);
        assertEquals(new Point(1, 10), startPoint);
    }
}