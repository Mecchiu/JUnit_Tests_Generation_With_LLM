// SBMLVisualStyleFactoryTest.java
package sbmlreader2;

/*
 Copyright (c) 2006, 2007, The Cytoscape Consortium (www.cytoscape.org)

 The Cytoscape Consortium is:
 - Institute for Systems Biology
 - University of California San Diego
 - Memorial Sloan-Kettering Cancer Center
 - Institut Pasteur
 - Agilent Technologies

 This library is free software; you can redistribute it and/or modify it
 under the terms of the GNU Lesser General Public License as published
 by the Free Software Foundation; either version 2.1 of the License, or
 any later version.

 This library is distributed in the hope that it will be useful, but
 WITHOUT ANY WARRANTY, WITHOUT EVEN THE IMPLIED WARRANTY OF
 MERCHANTABILITY OR FITNESS FOR A PARTICULAR PURPOSE.  The software and
 documentation provided hereunder is on an "as is" basis, and the
 Institute for Systems Biology and the Whitehead Institute
 have no obligations to provide maintenance, support,
 updates, enhancements or modifications.  In no event shall the
 Institute for Systems Biology and the Whitehead Institute
 be liable to any party for direct, indirect, special,
 incidental or consequential damages, including lost profits, arising
 out of the use of this software and its documentation, even if the
 Institute for Systems Biology and the Whitehead Institute
 have been advised of the possibility of such damage.  See
 the GNU Lesser General Public License for more details.

 You should have received a copy of the GNU Lesser General Public License
 along with this library; if not, write to the Free Software Foundation,
 Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.
*/
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
	 * Test of createVisualStyle method, of class SBMLVisualStyleFactory.
	 */
	@Test
	void testCreateVisualStyle() {
		System.out.println("createVisualStyle");
		CyNetwork network = null;
		VisualStyle result = SBMLVisualStyleFactory.createVisualStyle(network);
		assertNotNull(result);
	}
	
}

// SBMLReader.java
package sbmlreader2;

