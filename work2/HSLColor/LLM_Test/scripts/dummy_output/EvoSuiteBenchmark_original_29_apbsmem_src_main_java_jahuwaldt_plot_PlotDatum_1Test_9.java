// PlotDatum_1Test.java
package jahuwaldt.plot;

import java.awt.Color;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotDatum}.
* It contains one unit test case for the {@link PlotDatum#connected()} method.
*/
class PlotDatum_1Test {
		/**
		*  Check that
		*  {@link PlotDatum#connected()} returns true.
		*/
    @Test
    void connected() {
        boolean flag = true;
        Color c = new Color(45, 70, 0);
        PlotDatum pd1 = new PlotDatum();
        pd1.setColor(c);
        dd.addElement(pd1);
        PlotDatum pd2 = new PlotDatum();
        dd.addElement(pd2);
        assertTrue(flag);
        c = new Color();
        pd1.setColor(c);
        assertFalse(flag);
        c.setRed(25);
        pd2.setColor(c);
        assertTrue(flag);
        c.setGreen(25);
        pd2.setColor(c);
        assertTrue(flag);
        c.setBlue(25);
        pd2.setColor(c);
        assertTrue(flag);
    }
}