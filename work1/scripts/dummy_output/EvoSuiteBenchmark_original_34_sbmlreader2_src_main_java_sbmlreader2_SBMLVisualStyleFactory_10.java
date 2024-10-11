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
		
	// CONSTRUCTOR
	public SBMLVisualStyleFactoryTest() {	}

	// PUBLIC SINGLETON VARIABLES
	public VisualStyle createVisualStyle(CyNetwork network) {
		return createVisualStyle(network.getDefaultVisualStyle());
	}

	public VisualStyle createVisualStyle(VisualStyle visualStyle) {

        /*
         * Create a visual style for the network.
         */ 
        VisualStyle generatedStyle = VisualStyleFactory.createVisualStyle( visualStyle);

		return generatedStyle;

	}

	// PRIVATE VARIABLES
	private VisualStyle createVisualStyle(CyNetwork network, VisualStyle virtualStyles[]) {

		/*
		 * Generate the default visual styles.
		 */ 
		VisualStyle generatedStyle =
			VisualStyleFactory.createVisualStyle(virtualStyles, network);

		return generatedStyle;
	}

}