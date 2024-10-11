// JniInchiStructure_3Test.java
package net.sf.jniinchi;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStructure}.
* It contains one unit test case for the {@link JniInchiStructure#getAtom(int)} method.
*/
class JniInchiStructure_3Test {
private static final List<JniInchiAtom> atomsList = new ArrayList<JniInchiAtom>();
		private static final List<Integer> i_list = new ArrayList<Integer>();

		static {
				initAtomsList();
				System.out.println("in-chi-structure-3-test-starting.");
				initI();
				System.out.println("in-chi-structure-3-test-finished successfully.");
		}

		static void initAtomsList() {
				// Add all atoms in JNI structures to a list
				for (int i = 0; i < 3; i++) {
						// Create JniInchiAtom object
						JniInchiAtom a = new JniInchiAtom(JniInchiAtom.ATOM_ID, "t"+i);
						// Add the atom to the list
						a.setX(5);
						atomsList.add(a);
						i_list.add(i);
				}
		}

		static void initI() {
				// Create a list with all atoms in JNI structure
				List<JniInchiAtom> currentListH = atomsList;
				// create new list
				List<Integer> newI = new ArrayList<Integer>();
				// Add all atoms to I list
				for (int i = 1; i < 3; i++) {
						JniInchiAtom a = new JniInchiAtom(JniInchiAtom.ATOM_ID, "t"+i);
						// Add the atom to the list
						a.setX(5);
						newI.add(currentListH.indexOf(a));
						// Add the atom to the newList
						currentListH.add(a);
						i_list.add(i);
				}
				// Update I from the list
				currentListH = atomsList;
				for (int n = 0; n < 3; n++) {
						JniInchiAtom a = currentListH.get(n);
						a.setY(7);
						currentListH.set(n, a);
				}

		}

		@Test
		void testI( ) {
				// Check the value of I for each atom
				for (JniInchiAtom a : atomsList) {
						assertEquals(i_list.get(a.getIndex()), a.getI().intValue());
					}
				// Check the value of I for each atom
				for (int i = 1; i < 4; i++) {
						int pos = atomsList.indexOf(new JniInchiAtom(JniInchiAtom.ATOM_ID, "t"+i));
						assertEquals(i_list.get(pos), i_list.get(i));
				}
		}
}
