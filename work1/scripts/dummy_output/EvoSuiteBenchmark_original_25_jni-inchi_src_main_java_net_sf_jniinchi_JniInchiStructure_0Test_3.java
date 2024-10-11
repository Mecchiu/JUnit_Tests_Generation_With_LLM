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
		private JniInchiAtom atom1;
		private JniInchiAtom atom2;
		private JniInchiAtom atom3;
		private JniInchiStructure tested;

		public JniInchiStructure_0Test() {
			atom1 = new JniInchiAtom(1, 7);
			atom2 = new JniInchiAtom(1, 9);
			atom3 = new JniInchiAtom(2, 7);
		}
		public void setUp() {
			tested = new JniInchiStructure();
		}

		@Test
		public void test() {

			List<TestAtom> atom = new ArrayList<TestAtom>();

			// add first atom
			TestAtom atom1 = new TestAtom("atom one 1");
			assertEquals(1, atom1.atom.getAtomNumber());

			atom.add(atom1);

			// add second atom
			TestAtom atom3 = new TestAtom("atom three 2");
			assertEquals(2, atom3.atom.getAtomNumber());

			// add new atom
			JniInchiAtom atom2 = tested.addAtom(atom3);
			assertNotNull(atom2);

			assertEquals(2, atom1.atom.getAtomNumber());
			assertEquals(2, atom3.atom.getAtomNumber());
			assertEquals("atom three 2", atom3.atom.getAtomID());
			assertEquals(1 + 7, atom1.coords.size());
			assertEquals(3 + 7, atom2.coords.size());
			assertEquals(1 + 1 + 9, atom2.coords.get(atom1.coords));

			Iterator<TestAtom> i = atom1.atomCoords.iterator();
			iterateTestAtoms(atom1, atom3, i);

			assertEquals(2, atom2.coords.size());
			iterateTestAtoms(atom2, atom1, i);

			assertEquals(2, atom2.coords.size());
			assertEquals(1 + 9, atom2.coords.get(1));

			atom.clear();

		}
		private void iterateTestAtoms(TestAtom testAtom, JniInchiAtom newAtom, Iterator<TestAtom> i) {
			int i_x = 0;
			JniInchiAtom testAtom_i1;
			while (i.hasNext()) {
				testAtom_i1 = i.next();
				assertEquals(testAtom_i1.atom.getAtomID(), newAtom.atom.getAtomID());
				assertEquals(testAtom_i1.atom.getAtomNumber(), newAtom.atom.getAtomNumber());
				assertEquals(testAtom_i1.coords, newAtom.coords);
				i_x++;

			}
			assertEquals(i_x, newAtom.coords.size());
			assertTrue(i_x);

		}

}

/**
* Class of {@link JniInchiStructure}.
*/
class JniInchiStructureTest {
		private JniInchiStructure tested;
		private List<JniInchiAtom> allJniInchiAtoms = new ArrayList<JniInchiAtom>();

		public JniInchiStructureTest() {
			tested = new JniInchiStructure();
		}
		public void setUp() {

		}
		public void test() {

			// add atom
			JniInchiStructure tested3 = tested;
			Iterator<JniInchiAtom> iJniInchiAtom = tested3.allJniInchiAtoms.iterator();
			while (iJniInchiAtom.hasNext()) {
				JniInchiAtom addedAtom = iJniInchiAtom.next();
				List<TestAtom> list = new ArrayList<TestAtom>();
				list.add(addedAtom);
				addedAtom.coords = new TestCoords(tested3.getAllJniAtoms(list).get(0).coords);

			}

		}
		List<JniInchiAtom> getAllJniInchiAtoms() {
			return allJniInchiAtoms;
		}

		void iterateAllJniAtoms(List<JniInchiAtom> list) {
			Iterator<JniInchiAtom> i = allJniInchiAtoms.iterator();
			while (i.hasNext()) {
				list.add(i.next());
			}
		}
}

/**
* Collection of {@link JniInchiAtom} elements.
*/
class JniInchiAtom {
		private int coords;
		private JniInchiAtom(int coords, int iAtomNumber) {
			this.coords = coords;
			this.atom = new JniInchiAtom(iAtomNumber);
		}

		private void setCoords(int iAtomNumber) {
			coords = iAtomNumber;
		}

		private JniInchiAtom(int iAtomNumber) {
			coords = iAtomNumber;
		}

		private JniInchiAtom() {
			coords = 0;
		}

		@Override
		public String toString() {
			return "Atoms(" + coords + ", " + iAtomNumber + ")";
		}

		private JniInchiAtom atom = new JniInchiAtom(coords);

		private List<JniInchiAtom> coordsList = new ArrayList<JniInchiAtom>();

		public int getCoords() {
			return coords;
		}

		public boolean isEmpty() {
			return coordsList.size() == 0;
		}
}

/**
 * Array class.
 */
class TestCoords {
		private int iAtom;
		private TestAtom testAtom;
		private List<TestAtom> list = new ArrayList<TestAtom>();

		public TestAtom getAtom() {
			return testAtom;
		}

		public void setAtom(TestAtom testAtom) {
			this.testAtom = testAtom;
		}

		public int getAtomNumber() {
			return iAtom;
		}

		public void setAtomNumber(int iAtomNumber) {
			iAtom = iAtomNumber;
		}
}

public class JniInchiStructure {

	private JniInchiStructure() { }

	public static JniInchiStructureTest testStructure;

	public static JniInchiStructureTest getAllJniInchiStructure() {
		if (jniInchiStructureTest == null) jniInchiStructureTest = new JniInchiStructureTest();
		return jniInchiStructureTest;
	}

	public static JniInchiStructureTest getStructureTest() {
		if (jniInchiStructureTest == null) jniInchiStructureTest = new JniInchiStructureTest();
		return jniInchiStructureTest;
	}

	private static JniInchiStructureTest jniInchiStructureTest;

}