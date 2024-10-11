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
		
	/**
     * DOCUMENT ME!
     */  
    @Test
    public void test() {
        VisualStyle vs = SBMLVisualStyleFactory.createVisualStyle("sbml").evaluate();
        System.out.println(vs);
        CySwing sw = Network.getEdgeView(vs.getNetwork());
		
		/*
            // check that the node color is blue
			EdgeView e = Network.getNodeView("edge1");
			Swidget sw1 = (Swidget)e.getLabel("NODE1");
			assertFalse("Color of edge1 view is not blue",   // if it fails here just fix the bug.
						  sw1.getVisualStyle().getColor() == sw1.getVisualStyle().getStyle().getBlue());
		*/
		
		// check that the node type is NODE
		CyNodeView node1 = Network.getNodeView("node1");
		Swidget sw1 = (Swidget)Network.getEdgeView("edge1").getLabel("NODE1");
		Color c1 = sw1.getVisualStyle().getColor();
		assertFalse("Color of node1 view is not NODE", c1 == c1);
		

        // check that the edge type is EDGE
		CyEdgeView edge1 = Network.getEdgeView("edge1");
		Swidget sw2 = (Swidget)Network.getNodeView("node1").getLabel("NODE1");
		Color c2 = sw2.getVisualStyle().getColor();
		assertFalse("Color of edge1 view is not EDGE", c2 == c2);
		




        assertEquals( Color.blue, vs.getStyle().getColor() );		
        assertTrue(  vs.getStyle().isFilledByDefault() );		

    }

}