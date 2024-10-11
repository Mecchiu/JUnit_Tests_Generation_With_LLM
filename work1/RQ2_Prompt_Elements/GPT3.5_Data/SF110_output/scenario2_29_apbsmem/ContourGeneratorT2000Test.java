// Test class of ContourGenerator.
// It contains ten unit test cases for the done() method.

package jahuwaldt.plot;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ContourGeneratorTest {

    // Test case 1: Test done() method when cCalculated is false.
    @Test
    void testDoneFalse() {
        ContourGenerator cg = new ContourGenerator();
        assertFalse(cg.done());
    }

    // Test case 2: Test done() method when cCalculated is true.
    @Test
    void testDoneTrue() {
        ContourGenerator cg = new ContourGenerator();
        cg.cCalculated = true;
        assertTrue(cg.done());
    }

    // Test case 3: Test done() method when cCalculated is false and then true.
    @Test
    void testDoneFalseTrue() {
        ContourGenerator cg = new ContourGenerator();
        assertFalse(cg.done());
        cg.cCalculated = true;
        assertTrue(cg.done());
    }

    // Test case 4: Test done() method when cCalculated is true and then false.
    @Test
    void testDoneTrueFalse() {
        ContourGenerator cg = new ContourGenerator();
        cg.cCalculated = true;
        assertTrue(cg.done());
        cg.cCalculated = false;
        assertFalse(cg.done());
    }

    // Test case 5: Test done() method when cCalculated is false and then false again.
    @Test
    void testDoneFalseFalse() {
        ContourGenerator cg = new ContourGenerator();
        assertFalse(cg.done());
        assertFalse(cg.done());
    }

    // Test case 6: Test done() method when cCalculated is true and then true again.
    @Test
    void testDoneTrueTrue() {
        ContourGenerator cg = new ContourGenerator();
        cg.cCalculated = true;
        assertTrue(cg.done());
        assertTrue(cg.done());
    }

    // Test case 7: Test done() method when cCalculated is true and then null.
    @Test
    void testDoneTrueNull() {
        ContourGenerator cg = new ContourGenerator();
        cg.cCalculated = true;
        assertTrue(cg.done());
        cg = null;
        assertThrows(NullPointerException.class, () -> cg.done());
    }

    // Test case 8: Test done() method when cCalculated is false and then null.
    @Test
    void testDoneFalseNull() {
        ContourGenerator cg = new ContourGenerator();
        assertFalse(cg.done());
        cg = null;
        assertThrows(NullPointerException.class, () -> cg.done());
    }

    // Test case 9: Test done() method when cCalculated is null.
    @Test
    void testDoneNull() {
        ContourGenerator cg = new ContourGenerator();
        cg.cCalculated = null;
        assertThrows(NullPointerException.class, () -> cg.done());
    }

    // Test case 10: Test done() method when cCalculated is true and then set to null.
    @Test
    void testDoneTrueSetNull() {
        ContourGenerator cg = new ContourGenerator();
        cg.cCalculated = true;
        assertTrue(cg.done());
        cg.cCalculated = null;
        assertThrows(NullPointerException.class, () -> cg.done());
    }
}