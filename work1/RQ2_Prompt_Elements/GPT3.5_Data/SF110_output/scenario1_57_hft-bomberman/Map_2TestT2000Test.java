// Here's an example of how you can write unit tests for the Map class:

@Test
void testGetStartPoint() {
    Map map = new Map();
    Point startPoint = map.getStartPoint(1);
    assertEquals(startPoint.x, Constants.TILE_BORDER + Constants.TILE_BORDER / 2);
    assertEquals(startPoint.y, Constants.TILE_BORDER + Constants.TILE_BORDER / 2);

    startPoint = map.getStartPoint(2);
    assertEquals(startPoint.x, Constants.TILE_BORDER * 2 + Constants.TILE_BORDER / 2);
    assertEquals(startPoint.y, Constants.TILE_BORDER * 2 + Constants.TILE_BORDER / 2);

    startPoint = map.getStartPoint(3);
    assertEquals(startPoint.x, Constants.TILE_BORDER * 3 + Constants.TILE_BORDER / 2);
    assertEquals(startPoint.y, Constants.TILE_BORDER * 3 + Constants.TILE_BORDER / 2);

    startPoint = map.getStartPoint(4);
    assertEquals(startPoint.x, Constants.TILE_BORDER * 4 + Constants.TILE_BORDER / 2);
    assertEquals(startPoint.y, Constants.TILE_BORDER * 4 + Constants.TILE_BORDER / 2);

    startPoint = map.getStartPoint(5);
    assertEquals(startPoint.x, Constants.TILE_BORDER + Constants.TILE_BORDER / 2);
    assertEquals(startPoint.y, Constants.TILE_BORDER * 5 + Constants.TILE_BORDER / 2);

    startPoint = map.getStartPoint(6);
    assertEquals(startPoint.x, Constants.TILE_BORDER * 2 + Constants.TILE_BORDER / 2);
    assertEquals(startPoint.y, Constants.TILE_BORDER * 6 + Constants.TILE_BORDER / 2);

    startPoint = map.getStartPoint(7);
    assertEquals(startPoint.x, Constants.TILE_BORDER * 3 + Constants.TILE_BORDER / 2);
    assertEquals(startPoint.y, Constants.TILE_BORDER * 7 + Constants.TILE_BORDER / 2);

    startPoint = map.getStartPoint(8);
    assertEquals(startPoint.x, Constants.TILE_BORDER * 4 + Constants.TILE_BORDER / 2);
    assertEquals(startPoint.y, Constants.TILE_BORDER * 8 + Constants.TILE_BORDER / 2);

    startPoint = map.getStartPoint(9);
    assertEquals(startPoint.x, Constants.TILE_BORDER + Constants.TILE_BORDER / 2);
    assertEquals(startPoint.y, Constants.TILE_BORDER * 9 + Constants.TILE_BORDER / 2);

    startPoint = map.getStartPoint(10);
    assertEquals(startPoint.x, Constants.TILE_BORDER * 2 + Constants.TILE_BORDER / 2);
    assertEquals(startPoint.y, Constants.TILE_BORDER * 10 + Constants.TILE_BORDER / 2);
}