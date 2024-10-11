// JniInchiStructure_0Test.java
package net.sf.jniinchi;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStructure}.
* It contains one unit test case for the {@link JniInchiStructure#addAtom(JniInchiAtom)} method.
*/
class JniInchiStructure_0Test {
		
    /**
    * Run tests.
    *
    * @return
    *      null if nothing tested
    */
    public static List<JniInchiFeatureTest> test();


    /**
	 * Tests {@link JniInchiStructure#addAtom(JniInchiAtom)}. 
	 */
    public static List<JniInchiFeatureTest> testAtom() {
        List<JniInchiFeatureTest> tests = new ArrayList<>(16);
        List<JniInchiAtom> atoms = new ArrayList<>();
   
        // Add a new atom
		{
			JniInchiAtom atom = new JniInchiAtom();
			for (int i = 0; i < 15; i++) {
			    atom = addAtom(atom);
			    assertTrue("Unable to add atom", atom.isUnchecked());
			}
            
		}
        
		// Check the atom is the right size and has the right contents
		{
			atoms.add(atom);
			
			JniInchiAtom atom = addAtom(atom);
			assertTrue("Unable to add atom", atom.isUnchecked());
			assertEquals("Size of atom", 3, atom.getSize());
			
			int i = 2;
			while (1!= i) {
				if (!atom.getS()[i].getC().equals("H")) {
					assertEquals("Atom values do not match", "H-", atom.getS()[i].getC());
				}
	        	i++;
			}
		}
		
		// Try again but with null atom
		{
			
			List<JniInchiAtom> atoms_null = new ArrayList<>();
			
			assertNull("The null atom should not be a valid JNI atom",
								  	   addAtom(null));
			
			try {
				addAtom(null);
				fail("Unexpected NullPointerException");
			}
			catch (NullPointerException e) { }
			
			try {
				addAtom(atoms_null);
				fail("Unexpected InvalidCastException1");
			}
			catch (InvalidCastException e) { }
			
		}
        
        
        // Add the atoms twice
        {
        	List<JniInchiAtom> list_atoms = new ArrayList<>(atoms);
        	List<JniInchiAtom> list_atoms_null = new ArrayList<>(atoms);
        	
        	for (int i = 1; i < 16; i++) {
				list_atoms.add(addAtom(atoms.get(i)));
				list_atoms_null.add(addAtom(atoms_null.get(i)));
        	}

        	for (int i = 1; i < 16; i++) {
				list_atoms.add(addAtom(atoms.get(i)));
				list_atoms_null.add(addAtom(atoms_null.get(i)));
        	}
        }
        
		// Test adding of same atom to same molecule twice
        {
        	List<JniInchiAtom> list_atoms = new ArrayList<>(atoms);
        	List<JniInchiAtom> list_atoms_null = new ArrayList<>(atoms);
        	List<JniInchiAtom> list_atoms_2= new ArrayList<>(atoms);
		for (int i = 0; i < list_atoms.size(); i++) {
			
			for (int j = 0; j < list_atoms.size(); j++) {
				
				if (list_atoms.get(i).getO()!= 0) {
					// Atom 1 added
					list_atoms_2.add(list_atoms.get(i));
					list_atoms_2.add(addAtom(list_atoms.get(i)));
					if (list_atoms.get(i).getO()!= 0) {
						assertEquals("Atom values not equal", 
										0, 
										list_atoms_2.get(1).getO(),
										0.0000000001);
					}
				}
				else {
					assertEquals("Not valid atom", 0, list_atoms_2.get(i).getO());
				}
			}
			// Atom 2 added
			list_atoms_2.add(list_atoms_2.get(0));
			list_atoms_2.add(list_atoms_2.get(1));
			if (i > 1) {
				// Add atom 1 again
				list_atoms_2.add(addAtom(list_atoms.get(i-1)));
				if (i > 2) {
					// Add atom 2 again
					list_atoms_2.add(addAtom(list_atoms.get(i-2)));
				}
			}
			assertEquals("Atoms not equal",
						    0, 
						    list_atoms_2.get(1).getO(),
							  	 0.0000000001);
			assertEquals("Atoms not equal",
						    0, 
						    list_atoms_2.get(i-1).getO(),
								 0.0000000001);
		}

		// Test adding of all different atoms
		{
			AtomList newAtoms = new AtomList();                
			for (int i = 0; i < list_atoms.size(); i++) {
				newAtoms.add(list_atoms.get(i));
			}
			JniInchiAtom newAtom = addAtom(newAtoms);
			assertTrue("Unable to add atom", newAtom.isUnchecked());
			List<JniInchiAtom> atomList = newAtom.getS();
			assertEquals("List size is not equal", 
							  list_atoms.size()+1,  
							  atomList.size());
			
		}
		
		}
        
        
        return tests;
    }
	
}


class JniInchiAtom {
	
	
	byte o1 = 1;
	byte o2 = 2;
	String s1 = "W";
	String s2 = "N";
	int[][] c = {{1,1}, 
		   {1,3}, 
		   {2,3}};
}