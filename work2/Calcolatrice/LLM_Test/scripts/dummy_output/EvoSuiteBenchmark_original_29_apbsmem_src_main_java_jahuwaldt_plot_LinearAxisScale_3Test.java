package jahuwaldt.plot;
java
class LinearAxisScale_3Test {

    @Test
    void testFindGoodLimits_case1() {
        LinearAxisScale axisScale = new LinearAxisScale();
        AxisLimitData result = axisScale.findGoodLimits(0.0, 10.0);
        assertEquals(0.0, result.lb);
        assertEquals(10.0, result.ub);
        assertEquals(2.0, result.quantum);
    }

    @Test
    void testFindGoodLimits_case2() {
        LinearAxisScale axisScale = new LinearAxisScale();
        AxisLimitData result = axisScale.findGoodLimits(-5.0, 5.0);
        assertEquals(-10.0, result.lb);
        assertEquals(10.0, result.ub);
        assertEquals(2.0, result.quantum);
    }

    @Test
    void testFindGoodLimits_case3() {
        LinearAxisScale axisScale = new LinearAxisScale();
        AxisLimitData result = axisScale.findGoodLimits(-3.0, 3.0);
        assertEquals(-5.0, result.lb);
        assertEquals(5.0, result.ub);
        assertEquals(1.0, result.quantum);
    }

    @Test
    void testFindGoodLimits_case4() {
        LinearAxisScale axisScale = new LinearAxisScale();
        AxisLimitData result = axisScale.findGoodLimits(-1.0, 1.0);
        assertEquals(-2.0, result.lb);
        assertEquals(2.0, result.ub);
        assertEquals(0.5, result.quantum);
    }

    @Test
    void testFindGoodLimits_case5() {
        LinearAxisScale axisScale = new LinearAxisScale();
        AxisLimitData result = axisScale.findGoodLimits(0.0, 0.0);
        assertEquals(-1.0, result.lb);
        assertEquals(1.0, result.ub);
        assertEquals(0.5, result.quantum);
    }

    @Test
    void testFindGoodLimits_case6() {
        LinearAxisScale axisScale = new LinearAxisScale();
        AxisLimitData result = axisScale.findGoodLimits(-10.0, -5.0);
        assertEquals(-15.0, result.lb);
        assertEquals(-5.0, result.ub);
        assertEquals(2.0, result.quantum);
    }

    @Test
    void testFindGoodLimits_case7() {
        LinearAxisScale axisScale = new LinearAxisScale();
        AxisLimitData result = axisScale.findGoodLimits(100.0, 200.0);
        assertEquals(100.0, result.lb);
        assertEquals(200.0, result.ub);
        assertEquals(20.0, result.quantum);
    }

    @Test
    void testFindGoodLimits_case8() {
        LinearAxisScale axisScale = new LinearAxisScale();
        AxisLimitData result = axisScale.findGoodLimits(-100.0, -50.0);
        assertEquals(-100.0, result.lb);
        assertEquals(-50.0, result.ub);
        assertEquals(20.0, result.quantum);
    }

    @Test
    void testFindGoodLimits_case9() {
        LinearAxisScale axisScale = new LinearAxisScale();
        AxisLimitData result = axisScale.findGoodLimits(-0.5, 0.5);
        assertEquals(-1.0, result.lb);
        assertEquals(1.0, result.ub);
        assertEquals(0.5, result.quantum);
    }

    @Test
    void testFindGoodLimits_case10() {
        LinearAxisScale axisScale = new LinearAxisScale();
        AxisLimitData result = axisScale.findGoodLimits(-2.5, 2.5);
        assertEquals(-5.0, result.lb);
        assertEquals(5.0, result.ub);
        assertEquals(1.0, result.quantum);
    }
}
