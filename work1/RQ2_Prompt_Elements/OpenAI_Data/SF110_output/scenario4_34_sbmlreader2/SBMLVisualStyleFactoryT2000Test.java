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
	* Test case 1:
	* Test if the visual style is created correctly.
	*/
	@Test
	void testCreateVisualStyle1() {
		CyNetwork network = new CyNetwork();
		VisualStyle visualStyle = SBMLVisualStyleFactory.createVisualStyle(network);
		assertEquals(visualStyle.getName(), "SBMLReader Style");
	}
	
	/**
	* Test case 2:
	* Test if the visual style is created correctly.
	*/
	@Test
	void testCreateVisualStyle2() {
		CyNetwork network = new CyNetwork();
		VisualStyle visualStyle = SBMLVisualStyleFactory.createVisualStyle(network);
		assertEquals(visualStyle.getNodeAppearanceCalculator().getCalculator(VisualPropertyType.NODE_FILL_COLOR).getMapping(0).getControllingAttributeName(), "sbml type");
	}
	
	/**
	* Test case 3:
	* Test if the visual style is created correctly.
	*/
	@Test
	void testCreateVisualStyle3() {
		CyNetwork network = new CyNetwork();
		VisualStyle visualStyle = SBMLVisualStyleFactory.createVisualStyle(network);
		assertEquals(visualStyle.getNodeAppearanceCalculator().getCalculator(VisualPropertyType.NODE_FILL_COLOR).getMapping(0).getControllingAttributeName(), "sbml type");
	}
	
	/**
	* Test case 4:
	* Test if the visual style is created correctly.
	*/
	@Test
	void testCreateVisualStyle4() {
		CyNetwork network = new CyNetwork();
		VisualStyle visualStyle = SBMLVisualStyleFactory.createVisualStyle(network);
		assertEquals(visualStyle.getNodeAppearanceCalculator().getCalculator(VisualPropertyType.NODE_FILL_COLOR).getMapping(0).getControllingAttributeName(), "sbml type");
	}
	
	/**
	* Test case 5:
	* Test if the visual style is created correctly.
	*/
	@Test
	void testCreateVisualStyle5() {
		CyNetwork network = new CyNetwork();
		VisualStyle visualStyle = SBMLVisualStyleFactory.createVisualStyle(network);
		assertEquals(visualStyle.getNodeAppearanceCalculator().getCalculator(VisualPropertyType.NODE_FILL_COLOR).getMapping(0).getControllingAttributeName(), "sbml type");
	}
	
	/**
	* Test case 6:
	* Test if the visual style is created correctly.
	*/
	@Test
	void testCreateVisualStyle6() {
		CyNetwork network = new CyNetwork();
		VisualStyle visualStyle = SBMLVisualStyleFactory.createVisualStyle(network);
		assertEquals(visualStyle.getNodeAppearanceCalculator().getCalculator(VisualPropertyType.NODE_FILL_COLOR).getMapping(0).getControllingAttributeName(), "sbml type");
	}
	
	/**
	* Test case 7:
	* Test if the visual style is created correctly.
	*/
	@Test
	void testCreateVisualStyle7() {
		CyNetwork network = new CyNetwork();
		VisualStyle visualStyle = SBMLVisualStyleFactory.createVisualStyle(network);
		assertEquals(visualStyle.getNodeAppearanceCalculator().getCalculator(VisualPropertyType.NODE_FILL_COLOR).getMapping(0).getControllingAttributeName(), "sbml type");
	}
	
	/**
	* Test case 8:
	* Test if the visual style is created correctly.
	*/
	@Test
	void testCreateVisualStyle8() {
		CyNetwork network = new CyNetwork();
		VisualStyle visualStyle = SBMLVisualStyleFactory.createVisualStyle(network);
		assertEquals(visualStyle.getNodeAppearanceCalculator().getCalculator(VisualPropertyType.NODE_FILL_COLOR).getMapping(0).getControllingAttributeName(), "sbml type");
	}
	
	/**
	* Test case 9:
	* Test if the visual style is created correctly.
	*/
	@Test
	void testCreateVisualStyle9() {
		CyNetwork network = new CyNetwork();
		VisualStyle visualStyle = SBMLVisualStyleFactory.createVisualStyle(network);
		assertEquals(visualStyle.getNodeAppearanceCalculator().getCalculator(VisualPropertyType.NODE_FILL_COLOR).getMapping(0).getControllingAttributeName(), "sbml type");
	}
	
	/**
	* Test case 10:
	* Test if the visual style is created correctly.
	*/
	@Test
	void testCreateVisualStyle10() {
		CyNetwork network = new CyNetwork();
		VisualStyle visualStyle = SBMLVisualStyleFactory.createVisualStyle(network);
		assertEquals(visualStyle.getNodeAppearanceCalculator().getCalculator(VisualPropertyType.NODE_FILL_COLOR).getMapping(0).getControllingAttributeName(), "sbml type");
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
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.filechooser.*;
import org.sbml.libsbml.*;

/**
 * SBMLReader.java
 * This class reads SBML files and creates a CyNetwork from it.
 *
 * @author W.P.A. Ligtenberg, Eindhoven University of Technology
 */
public class SBMLReader extends CytoscapePlugin {

    /**
     */
    public static final String SBML_NETWORK_NAME = "SBML Network";

    /**
     */
    public static final String SBML_NETWORK_TITLE = "SBML Network";

    /**
     */
    public static final String SBML_NETWORK_DESCRIPTION = "SBML Network";

    /**
     */
    public static final String SBML_NETWORK_TYPE = "SBML Network";

    /**
     */
    public static final String SBML_NETWORK_SOURCE = "SBML Network";

    /**
     */
    public static final String SBML_NETWORK_VERSION = "SBML Network";

    /**
     */
    public static final String SBML_NETWORK_DATE = "SBML Network";

    /**
     */
    public static final String SBML_NETWORK_FORMAT = "SBML Network";

    /**
     */
    public static final String SBML_NETWORK_IDENTIFIER = "SBML Network";

    /**
     */
    public static final String SBML_NETWORK_SOURCE_FILE = "SBML Network";

    /**
     */
    public static final String SBML_NETWORK_ATTRIBUTE_NAME = "SBML Network";

    /**
     */
    public static final String SBML_NETWORK_ATTRIBUTE_DESCRIPTION = "SBML Network";

    /**
     */
    public static final String SBML_NETWORK_ATTRIBUTE_TYPE = "SBML Network";

    /**
     */
    public static final String SBML_NETWORK_ATTRIBUTE_VALUE = "SBML Network";

    /**
     */
    public static final String SBML_NETWORK_ATTRIBUTE_SOURCE = "SBML Network";

    /**
     */
    public static final String SBML_NETWORK_ATTRIBUTE_VERSION = "SBML Network";

    /**
     */
    public static final String SBML_NETWORK_ATTRIBUTE_DATE = "SBML Network";

    /**
     */
    public static final String SBML_NETWORK_ATTRIBUTE_FORMAT = "SBML Network";

    /**
     */
    public static final String SBML_NETWORK_ATTRIBUTE_IDENTIFIER = "SBML Network";