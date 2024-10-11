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
	* Test case for {@link SBMLVisualStyleFactory#createVisualStyle(CyNetwork)} method.
	* This test case checks if the visual style is created correctly.
	*/
	@Test
	void testCreateVisualStyle() {
		CyNetwork network = new CyNetwork();
		VisualStyle visualStyle = SBMLVisualStyleFactory.createVisualStyle(network);
		assertEquals(visualStyle.getName(), "SBMLReader");
	}
	
	/**
	* Test case for {@link SBMLVisualStyleFactory#createVisualStyle(CyNetwork)} method.
	* This test case checks if the node shape is set correctly.
	*/
	@Test
	void testCreateVisualStyleNodeShape() {
		CyNetwork network = new CyNetwork();
		VisualStyle visualStyle = SBMLVisualStyleFactory.createVisualStyle(network);
		NodeAppearanceCalculator nodeAppCalc = visualStyle.getNodeAppearanceCalculator();
		Calculator shapeCalculator = nodeAppCalc.getCalculator(VisualPropertyType.NODE_SHAPE);
		DiscreteMapping disMapping = (DiscreteMapping) shapeCalculator.getMapping(0);
		assertEquals(disMapping.getMapValue("species"), NodeShape.DIAMOND);
		assertEquals(disMapping.getMapValue("reaction"), NodeShape.ELLIPSE);
	}
	
	/**
	* Test case for {@link SBMLVisualStyleFactory#createVisualStyle(CyNetwork)} method.
	* This test case checks if the node label is set correctly.
	*/
	@Test
	void testCreateVisualStyleNodeLabel() {
		CyNetwork network = new CyNetwork();
		VisualStyle visualStyle = SBMLVisualStyleFactory.createVisualStyle(network);
		NodeAppearanceCalculator nodeAppCalc = visualStyle.getNodeAppearanceCalculator();
		Calculator nlc = nodeAppCalc.getCalculator(VisualPropertyType.NODE_LABEL);
		PassThroughMapping m = (PassThroughMapping) nlc.getMapping(0);
		assertEquals(m.getControllingAttributeName(), "sbml name");
	}
	
	/**
	* Test case for {@link SBMLVisualStyleFactory#createVisualStyle(CyNetwork)} method.
	* This test case checks if the node size is set correctly.
	*/
	@Test
	void testCreateVisualStyleNodeSize() {
		CyNetwork network = new CyNetwork();
		VisualStyle visualStyle = SBMLVisualStyleFactory.createVisualStyle(network);
		NodeAppearanceCalculator nodeAppCalc = visualStyle.getNodeAppearanceCalculator();
		Calculator sizeCalculator = nodeAppCalc.getCalculator(VisualPropertyType.NODE_SIZE);
		DiscreteMapping sizeMapping = (DiscreteMapping) sizeCalculator.getMapping(0);
		assertEquals(sizeMapping.getMapValue("species"), 30.0);
		assertEquals(sizeMapping.getMapValue("reaction"), 30.0);
	}
	
	/**
	* Test case for {@link SBMLVisualStyleFactory#createVisualStyle(CyNetwork)} method.
	* This test case checks if the edge arrow shape is set correctly.
	*/
	@Test
	void testCreateVisualStyleEdgeArrowShape() {
		CyNetwork network = new CyNetwork();
		VisualStyle visualStyle = SBMLVisualStyleFactory.createVisualStyle(network);
		EdgeAppearanceCalculator edgeAppCalc = visualStyle.getEdgeAppearanceCalculator();
		Calculator edgeArrowCalculator = edgeAppCalc.getCalculator(VisualPropertyType.EDGE_SRCARROW_SHAPE);
		DiscreteMapping arrowMapping = (DiscreteMapping) edgeArrowCalculator.getMapping(0);
		assertEquals(arrowMapping.getMapValue("reaction-product"), ArrowShape.ARROW);
		assertEquals(arrowMapping.getMapValue("reaction-reactant"), ArrowShape.NONE);
		assertEquals(arrowMapping.getMapValue("reaction-modifier"), ArrowShape.CIRCLE);
	}
	
	/**
	* Test case for {@link SBMLVisualStyleFactory#createVisualStyle(CyNetwork)} method.
	* This test case checks if the edge colour is set correctly.
	*/
	@Test
	void testCreateVisualStyleEdgeColor() {
		CyNetwork network = new CyNetwork();
		VisualStyle visualStyle = SBMLVisualStyleFactory.createVisualStyle(network);
		EdgeAppearanceCalculator edgeAppCalc = visualStyle.getEdgeAppearanceCalculator();
		Calculator edgeColorCalculator = edgeAppCalc.getCalculator(VisualPropertyType.EDGE_COLOR);
		DiscreteMapping edgeColorMapping = (DiscreteMapping) edgeColorCalculator.getMapping(0);
		assertEquals(edgeColorMapping.getMapValue("reaction-product"), Color.GREEN);
		assertEquals(edgeColorMapping.getMapValue("reaction-reactant"), Color.RED);
		assertEquals(edgeColorMapping.getMapValue("reaction-modifier"), Color.BLACK);
	}
	
	/**
	* Test case for {@link SBMLVisualStyleFactory#createVisualStyle(CyNetwork)} method.
	* This test case checks if the node size is locked.
	*/
	@Test
	void testCreateVisualStyleNodeSizeLocked() {
		CyNetwork network = new CyNetwork();
		VisualStyle visualStyle = SBMLVisualStyleFactory.createVisualStyle(network);
		NodeAppearanceCalculator nodeAppCalc = visualStyle.getNodeAppearanceCalculator();
		assertTrue(nodeAppCalc.getNodeSizeLocked());
	}
	
	/**
	* Test case for {@link SBMLVisualStyleFactory#createVisualStyle(CyNetwork)} method.
	* This test case checks if the node shape is set correctly.
	*/
	@Test
	void testCreateVisualStyleNodeShape2() {
		CyNetwork network = new CyNetwork();
		VisualStyle visualStyle = SBMLVisualStyleFactory.createVisualStyle(network);
		NodeAppearanceCalculator nodeAppCalc = visualStyle.getNodeAppearanceCalculator();
		Calculator shapeCalculator = nodeAppCalc.getCalculator(VisualPropertyType.NODE_SHAPE);
		DiscreteMapping disMapping = (DiscreteMapping) shapeCalculator.getMapping(0);
		assertEquals(disMapping.getMapValue("species"), NodeShape.DIAMOND);
		assertEquals(disMapping.getMapValue("reaction"), NodeShape.ELLIPSE);
	}
	
	/**
	* Test case for {@link SBMLVisualStyleFactory#createVisualStyle(CyNetwork)} method.
	* This test case checks if the node label is set correctly.
	*/
	@Test
	void testCreateVisualStyleNodeLabel2() {
		CyNetwork network = new CyNetwork();
		VisualStyle visualStyle = SBMLVisualStyleFactory.createVisualStyle(network);
		NodeAppearanceCalculator nodeAppCalc = visualStyle.getNodeAppearanceCalculator();
		Calculator nlc = nodeAppCalc.getCalculator(VisualPropertyType.NODE_LABEL);
		PassThroughMapping m = (PassThroughMapping) nlc.getMapping(0);
		assertEquals(m.getControllingAttributeName(), "sbml name");
	}
	
	/**
	* Test case for {@link SBMLVisualStyleFactory#createVisualStyle(CyNetwork)} method.
	* This test case checks if the node size is set correctly.
	*/
	@Test
	void testCreateVisualStyleNodeSize2() {
		CyNetwork network = new CyNetwork();
		VisualStyle visualStyle = SBMLVisualStyleFactory.createVisualStyle(network);
		NodeAppearanceCalculator nodeAppCalc = visualStyle.getNodeAppearanceCalculator();
		Calculator sizeCalculator = nodeAppCalc.getCalculator(VisualPropertyType.NODE_SIZE);
		DiscreteMapping sizeMapping = (DiscreteMapping)