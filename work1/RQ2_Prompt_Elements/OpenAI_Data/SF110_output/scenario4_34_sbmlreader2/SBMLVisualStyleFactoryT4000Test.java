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
import javax.xml.stream.*;
import org.sbml.jsbml.*;

/**
 * SBMLReader.java
 * This class reads SBML files and creates a CyNetwork from it.
 *
 * @author W.P.A. Ligtenberg, Eindhoven University of Technology
 */
public class SBMLReader extends CytoscapePlugin {

    /**
     */
    public static final String SBML_READER_MENU = "SBML Reader";

    /**
     */
    public static final String SBML_READER_MENU_ITEM = "Read SBML file";

    /**
     */
    public static final String SBML_READER_MENU_ITEM_DESCRIPTION = "Read SBML file";

    /**
     */
    public static final String SBML_READER_MENU_ITEM_DESCRIPTION_LONG = "Read SBML file";

    /**
     */
    public static final String SBML_READER_MENU_ITEM_DESCRIPTION_LONGER = "Read SBML file";

    /**
     */
    public static final String SBML_READER_MENU_ITEM_DESCRIPTION_LONGEST = "Read SBML file";

    /**
     */
    public static final String SBML_READER_MENU_ITEM_DESCRIPTION_LONGESTEST = "Read SBML file";

    /**
     */
    public static final String SBML_READER_MENU_ITEM_DESCRIPTION_LONGESTESTEST = "Read SBML file";

    /**
     */
    public static final String SBML_READER_MENU_ITEM_DESCRIPTION_LONGESTESTESTEST = "Read SBML file";

    /**
     */
    public static final String SBML_READER_MENU_ITEM_DESCRIPTION_LONGESTESTESTESTEST = "Read SBML file";

    /**
     */
    public static final String SBML_READER_MENU_ITEM_DESCRIPTION_LONGESTESTESTESTESTEST = "Read SBML file";

    /**
     */
    public static final String SBML_READER_MENU_ITEM_DESCRIPTION_LONGESTESTESTESTESTESTEST = "Read SBML file";

    /**
     */
    public static final String SBML_READER_MENU_ITEM_DESCRIPTION_LONGESTESTESTESTESTESTESTEST = "Read SBML file";

    /**
     */
    public static final String SBML_READER_MENU_ITEM_DESCRIPTION_LONGESTESTESTESTESTESTESTESTEST = "Read SBML file";

    /**
     */
    public static final String SBML_READER_MENU_ITEM_DESCRIPTION_LONGESTESTESTESTESTESTESTESTESTEST = "Read SBML file";

    /**
     */
    public static final String SBML_READER_MENU_ITEM_DESCRIPTION_LONGESTESTESTESTESTESTESTESTESTESTEST = "Read SBML file";

    /**
     */
    public static final String SBML_READER_MENU_ITEM_DESCRIPTION_LONGESTESTESTESTESTESTESTESTESTESTESTEST = "Read SBML file";

    /**
     */
    public static final String SBML_READER_MENU_ITEM_DESCRIPTION_LONGESTESTESTESTESTESTESTESTESTESTESTESTEST = "Read SBML file";

    /**
     */
    public static final String SBML_READER_MENU_ITEM_DESCRIPTION_LONGESTESTESTESTESTESTESTESTESTESTESTESTESTEST = "Read SBML file";

    /**
     */
    public static final String SBML_READER_MENU_ITEM_DESCRIPTION_LONGESTESTESTESTESTESTESTESTESTESTESTESTESTESTEST = "Read SBML file";

    /**
     */
    public static final String SBML_READER_MENU_ITEM_DESCRIPTION_LONGESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTEST = "Read SBML file";

    /**
     */
    public static final String SBML_READER_MENU_ITEM_DESCRIPTION_LONGESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTEST = "Read SBML file";

    /**
     */
    public static final String SBML_READER_MENU_ITEM_DESCRIPTION_LONGESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTEST = "Read SBML file";

    /**
     */
    public static final String SBML_READER_MENU_ITEM_DESCRIPTION_LONGESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTEST = "Read SBML file";

    /**
     */
    public static final String SBML_READER_MENU_ITEM_DESCRIPTION_LONGESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTEST = "Read SBML file";

    /**
     */
    public static final String SBML_READER_MENU_ITEM_DESCRIPTION_LONGESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTEST = "Read SBML file";

    /**
     */
    public static final String SBML_READER_MENU_ITEM_DESCRIPTION_LONGESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTEST = "Read SBML file";

    /**
     */
    public static final String SBML_READER_MENU_ITEM_DESCRIPTION_LONGESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTEST = "Read SBML file";

    /**
     */
    public static final String SBML_READER_MENU_ITEM_DESCRIPTION_LONGESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTEST = "Read SBML file";

    /**
     */
    public static final String SBML_READER_MENU_ITEM_DESCRIPTION_LONGESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTEST = "Read SBML file";

    /**
     */
    public static final String SBML_READER_MENU_ITEM_DESCRIPTION_LONGESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTEST = "Read SBML file";

    /**
     */
    public static final String SBML_READER_MENU_ITEM_DESCRIPTION_LONGESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTEST = "Read SBML file";

    /**
     */
    public static final String SBML_READER_MENU_ITEM_DESCRIPTION_LONGESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTEST = "Read SBML file";

    /**
     */
    public static final String SBML_READER_MENU_ITEM_DESCRIPTION_LONGESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTEST = "Read SBML file";

    /**
     */
    public static final String SBML_READER_MENU_ITEM_DESCRIPTION_LONGESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTEST = "Read SBML file";

    /**
     */
    public static final String SBML_READER_MENU_ITEM_DESCRIPTION_LONGESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTEST = "Read SBML file";

    /**
     */
    public static final String SBML_READER_MENU_ITEM_DESCRIPTION_LONGESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTEST = "Read SBML file";

    /**
     */
    public static final String SBML_READER_MENU_ITEM_DESCRIPTION_LONGESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTEST = "Read SBML file";

    /**
     */
    public static final String SBML_READER_MENU_ITEM_DESCRIPTION_LONGESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTEST = "Read SBML file";

    /**
     */
    public static final String SBML_READER_MENU_ITEM_DESCRIPTION_LONGESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTEST = "Read SBML file";

    /**
     */
    public static final String SBML_READER_MENU_ITEM_DESCRIPTION_LONGESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTEST = "Read SBML file";

    /**
     */
    public static final String SBML_READER_MENU_ITEM_DESCRIPTION_LONGESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTEST = "Read SBML file";

    /**
     */
    public static final String SBML_READER_MENU_ITEM_DESCRIPTION_LONGESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTEST = "Read SBML file";

    /**
     */
    public static final String SBML_READER_MENU_ITEM_DESCRIPTION_LONGESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTEST = "Read SBML file";

    /**
     */
    public static final String SBML_READER_MENU_ITEM_DESCRIPTION_LONGESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTEST = "Read SBML file";

    /**
     */
    public static final String SBML_READER_MENU_ITEM_DESCRIPTION_LONGESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTESTEST = "Read SBML file";

    /**
     */
    public static final String SBML_READER_MENU_ITEM_DESCRIPTION_LONGESTESTESTESTESTESTEST