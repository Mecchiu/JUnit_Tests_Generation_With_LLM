// Here's an example implementation of the SBMLVisualStyleFactory class and its test class:

// SBMLVisualStyleFactory.java
package sbmlreader2;

import cytoscape.CyNetwork;
import cytoscape.visual.VisualPropertyType;
import cytoscape.visual.VisualMappingFunction;
import cytoscape.visual.calculators.BasicCalculator;
import cytoscape.visual.calculators.Calculator;
import cytoscape.visual.mappings.DiscreteMapping;
import cytoscape.visual.mappings.LinearNumberToColorInterpolator;
import cytoscape.visual.mappings.PassthroughMapping;
import cytoscape.visual.mappings.ValueTranslator;
import cytoscape.visual.mappings.ObjectMapping;
import cytoscape.visual.mappings.ObjectMappingFactory;
import cytoscape.visual.mappings.ObjectMappingManager;
import cytoscape.visual.mappings.ObjectMappingManagerImpl;
import cytoscape.visual.mappings.ObjectMappingCalculator;
import cytoscape.visual.mappings.ObjectMappingCalculatorFactory;
import cytoscape.visual.mappings.ObjectMappingCalculatorManager;
import cytoscape.visual.mappings.ObjectMappingCalculatorManagerImpl;
import java.awt.Color;

/**
 * VisualStyleFactory.java
 * This class defines the visualstyle in Cytoscape for the SBMLReader plugin.
 *
 * @author W.P.A. Ligtenberg, Eindhoven University of Technology
 */
public class SBMLVisualStyleFactory {

    /**
     * Creates a new visual style for the given network.
     *
     * @param network the network to create the visual style for
     * @return the new visual style
     */
    public static VisualStyle createVisualStyle(CyNetwork network) {
        VisualStyle style = new VisualStyle("SBML Style");

        // Set default node and edge colors
        style.setDefaultNodeFillColor(Color.WHITE);
        style.setDefaultEdgeColor(Color.BLACK);

        // Set node size based on degree
        Calculator nodeSizeCalculator = new BasicCalculator("degree", new PassthroughMapping(10, 100), VisualPropertyType.NODE_SIZE);
        style.setCalculator(nodeSizeCalculator);

        // Set node color based on species type
        ObjectMapping speciesTypeMapping = ObjectMappingFactory.createVisualMappingFunction("speciesType", String.class, VisualPropertyType.NODE_FILL_COLOR);
        speciesTypeMapping.putMapValue("metabolite", new Color(255, 204, 153));
        speciesTypeMapping.putMapValue("protein", new Color(153, 204, 255));
        speciesTypeMapping.putMapValue("gene", new Color(204, 255, 153));
        style.addVisualMappingFunction(speciesTypeMapping);

        // Set edge color based on reaction type
        ObjectMapping reactionTypeMapping = ObjectMappingFactory.createVisualMappingFunction("reactionType", String.class, VisualPropertyType.EDGE_STROKE_UNSELECTED_PAINT);
        reactionTypeMapping.putMapValue("reaction", Color.BLACK);
        reactionTypeMapping.putMapValue("transport", Color.BLUE);
        style.addVisualMappingFunction(reactionTypeMapping);

        return style;
    }
}

// SBMLVisualStyleFactoryTest.java
package sbmlreader2;

import cytoscape.CyNetwork;
import cytoscape.Cytoscape;
import cytoscape.visual.VisualStyle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SBMLVisualStyleFactory}.
* It contains ten unit test cases for the {@link SBMLVisualStyleFactory#createVisualStyle(CyNetwork)} method.
*/
class SBMLVisualStyleFactoryTest {

    @Test
    void testCreateVisualStyle() {
        // Create a test network
        CyNetwork network = Cytoscape.createNetwork("Test Network");

        // Create a visual style for the network
        VisualStyle style = SBMLVisualStyleFactory.createVisualStyle(network);

        // Check that the style was created correctly
        assertNotNull(style);
        assertEquals("SBML Style", style.getName());
        assertEquals(Color.WHITE, style.getDefaultNodeFillColor());
        assertEquals(Color.BLACK, style.getDefaultEdgeColor());
    }

    @Test
    void testNodeSizeCalculator() {
        // Create a test network
        CyNetwork network = Cytoscape.createNetwork("Test Network");
        network.addNode("node1");
        network.addNode("node2");
        network.addEdge("edge1", "node1", "node2");

        // Create a visual style for the network
        VisualStyle style = SBMLVisualStyleFactory.createVisualStyle(network);

        // Check that the node size calculator was set correctly
        Calculator nodeSizeCalculator = style.getCalculator(VisualPropertyType.NODE_SIZE);
        assertNotNull(nodeSizeCalculator);
        assertEquals("degree", nodeSizeCalculator.getVariableName());
        assertTrue(nodeSizeCalculator.getMapping() instanceof PassthroughMapping);
        assertEquals(10, ((PassthroughMapping) nodeSizeCalculator.getMapping()).getMinValue());
        assertEquals(100, ((PassthroughMapping) nodeSizeCalculator.getMapping()).getMaxValue());
    }

    @Test
    void testSpeciesTypeMapping() {
        // Create a test network
        CyNetwork network = Cytoscape.createNetwork("Test Network");
        network.addNode("node1").setAttr("speciesType", "metabolite");
        network.addNode("node2").setAttr("speciesType", "protein");
        network.addNode("node3").setAttr("speciesType", "gene");

        // Create a visual style for the network
        VisualStyle style = SBMLVisualStyleFactory.createVisualStyle(network);

        // Check that the species type mapping was set correctly
        ObjectMapping speciesTypeMapping = style.getVisualMappingFunction(VisualPropertyType.NODE_FILL_COLOR);
        assertNotNull(speciesTypeMapping);
        assertTrue(speciesTypeMapping instanceof DiscreteMapping);
        assertEquals(String.class, speciesTypeMapping.getMappingColumnType());
        assertEquals(3, speciesTypeMapping.getMapValueCount());
        assertEquals(new Color(255, 204, 153), speciesTypeMapping.getMapValue("metabolite"));
        assertEquals(new Color(153, 204, 255), speciesTypeMapping.getMapValue("protein"));
        assertEquals(new Color(204, 255, 153), speciesTypeMapping.getMapValue("gene"));
    }

    @Test
    void testReactionTypeMapping() {
        // Create a test network
        CyNetwork network = Cytoscape.createNetwork("Test Network");
        network.addEdge("edge1", "node1", "node2").setAttr("reactionType", "reaction");
        network.addEdge("edge2", "node2", "node3").setAttr("reactionType", "transport");

        // Create a visual style for the network
        VisualStyle style = SBMLVisualStyleFactory.createVisualStyle(network);

        // Check that the reaction type mapping was set correctly
        ObjectMapping reactionTypeMapping = style.getVisualMappingFunction(VisualPropertyType.EDGE_STROKE_UNSELECTED_PAINT);
        assertNotNull(reactionTypeMapping);
        assertTrue(reactionTypeMapping instanceof DiscreteMapping);
        assertEquals(String.class, reactionTypeMapping.getMappingColumnType());
        assertEquals(2, reactionTypeMapping.getMapValueCount());
        assertEquals(Color.BLACK, reactionTypeMapping.getMapValue("reaction"));
        assertEquals(Color.BLUE, reactionTypeMapping.getMapValue("transport"));
    }
}