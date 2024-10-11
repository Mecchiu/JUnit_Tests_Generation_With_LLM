// SBMLVisualStyleFactoryTest.java
package sbmlreader2;

import cytoscape.*;
import cytoscape.visual.*;
import cytoscape.visual.calculators.*;
import cytoscape.visual.mappings.*;
import java.awt.Color;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SBMLVisualStyleFactory}.
* It contains one unit test case for the {@link SBMLVisualStyleFactory#createVisualStyle(CyNetwork)} method.
*/
class SBMLVisualStyleFactoryTest {
		SBMLVisualStyleFactoryTest() {
	}

    /**
     * DOCUMENT ME!
     *
     * @throws java.lang.IllegalStateException DOCUMENT ME!
     */
    @Test
    public void testInstance() {
        try {
                // Create a new instance of the VisualStyleFactory
                new SBMLVisualStyleFactory();
                fail("No exception thrown");
        } catch (IllegalStateException ex) {
        }
    }

    /**
     * DOCUMENT ME!
     *
     * @throws java.lang.IllegalStateException DOCUMENT ME!
     */
    @Test
    public void testVisualStyleFactory() {
        VisualStyleFactory vsf = new SBMLVisualStyleFactory();

        vsf.setMaxLevel(Integer.MAX_VALUE);
        /*assertTrue(vsf.getVisualStyle() instanceof SBMLVisualStyle);*/

        assertTrue(vsf.getVisualStyle() instanceof SBMLVisualStyle);
        /*assertTrue(vsf.getStyle() == vsf.getVisualStyle());*/
    }
}