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
private final static String FILE = "JniInchiStructure_1.java";

		/**
		 * Runs the test.
		 *
		 * @throws Exception Exception thrown when test is executed.
		 */
		@Test
		public void test() throws Exception {
			JniStructure2 structure = new JniStructure2();
			List<Element> list = new ArrayList<Element>();

			for (int i = 0; i < 10; i++) // 10 are allowed
				list.add(structure.getAtom(i));

			assertEquals("test 1", 1, list.size());

			JniInchiStructure structure2 = new JniStructure();
			List<Element> list2 = new ArrayList<Element>();

			for (int i = 0; i < 4; i++) // 4 are allowed
				list2.add(structure2.getAtom(i));

			assertEquals("test 1", 4, list2.size());

			JniInchiStructure structure3 = new JniStructure();
			List<Element> list3 = new ArrayList<Element>();

			list3.add(structure3.getAtom(5 + 10*i));

			assertEquals("test 2", 2, list3.size());

		}
}

/**
 * Test class of {@link JniInchiStructure}.
 * It contains one unit test case for the {@link JniInchiStructure#getAtom(int)} method.
 */
public class JniInchiStructure_4Test {
    
		private final static String FILE = "JniInchiStructure_4Test.java";

    /**
     * Runs the test.
     *
     * @throws Exception Exception thrown when test is executed.
     */
    @Test
    public void test() throws Exception {

    	JniStructure structure = new JniStructure();
//  		List<Element> list = new ArrayList<Element>();

        List<JniInchiAtom> atomList = structure.getAtomList();

        List<Element> list = new ArrayList<Element>();

		for (int x = 7; x >= 7; x--) {
			int d1 = x % 10;
            list.add(structure.getAtom(x));
        }

        assertEquals(11, list.size());

        // JNI tests
        // Test 1: Structure.getAtomList()
        {
        	JNIStructure1 st = new JNIStructure1();
        	List<Element> lst = new ArrayList<Element>();
        	for (int i = 0; i < 11; i++)
        		lst.add(atoms[i]);
        	assertEquals("test 1", lst, st.getAtomList());
        }

        // Test 2: structure.getAtomList()
        {
        	JniStructure2 st = new JniStructure2();
        	List<Element> lst = new ArrayList<Element>();
        	for (int i = 0; i < 5; i++)
        		lst.add(atoms[i]);
        	assertEquals("test 2", lst, st.getAtomList());
        }

		// Test 3: structure.getAtomList()
		List<Element> result = structure.getAsMolecular()
//  		.getMoleculeAtoms(structure.getStructure()).getAtomList();

        {
        	assertEquals("test 3 1", lst, result);
        }

	}
}


// ************************************************************
// End of JniInchiStructureTestGenerator.java
// ************************************************************
