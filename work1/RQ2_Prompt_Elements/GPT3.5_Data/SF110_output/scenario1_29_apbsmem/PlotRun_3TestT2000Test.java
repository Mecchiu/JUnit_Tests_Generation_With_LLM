// Test case 1: Test if iterator returns correct number of elements in the run.
@Test
public void testIteratorSize() {
    PlotDatum[] testData = {new PlotDatum(0,0), new PlotDatum(1,1), new PlotDatum(2,2)};
    PlotRun testRun = new PlotRun(Arrays.asList(testData));
    Iterator<PlotDatum> it = testRun.iterator();
    int count = 0;
    while (it.hasNext()) {
        it.next();
        count++;
    }
    assertEquals(3, count);
}

// Test case 2: Test if iterator returns elements in the correct order.
@Test
public void testIteratorOrder() {
    PlotDatum[] testData = {new PlotDatum(0,0), new PlotDatum(1,1), new PlotDatum(2,2)};
    PlotRun testRun = new PlotRun(Arrays.asList(testData));
    Iterator<PlotDatum> it = testRun.iterator();
    assertEquals(new PlotDatum(0,0), it.next());
    assertEquals(new PlotDatum(1,1), it.next());
    assertEquals(new PlotDatum(2,2), it.next());
}

// Test case 3: Test if iterator returns correct elements when run is empty.
@Test
public void testIteratorEmpty() {
    PlotRun testRun = new PlotRun(new ArrayList<PlotDatum>());
    Iterator<PlotDatum> it = testRun.iterator();
    assertFalse(it.hasNext());
}

// Test case 4: Test if iterator returns correct elements when run has only one element.
@Test
public void testIteratorSingleElement() {
    PlotDatum[] testData = {new PlotDatum(0,0)};
    PlotRun testRun = new PlotRun(Arrays.asList(testData));
    Iterator<PlotDatum> it = testRun.iterator();
    assertTrue(it.hasNext());
    assertEquals(new PlotDatum(0,0), it.next());
    assertFalse(it.hasNext());
}

// Test case 5: Test if iterator returns correct elements when run has multiple elements with the same x-value.
@Test
public void testIteratorMultipleSameX() {
    PlotDatum[] testData = {new PlotDatum(0,0), new PlotDatum(0,1), new PlotDatum(0,2)};
    PlotRun testRun = new PlotRun(Arrays.asList(testData));
    Iterator<PlotDatum> it = testRun.iterator();
    assertEquals(new PlotDatum(0,0), it.next());
    assertEquals(new PlotDatum(0,1), it.next());
    assertEquals(new PlotDatum(0,2), it.next());
}

// Test case 6: Test if iterator returns correct elements when run has multiple elements with the same y-value.
@Test
public void testIteratorMultipleSameY() {
    PlotDatum[] testData = {new PlotDatum(0,0), new PlotDatum(1,0), new PlotDatum(2,0)};
    PlotRun testRun = new PlotRun(Arrays.asList(testData));
    Iterator<PlotDatum> it = testRun.iterator();
    assertEquals(new PlotDatum(0,0), it.next());
    assertEquals(new PlotDatum(1,0), it.next());
    assertEquals(new PlotDatum(2,0), it.next());
}

// Test case 7: Test if iterator returns correct elements when run has elements with negative values.
@Test
public void testIteratorNegativeValues() {
    PlotDatum[] testData = {new PlotDatum(-1,-1), new PlotDatum(0,0), new PlotDatum(1,1)};
    PlotRun testRun = new PlotRun(Arrays.asList(testData));
    Iterator<PlotDatum> it = testRun.iterator();
    assertEquals(new PlotDatum(-1,-1), it.next());
    assertEquals(new PlotDatum(0,0), it.next());
    assertEquals(new PlotDatum(1,1), it.next());
}

// Test case 8: Test if iterator returns correct elements when run has elements with large values.
@Test
public void testIteratorLargeValues() {
    PlotDatum[] testData = {new PlotDatum(1000000,1000000), new PlotDatum(2000000,2000000), new PlotDatum(3000000,3000000)};
    PlotRun testRun = new PlotRun(Arrays.asList(testData));
    Iterator<PlotDatum> it = testRun.iterator();
    assertEquals(new PlotDatum(1000000,1000000), it.next());
    assertEquals(new PlotDatum(2000000,2000000), it.next());
    assertEquals(new PlotDatum(3000000,3000000), it.next());
}

// Test case 9: Test if iterator throws NoSuchElementException when there are no more elements.
@Test
public void testIteratorNoSuchElement() {
    PlotDatum[] testData = {new PlotDatum(0,0)};
    PlotRun testRun = new PlotRun(Arrays.asList(testData));
    Iterator<PlotDatum> it = testRun.iterator();
    it.next();
    assertThrows(NoSuchElementException.class, () -> it.next());
}

// Test case 10: Test if iterator is fail-fast.
@Test
public void testIteratorFailFast() {
    PlotDatum[] testData = {new PlotDatum(0,0), new PlotDatum(1,1), new PlotDatum(2,2)};
    PlotRun testRun = new PlotRun(Arrays.asList(testData));
    Iterator<PlotDatum> it = testRun.iterator();
    it.next();
    testRun.add(new PlotDatum(3,3));
    assertThrows(ConcurrentModificationException.class, () -> it.next());
}
}