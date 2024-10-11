// PlotDatum_0Test.java
package jahuwaldt.plot;

import java.awt.Color;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotDatum}.
* It contains one unit test case for the {@link PlotDatum#hasErrorBar()} method.
*/
class PlotDatum_0Test {

    /**
     *  Test the hasErrorBar() method.
     */
    @Test
    void testIsErrorBar() {
        {
            PlotDatum p = new PlotDatum( new Color( 0, 255, 0 ),
                    new Color( 0, 0, 255 ),
                    null );
            assertTrue( p.hasErrorBar());
        }
        {
            PlotDatum p = new PlotDatum( new Color( 0,255,0 ),
                    new Color( 1,255,0 ),
                    null );
            assertFalse( p.hasErrorBar());
        }
        {
            PlotDatum p = new PlotDatum( new Color( 0,255,0 ),
                    new Color(  1,255,255 ),
                    null );
            assertFalse( p.hasErrorBar());
        }
        {
            PlotDatum p = new PlotDatum( new Color( 1,255,255 ),
                    new Color(  1,255,255 ),
                    null );
            assertFalse( p.hasErrorBar());
        }
        {
            PlotDatum p = new PlotDatum( new Color( 0,255,255 ),
                    new Color(255,0,255 ),
                    null );
            assertTrue( p.hasErrorBar());
        }
    }
	
}
