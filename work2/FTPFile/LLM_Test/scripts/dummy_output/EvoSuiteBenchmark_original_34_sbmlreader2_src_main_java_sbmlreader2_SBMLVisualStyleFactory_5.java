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
     * DOCUMENT ME!
     *
     * @param  network  DOCUMENT ME!
     * @throws  Exception DOCUMENT ME!
     */
    @Test
    public void testCreateVisualStyle(CyNetwork network) throws Exception {     
				
        String visualString = ""
                                + "import sbml;"
                                + "import cytoscape.tools::Evaluator;"
                                + "import cytoscape.structure.CyNode;"
                                + "import cytoscape.structure.CyEdge;";
        
        String nodeTypeAtt = "";
        String interactionTypeAtt = "";
        NamedNodeMap styleParams = network.getModel().getMetadataRoot().getNode("style").getAttributes();
        
        for(int i = 0; i < styleParams.getLength(); i++) {
            String key = styleParams.item(i).getLocalName();
            String value = styleParams.item(i).getNodeValue();
            
            if (key.equals(NODE_TYPE_ATT)){ // Node type
                    nodeTypeAtt = value; 
            } else if (key.equals(EDGE_TYPE_ATT)){ // Edge type
                    interactionTypeAtt = value;
            }
        }
        
        if (nodeTypeAtt.isEmpty()) {
            String defaultNodeTypeAtt = network.getNamedNode("Default node type").getLocalName();
            nodeTypeAtt = defaultNodeTypeAtt.replace('.', '/');
        } else {
            String defaultNodeTypeAtt = nodeTypeAtt.replace('.', '/');
        }
        
        if (interactionTypeAtt.isEmpty()) {
            String defaultEdgeTypeAtt = network.getNamedNode("Default edge type").getLocalName();
            interactionTypeAtt = defaultEdgeTypeAtt.replace('.', '/');
        } else {
            String defaultEdgeTypeAtt = interactionTypeAtt.replace('.', '/');
        }
        
        VisualStyle visualStyle = network.getDataTypeFactory().createVisualStyle(network);
        // Visualization VisualizationStyle  
        //    default:    blue line 
           
        visualStyle.addParameter("Color", Color.BLUE);
       
        // Visualization VisualStyle  // VisualizationStyle
        VisualStyle visualStyle2 = network.getDataTypeFactory().createVisualStyle(network);
        visualStyle2.addParameter("Color", Color.BLUE);
        
        // Visualization VisualStyle  // VisualizationStyle/nodedata
        VisualStyle visualStyle3 = network.getDataTypeFactory().createVisualStyle(network);
        visualStyle3.addParameter("Color", Color.BLUE);
    }
}