import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;

class RescaleToUnitTest {

    @Test
    void testRescaleToUnit() {
        List<Double> input = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
        List<Double> expectedOutput = Arrays.asList(0.0, 0.25, 0.5, 0.75, 1.0);
        List<Double> actualOutput = RescaleToUnit.rescaleToUnit(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testRescaleToUnitWithNegativeNumbers() {
        List<Double> input = Arrays.asList(-5.0, -4.0, -3.0, -2.0, -1.0);
        List<Double> expectedOutput = Arrays.asList(0.0, 0.25, 0.5, 0.75, 1.0);
        List<Double> actualOutput = RescaleToUnit.rescaleToUnit(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testRescaleToUnitWithRepeatedNumbers() {
        List<Double> input = Arrays.asList(1.0, 1.0, 1.0, 1.0, 1.0);
        List<Double> expectedOutput = Arrays.asList(0.0, 0.0, 0.0, 0.0, 0.0);
        List<Double> actualOutput = RescaleToUnit.rescaleToUnit(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testRescaleToUnitWithOneNumber() {
        List<Double> input = Arrays.asList(1.0);
        List<Double> expectedOutput = Arrays.asList(0.0);
        List<Double> actualOutput = RescaleToUnit.rescaleToUnit(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testRescaleToUnitWithEmptyList() {
        List<Double> input = new ArrayList<Double>();
        List<Double> expectedOutput = new ArrayList<Double>();
        List<Double> actualOutput = RescaleToUnit.rescaleToUnit(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testRescaleToUnitWithNullList() {
        List<Double> input = null;
        List<Double> expectedOutput = null;
        List<Double> actualOutput = RescaleToUnit.rescaleToUnit(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testRescaleToUnitWithMaxValue() {
        List<Double> input = Arrays.asList(Double.MAX_VALUE, Double.MAX_VALUE, Double.MAX_VALUE);
        List<Double> expectedOutput = Arrays.asList(0.0, 0.0, 0.0);
        List<Double> actualOutput = RescaleToUnit.rescaleToUnit(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testRescaleToUnitWithMinValue() {
        List<Double> input = Arrays.asList(Double.MIN_VALUE, Double.MIN_VALUE, Double.MIN_VALUE);
        List<Double> expectedOutput = Arrays.asList(0.0, 0.0, 0.0);
        List<Double> actualOutput = RescaleToUnit.rescaleToUnit(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testRescaleToUnitWithMixedNumbers() {
        List<Double> input = Arrays.asList(-5.0, 0.0, 5.0);
        List<Double> expectedOutput = Arrays.asList(0.0, 0.5, 1.0);
        List<Double> actualOutput = RescaleToUnit.rescaleToUnit(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testRescaleToUnitWithNaN() {
        List<Double> input = Arrays.asList(1.0, Double.NaN, 3.0);
        List<Double> expectedOutput = Arrays.asList(0.0, Double.NaN, 1.0);
        List<Double> actualOutput = RescaleToUnit.rescaleToUnit(input);
        assertEquals(expectedOutput, actualOutput);
    }
}