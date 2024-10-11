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
		CyNetwork network = Cytoscape.createNetwork("test");
		VisualStyle visualStyle = SBMLVisualStyleFactory.createVisualStyle(network);
		assertEquals(NodeShape.DIAMOND, visualStyle.getNodeAppearanceCalculator().getCalculator(VisualPropertyType.NODE_SHAPE).getMapping(0).getMapValue("species"));
		assertEquals(NodeShape.ELLIPSE, visualStyle.getNodeAppearanceCalculator().getCalculator(VisualPropertyType.NODE_SHAPE).getMapping(0).getMapValue("reaction"));
	}
	
	/**
	* Test case 2: Test the node label of the visual style.
	*/
	@Test
	void testNodeLabel() {
		CyNetwork network = Cytoscape.createNetwork("test");
		VisualStyle visualStyle = SBMLVisualStyleFactory.createVisualStyle(network);
		assertEquals("sbml name", visualStyle.getNodeAppearanceCalculator().getCalculator(VisualPropertyType.NODE_LABEL).getMapping(0).getControllingAttributeName());
	}
	
	/**
	* Test case 3: Test the node size of the visual style.
	*/
	@Test
	void testNodeSize() {
		CyNetwork network = Cytoscape.createNetwork("test");
		VisualStyle visualStyle = SBMLVisualStyleFactory.createVisualStyle(network);
		assertEquals(30, visualStyle.getNodeAppearanceCalculator().getCalculator(VisualPropertyType.NODE_SIZE).getMapping(0).getMapValue("species"));
		assertEquals(30, visualStyle.getNodeAppearanceCalculator().getCalculator(VisualPropertyType.NODE_SIZE).getMapping(0).getMapValue("reaction"));
	}
	
	/**
	* Test case 4: Test the edge arrow shape of the visual style.
	*/
	@Test
	void testEdgeArrowShape() {
		CyNetwork network = Cytoscape.createNetwork("test");
		VisualStyle visualStyle = SBMLVisualStyleFactory.createVisualStyle(network);
		assertEquals(ArrowShape.ARROW, visualStyle.getEdgeAppearanceCalculator().getCalculator(VisualPropertyType.EDGE_SRCARROW_SHAPE).getMapping(0).getMapValue("reaction-product"));
		assertEquals(ArrowShape.NONE, visualStyle.getEdgeAppearanceCalculator().getCalculator(VisualPropertyType.EDGE_SRCARROW_SHAPE).getMapping(0).getMapValue("reaction-reactant"));
		assertEquals(ArrowShape.CIRCLE, visualStyle.getEdgeAppearanceCalculator().getCalculator(VisualPropertyType.EDGE_SRCARROW_SHAPE).getMapping(0).getMapValue("reaction-modifier"));
	}
	
	/**
	* Test case 5: Test the edge colour of the visual style.
	*/
	@Test
	void testEdgeColour() {
		CyNetwork network = Cytoscape.createNetwork("test");
		VisualStyle visualStyle = SBMLVisualStyleFactory.createVisualStyle(network);
		assertEquals(Color.GREEN, visualStyle.getEdgeAppearanceCalculator().getCalculator(VisualPropertyType.EDGE_COLOR).getMapping(0).getMapValue("reaction-product"));
		assertEquals(Color.RED, visualStyle.getEdgeAppearanceCalculator().getCalculator(VisualPropertyType.EDGE_COLOR).getMapping(0).getMapValue("reaction-reactant"));
		assertEquals(Color.BLACK, visualStyle.getEdgeAppearanceCalculator().getCalculator(VisualPropertyType.EDGE_COLOR).getMapping(0).getMapValue("reaction-modifier"));
	}
	
	/**
	* Test case 6: Test the node shape of the visual style.
	*/
	@Test
	void testNodeShape2() {
		CyNetwork network = Cytoscape.createNetwork("test");
		VisualStyle visualStyle = SBMLVisualStyleFactory.createVisualStyle(network);
		assertEquals(NodeShape.DIAMOND, visualStyle.getNodeAppearanceCalculator().getCalculator(VisualPropertyType.NODE_SHAPE).getMapping(0).getMapValue("species"));
		assertEquals(NodeShape.ELLIPSE, visualStyle.getNodeAppearanceCalculator().getCalculator(VisualPropertyType.NODE_SHAPE).getMapping(0).getMapValue("reaction"));
	}
	
	/**
	* Test case 7: Test the node label of the visual style.
	*/
	@Test
	void testNodeLabel2() {
		CyNetwork network = Cytoscape.createNetwork("test");
		VisualStyle visualStyle = SBMLVisualStyleFactory.createVisualStyle(network);
		assertEquals("sbml name", visualStyle.getNodeAppearanceCalculator().getCalculator(VisualPropertyType.NODE_LABEL).getMapping(0).getControllingAttributeName());
	}
	
	/**
	* Test case 8: Test the node size of the visual style.
	*/
	@Test
	void testNodeSize2() {
		CyNetwork network = Cytoscape.createNetwork("test");
		VisualStyle visualStyle = SBMLVisualStyleFactory.createVisualStyle(network);
		assertEquals(30, visualStyle.getNodeAppearanceCalculator().getCalculator(VisualPropertyType.NODE_SIZE).getMapping(0).getMapValue("species"));
		assertEquals(30, visualStyle.getNodeAppearanceCalculator().getCalculator(VisualPropertyType.NODE_SIZE).getMapping(0).getMapValue("reaction"));
	}
	
	/**
	* Test case 9: Test the edge arrow shape of the visual style.
	*/
	@Test
	void testEdgeArrowShape2() {
		CyNetwork network = Cytoscape.createNetwork("test");
		VisualStyle visualStyle = SBMLVisualStyleFactory.createVisualStyle(network);
		assertEquals(ArrowShape.ARROW, visualStyle.getEdgeAppearanceCalculator().getCalculator(VisualPropertyType.EDGE_SRCARROW_SHAPE).getMapping(0).getMapValue("reaction-product"));
		assertEquals(ArrowShape.NONE, visualStyle.getEdgeAppearanceCalculator().getCalculator(VisualPropertyType.EDGE_SRCARROW_SHAPE).getMapping(0).getMapValue("reaction-reactant"));
		assertEquals(ArrowShape.CIRCLE, visualStyle.getEdgeAppearanceCalculator().getCalculator(VisualPropertyType.EDGE_SRCARROW_SHAPE).getMapping(0).getMapValue("reaction-modifier"));
	}
	
	/**
	* Test case 10: Test the edge colour of the visual style.
	*/
	@Test
	void testEdgeColour2() {
		CyNetwork network = Cytoscape.createNetwork("test");
		VisualStyle visualStyle = SBMLVisualStyleFactory.createVisualStyle(network);
		assertEquals(Color.GREEN, visualStyle.getEdgeAppearanceCalculator().getCalculator(VisualPropertyType.EDGE_COLOR).getMapping(0).getMapValue("reaction-product"));
		assertEquals(Color.RED, visualStyle.getEdgeAppearanceCalculator().getCalculator(VisualPropertyType.EDGE_COLOR).getMapping(0).getMapValue("reaction-reactant"));
		assertEquals(Color.BLACK, visualStyle.getEdgeAppearanceCalculator().getCalculator(VisualPropertyType.EDGE_COLOR).getMapping(0).getMapValue("reaction-modifier"));
	}
}