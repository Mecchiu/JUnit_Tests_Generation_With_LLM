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
	 * Test method for {@link sbmlreader2.SBMLVisualStyleFactory#createVisualStyle(cytoscape.CyNetwork)}.
	 */
	@Test
	public void testCreateVisualStyle() {
		new SBMLVisualStyleFactory();
		new SBMLVisualStyleFactory("SBML", "http://sbml.org");
	}
}