// Test case 1: Test with positive quantum and bounds.
@Test
public void testCalcTickMarks_PositiveQuantumAndBounds() {
    LinearAxisScale scale = new LinearAxisScale();
    TickMarkData data = scale.calcTickMarks(1.0, 0.0, 10.0, 1.0, 0.0);
    assertNotNull(data);
    assertEquals(9, data.mark.length);
    assertEquals(9, data.lmark.length);
    assertEquals(9, data.markValue.length);
    assertEquals(0, data.mark[0]);
    assertEquals(100, data.mark[8]);
    assertEquals(PlotAxis.kTick, data.lmark[0]);
    assertEquals(PlotAxis.kTick, data.lmark[1]);
    assertEquals(PlotAxis.kTick, data.lmark[2]);
    assertEquals(PlotAxis.kTick, data.lmark[3]);
    assertEquals(PlotAxis.kTick, data.lmark[4]);
    assertEquals(PlotAxis.kTick, data.lmark[5]);
    assertEquals(PlotAxis.kTick, data.lmark[6]);
    assertEquals(PlotAxis.kTick, data.lmark[7]);
    assertEquals(3 * PlotAxis.kTick, data.lmark[8]);
    assertEquals(0.0f, data.markValue[0]);
    assertEquals(8.0f, data.markValue[8]);
}

// Test case 2: Test with negative quantum and bounds.
@Test
public void testCalcTickMarks_NegativeQuantumAndBounds() {
    LinearAxisScale scale = new LinearAxisScale();
    TickMarkData data = scale.calcTickMarks(-1.0, 0.0, 10.0, 1.0, 0.0);
    assertNotNull(data);
    assertEquals(9, data.mark.length);
    assertEquals(9, data.lmark.length);
    assertEquals(9, data.markValue.length);
    assertEquals(100, data.mark[0]);
    assertEquals(0, data.mark[8]);
    assertEquals(PlotAxis.kTick, data.lmark[0]);
    assertEquals(PlotAxis.kTick, data.lmark[1]);
    assertEquals(PlotAxis.kTick, data.lmark[2]);
    assertEquals(PlotAxis.kTick, data.lmark[3]);
    assertEquals(PlotAxis.kTick, data.lmark[4]);
    assertEquals(PlotAxis.kTick, data.lmark[5]);
    assertEquals(PlotAxis.kTick, data.lmark[6]);
    assertEquals(PlotAxis.kTick, data.lmark[7]);
    assertEquals(3 * PlotAxis.kTick, data.lmark[8]);
    assertEquals(10.0f, data.markValue[0]);
    assertEquals(2.0f, data.markValue[8]);
}

// Test case 3: Test with zero quantum and positive bounds.
@Test
public void testCalcTickMarks_ZeroQuantumAndPositiveBounds() {
    LinearAxisScale scale = new LinearAxisScale();
    TickMarkData data = scale.calcTickMarks(0.0, 0.0, 10.0, 1.0, 0.0);
    assertNotNull(data);
    assertEquals(0, data.mark.length);
    assertEquals(0, data.lmark.length);
    assertEquals(0, data.markValue.length);
}

// Test case 4: Test with zero quantum and negative bounds.
@Test
public void testCalcTickMarks_ZeroQuantumAndNegativeBounds() {
    LinearAxisScale scale = new LinearAxisScale();
    TickMarkData data = scale.calcTickMarks(0.0, -10.0, 0.0, 1.0, 0.0);
    assertNotNull(data);
    assertEquals(0, data.mark.length);
    assertEquals(0, data.lmark.length);
    assertEquals(0, data.markValue.length);
}

// Test case 5: Test with quantum larger than bounds.
@Test
public void testCalcTickMarks_QuantumLargerThanBounds() {
    LinearAxisScale scale = new LinearAxisScale();
    TickMarkData data = scale.calcTickMarks(20.0, 0.0, 10.0, 1.0, 0.0);
    assertNotNull(data);
    assertEquals(0, data.mark.length);
    assertEquals(0, data.lmark.length);
    assertEquals(0, data.markValue.length);
}

// Test case 6: Test with quantum equal to bounds.
@Test
public void testCalcTickMarks_QuantumEqualToBounds() {
    LinearAxisScale scale = new LinearAxisScale();
    TickMarkData data = scale.calcTickMarks(10.0, 0.0, 10.0, 1.0, 0.0);
    assertNotNull(data);
    assertEquals(1, data.mark.length);
    assertEquals(1, data.lmark.length);
    assertEquals(1, data.markValue.length);
    assertEquals(0, data.mark[0]);
    assertEquals(3 * PlotAxis.kTick, data.lmark[0]);
    assertEquals(0.0f, data.markValue[0]);
}

