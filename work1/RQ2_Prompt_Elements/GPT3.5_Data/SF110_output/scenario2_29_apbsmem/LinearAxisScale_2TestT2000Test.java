// LinearAxisScale_2Test.java
package jahuwaldt.plot;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link LinearAxisScale}.
 * It contains ten unit test cases for the {@link LinearAxisScale#findGoodLimits(double, double)} method.
 */
class LinearAxisScale_2Test {

    @Test
    void testFindGoodLimits1() {
        LinearAxisScale las = new LinearAxisScale();
        AxisLimitData ald = las.findGoodLimits(0, 0);
        assertEquals(-1, ald.lb);
        assertEquals(1, ald.ub);
        assertEquals(1, ald.quantum);
    }

    @Test
    void testFindGoodLimits2() {
        LinearAxisScale las = new LinearAxisScale();
        AxisLimitData ald = las.findGoodLimits(-10, 10);
        assertEquals(-10, ald.lb);
        assertEquals(10, ald.ub);
        assertEquals(5, ald.quantum);
    }

    @Test
    void testFindGoodLimits3() {
        LinearAxisScale las = new LinearAxisScale();
        AxisLimitData ald = las.findGoodLimits(-0.5, 0.5);
        assertEquals(-1, ald.lb);
        assertEquals(1, ald.ub);
        assertEquals(0.5, ald.quantum);
    }

    @Test
    void testFindGoodLimits4() {
        LinearAxisScale las = new LinearAxisScale();
        AxisLimitData ald = las.findGoodLimits(-0.1, 0.1);
        assertEquals(-0.2, ald.lb);
        assertEquals(0.2, ald.ub);
        assertEquals(0.1, ald.quantum);
    }

    @Test
    void testFindGoodLimits5() {
        LinearAxisScale las = new LinearAxisScale();
        AxisLimitData ald = las.findGoodLimits(-0.05, 0.05);
        assertEquals(-0.1, ald.lb);
        assertEquals(0.1, ald.ub);
        assertEquals(0.05, ald.quantum);
    }

    @Test
    void testFindGoodLimits6() {
        LinearAxisScale las = new LinearAxisScale();
        AxisLimitData ald = las.findGoodLimits(-0.01, 0.01);
        assertEquals(-0.02, ald.lb);
        assertEquals(0.02, ald.ub);
        assertEquals(0.01, ald.quantum);
    }

    @Test
    void testFindGoodLimits7() {
        LinearAxisScale las = new LinearAxisScale();
        AxisLimitData ald = las.findGoodLimits(-0.001, 0.001);
        assertEquals(-0.002, ald.lb);
        assertEquals(0.002, ald.ub);
        assertEquals(0.001, ald.quantum);
    }

    @Test
    void testFindGoodLimits8() {
        LinearAxisScale las = new LinearAxisScale();
        AxisLimitData ald = las.findGoodLimits(-0.0001, 0.0001);
        assertEquals(-0.0002, ald.lb);
        assertEquals(0.0002, ald.ub);
        assertEquals(0.0001, ald.quantum);
    }

    @Test
    void testFindGoodLimits9() {
        LinearAxisScale las = new LinearAxisScale();
        AxisLimitData ald = las.findGoodLimits(-0.00001, 0.00001);
        assertEquals(-0.00002, ald.lb);
        assertEquals(0.00002, ald.ub);
        assertEquals(0.00001, ald.quantum);
    }

    @Test
    void testFindGoodLimits10() {
        LinearAxisScale las = new LinearAxisScale();
        AxisLimitData ald = las.findGoodLimits(-0.000001, 0.000001);
        assertEquals(-0.000002, ald.lb);
        assertEquals(0.000002, ald.ub);
        assertEquals(0.000001, ald.quantum);
    }
}