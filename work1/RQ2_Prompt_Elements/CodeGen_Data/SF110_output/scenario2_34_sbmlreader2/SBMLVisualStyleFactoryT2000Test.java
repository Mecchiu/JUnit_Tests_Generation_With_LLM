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

	@Test
	void testCreateVisualStyle() {
		
		assertNotNull(
				"SBMLVisualStyleFactoryTest instance",
				createVisualStyle(CyNetwork.getInstance("sbnml.net"))
		);
//		assertNotNull("SBMLVisualStyleFactoryTest instance", createVisualStyle(null));	// No input for SBMLVisualStyleFactoryTest!
	} 	

}