// Test case 7: Test with quantum smaller than bounds.
@Test
public void testCalcTickMarks_QuantumSmallerThanBounds() {
    LinearAxisScale scale = new LinearAxisScale();
    TickMarkData data = scale.calcTickMarks(0.5, 0.0, 10.0, 1.0, 0.0);
    assertNotNull(data);
    assertEquals(19, data.mark.length);
    assertEquals(19, data.lmark.length);
    assertEquals(19, data.markValue.length);
    assertEquals(0, data.mark[0]);
    assertEquals(100, data.mark[18]);
    assertEquals(PlotAxis.kTick, data.lmark[0]);
    assertEquals(PlotAxis.kTick, data.lmark[1]);
    assertEquals(PlotAxis.kTick, data.lmark[2]);
    assertEquals(PlotAxis.kTick, data.lmark[3]);
    assertEquals(PlotAxis.kTick, data.lmark[4]);
    assertEquals(PlotAxis.kTick, data.lmark[5]);
    assertEquals(PlotAxis.kTick, data.lmark[6]);
    assertEquals(PlotAxis.kTick, data.lmark[7]);
    assertEquals(PlotAxis.kTick, data.lmark[8]);
    assertEquals(PlotAxis.kTick, data.lmark[9]);
    assertEquals(PlotAxis.kTick, data.lmark[10]);
    assertEquals(PlotAxis.kTick, data.lmark[11]);
    assertEquals(PlotAxis.kTick, data.lmark[12]);
    assertEquals(PlotAxis.kTick, data.lmark[13]);
    assertEquals(PlotAxis.kTick, data.lmark[14]);
    assertEquals(PlotAxis.kTick, data.lmark[15]);
    assertEquals(PlotAxis.kTick, data.lmark[16]);
    assertEquals(PlotAxis.kTick, data.lmark[17]);
    assertEquals(3 * PlotAxis.kTick, data.lmark[18]);
    assertEquals(0.0f, data.markValue[0]);
    assertEquals(9.5f, data.markValue[9]);
    assertEquals(10.0f, data.markValue[18]);
}

// Test case 8: Test with quantum equal to negative bounds.
@Test
public void testCalcTickMarks_QuantumEqualToNegativeBounds() {
    LinearAxisScale scale = new LinearAxisScale();
    TickMarkData data = scale.calcTickMarks(-10.0, -10.0, 0.0, 1.0, 0.0);
    assertNotNull(data);
    assertEquals(1, data.mark.length);
    assertEquals(1, data.lmark.length);
    assertEquals(1, data.markValue.length);
    assertEquals(100, data.mark[0]);
    assertEquals(3 * PlotAxis.kTick, data.lmark[0]);
    assertEquals(0.0f, data.markValue[0]);
}

// Test case 9: Test with quantum smaller than negative bounds.
@Test
public void testCalcTickMarks_QuantumSmallerThanNegativeBounds() {
    LinearAxisScale scale = new LinearAxisScale();
    TickMarkData data = scale.calcTickMarks(-20.0, -10.0, 0.0, 1.0, 0.0);
    assertNotNull(data);
    assertEquals(0, data.mark.length);
    assertEquals(0, data.lmark.length);
    assertEquals(0, data.markValue.length);
}

// Test case 10: Test with quantum larger than negative bounds.
@Test
public void testCalcTickMarks_QuantumLargerThanNegativeBounds() {
    LinearAxisScale scale = new LinearAxisScale();
    TickMarkData data = scale.calcTickMarks(-5.0, -10.0, 0.0, 1.0, 0.0);
    assertNotNull(data);
    assertEquals(2, data.mark.length);
    assertEquals(2, data.lmark.length);
    assertEquals(2, data.markValue.length);
    assertEquals(0, data.mark[0]);
    assertEquals(100, data.mark[1]);
    assertEquals(3 * PlotAxis.kTick, data.lmark[0]);
    assertEquals(3 * PlotAxis.kTick, data.lmark[1]);
    assertEquals(-10.0f, data.markValue[0]);
    assertEquals(0.0f, data.markValue[1]);
}
}