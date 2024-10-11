// Test case 1: Test with positive quantum and positive bounds.
@Test
void testCalcTickMarks_PositiveQuantum_PositiveBounds() {
    LinearAxisScale scale = new LinearAxisScale();
    TickMarkData data = scale.calcTickMarks(0.5, 0, 10, 1, 100);
    assertNotNull(data);
    assertEquals(19, data.mark.length);
    assertEquals(19, data.lmark.length);
    assertEquals(19, data.markValue.length);
    assertEquals(100, data.mark[0]);
    assertEquals(200, data.mark[18]);
    assertEquals(0.5f, data.markValue[0]);
    assertEquals(9.5f, data.markValue[18]);
}

// Test case 2: Test with negative quantum and positive bounds.
@Test
void testCalcTickMarks_NegativeQuantum_PositiveBounds() {
    LinearAxisScale scale = new LinearAxisScale();
    TickMarkData data = scale.calcTickMarks(-1, 0, 10, 1, 100);
    assertNotNull(data);
    assertEquals(19, data.mark.length);
    assertEquals(19, data.lmark.length);
    assertEquals(19, data.markValue.length);
    assertEquals(100, data.mark[0]);
    assertEquals(200, data.mark[18]);
    assertEquals(9f, data.markValue[0]);
    assertEquals(0f, data.markValue[18]);
}

// Test case 3: Test with zero quantum and positive bounds.
@Test
void testCalcTickMarks_ZeroQuantum_PositiveBounds() {
    LinearAxisScale scale = new LinearAxisScale();
    assertThrows(ArithmeticException.class, () -> {
        scale.calcTickMarks(0, 0, 10, 1, 100);
    });
}

// Test case 4: Test with positive quantum and negative bounds.
@Test
void testCalcTickMarks_PositiveQuantum_NegativeBounds() {
    LinearAxisScale scale = new LinearAxisScale();
    TickMarkData data = scale.calcTickMarks(0.5, -10, 0, 1, 100);
    assertNotNull(data);
    assertEquals(19, data.mark.length);
    assertEquals(19, data.lmark.length);
    assertEquals(19, data.markValue.length);
    assertEquals(100, data.mark[0]);
    assertEquals(200, data.mark[18]);
    assertEquals(-9.5f, data.markValue[0]);
    assertEquals(-0.5f, data.markValue[18]);
}

// Test case 5: Test with negative quantum and negative bounds.
@Test
void testCalcTickMarks_NegativeQuantum_NegativeBounds() {
    LinearAxisScale scale = new LinearAxisScale();
    TickMarkData data = scale.calcTickMarks(-1, -10, 0, 1, 100);
    assertNotNull(data);
    assertEquals(19, data.mark.length);
    assertEquals(19, data.lmark.length);
    assertEquals(19, data.markValue.length);
    assertEquals(100, data.mark[0]);
    assertEquals(200, data.mark[18]);
    assertEquals(-0f, data.markValue[0]);
    assertEquals(-9f, data.markValue[18]);
}

// Test case 6: Test with zero quantum and negative bounds.
@Test
void testCalcTickMarks_ZeroQuantum_NegativeBounds() {
    LinearAxisScale scale = new LinearAxisScale();
    assertThrows(ArithmeticException.class, () -> {
        scale.calcTickMarks(0, -10, 0, 1, 100);
    });
}

// Test case 7: Test with positive quantum and zero bounds.
@Test
void testCalcTickMarks_PositiveQuantum_ZeroBounds() {
    LinearAxisScale scale = new LinearAxisScale();
    assertThrows(ArithmeticException.class, () -> {
        scale.calcTickMarks(0.5, 0, 0, 1, 100);
    });
}

// Test case 8: Test with negative quantum and zero bounds.
@Test
void testCalcTickMarks_NegativeQuantum_ZeroBounds() {
    LinearAxisScale scale = new LinearAxisScale();
    assertThrows(ArithmeticException.class, () -> {
        scale.calcTickMarks(-1, 0, 0, 1, 100);
    });
}

// Test case 9: Test with zero quantum and zero bounds.
@Test
void testCalcTickMarks_ZeroQuantum_ZeroBounds() {
    LinearAxisScale scale = new LinearAxisScale();
    assertThrows(ArithmeticException.class, () -> {
        scale.calcTickMarks(0, 0, 0, 1, 100);
    });
}

// Test case 10: Test with quantum larger than bounds.
@Test
void testCalcTickMarks_QuantumLargerThanBounds() {
    LinearAxisScale scale = new LinearAxisScale();
    assertThrows(ArithmeticException.class, () -> {
        scale.calcTickMarks(20, 0, 10, 1, 100);
    });
}
}