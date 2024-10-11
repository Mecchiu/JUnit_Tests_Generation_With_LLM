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
		
	/**
	 * Test method for {@link net.sf.jniinchi.JniInchiStructure#addBond(net.sf.jniinchi.JniInchiBond)}.
	 */
	@SuppressWarnings("boxing")
	@Test
	public void oneUnitTest() {		
		JniInchiBond bondTest = new JniInchiBond("X");
		bondTest.addLigand(new JniInchiLigand("A"));
		bondTest.addBond(new JniInchiBond("Y"));
		JniInchiStructure bondAddition = new JniInchiStructure(bondTest);
		
		JniInchiBond bond = new JniInchiBond();		
		bond.setLigand1(new JniInchiLigand("B"));
		bond.addBond(new JniInchiBond("C"));
		bondAddition.addBond(bond);
		
		JniInchiBond bondCopy = bondAddition.createBond();
		assertEquals(bond.getLigand1(), bondCopy.getLigand1());
		assertEquals(bond.getLigand2(), bondCopy.getLigand2());				
	}
	
	/**
	 * Test method for {@link net.sf.jniinchi.JniInchiStructure#getBondsFrom(JniInchiBond)}.
	 * Note: The bonds are reversed, so the correct order is used
	 * (e.g. if you want [A-D] you would do {@link net.sf.jniinchi.Utils#reverse(List, JniInchiStructure)})
	 */
	@SuppressWarnings("unchecked")
	@Test
	public void twoUnitTest() {		
		List<JniInchiBond> bonds = new ArrayList<>();
		bonds.add(new JniInchiBond("A"));
		bonds.add(new JniInchiBond("B"));
		bonds.add(new JniInchiBond("D"));
		
		JniInchiBond tempBond = new JniInchiBond();
		JniInchiStructure bipos = new JniInchiStructure(bonds);
		bipos.getBondsFrom(tempBond);
		
		assertTrue(bipos.getBondIterator().hasNext());
		assertEquals("D", bipos.getBondIterator().next().getAtomicNo());
	}
	
	/**
	 * Test method for {@link net.sf.jniinchi.JniInchiStructure#getBondsFrom(net.sf.jniinchi.JniInchiBundledAtom)}.
	 */
	@SuppressWarnings("unchecked")
	@Test
	public void threeUnitTest() {		
		List<JniInchiBond> bonds = new ArrayList<>();
		bonds.add(new JniInchiBond("A"));
		bonds.add(new JniInchiBond("B"));
		bonds.add(new JniInchiBond("O"));
		
		JniInchiStructure bipos = new JniInchiStructure(bonds);
		bipos.getBondsFrom(new JniInchiBundledAtom());
		
		assertTrue(bipos.getBondIterator().hasNext());
		assertEquals("A", bipos.getBondIterator().next().getAtomicNo());
		assertEquals("O", bipos.getBondIterator().next().getAtomicNo());
		assertEquals("B", bipos.getBondIterator().next().getAtomicNo());
	}
}