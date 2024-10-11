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
	 * Test method for {@link sbmlreader2.SBMLVisualStyleFactory#createVisualStyle(CyNetwork)}.
	 * @throws Exception Thrown if SV is <code>null</code>, a <code>CyNet</code> is not a Cytoscape network, or the SBML document associated with the CyNet is in an invalid format (or the Cytoscape API returned a <code>null</code> <code>sbml</code>)
	*/
	@Test
    public  void testCreateVisualStyleSBMLString() {
		CyNet net = null;
		
		net =  new CyNet((String)null);	
		assertNotNull(net);
		assertTrue(net.getSBMLCore().length() <= 0);
		
		cytoscape.Visualization vis = new CytoscapeVisualization(net, null, null, null, null);
		
		try {
			Net<String> b = net.getSBMLCore().toString();
			vis.setSBNode((VisualShape)null);
			vis.render();
			assertFalse(net.getSBMLCore().toString().startsWith(net.getSBMLCore().toString()));
			assertTrue(vis.getSBNode()!= null);
			assertNotNull(vis.getSBNode().getVisualStyle());
		} catch (CytoscapeException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * DOCUMENT ME!
	 *
	 * @param net DOCUMENT ME!
	 *
	 * @return DOCUMENT ME!
	 */
	@Test
    public  void testCreateVisualStyleCytoscapeNetwork() {
		CyNet net = null;
		
}
}