/*
 Copyright (c) 2006, 2007, The Cytoscape Consortium (www.cytoscape.org)

 The Cytoscape Consortium is:
 - Institute for Systems Biology
 - University of California San Diego
 - Memorial Sloan-Kettering Cancer Center
 - Institut Pasteur
 - Agilent Technologies

 This library is free software; you can redistribute it and/or modify it
 under the terms of the GNU Lesser General Public License as published
 by the Free Software Foundation; either version 2.1 of the License, or
 any later version.

 This library is distributed in the hope that it will be useful, but
 WITHOUT ANY WARRANTY, WITHOUT EVEN THE IMPLIED WARRANTY OF
 MERCHANTABILITY OR FITNESS FOR A PARTICULAR PURPOSE.  The software and
 documentation provided hereunder is on an "as is" basis, and the
 Institute for Systems Biology and the Whitehead Institute
 have no obligations to provide maintenance, support,
 updates, enhancements or modifications.  In no event shall the
 Institute for Systems Biology and the Whitehead Institute
 be liable to any party for direct, indirect, special,
 incidental or consequential damages, including lost profits, arising
 out of the use of this software and its documentation, even if the
 Institute for Systems Biology and the Whitehead Institute
 have been advised of the possibility of such damage.  See
 the GNU Lesser General Public License for more details.

 You should have received a copy of the GNU Lesser General Public License
 along with this library; if not, write to the Free Software Foundation,
 Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.
*/
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
 * This class reads SBML files and creates a CyNetwork.
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
        SBMLReader reader = new SBMLReader();
        reader.readFile(args[0]);
    }

    /**
     *  DOCUMENT ME!
     */
    public SBMLReader() {
        Cytoscape.getDesktop().getCyMenus().addCytoscapeAction(new SBMLReaderAction());
    }

    /**
     *  DOCUMENT ME!
     *
     * @param fileName DOCUMENT ME!
     */
    public void readFile(String fileName) {
        try {
            // Create a new SBML document
            SBMLDocument doc = new SBMLDocument(2, 4);
            // Read the file
            XMLInputStream xis = new XMLInputStream(new FileInputStream(fileName), false);
            doc = doc.readSBML(xis);
            // Create a new CyNetwork
            CyNetwork network = Cytoscape.createNetwork(fileName);
            // Create a new CyAttributes
            CyAttributes nodeAttributes = Cytoscape.getNodeAttributes();
            CyAttributes edgeAttributes = Cytoscape.getEdgeAttributes();
            // Create a new SBMLVisualStyleFactory
            SBMLVisualStyleFactory visualStyleFactory = new SBMLVisualStyleFactory();
            // Create a new VisualStyle
            VisualStyle visualStyle = visualStyleFactory.createVisualStyle(network);
            // Add the VisualStyle to the VisualMappingManager
            Cytoscape.getVisualMappingManager().setVisualStyle(visualStyle);
            // Get the model
            Model model = doc.getModel();
            // Get the listOfSpecies
            ListOf<Species> listOfSpecies = model.getListOfSpecies();
            // Get the listOfReactions
            ListOf<Reaction> listOfReactions = model.getListOfReactions();
            // Create a new HashMap
            HashMap<String, Node> nodeMap = new HashMap<String, Node>();
            // Create a new HashMap
            HashMap<String, Edge> edgeMap = new HashMap<String, Edge>();
            // Create a new HashMap
            HashMap<String, String> speciesMap = new HashMap<String, String>();
            // Create a new HashMap
            HashMap<String, String> reactionMap = new HashMap<String, String>();
            // Create a new HashMap
            HashMap<String, String> modifierMap = new HashMap<String, String>();
            // Create a new HashMap
            HashMap<String, String> productMap = new HashMap<String, String>();
            // Create a new HashMap
            HashMap<String, String> reactantMap = new HashMap<String, String>();
            // Create a new HashMap
            HashMap<String, String> speciesNameMap = new HashMap<String, String>();
            // Create a new HashMap
            HashMap<String, String> reactionNameMap = new HashMap<String, String>();
            // Create a new HashMap
            HashMap<String, String> modifierNameMap = new HashMap<String, String>();
            // Create a new HashMap
            HashMap<String, String> productNameMap = new HashMap<String, String>();
            // Create a new HashMap
            HashMap<String, String> reactantNameMap = new HashMap<String, String>();
            // Create a new HashMap
            HashMap<String, String> speciesIdMap = new HashMap<String, String>();
            // Create a new HashMap
            HashMap<String, String> reactionIdMap = new HashMap<String, String>();
            // Create a new HashMap
            HashMap<String, String> modifierIdMap = new HashMap<String, String>();
            // Create a new HashMap
            HashMap<String, String> productIdMap = new HashMap<String, String>();
            // Create a new HashMap
            HashMap<String, String> reactantIdMap = new HashMap<String, String>();
            // Create a new HashMap
            HashMap<String, String> speciesCompartmentMap = new HashMap<String, String>();
            // Create a new HashMap
            HashMap<String, String> reactionCompartmentMap = new HashMap<String, String>();
            // Create a new HashMap
            HashMap<String, String> modifierCompartmentMap = new HashMap<String, String>();
            // Create a new HashMap
            HashMap<String, String> productCompartmentMap = new HashMap<String, String>();
            // Create a new HashMap
            HashMap<String, String> reactantCompartmentMap = new HashMap<String, String>();
            // Create a new HashMap
            HashMap<String, String> speciesInitialAmountMap = new HashMap<String, String>();
            // Create a new HashMap
            HashMap<String, String> reactionInitialAmountMap = new HashMap<String, String>();
            // Create a new HashMap
            HashMap<String, String> modifierInitialAmountMap = new HashMap<String, String>();
            // Create a new HashMap
            HashMap<String, String> productInitialAmountMap = new HashMap<String, String>();
            // Create a new HashMap
            HashMap<String, String> reactantInitialAmountMap = new HashMap<String, String>();
            // Create a new HashMap
            HashMap<String, String> speciesInitialConcentrationMap = new HashMap<String, String>();
            // Create a new HashMap
            HashMap<String, String> reactionInitialConcentrationMap = new HashMap<String, String>();
            // Create a new HashMap
            HashMap<String, String> modifierInitialConcentrationMap = new HashMap<String, String>();
            // Create a new HashMap
            HashMap<String, String> productInitialConcentrationMap = new HashMap<String, String>();
            // Create a new HashMap
            HashMap<String, String> reactantInitialConcentrationMap = new HashMap<String, String>();
            // Create a new HashMap
            HashMap<String, String> speciesSubstanceUnitsMap = new HashMap<String, String>();
            // Create a new HashMap
            HashMap<String, String> reactionSubstanceUnitsMap = new HashMap<String, String>();
            // Create a new HashMap
            HashMap<String, String> modifierSubstanceUnitsMap = new HashMap<String, String>();
            // Create a new HashMap
            HashMap<String, String> productSubstanceUnitsMap = new HashMap<String, String>();
            // Create a new HashMap
            HashMap<String, String> reactantSubstanceUnitsMap = new HashMap<String, String>();
            // Create a new HashMap
            HashMap<String, String> speciesSpatialSizeUnitsMap = new HashMap<String, String>();
            // Create a new HashMap
            HashMap<String, String> reactionSpatialSizeUnitsMap = new HashMap<String, String>();
            // Create a new HashMap
            HashMap<String, String> modifierSpatialSizeUnitsMap = new HashMap<String, String>();
            // Create a new HashMap
            HashMap<String, String> productSpatialSizeUnitsMap = new HashMap<String, String>();
            // Create a new HashMap
            HashMap<String, String> reactantSpatialSizeUnitsMap = new HashMap<String, String>();
            // Create a new HashMap
            HashMap<String, String> speciesUnitsMap = new HashMap<String, String>();
            // Create a new HashMap
            HashMap<String, String> reactionUnitsMap = new HashMap<String, String>();
            // Create a new HashMap
            HashMap<String, String> modifierUnitsMap = new HashMap<String, String>();
            // Create a new HashMap
            HashMap<String, String> productUnitsMap = new HashMap<String, String>();
            // Create a new HashMap
            HashMap<String, String> reactantUnitsMap = new HashMap<String, String>();
            // Create a new HashMap
            HashMap<String, String> speciesConversionFactorMap = new HashMap<String, String>();
            // Create a new HashMap
            HashMap<String, String> reactionConversionFactorMap = new HashMap<String, String>();
            // Create a new HashMap
            HashMap<String, String> modifierConversionFactorMap = new HashMap<String, String>();
            // Create a new HashMap
            HashMap<String, String> productConversionFactorMap = new HashMap<String, String>();
            // Create a new HashMap
            HashMap<String, String> reactantConversionFactorMap = new HashMap<String, String>();
            // Create a new HashMap
            HashMap<String, String> speciesBoundaryConditionMap = new HashMap<String, String>();
            // Create a new HashMap
            HashMap<String, String> reactionBoundaryConditionMap = new HashMap<String, String>();
            // Create a new HashMap
            HashMap<String, String> modifierBoundaryConditionMap = new HashMap<String, String>();
            // Create a new HashMap
            HashMap<String, String> productBoundaryConditionMap = new HashMap<String, String>();
            // Create a new HashMap
            HashMap<String, String> reactantBoundaryConditionMap = new HashMap<String, String>();
            // Create a new HashMap
            HashMap<String, String> speciesChargeMap = new HashMap<String, String>();
            // Create a new HashMap
            HashMap<String, String> reactionChargeMap = new HashMap<String, String>();
            // Create a new HashMap
            HashMap<String, String> modifierChargeMap = new HashMap<String, String>();
            // Create a new HashMap
            HashMap<String, String> productChargeMap = new HashMap<String, String>();
            // Create a new HashMap
            HashMap<String, String> reactantChargeMap = new HashMap<String, String>();
            // Create a new HashMap
            HashMap<String, String> speciesConstantMap = new HashMap<String, String>();
            // Create a new HashMap
            HashMap<String, String> reactionConstantMap = new HashMap<String, String>();
            // Create a new HashMap
            HashMap<String, String> modifierConstantMap = new HashMap<String, String>();
            // Create a new HashMap
            HashMap<String, String> productConstantMap = new HashMap<String, String>();
            // Create a new HashMap
            HashMap<String, String> reactantConstantMap = new HashMap<String, String>();
            // Create a new HashMap
            HashMap<String, String> speciesHasOnlySubstanceUnitsMap = new HashMap<String, String>();
            // Create a new HashMap
            HashMap<String, String> reactionHasOnlySubstanceUnitsMap = new HashMap<String, String>();
            // Create a new HashMap
            HashMap<String, String> modifierHasOnlySubstanceUnitsMap = new HashMap<String, String>();
            // Create a new HashMap
            HashMap<String, String> productHasOnlySubstanceUnitsMap = new HashMap<String, String>();
            // Create a new HashMap
            HashMap<String, String> reactantHasOnlySubstanceUnitsMap = new HashMap<String, String>();
            // Create a new HashMap
            HashMap<String, String> speciesIdentityMap = new HashMap<String, String>();
            // Create a new HashMap
            HashMap<String, String> reactionIdentityMap = new HashMap<String, String>();
            // Create a new HashMap
            HashMap<String, String> modifierIdentityMap = new HashMap<String, String>();
            // Create a new HashMap
            HashMap<String, String> productIdentityMap = new HashMap<String, String>();
            // Create a new HashMap
            HashMap<String, String> reactantIdentityMap = new HashMap<String, String>();
            // Create a new HashMap
            HashMap<String, String> speciesMetaIdMap = new HashMap<String, String>();
            // Create a new HashMap
            HashMap<String, String> reactionMetaIdMap = new HashMap<String, String>();
            // Create a new HashMap
            HashMap<String, String> modifierMetaIdMap = new HashMap<String, String>();
            // Create a new HashMap
            HashMap<String, String> productMetaIdMap = new HashMap<String, String>();
            // Create a new HashMap
            HashMap<String, String> reactantMetaIdMap = new HashMap<String, String>();
            // Create a new HashMap
            HashMap<String, String> speciesNotesMap = new HashMap<String, String>();
            // Create a new HashMap
            HashMap<String, String> reactionNotesMap = new HashMap<String, String>();
            // Create a new HashMap
            HashMap<String, String> modifierNotesMap = new HashMap<String, String>();
            // Create a new HashMap
            HashMap<String, String> productNotesMap = new HashMap<String, String>();
            // Create a new HashMap
            HashMap<String, String> reactantNotesMap = new HashMap<String, String>();
            // Create a new HashMap
            HashMap<String, String> speciesAnnotationMap = new HashMap<String, String>();
            // Create a new HashMap
            HashMap<String, String> reactionAnnotationMap = new HashMap<String, String>();
            // Create a new HashMap
            HashMap<String, String> modifierAnnotationMap = new