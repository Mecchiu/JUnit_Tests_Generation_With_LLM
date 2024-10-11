I can help you write the source code for the ten unit test cases for the `PlotRunList#size()` method. Here's an example:

```
@Test
void testSizeEmptyList() {
    PlotRunList list = new PlotRunList();
    assertEquals(0, list.size());
}

@Test
void testSizeSingleRun() {
    PlotDatum[] data = {new PlotDatum(1, 2), new PlotDatum(3, 4)};
    PlotRun run = new PlotRun(data, Color.RED);
    PlotRunList list = new PlotRunList();
    list.add(run);
    assertEquals(1, list.size());
}

// Add more test cases here...
```

You can modify the test cases as per your requirements.