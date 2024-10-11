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
* It contains ten unit test cases for the {@link SBMLVisualStyleFactory#createVisualStyle(CyNetwork)} method.
*/
class SBMLVisualStyleFactoryTest {

	/**
	* Test case 1: Test the node shape of the visual style.
	*/
	@Test
	void testNodeShape() {
		CyNetwork network = new CyNetwork();
		VisualStyle visualStyle = SBMLVisualStyleFactory.createVisualStyle(network);
		NodeAppearanceCalculator nodeAppCalc = visualStyle.getNodeAppearanceCalculator();
		Calculator shapeCalculator = nodeAppCalc.getCalculator(VisualPropertyType.NODE_SHAPE);
		DiscreteMapping disMapping = (DiscreteMapping) shapeCalculator.getMapping(0);
		assertEquals(NodeShape.DIAMOND, disMapping.getMapValue("species"));
		assertEquals(NodeShape.ELLIPSE, disMapping.getMapValue("reaction"));
	}
	
	/**
	* Test case 2: Test the node label of the visual style.
	*/
	@Test
	void testNodeLabel() {
		CyNetwork network = new CyNetwork();
		VisualStyle visualStyle = SBMLVisualStyleFactory.createVisualStyle(network);
		NodeAppearanceCalculator nodeAppCalc = visualStyle.getNodeAppearanceCalculator();
		Calculator nlc = nodeAppCalc.getCalculator(VisualPropertyType.NODE_LABEL);
		PassThroughMapping m = (PassThroughMapping) nlc.getMapping(0);
		assertEquals("sbml name", m.getControllingAttributeName());
	}
	
	/**
	* Test case 3: Test the node size of the visual style.
	*/
	@Test
	void testNodeSize() {
		CyNetwork network = new CyNetwork();
		VisualStyle visualStyle = SBMLVisualStyleFactory.createVisualStyle(network);
		NodeAppearanceCalculator nodeAppCalc = visualStyle.getNodeAppearanceCalculator();
		Calculator sizeCalculator = nodeAppCalc.getCalculator(VisualPropertyType.NODE_SIZE);
		DiscreteMapping sizeMapping = (DiscreteMapping) sizeCalculator.getMapping(0);
		assertEquals(30, sizeMapping.getMapValue("species"));
		assertEquals(30, sizeMapping.getMapValue("reaction"));
	}
	
	/**
	* Test case 4: Test the edge arrow shape of the visual style.
	*/
	@Test
	void testEdgeArrowShape() {
		CyNetwork network = new CyNetwork();
		VisualStyle visualStyle = SBMLVisualStyleFactory.createVisualStyle(network);
		EdgeAppearanceCalculator edgeAppCalc = visualStyle.getEdgeAppearanceCalculator();
		Calculator edgeArrowCalculator = edgeAppCalc.getCalculator(VisualPropertyType.EDGE_SRCARROW_SHAPE);
		DiscreteMapping arrowMapping = (DiscreteMapping) edgeArrowCalculator.getMapping(0);
		assertEquals(ArrowShape.ARROW, arrowMapping.getMapValue("reaction-product"));
		assertEquals(ArrowShape.NONE, arrowMapping.getMapValue("reaction-reactant"));
		assertEquals(ArrowShape.CIRCLE, arrowMapping.getMapValue("reaction-modifier"));
	}
	
	/**
	* Test case 5: Test the edge colour of the visual style.
	*/
	@Test
	void testEdgeColour() {
		CyNetwork network = new CyNetwork();
		VisualStyle visualStyle = SBMLVisualStyleFactory.createVisualStyle(network);
		EdgeAppearanceCalculator edgeAppCalc = visualStyle.getEdgeAppearanceCalculator();
		Calculator edgeColorCalculator = edgeAppCalc.getCalculator(VisualPropertyType.EDGE_COLOR);
		DiscreteMapping edgeColorMapping = (DiscreteMapping) edgeColorCalculator.getMapping(0);
		assertEquals(Color.GREEN, edgeColorMapping.getMapValue("reaction-product"));
		assertEquals(Color.RED, edgeColorMapping.getMapValue("reaction-reactant"));
		assertEquals(Color.BLACK, edgeColorMapping.getMapValue("reaction-modifier"));
	}
	
	/**
	* Test case 6: Test the visual style name.
	*/
	@Test
	void testVisualStyleName() {
		CyNetwork network = new CyNetwork();
		VisualStyle visualStyle = SBMLVisualStyleFactory.createVisualStyle(network);
		assertEquals("SBMLReader", visualStyle.getName());
	}
	
	/**
	* Test case 7: Test the node size lock of the visual style.
	*/
	@Test
	void testNodeSizeLock() {
		CyNetwork network = new CyNetwork();
		VisualStyle visualStyle = SBMLVisualStyleFactory.createVisualStyle(network);
		NodeAppearanceCalculator nodeAppCalc = visualStyle.getNodeAppearanceCalculator();
		assertTrue(nodeAppCalc.getNodeSizeLocked());
	}
	
	/**
	* Test case 8: Test the node shape calculator of the visual style.
	*/
	@Test
	void testNodeShapeCalculator() {
		CyNetwork network = new CyNetwork();
		VisualStyle visualStyle = SBMLVisualStyleFactory.createVisualStyle(network);
		NodeAppearanceCalculator nodeAppCalc = visualStyle.getNodeAppearanceCalculator();
		Calculator shapeCalculator = nodeAppCalc.getCalculator(VisualPropertyType.NODE_SHAPE);
		assertEquals("SBMLReader Shape Calculator", shapeCalculator.getName());
	}
	
	/**
	* Test case 9: Test the node label calculator of the visual style.
	*/
	@Test
	void testNodeLabelCalculator() {
		CyNetwork network = new CyNetwork();
		VisualStyle visualStyle = SBMLVisualStyleFactory.createVisualStyle(network);
		NodeAppearanceCalculator nodeAppCalc = visualStyle.getNodeAppearanceCalculator();
		Calculator nlc = nodeAppCalc.getCalculator(VisualPropertyType.NODE_LABEL);
		assertEquals("sbml name", nlc.getName());
	}
	
	/**
	* Test case 10: Test the node size calculator of the visual style.
	*/
	@Test
	void testNodeSizeCalculator() {
		CyNetwork network = new CyNetwork();
		VisualStyle visualStyle = SBMLVisualStyleFactory.createVisualStyle(network);
		NodeAppearanceCalculator nodeAppCalc = visualStyle.getNodeAppearanceCalculator();
		Calculator sizeCalculator = nodeAppCalc.getCalculator(VisualPropertyType.NODE_SIZE);
		assertEquals("SBMLReader Size Calculator", sizeCalculator.getName());
	}
}

// SBMLReader.java
package sbmlreader2;

import cytoscape.*;
import cytoscape.data.*;
import cytoscape.data.readers.*;
import cytoscape.plugin.*;
import cytoscape.util.*;
import cytoscape.view.*;
import cytoscape.visual.*;
import cytoscape.visual.calculators.*;
import cytoscape.visual.mappings.*;
import giny.model.*;
import giny.view.*;
import java.awt.Color;
import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;
import javax.xml.stream.*;
import org.sbml.jsbml.*;

/**
 * SBMLReader.java
 * This class reads an SBML file and creates a CyNetwork.
 *
 * @author W.P.A. Ligtenberg, Eindhoven University of Technology
 */
public class SBMLReader implements CytoscapePlugin {

    /**
     *  DOCUMENT ME!
     *
     * @param args DOCUMENT ME!
     */
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: SBMLReader <filename>");
           