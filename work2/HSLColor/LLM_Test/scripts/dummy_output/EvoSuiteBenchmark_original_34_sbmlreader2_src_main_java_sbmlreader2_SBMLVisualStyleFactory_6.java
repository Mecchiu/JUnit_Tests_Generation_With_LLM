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
		
    static CyNetwork network;

		/**
     * Test that the class {@link SBMLVisualStyleFactory#createVisualStyle(CyNetwork)}
     * returns the expected {@link VisualStyle}.
     */
    @Test
    public void testCreateVisualStyle() {
        Cytoscape.initialize(network);

        Cytoscape.getCurrent().startup(new int[] {Cytoscape.STANDARD_UI_SCOPE});

        Cytoscape.model.Model model = Cytoscape.loadModel("CytoscapeTestModel.xml");
        ModelVisual style = model.getVisualStyle("default");
        assertFalse(style==null);
    }

		/**
     * Test that the class {@link SBMLVisualStyleFactory#createVisualStyle(CyNetwork)}
     * returns an array containing two elements.
     */
    @Test
    public void testCreateVisualStyleArray() {
        Cytoscape.initialize(network);

        Cytoscape.getCurrent().startup(new int[] {Cytoscape.STANDARD_UI_SCOPE});

        Cytoscape.model.Model model = Cytoscape.loadModel("CytoscapeTestModel.xml");
        NamedNodeMap style_nodes = model.getDefinition().getStyleNodes();
        Cytoscape.getCurrent().stop();

        int[] array_count = new int[2];
        int array_offset = 0;
        for (Object o : style_nodes.getNodes()) {
            NamedNode node = (NamedNode) o;
            array_offset = array_offset + 1;
            Color color = (Color) node.getContent();
            Color color_in_array = new Color(color.getRed() / array_count[0],
                 color.getGreen() / array_count[1],
                 color.getBlue() / array_count[2]);
            new Color(
                color_in_array.getRed() / array_count[0],
                color_in_array.getGreen() / array_count[1],
                color_in_array.getBlue() / array_count[2]);
        }
        
        NetworkDef def = Cytoscape.readNetwork(network);
        ModelVisual[] visual_arrays = def.getVisuals();
        assertEquals(2, visual_arrays.length);
        ModelVisual vis1 = (ModelVisual) visual_arrays[0];
        ModelVisual vis2 = (ModelVisual) visual_arrays[1];
        assertTrue(vis1.getStyle().equals(vis2.getStyle()));
        
//         vis1.updateColor(new Color(0, 0, 0));
//         System.out.println(vis1.getStyle());
//         System.out.println(str(NetworkDef.toString(def, "") + "\n"));
    }
	
	/**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    private static String str(String doc) {
        return doc.substring(4,5); // get rid of brackets.
    }

}