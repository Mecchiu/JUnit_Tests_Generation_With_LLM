// LinearAxisScale_4Test.java
package jahuwaldt.plot;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LinearAxisScale}.
* It contains ten unit test cases for the {@link LinearAxisScale#calcTickMarks(double, double, double, double, double)} method.
*/
class LinearAxisScale_4Test {
		java
    @Test
    void testCalcTickMarks_PositiveQuantum() {
        LinearAxisScale axisScale = new LinearAxisScale();
        double quantum = 0.5;
        double aLB = 0.0;
        double aUB = 5.0;
        double xA = 1.0;
        double xB = 0.0;
        TickMarkData tickMarkData = axisScale.calcTickMarks(quantum, aLB, aUB, xA, xB);
        assertNotNull(tickMarkData);
        assertEquals(11, tickMarkData.mark.length);
        assertEquals(11, tickMarkData.lmark.length);
        assertEquals(11, tickMarkData.markValue.length);
    }

    @Test
    void testCalcTickMarks_NegativeQuantum() {
        LinearAxisScale axisScale = new LinearAxisScale();
        double quantum = -0.5;
        double aLB = 0.0;
        double aUB = 5.0;
        double xA = 1.0;
        double xB = 0.0;
        TickMarkData tickMarkData = axisScale.calcTickMarks(quantum, aLB, aUB, xA, xB);
        assertNotNull(tickMarkData);
        assertEquals(11, tickMarkData.mark.length);
        assertEquals(11, tickMarkData.lmark.length);
        assertEquals(11, tickMarkData.markValue.length);
    }

    @Test
    void testCalcTickMarks_ZeroQuantum() {
        LinearAxisScale axisScale = new LinearAxisScale();
        double quantum = 0.0;
        double aLB = 0.0;
        double aUB = 5.0;
        double xA = 1.0;
        double xB = 0.0;
        TickMarkData tickMarkData = axisScale.calcTickMarks(quantum, aLB, aUB, xA, xB);
        assertNotNull(tickMarkData);
        assertEquals(0, tickMarkData.mark.length);
        assertEquals(0, tickMarkData.lmark.length);
        assertEquals(0, tickMarkData.markValue.length);
    }

    @Test
    void testCalcTickMarks_LargeRange() {
        LinearAxisScale axisScale = new LinearAxisScale();
        double quantum = 1.0;
        double aLB = -1000.0;
        double aUB = 1000.0;
        double xA = 1.0;
        double xB = 0.0;
        TickMarkData tickMarkData = axisScale.calcTickMarks(quantum, aLB, aUB, xA, xB);
        assertNotNull(tickMarkData);
        assertEquals(401, tickMarkData.mark.length);
        assertEquals(401, tickMarkData.lmark.length);
        assertEquals(401, tickMarkData.markValue.length);
    }

    @Test
    void testCalcTickMarks_SmallRange() {
        LinearAxisScale axisScale = new LinearAxisScale();
        double quantum = 0.1;
        double aLB = 0.5;
        double aUB = 1.5;
        double xA = 1.0;
        double xB = 0.0;
        TickMarkData tickMarkData = axisScale.calcTickMarks(quantum, aLB, aUB, xA, xB);
        assertNotNull(tickMarkData);
        assertEquals(11, tickMarkData.mark.length);
        assertEquals(11, tickMarkData.lmark.length);
        assertEquals(11, tickMarkData.markValue.length);
    }

    @Test
    void testCalcTickMarks_NegativeRange() {
        LinearAxisScale axisScale = new LinearAxisScale();
        double quantum = 0.2;
        double aLB = -2.0;
        double aUB = -1.0;
        double xA = 1.0;
        double xB = 0.0;
        TickMarkData tickMarkData = axisScale.calcTickMarks(quantum, aLB, aUB, xA, xB);
        assertNotNull(tickMarkData);
        assertEquals(6, tickMarkData.mark.length);
        assertEquals(6, tickMarkData.lmark.length);
        assertEquals(6, tickMarkData.markValue.length);
    }

    @Test
    void testCalcTickMarks_QuantumGreaterThanRange() {
        LinearAxisScale axisScale = new LinearAxisScale();
        double quantum = 10.0;
        double aLB = 1.0;
        double aUB = 2.0;
        double xA = 1.0;
        double xB = 0.0;
        TickMarkData tickMarkData = axisScale.calcTickMarks(quantum, aLB, aUB, xA, xB);
        assertNotNull(tickMarkData);
        assertEquals(0, tickMarkData.mark.length);
        assertEquals(0, tickMarkData.lmark.length);
        assertEquals(0, tickMarkData.markValue.length);
    }

    @Test
    void testCalcTickMarks_QuantumLessThanRange() {
        LinearAxisScale axisScale = new LinearAxisScale();
        double quantum = 0.1;
        double aLB = 1.0;
        double aUB = 2.0;
        double xA = 1.0;
        double xB = 0.0;
        TickMarkData tickMarkData = axisScale.calcTickMarks(quantum, aLB, aUB, xA, xB);
        assertNotNull(tickMarkData);
        assertEquals(11, tickMarkData.mark.length);
        assertEquals(11, tickMarkData.lmark.length);
        assertEquals(11, tickMarkData.markValue.length);
    }

    @Test
    void testCalcTickMarks_QuantumNegativeRange() {
        LinearAxisScale axisScale = new LinearAxisScale();
        double quantum = -0.1;
        double aLB = -2.0;
        double aUB = -1.0;
        double xA = 1.0;
        double xB = 0.0;
        TickMarkData tickMarkData = axisScale.calcTickMarks(quantum, aLB, aUB, xA, xB);
        assertNotNull(tickMarkData);
        assertEquals(6, tickMarkData.mark.length);
        assertEquals(6, tickMarkData.lmark.length);
        assertEquals(6, tickMarkData.markValue.length);
    }
}