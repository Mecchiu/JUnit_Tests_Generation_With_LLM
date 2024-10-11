// Here is an example implementation of the PlotRun_1Test class with ten unit test cases for the get() method.

class PlotRun_1Test {

    @Test
    void testGet() {
        // Create a new PlotRun object with three PlotDatum objects.
        PlotRun run = new PlotRun();
        run.add(new PlotDatum(1, 2));
        run.add(new PlotDatum(3, 4));
        run.add(new PlotDatum(5, 6));

        // Test getting the first PlotDatum object.
        assertEquals(new PlotDatum(1, 2), run.get(0));

        // Test getting the second PlotDatum object.
        assertEquals(new PlotDatum(3, 4), run.get(1));

        // Test getting the third PlotDatum object.
        assertEquals(new PlotDatum(5, 6), run.get(2));

        // Test getting an index out of bounds.
        assertThrows(IndexOutOfBoundsException.class, () -> run.get(3));

        // Test getting a negative index.
        assertThrows(IndexOutOfBoundsException.class, () -> run.get(-1));

        // Test getting from an empty PlotRun object.
        PlotRun emptyRun = new PlotRun();
        assertThrows(IndexOutOfBoundsException.class, () -> emptyRun.get(0));

        // Test getting from a PlotRun object with one PlotDatum object.
        PlotRun oneDatumRun = new PlotRun();
        oneDatumRun.add(new PlotDatum(1, 2));
        assertEquals(new PlotDatum(1, 2), oneDatumRun.get(0));

        // Test getting from a PlotRun object with two PlotDatum objects.
        PlotRun twoDatumRun = new PlotRun();
        twoDatumRun.add(new PlotDatum(1, 2));
        twoDatumRun.add(new PlotDatum(3, 4));
        assertEquals(new PlotDatum(3, 4), twoDatumRun.get(1));

        // Test getting from a PlotRun object with many PlotDatum objects.
        PlotRun manyDatumRun = new PlotRun();
        for (int i = 0; i < 100; i++) {
            manyDatumRun.add(new PlotDatum(i, i+1));
        }
        assertEquals(new PlotDatum(50, 51), manyDatumRun.get(50));
    }
}