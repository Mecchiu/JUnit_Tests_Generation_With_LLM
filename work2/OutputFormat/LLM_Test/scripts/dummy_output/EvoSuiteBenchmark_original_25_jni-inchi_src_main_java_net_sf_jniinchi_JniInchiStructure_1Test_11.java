// JniInchiStructure_1Test.java
package net.sf.jniinchi;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStructure}.
* It contains one unit test case for the {@link JniInchiStructure#addBond(JniInchiBond)} method.
*/
class JniInchiStructure_1Test {
		private static class Bond {
				public int id;
				public int num;
        public JniInchiBond getBond() {return bond;}
        public Bond(JniInchiBond bond) {
                                    this(bond, 1);
                                }
				public Bond(JniInchiBond bond, int num) {
            this.id = Integer.valueOf(bond.getId() );
                    this.num = num;
        }
        }
        private List<Bond> bonds = new ArrayList<Bond>();
		//private Bond bond;
		//private String label;

		@Test
        public void testAddBond() {
				JniInchiStructure structure = new JniInchiStructure();
        //    structure.addBond(bond);
		}
		@Test
        public void testGetName() {
				JniInchiStructure structure = new JniInchiStructure();
				assertEquals("Bond.getName() returns value for non-existent Bond.", 
                                 "null", structure.getName("nonexistent_bond"));
				//Bond bond = new Bond(1);
				//Structure.addBond(bond);
				// assertEquals("Bond.getName() returns value for nonexistent Bond.", 
				//               "bond", structure.getName("nonexistent_bond"));
					
				assertEquals("Bond.getName() returns value.", 
                                 "Bond: id=1, num=1", 
                                 structure.getName("bond"));
				
		}
		@Test
        public void testInchiMol() throws JniInchiException {
				JniInchiStructure structure = new JniInchiStructure();
        //    structure.addBond(new JniInchiBond(1, 3) );
		}
		
		@Test
        public void testInchiIsCompatible() {
				JniInchiStructure structure = new JniInchiStructure();
        //        structure.addBond(new JniInchiBond(1, 3));
				assertTrue("Bond.inchiClass() returns", structure.inchiClass() == Bond.class);
        //        structure.addBond(new JniInchiBond(1, 3));
				assertFalse("Bond.inchiClass() returns", structure.inchiClass() == Bond.class);
        //        structure.addBond(new JniInchiBond(1, 3));
				assertTrue("Bond.inchiClass() returns", structure.getAromatic() == Bond.class);
				assertTrue("Bond.inchiClass() returns", structure.getSymbol() == Bond.class);
		}
		
		@Test
        public void testAddBondIsCompatibleWithGetBond() {
				JniInchiStructure structure = new JniInchiStructure();
				Bond bond = new Bond(new JniInchiBond(1, 3));
			  structure.addBond(bond);
        
		}
		
		@Test
        public void testListBonds() {
				JniInchiStructure structure = new JniInchiStructure();
        //     structure.addBond(new JniInchiBond(1, 3));
		}
		
		@Test
        public void testListBondsIsCompatibleWithCheckBondInStructure() {
				JniInchiStructure structure = new JniInchiStructure();
        //    structure.addBond(new JniInchiBond(1, 3));
		}
		
		@Test
        public void testGetNumBonds() {
				JniInchiStructure structure = new JniInchiStructure();
        //    structure.addBond(new JniInchiBond(1, 3));
		}
		
}// JniInchiStructure_1Test.java