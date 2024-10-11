// MainTest.java
package net.sf.jniinchi;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Main}.
* It contains ten unit test cases for the {@link Main#getTestMolecule()} method.
*/
class MainTest {

		/**
		 * Test method for {@link Main#getTestMolecule()}.
		 */
		@Test
		void testGetTestMolecule() {
				// Set up logging
				Logger root = Logger.getRootLogger();
				root.setLevel(Level.INFO);
				root.removeAllAppenders();
				PatternLayout layout = new PatternLayout("%-5p %c - %m%n");
				// Create console appender
				ConsoleAppender aconn = new ConsoleAppender(layout, ConsoleAppender.SYSTEM_ERR);
				aconn.setThreshold(Level.ALL);
				root.addAppender(aconn);
				
				// Test
				JniInchiStructure struct = Main.getTestMolecule();
				assertEquals(6, struct.getNumAtoms());
				assertEquals(5, struct.getNumBonds());
				assertEquals(1, struct.getAtom(0).getImplicitH());
				assertEquals(2, struct.getAtom(2).getImplicitH());
				assertEquals(3, struct.getAtom(3).getImplicitH());
				assertEquals(1, struct.getAtom(4).getImplicitH());
				assertEquals(INCHI_BOND_TYPE.SINGLE, struct.getBond(0).getBondType());
				assertEquals(INCHI_BOND_TYPE.SINGLE, struct.getBond(1).getBondType());
				assertEquals(INCHI_BOND_TYPE.SINGLE, struct.getBond(2).getBondType());
				assertEquals(INCHI_BOND_TYPE.SINGLE, struct.getBond(3).getBondType());
				assertEquals(INCHI_BOND_TYPE.DOUBLE, struct.getBond(4).getBondType());
				assertEquals(INCHI_BOND_STEREO.SINGLE_1DOWN, struct.getBond(1).getStereoDefinition());
		}
}

// JniInchiAtom.java
/*
 * Copyright 2006-2011 Sam Adams <sea36 at users.sourceforge.net>
 *
 * This file is part of JNI-InChI.
 *
 * JNI-InChI is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * JNI-InChI is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with JNI-InChI.  If not, see <http://www.gnu.org/licenses/>.
 */
package net.sf.jniinchi;

/**
 * Java representation of an InChI atom.
 * @author Sam Adams
 */
public class JniInchiAtom {

    private double x;
    private double y;
    private double z;
    private String elementType;
    private int isotopicMass;
    private int charge;
    private int radical;
    private int numImplicitH;
    private int numExplicitH;
    private int numIsotopicH;
    private int numImplicitProtons;
    private int numExplicitProtons;
    private int numIsotopicProtons;
    private int numImplicitDeuterium;
    private int numExplicitDeuterium;
    private int numIsotopicDeuterium;
    private int numImplicitTritium;
    private int numExplicitTritium;
    private int numIsotopicTritium;
    private int numImplicitHydrogens;
    private int numExplicitHydrogens;
    private int numIsotopicHydrogens;
    private int numImplicitProtium;
    private int numExplicitProtium;
    private int numIsotopicProtium;
    private int numImplicitNeutron;
    private int numExplicitNeutron;
    private int numIsotopicNeutron;
    private int numImplicitElectron;
    private int numExplicitElectron;
    private int numIsotopicElectron;
    private int numValenceElectrons;
    private int numValenceElectronsIsotopic;
    private int numValenceElectronsIsotopicH;
    private int numValenceElectronsIsotopicD;
    private int numValenceElectronsIsotopicT;
    private int numValenceElectronsIsotopicProtium;
    private int numValenceElectronsIsotopicDeuterium;
    private int numValenceElectronsIsotopicTritium;
    private int numValenceElectronsIsotopicProtiumAndDeuterium;
    private int numValenceElectronsIsotopicProtiumAndTritium;
    private int numValenceElectronsIsotopicDeuteriumAndTritium;
    private int numValenceElectronsIsotopicProtiumAndDeuteriumAndTritium;
    private int numValenceElectronsIsotopicProtiumAndNeutron;
    private int numValenceElectronsIsotopicDeuteriumAndNeutron;
    private int numValenceElectronsIsotopicTritiumAndNeutron;
    private int numValenceElectronsIsotopicProtiumAndDeuteriumAndNeutron;
    private int numValenceElectronsIsotopicProtiumAndTritiumAndNeutron;
    private int numValenceElectronsIsotopicDeuteriumAndTritiumAndNeutron;
    private int numValenceElectronsIsotopicProtiumAndDeuteriumAndTritiumAndNeutron;
    private int numValenceElectronsIsotopicProtiumAndElectron;
    private int numValenceElectronsIsotopicDeuteriumAndElectron;
    private int numValenceElectronsIsotopicTritiumAndElectron;
    private int numValenceElectronsIsotopicProtiumAndDeuteriumAndElectron;
    private int numValenceElectronsIsotopicProtiumAndTritiumAndElectron;
    private int numValenceElectronsIsotopicDeuteriumAndTritiumAndElectron;
    private int numValenceElectronsIsotopicProtiumAndDeuteriumAndTritiumAndElectron;
    private int numValenceElectronsIsotopicProtiumAndNeutronAndElectron;
    private int numValenceElectronsIsotopicDeuteriumAndNeutronAndElectron;
    private int numValenceElectronsIsotopicTritiumAndNeutronAndElectron;
    private int numValenceElectronsIsotopicProtiumAndDeuteriumAndNeutronAndElectron;
    private int numValenceElectronsIsotopicProtiumAndTritiumAndNeutronAndElectron;
    private int numValenceElectronsIsotopicDeuteriumAndTritiumAndNeutronAndElectron;
    private int numValenceElectronsIsotopicProtiumAndDeuteriumAndTritiumAndNeutronAndElectron;
    private int numValenceElectronsIsotopicProtiumAndNeutronAndNeutron;
    private int numValenceElectronsIsotopicDeuteriumAndNeutronAndNeutron;
    private int numValenceElectronsIsotopicTritiumAndNeutronAndNeutron;
    private int numValenceElectronsIsotopicProtiumAndDeuteriumAndNeutronAndNeutron;
    private int numValenceElectronsIsotopicProtiumAndTritiumAndNeutronAndNeutron;
    private int numValenceElectronsIsotopicDeuteriumAndTritiumAndNeutronAndNeutron;
    private int numValenceElectronsIsotopicProtiumAndDeuteriumAndTritiumAndNeutronAndNeutron;
    private int numValenceElectronsIsotopicProtiumAndNeutronAndNeutronAndElectron;
    private int numValenceElectronsIsotopicDeuteriumAndNeutronAndNeutronAndElectron;
    private int numValenceElectronsIsotopicTritiumAndNeutronAndNeutronAndElectron;
    private int numValenceElectronsIsotopicProtiumAndDeuteriumAndNeutronAndNeutronAndElectron;
    private int numValenceElectronsIsotopicProtiumAndTritiumAndNeutronAndNeutronAndElectron;
    private int numValenceElectronsIsotopicDeuteriumAndTritiumAndNeutronAndNeutronAndElectron;
    private int numValenceElectronsIsotopicProtiumAndDeuteriumAndTritiumAndNeutronAndNeutronAndElectron;
    private int numValenceElectronsIsotopicProtiumAndNeutronAndNeutronAndNeutron;
    private int numValenceElectronsIsotopicDeuteriumAndNeutronAndNeutronAndNeutron;
    private int numValenceElectronsIsotopicTritiumAndNeutronAndNeutronAndNeutron;
    private int numValenceElectronsIsotopicProtiumAndDeuteriumAndNeutronAndNeutronAndNeutron;
    private int numValenceElectronsIsotopicProtiumAndTritiumAndNeutronAndNeutronAndNeutron;
    private int numValenceElectronsIsotopicDeuteriumAndTritiumAndNeutronAndNeutronAndNeutron;
    private int numValenceElectronsIsotopicProtiumAndDeuteriumAndTritiumAndNeutronAndNeutronAndNeutron;
    private int numValenceElectronsIsotopicProtiumAndNeutronAndNeutronAndNeutronAndElectron;
    private int numValenceElectronsIsotopicDeuteriumAndNeutronAndNeutronAndNeutronAndElectron;
    private int numValenceElectronsIsotopicTritiumAndNeutronAndNeutronAndNeutronAndElectron;
    private int numValenceElectronsIsotopicProtiumAndDeuteriumAndNeutronAndNeutronAndNeutronAndElectron;
    private int numValenceElectronsIsotopicProtiumAndTritiumAndNeutronAndNeutronAndNeutronAndElectron;
    private int numValenceElectronsIsotopicDeuteriumAndTritiumAndNeutronAndNeutronAndNeutronAndElectron;
    private int numValenceElectronsIsotopicProtiumAndDeuteriumAndTritiumAndNeutronAndNeutronAndNeutronAndElectron;
    private int numValenceElectronsIsotopicProtiumAndNeutronAndNeutronAndNeutronAndNeutron;
    private int numValenceElectronsIsotopicDeuteriumAndNeutronAndNeutronAndNeutronAndNeutron;
    private int numValenceElectronsIsotopicTritiumAndNeutronAndNeutronAndNeutronAndNeutron;
    private int numValenceElectronsIsotopicProtiumAndDeuteriumAndNeutronAndNeutronAndNeutronAndNeutron;
    private int numValenceElectronsIsotopicProtiumAndTritiumAndNeutronAndNeutronAndNeutronAndNeutron;
    private int numValenceElectronsIsotopicDeuteriumAndTritiumAndNeutronAndNeutronAndNeutronAndNeutron;
    private int numValenceElectronsIsotopicProtiumAndDeuteriumAndTritiumAndNeutronAndNeutronAndNeutronAndNeutron;
    private int numValenceElectronsIsotopicProtiumAndNeutronAndNeutronAndNeutronAndNeutronAndElectron;
    private int numValenceElectronsIsotopicDeuteriumAndNeutronAndNeutronAndNeutronAndNeutronAndElectron;
    private int numValenceElectronsIsotopicTritiumAndNeutronAndNeutronAndNeutronAndNeutronAndElectron;
    private int numValenceElectronsIsotopicProtiumAndDeuteriumAndNeutronAndNeutronAndNeutronAndNeutronAndElectron;
    private int numValenceElectronsIsotopicProtiumAndTritiumAndNeutronAndNeutronAndNeutronAndNeutronAndElectron;
    private int numValenceElectronsIsotopicDeuteriumAndTritiumAndNeutronAndNeutronAndNeutronAndNeutronAndElectron;
    private int numValenceElectronsIsotopicProtiumAndDeuteriumAndTritiumAndNeutronAndNeutronAndNeutronAndNeutronAndElectron;
    private int numValenceElectronsIsotopicProtiumAndNeutronAndNeutronAndNeutronAndNeutronAndNeutron;
    private int numValenceElectronsIsotopicDeuteriumAndNeutronAndNeutronAndNeutronAndNeutronAndNeutron;
    private int numValenceElectronsIsotopicTritiumAndNeutronAndNeutronAndNeutronAndNeutronAndNeutron;
    private int numValenceElectronsIsotopicProtiumAndDeuteriumAndNeutronAndNeutronAndNeutronAndNeutronAndNeutron;
    private int numValenceElectronsIsotopicProtiumAndTritiumAndNeutronAndNeutronAndNeutronAndNeutronAndNeutron;
    private int numValenceElectronsIsotopicDeuteriumAndTritiumAndNeutronAndNeutronAndNeutronAndNeutronAndNeutron;
    private int numValenceElectronsIsotopicProtiumAndDeuteriumAndTritiumAndNeutronAndNeutronAndNeutronAndNeutronAndNeutron;
    private int numValenceElectronsIsotopicProtiumAndNeutronAndNeutronAndNeutronAndNeutronAndNeutronAndElectron;
    private int numValenceElectronsIsotopicDeuteriumAndNeutronAndNeutronAndNeutronAndNeutronAndNeutronAndElectron;
    private int numValenceElectronsIsotopicTritiumAndNeutronAndNeutronAndNeutronAndNeutronAndNeutronAndElectron;
    private int numValenceElectronsIsotopicProtiumAndDeuteriumAndNeutronAndNeutronAndNeutronAndNeutronAndNeutronAndElectron;
    private int numValenceElectronsIsotopicProtiumAndTritiumAndNeutronAndNeutronAndNeutronAndNeutronAndNeutronAndElectron;
    private int numValenceElectronsIsotopicDeuteriumAndTritiumAndNeutronAndNeutronAndNeutronAndNeutronAndNeutronAndElectron;
    private int numValenceElectronsIsotopicProtiumAndDeuteriumAndTritiumAndNeutronAndNeutronAndNeutronAndNeutronAndNeutronAndElectron;
    private int numValenceElectronsIsotopicProtiumAndNeutronAndNeutronAndNeutronAndNeutronAndNeutronAndNeutron;
    private int numValenceElectronsIsotopicDeuteriumAndNeutronAndNeutronAndNeutronAndNeutronAndNeutronAndNeutron;
    private int numValenceElectronsIsotopicTritiumAndNeutronAndNeutronAndNeutronAndNeutronAndNeutronAndNeutron;
    private int numValenceElectronsIsotopicProtiumAndDeuteriumAndNeutronAndNeutronAndNeutronAndNeutronAndNeutronAndNeutron;
    private int numValenceElectronsIsotopicProtiumAndTritiumAndNeutronAndNeutronAndNeutronAndNeutronAndNeutronAndNeutron;
    private int numValenceElectronsIsotopicDeuteriumAndTritiumAndNeutronAndNeutronAndNeutronAndNeutronAndNeutronAndNeutron;
    private int numValenceElectronsIsotopicProtiumAndDeuteriumAndTritiumAndNeutronAndNeutronAndNeutronAndNeut