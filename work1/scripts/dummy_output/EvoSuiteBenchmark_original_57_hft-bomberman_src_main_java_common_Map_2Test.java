package common;
java
class Map_2Test {

    @Test
    void testGetStartPoint_PlayerNo1() {
        Map map = new Map("test.xml");
        Point startPoint = map.getStartPoint(1);
        assertEquals(new Point(20, 20), startPoint);
    }

    @Test
    void testGetStartPoint_PlayerNo2() {
        Map map = new Map("test.xml");
        Point startPoint = map.getStartPoint(2);
        assertEquals(new Point(20, 20), startPoint);
    }

    @Test
    void testGetStartPoint_PlayerNo3() {
        Map map = new Map("test.xml");
        Point startPoint = map.getStartPoint(3);
        assertEquals(new Point(20, 20), startPoint);
    }

    @Test
    void testGetStartPoint_PlayerNo4() {
        Map map = new Map("test.xml");
        Point startPoint = map.getStartPoint(4);
        assertEquals(new Point(20, 20), startPoint);
    }

    @Test
    void testGetStartPoint_PlayerNo5() {
        Map map = new Map("test.xml");
        Point startPoint = map.getStartPoint(5);
        assertEquals(new Point(20, 20), startPoint);
    }

    @Test
    void testGetStartPoint_PlayerNo6() {
        Map map = new Map("test.xml");
        Point startPoint = map.getStartPoint(6);
        assertEquals(new Point(20, 20), startPoint);
    }

    @Test
    void testGetStartPoint_PlayerNo7() {
        Map map = new Map("test.xml");
        Point startPoint = map.getStartPoint(7);
        assertEquals(new Point(20, 20), startPoint);
    }

    @Test
    void testGetStartPoint_PlayerNo8() {
        Map map = new Map("test.xml");
        Point startPoint = map.getStartPoint(8);
        assertEquals(new Point(20, 20), startPoint);
    }

    @Test
    void testGetStartPoint_PlayerNo9() {
        Map map = new Map("test.xml");
        Point startPoint = map.getStartPoint(9);
        assertEquals(new Point(20, 20), startPoint);
    }

    @Test
    void testGetStartPoint_PlayerNo10() {
        Map map = new Map("test.xml");
        Point startPoint = map.getStartPoint(10);
        assertEquals(new Point(20, 20), startPoint);
    }
}
