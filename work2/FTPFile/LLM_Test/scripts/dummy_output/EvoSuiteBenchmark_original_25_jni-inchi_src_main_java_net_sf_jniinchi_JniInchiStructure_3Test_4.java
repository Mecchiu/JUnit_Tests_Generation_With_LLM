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
		public static final int ITEM = 0;
		public static final int ITEM2 = 2;
		
    /**
     * Test method for {@link net.sf.jniinchi.JniInchiStructure#getAtom(int)}.
     */
    @Test
    public void testGetAtom() {
        
        // Test 1
		// test null atom
		if (getAtom(ITEM)==null)
			fail("JniInchiStructure.getAtom(ITEM): Atom for test #1 is null");
		
		// test multiple {ITEM} atoms
		List<JniInchiAtom> result = JniInchiStructure.getAtoms(ITEM);
		assertTrue(result.size()==2);
		
		assertTrue(result.get(0).getAtom().getID().getValue()==ITEM);
		assertTrue(result.get(0).getAtom().getPosition().getValue()==5);
		assertTrue(result.get(1).getAtom().getID().getValue()==ITEM2);
		assertTrue(result.get(1).getAtom().getPosition().getValue()==-8);
    }
	
	/**
	 * Test method for {@link net.sf.jniinchi.JniInchiStructure#getAtoms(int)}.
	 * Test the length of the Atom instances.
	 */
	@Test
    public void testGetAtomsLength() {
		assertEquals(2, getAtomsLength(ITEM));
		assertEquals(2, getAtomsLength(ITEM2));
		assertEquals(2, getAtomsLength(ITEM3));
	}
	
	/**
	 * Test method for {@link net.sf.jniinchi.JniInchiStructure#getAtoms(int)}.
	 */
	@Test
	public void testGetAtomsSize() {
		assertEquals(2, getAtomsSize(ITEM));
		assertEquals(2, getAtomsSize(ITEM2));
		assertEquals(1, getAtomsSize(ITEM3));
	}
	
	/**
	 * Test method for {@link net.sf.jniinchi.JniInchiStructure#getAtoms(int)}.
	 * Returns a list of {@link net.sf.jniinchi.JniInchiAtom} of the {@link net.sf.jniinchi.JniInchiStructure#getAtom(int)}.
	 */
	@Test
	public void testGetAtoms() {
		List<JniInchiAtom> atomList = new ArrayList<>();
		List<JniInchiAtom> list = JniInchiStructure.getAtoms(ITEM);
		assertEquals(4, list.size());
		for (int i = 0; i < list.size(); i++) {
			JniInchiAtom item = list.get(i);
			atomList.add(item);
		}
		
		assertTrue(atomList.contains(JniInchiStructure.getAtom(ITEM)));
		assertTrue(atomList.contains(JniInchiStructure.getAtom(ITEM2)));
		assertTrue(atomList.contains(JniInchiStructure.getAtom(ITEM3)));
		assertTrue(atomList.contains(JniInchiStructure.getAtom(ITEM4)));
		assertFalse(atomList.contains(JniInchiStructure.getAtom(ITEM5)));
	}
	
	/**
	 * Test method for {@link net.sf.jniinchi.JniInchiStructure#getAtomCount(int)}.
	 */
	@Test
    public void testGetAtomCount() {
		assertEquals(6, getAtomCount(ITEM));
		assertEquals(2, getAtomCount(ITEM2));
		assertEquals(1, getAtomCount(ITEM3));
	}
}