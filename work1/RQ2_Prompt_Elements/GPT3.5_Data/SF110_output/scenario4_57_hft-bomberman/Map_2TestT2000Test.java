// Test case for Map.getStartPoint(int)
class Map_2Test {

    // Test case 1: get start point for player 1
    @Test
    void testGetStartPoint_Player1() {
        Map map = new Map("test.xml");
        Point[] startPoints = {new Point(1, 1), new Point(2, 2)};
        map.setStartPoints(startPoints);
        Point expected = new Point(1, 1);
        Point actual = map.getStartPoint(1);
        assertEquals(expected, actual, "Start point for player 1 should be (1,1)");
    }

    // Test case 2: get start point for player 2
    @Test
    void testGetStartPoint_Player2() {
        Map map = new Map("test.xml");
        Point[] startPoints = {new Point(1, 1), new Point(2, 2)};
        map.setStartPoints(startPoints);
        Point expected = new Point(2, 2);
        Point actual = map.getStartPoint(2);
        assertEquals(expected, actual, "Start point for player 2 should be (2,2)");
    }

    // Test case 3: get start point for player 3 when only two start points are set
    @Test
    void testGetStartPoint_Player3_WithTwoStartPoints() {
        Map map = new Map("test.xml");
        Point[] startPoints = {new Point(1, 1), new Point(2, 2)};
        map.setStartPoints(startPoints);
        assertThrows(NoSuchElementException.class, () -> map.getStartPoint(3), "Should throw NoSuchElementException");
    }

    // Test case 4: get start point for player 0
    @Test
    void testGetStartPoint_Player0() {
        Map map = new Map("test.xml");
        Point[] startPoints = {new Point(1, 1), new Point(2, 2)};
        map.setStartPoints(startPoints);
        assertThrows(NoSuchElementException.class, () -> map.getStartPoint(0), "Should throw NoSuchElementException");
    }

    // Test case 5: get start point for player -1
    @Test
    void testGetStartPoint_PlayerMinus1() {
        Map map = new Map("test.xml");
        Point[] startPoints = {new Point(1, 1), new Point(2, 2)};
        map.setStartPoints(startPoints);
        assertThrows(NoSuchElementException.class, () -> map.getStartPoint(-1), "Should throw NoSuchElementException");
    }

    // Test case 6: get start point for player 4 when only two start points are set
    @Test
    void testGetStartPoint_Player4_WithTwoStartPoints() {
        Map map = new Map("test.xml");
        Point[] startPoints = {new Point(1, 1), new Point(2, 2)};
        map.setStartPoints(startPoints);
        assertThrows(NoSuchElementException.class, () -> map.getStartPoint(4), "Should throw NoSuchElementException");
    }

    // Test case 7: get start point for player 1 when start points are not set
    @Test
    void testGetStartPoint_Player1_WithoutStartPoints() {
        Map map = new Map("test.xml");
        assertThrows(NoSuchElementException.class, () -> map.getStartPoint(1), "Should throw NoSuchElementException");
    }

    // Test case 8: get start point for player 1 when start points are null
    @Test
    void testGetStartPoint_Player1_WithNullStartPoints() {
        Map map = new Map("test.xml");
        map.setStartPoints(null);
        assertThrows(NoSuchElementException.class, () -> map.getStartPoint(1), "Should throw NoSuchElementException");
    }

    // Test case 9: get start point for player 1 when start points array is empty
    @Test
    void testGetStartPoint_Player1_WithEmptyStartPoints() {
        Map map = new Map("test.xml");
        Point[] startPoints = {};
        map.setStartPoints(startPoints);
        assertThrows(NoSuchElementException.class, () -> map.getStartPoint(1), "Should throw NoSuchElementException");
    }

    // Test case 10: get start point for player 1 when start point is null
    @Test
    void testGetStartPoint_Player1_WithNullStartPoint() {
        Map map = new Map("test.xml");
        Point[] startPoints = {null, new Point(2, 2)};
        map.setStartPoints(startPoints);
        assertThrows(NullPointerException.class, () -> map.getStartPoint(1), "Should throw NullPointerException");
    }
}