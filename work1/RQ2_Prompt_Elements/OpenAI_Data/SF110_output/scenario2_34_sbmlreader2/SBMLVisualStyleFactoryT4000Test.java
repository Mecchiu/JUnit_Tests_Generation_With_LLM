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
import javax.swing.*;
import javax.xml.stream.*;
import org.sbml.jsbml.*;

/**
 * SBMLReader.java
 * This class reads an SBML file and creates a Cytoscape network.
 *
 * @author W.P.A. Ligtenberg, Eindhoven University of Technology
 */
public class SBMLReader extends CytoscapePlugin {

    /**
     *  DOCUMENT ME!
     *
     * @param args DOCUMENT ME!
     */
    public static void main(String[] args) {
        Cytoscape.main(args);
    }

    /**
     *  DOCUMENT ME!
     */
    public SBMLReader() {
        // Create a new menu item under the Plugins menu
        JMenuItem menuItem = new JMenuItem("SBMLReader");
        menuItem.addActionListener(new SBMLReaderActionListener());
        Cytoscape.getDesktop().getCyMenus().getMenuBar().getMenu("Plugins").add(menuItem);
    }

    /**
     *  DOCUMENT ME!
     *
     * @param fileName DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static CyNetwork readSBML(String fileName) {
        // Create a new network
        CyNetwork network = Cytoscape.createNetwork(fileName);
        // Read the SBML file
        SBMLDocument doc = null;
        try {
            doc = SBMLReader.read(new File(fileName));
        } catch (Exception e) {
            System.out.println("Error reading SBML file: " + e.getMessage());
            return null;
        }
        // Get the model
        Model model = doc.getModel();
        // Create a hashmap for the nodes
        HashMap<String, Node> nodeMap = new HashMap<String, Node>();
        // Create a hashmap for the edges
        HashMap<String, Edge> edgeMap = new HashMap<String, Edge>();
        // Create a hashmap for the species
        HashMap<String, Species> speciesMap = new HashMap<String, Species>();
        // Create a hashmap for the reactions
        HashMap<String, Reaction> reactionMap = new HashMap<String, Reaction>();
        // Create a hashmap for the modifiers
        HashMap<String, ModifierSpeciesReference> modifierMap = new HashMap<String, ModifierSpeciesReference>();
        // Create a hashmap for the products
        HashMap<String, SpeciesReference> productMap = new HashMap<String, SpeciesReference>();
        // Create a hashmap for the reactants
        HashMap<String, SpeciesReference> reactantMap = new HashMap<String, SpeciesReference>();
        // Create a hashmap for the species references
        HashMap<String, SpeciesReference> speciesReferenceMap = new HashMap<String, SpeciesReference>();
        // Create a hashmap for the modifiers
        HashMap<String, ModifierSpeciesReference> modifierSpeciesReferenceMap = new HashMap<String, ModifierSpeciesReference>();
        // Create a hashmap for the species references
        HashMap<String, SpeciesReference> speciesReferenceMap2 = new HashMap<String, SpeciesReference>();
        // Create a hashmap for the modifiers
        HashMap<String, ModifierSpeciesReference> modifierSpeciesReferenceMap2 = new HashMap<String, ModifierSpeciesReference>();
        // Create a hashmap for the species references
        HashMap<String, SpeciesReference> speciesReferenceMap3 = new HashMap<String, SpeciesReference>();
        // Create a hashmap for the modifiers
        HashMap<String, ModifierSpeciesReference> modifierSpeciesReferenceMap3 = new HashMap<String, ModifierSpeciesReference>();
        // Create a hashmap for the species references
        HashMap<String, SpeciesReference> speciesReferenceMap4 = new HashMap<String, SpeciesReference>();
        // Create a hashmap for the modifiers
        HashMap<String, ModifierSpeciesReference> modifierSpeciesReferenceMap4 = new HashMap<String, ModifierSpeciesReference>();
        // Create a hashmap for the species references
        HashMap<String, SpeciesReference> speciesReferenceMap5 = new HashMap<String, SpeciesReference>();
        // Create a hashmap for the modifiers
        HashMap<String, ModifierSpeciesReference> modifierSpeciesReferenceMap5 = new HashMap<String, ModifierSpeciesReference>();
        // Create a hashmap for the species references
        HashMap<String, SpeciesReference> speciesReferenceMap6 = new HashMap<String, SpeciesReference>();
        // Create a hashmap for the modifiers
        HashMap<String, ModifierSpeciesReference> modifierSpeciesReferenceMap6 = new HashMap<String, ModifierSpeciesReference>();
        // Create a hashmap for the species references
        HashMap<String, SpeciesReference> speciesReferenceMap7 = new HashMap<String, SpeciesReference>();
        // Create a hashmap for the modifiers
        HashMap<String, ModifierSpeciesReference> modifierSpeciesReferenceMap7 = new HashMap<String, ModifierSpeciesReference>();
        // Create a hashmap for the species references
        HashMap<String, SpeciesReference> speciesReferenceMap8 = new HashMap<String, SpeciesReference>();
        // Create a hashmap for the modifiers
        HashMap<String, ModifierSpeciesReference> modifierSpeciesReferenceMap8 = new HashMap<String, ModifierSpeciesReference>();
        // Create a hashmap for the species references
        HashMap<String, SpeciesReference> speciesReferenceMap9 = new HashMap<String, SpeciesReference>();
        // Create a hashmap for the modifiers
        HashMap<String, ModifierSpeciesReference> modifierSpeciesReferenceMap9 = new HashMap<String, ModifierSpeciesReference>();
        // Create a hashmap for the species references
        HashMap<String, SpeciesReference> speciesReferenceMap10 = new HashMap<String, SpeciesReference>();
        // Create a hashmap for the modifiers
        HashMap<String, ModifierSpeciesReference> modifierSpeciesReferenceMap10 = new HashMap<String, ModifierSpeciesReference>();
        // Create a hashmap for the species references
        HashMap<String, SpeciesReference> speciesReferenceMap11 = new HashMap<String, SpeciesReference>();
        // Create a hashmap for the modifiers
        HashMap<String, ModifierSpeciesReference> modifierSpeciesReferenceMap11 = new HashMap<String, ModifierSpeciesReference>();
        // Create a hashmap for the species references
        HashMap<String, SpeciesReference> speciesReferenceMap12 = new HashMap<String, SpeciesReference>();
        // Create a hashmap for the modifiers
        HashMap<String, ModifierSpeciesReference> modifierSpeciesReferenceMap12 = new HashMap<String, ModifierSpeciesReference>();
        // Create a hashmap for the species references
        HashMap<String, SpeciesReference> speciesReferenceMap13 = new HashMap<String, SpeciesReference>();
        // Create a hashmap for the modifiers
        HashMap<String, ModifierSpeciesReference> modifierSpeciesReferenceMap13 = new HashMap<String, ModifierSpeciesReference>();
        // Create a hashmap for the species references
        HashMap<String, SpeciesReference> speciesReferenceMap14 = new HashMap<String, SpeciesReference>();
        // Create a hashmap for the modifiers
        HashMap<String, ModifierSpeciesReference> modifierSpeciesReferenceMap14 = new HashMap<String, ModifierSpeciesReference>();
        // Create a hashmap for the species references
        HashMap<String, SpeciesReference> speciesReferenceMap15 = new HashMap<String, SpeciesReference>();
        // Create a hashmap for the modifiers
        HashMap<String, ModifierSpeciesReference> modifierSpeciesReferenceMap15 = new HashMap<String, ModifierSpeciesReference>();
        // Create a hashmap for the species references
        HashMap<String, SpeciesReference> speciesReferenceMap16 = new HashMap<String, SpeciesReference>();
        // Create a hashmap for the modifiers
        HashMap<String, ModifierSpeciesReference> modifierSpeciesReferenceMap16 = new HashMap