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
		DiscreteMapping sizeMapping = (DiscreteMapping) sizeCalculator.getMapping(0);
		assertEquals(sizeMapping.getMapValue("species"), 30.0);
		assertEquals(sizeMapping.getMapValue("reaction"), 30.0);
	}
	
	/**
	* Test case for {@link SBMLVisualStyleFactory#createVisualStyle(CyNetwork)} method.
	* This test case checks if the edge arrow shape is set correctly.
	*/
	@Test
	void testCreateVisualStyleEdgeArrowShape2() {
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
	void testCreateVisualStyleEdgeColor2() {
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
	void testCreateVisualStyleNodeSizeLocked2() {
		CyNetwork network = new CyNetwork();
		VisualStyle visualStyle = SBMLVisualStyleFactory.createVisualStyle(network);
		NodeAppearanceCalculator nodeAppCalc = visualStyle.getNodeAppearanceCalculator();
		assertTrue(nodeAppCalc.getNodeSizeLocked());
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
import java.awt.Color;
import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;
import org.sbml.jsbml.*;

/**
 * SBMLReader.java
 * This class reads an SBML file and creates a Cytoscape network.
 *
 * @author W.P.A. Ligtenberg, Eindhoven University of Technology
 */
public class SBMLReader extends CytoscapePlugin {

    public static final String SBML_FILE_EXTENSION = "xml";
    public static final String SBML_FILE_DESCRIPTION = "SBML files";
    public static final String SBML_FILE_TYPE = "SBML";
    public static final String SBML_READER_ID = "SBMLReader";
    public static final String SBML_READER_NAME = "SBMLReader";
    public static final String SBML_READER_DESCRIPTION = "SBMLReader";
    public static final String SBML_READER_VERSION = "1.0";
    public static final String SBML_READER_VS = "SBMLReader";
    public static final String NODE_TYPE_ATT = "nodeType";
    public static final String EDGE_TYPE_ATT = "edgeType";
    public static final String REACTION_ID_ATT = "reactionId";
    public static final String REACTION_NAME_ATT = "reactionName";
    public static final String REACTION_TYPE_ATT = "reactionType";
    public static final String REACTION_TYPE_REVERSIBLE = "reversible";
    public static final String REACTION_TYPE_IRREVERSIBLE = "irreversible";
    public static final String REACTION_TYPE_UNKNOWN = "unknown";
    public static final String REACTION_TYPE_UNDEFINED = "undefined";
    public static final String REACTION_TYPE_NONE = "none";
    public static final String REACTION_TYPE_ASSOCIATION = "association";
    public static final String REACTION_TYPE_DISSOCIATION = "dissociation";
    public static final String REACTION_TYPE_DEGRADATION = "degradation";
    public static final String REACTION_TYPE_BIMODAL = "bimodal";
    public static final String REACTION_TYPE_TRANSCRIPTION = "transcription";
    public static final String REACTION_TYPE_TRANSLATION = "translation";
    public static final String REACTION_TYPE_TRANSPORT = "transport";
    public static final String REACTION_TYPE_STATE_TRANSITION = "state transition";
    public static final String REACTION_TYPE_TRIGGER = "trigger";
    public static final String REACTION_TYPE_INHIBITION = "inhibition";
    public static final String REACTION_TYPE_CATALYSIS = "catalysis";
    public static final String REACTION_TYPE_MODULATION = "modulation";
    public static final String REACTION_TYPE_NECESSARY_STIMULATION = "necessary stimulation";
    public static final String REACTION_TYPE_UNKNOWN_PROCESS = "unknown process";
    public static final String REACTION_TYPE_OMITTED_PROCESS = "omitted process";
    public static final String REACTION_TYPE_UNCERTAIN_PROCESS = "uncertain process";
    public static final String REACTION_TYPE_NEGATIVE_INFLUENCE = "negative influence";
    public static final String REACTION_TYPE_POSITIVE_INFLUENCE = "positive influence";
    public static final String REACTION_TYPE_UNKNOWN_INFLUENCE = "unknown influence";
    public static final String REACTION_TYPE_ASSIGNMENT = "assignment";
    public static final String REACTION_TYPE_INTERACTION = "interaction";
    public static final String REACTION_TYPE_LOGIC_ARC = "logic arc";
    public static final String REACTION_TYPE_EQUIVALENCE_ARC = "equivalence arc";
    public static final String REACTION_TYPE_INHIBITOR_ARC = "inhibitor arc";
    public static final String REACTION_TYPE_UNKNOWN_ARC = "unknown arc";
    public static final String REACTION_TYPE_CONSUMPTION = "consumption";
    public static final String REACTION_TYPE_PRODUCTION = "production";
    public static final String REACTION_TYPE_MODIFICATION = "modification";
    public static final String REACTION_TYPE_STIMULATION = "stimulation";
    public static final String REACTION_TYPE_CATALYSIS_REVERSIBLE = "catalysis reversible";
    public static final String REACTION_TYPE_CATALYSIS_IRREVERSIBLE = "catalysis irreversible";
    public static final String REACTION_TYPE_INHIBITION_REVERSIBLE = "inhibition reversible";
    public static final String REACTION_TYPE_INHIBITION_IRREVERSIBLE = "inhibition