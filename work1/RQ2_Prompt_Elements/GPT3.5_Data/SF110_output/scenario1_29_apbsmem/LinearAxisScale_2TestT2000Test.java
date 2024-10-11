// Test case 1: Test with aLB = 0 and aUB = 0.
@Test
public void testFindGoodLimits_case1() {
    LinearAxisScale las = new LinearAxisScale();
    AxisLimitData ald = las.findGoodLimits(0, 0);
    assertEquals(-1, ald.lb);
    assertEquals(1, ald.ub);
    assertEquals(1, ald.quantum);
}

// Test case 2: Test with aLB = 0 and aUB = 10.
@Test
public void testFindGoodLimits_case2() {
    LinearAxisScale las = new LinearAxisScale();
    AxisLimitData ald = las.findGoodLimits(0, 10);
    assertEquals(0, ald.lb);
    assertEquals(10, ald.ub);
    assertEquals(5, ald.quantum);
}

// Test case 3: Test with aLB = -10 and aUB = 0.
@Test
public void testFindGoodLimits_case3() {
    LinearAxisScale las = new LinearAxisScale();
    AxisLimitData ald = las.findGoodLimits(-10, 0);
    assertEquals(-10, ald.lb);
    assertEquals(0, ald.ub);
    assertEquals(5, ald.quantum);
}

// Test case 4: Test with aLB = -10 and aUB = 10.
@Test
public void testFindGoodLimits_case4() {
    LinearAxisScale las = new LinearAxisScale();
    AxisLimitData ald = las.findGoodLimits(-10, 10);
    assertEquals(-10, ald.lb);
    assertEquals(10, ald.ub);
    assertEquals(5, ald.quantum);
}

// Test case 5: Test with aLB = 0 and aUB = 1.
@Test
public void testFindGoodLimits_case5() {
    LinearAxisScale las = new LinearAxisScale();
    AxisLimitData ald = las.findGoodLimits(0, 1);
    assertEquals(0, ald.lb);
    assertEquals(1, ald.ub);
    assertEquals(0.5, ald.quantum);
}

// Test case 6: Test with aLB = -1 and aUB = 0.
@Test
public void testFindGoodLimits_case6() {
    LinearAxisScale las = new LinearAxisScale();
    AxisLimitData ald = las.findGoodLimits(-1, 0);
    assertEquals(-1, ald.lb);
    assertEquals(0, ald.ub);
    assertEquals(0.5, ald.quantum);
}

// Test case 7: Test with aLB = -1 and aUB = 1.
@Test
public void testFindGoodLimits_case7() {
    LinearAxisScale las = new LinearAxisScale();
    AxisLimitData ald = las.findGoodLimits(-1, 1);
    assertEquals(-1, ald.lb);
    assertEquals(1, ald.ub);
    assertEquals(0.5, ald.quantum);
}

// Test case 8: Test with aLB = -100 and aUB = 100.
@Test
public void testFindGoodLimits_case8() {
    LinearAxisScale las = new LinearAxisScale();
    AxisLimitData ald = las.findGoodLimits(-100, 100);
    assertEquals(-100, ald.lb);
    assertEquals(100, ald.ub);
    assertEquals(50, ald.quantum);
}

// Test case 9: Test with aLB = -1000 and aUB = 1000.
@Test
public void testFindGoodLimits_case9() {
    LinearAxisScale las = new LinearAxisScale();
    AxisLimitData ald = las.findGoodLimits(-1000, 1000);
    assertEquals(-1000, ald.lb);
    assertEquals(1000, ald.ub);
    assertEquals(500, ald.quantum);
}

// Test case 10: Test with aLB = -0.1 and aUB = 0.1.
@Test
public void testFindGoodLimits_case10() {
    LinearAxisScale las = new LinearAxisScale();
    AxisLimitData ald = las.findGoodLimits(-0.1, 0.1);
    assertEquals(-0.1, ald.lb);
    assertEquals(0.1, ald.ub);
    assertEquals(0.05, ald.quantum);
}
}