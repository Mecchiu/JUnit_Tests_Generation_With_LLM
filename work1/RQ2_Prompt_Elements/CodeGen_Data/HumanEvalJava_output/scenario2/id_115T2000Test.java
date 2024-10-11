// MaxFillTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MaxFill}.
* It contains one unit test case for the {@link MaxFill#maxFill(List, int)} method.
*/
class MaxFillTest {

	private static final int WIDTH = 10;
	private static final int HEIGHT = 10;
	
	@Test
    public void testMaxFillSucceeds1() {
        assertTrue(MaxFill.maxFill(new IntMatrix1D(WIDTH, HEIGHT), 9) >= 9);
    }

	@Test
    public void testMaxFillFailures() {
        try {
            MaxFill.maxFill(new IntMatrix1D(WIDTH, HEIGHT), 10);
        } catch (IllegalArgumentException ex) {
            return;
        }
        fail();
    }

	@Test
    public void testMaxFillWon() {
        IntMatrix1D max = new IntMatrix1D(WIDTH, HEIGHT);
        max.fillTo(0);
        max.fillTo(HEIGHT);
        assertEquals("Max fill of 0", 5, max.getValue(0), 0.1);
        assertEquals("Max fill of 1", 5, max.getValue(HEIGHT + 1), 0.1);
    }

	@Test
    public void testMaxFillBucketMismatch() {
        IntMatrix1D max = new IntMatrix1D(WIDTH, HEIGHT);
        max.fillTo(0);
        max.fillTo(HEIGHT);
        assertTrue("Failed to correctly construct bucket. BUG? "+ max.toString()+" -- "+ max.getValue(0)+ " ", false);
        assertTrue("Failed to correctly construct bucket. BUG? "+ max.toString()+" -- "+ max.getValue(HEIGHT+1), false);
    }

	@Test
    public void testMaxCountWon() {
        IntMatrix1D max = new IntMatrix1D(WIDTH, HEIGHT);
        for (int x = 0; x < HEIGHT; x++) {
            max.setValue(x, x);
        }
        //assertEquals(7, max.getMax(HEIGHT));
        assertEquals(max, new IntMatrix1D(WIDTH, HEIGHT));
    }
	
	
	@Test
	public void testMaxCountFails() {
		try {
			MaxCount.maxCount(new IntMatrix1D(WIDTH, HEIGHT), 4);
		} catch (IllegalArgumentException ex) {
			return;
		}
		fail();
		
	}

}