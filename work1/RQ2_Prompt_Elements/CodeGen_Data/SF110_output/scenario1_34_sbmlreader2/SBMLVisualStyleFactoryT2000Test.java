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
 
    @Test
    public void createVisualStyle() throws Exception {
		   
		   String label = "SBMLReader";
        double x = 100;
        double y = 200;
        double w = 200;
        double h = 200;
        VisualStyle v = SBMLVisualStyleFactory.createVisualStyle(
		        getSimpleNetwork(),
		        x, y, w, h);
        assertNotNull(v);
        assertEquals(x, v.getX(), 0.1);
        assertEquals(y, v.getY(), 0.1);
        assertEquals(w, v.getWidth(), 0.1);
        assertEquals(h, v.getHeight(), 0.1);
        assertNull(v.getLabel());
        assertFalse(v.contains(null));
        assertFalse(v.contains(null, null));
        v = SBMLVisualStyleFactory.createVisualStyle(
                getSimpleNetwork(),
                label,
                x, y, w, h);
        assertNotNull(v);
        assertEquals(x, v.getX(), 0.1);
        assertEquals(y, v.getY(), 0.1);
        assertEquals(w, v.getWidth(), 0.1);
        assertEquals(h, v.getHeight(), 0.1);
        assertTrue(v.contains(label));
        assertTrue(v.contains(label, null));
        assertFalse(v.contains());
        assertFalse(v.contains(null, label));        
    }	

}
