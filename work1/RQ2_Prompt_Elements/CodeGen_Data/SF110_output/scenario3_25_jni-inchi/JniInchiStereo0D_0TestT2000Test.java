// JniInchiStereo0D_0Test.java
package net.sf.jniinchi;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStereo0D}.
* It contains one unit test case for the {@link JniInchiStereo0D#createNewTetrahedralStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)} method.
*/
class JniInchiStereo0D_0Test {

	/**
	 * Test {@link JniInchiStereo0D#createNewTetrahedralStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)} as
	 * zero parity parameter when {@link INCHI_PARITY_UNDEF} parity is zero.
	 */
	@Test
	public void createNewTetrahedralStereo0D_0Test() {
		

		JniInchiAtom a0 = null;
		JniInchiAtom a2 = null;
		JniInchiAtom a2a = null;
		JniInchiAtom a3 = null;
		
		assertTrue("the test fails.",!isParallelStereo(a0));
		
		assertTrue("the test fails.",!isParallelStereo(a3));
		
		assertTrue("the test fails.", isParallelStereo(a0));
		assertFalse("the test fails.", isParallelStereo(a2));
		
		a0 = JniInchiAtom.createNew("a0", "Pair", INCHI_TYPE_TO_NAT);
		a3 = JniInchiAtom.createNew("a3", "Pair", INCHI_TYPE_TO_NAT);
		a2a = JniInchiAtom.createNew("a2a", "Pair", INCHI_TYPE_TO_NAT);
		a3a = JniInchiAtom.createNew("a3a", "Pair", INCHI_TYPE_TO_NAT);
		
		
		a0.addNeighbour(a2);
		a3.addNeighbour(a2a);
		a0.addNeighbour(a2);
		a3.addNeighbour(a3a);
		
		
		//TODO
		
		
		
		assertFalse("the test fails.", isParallelStereo(a0));
		assertTrue("the test fails.", isParallelStereo(a3));
		
				
	}
	
	
	/**
	 * Tests {@link JniInchiStereo0D#createNewTetrahedralStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)} as
	 * zero parity parameter when
	 * <tt>type</tt> is null.
	 */
	@Test
	public void createNewTetrahedralStereo0D_1stTest( ) {
		JniInchiAtom a0 = JniInchiAtom.createNew("a0", "Pair", INCHI_TYPE_TO_NAT);
		JniInchiAtom at5 = JniInchiAtom.createNew("at", "Atomic", INCHI_TYPE_TO_NAT);
		
		a0.addNeighbour(at5);
		
		
		assertFalse("the test fails.", isParallelStereo(a0));
		assertFalse("the test fails.", isParallelStereo(at5));
		//TODO
		
	}
			
	/**
	 * Tests {@link JniInchiStereo0D#createNewTetrahedralStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)} as
	 * zero parity parameter when
	 * <tt>type==TETRIS_TETRAHEDRAL</tt>.
	 */
	@Test
	public void createNewTetrahedralStereo0D_2ndTest( ) {
		JniInchiAtom a1 = JniInchiAtom.createNew("a1", "Polar", INCHI_TYPE_TO_NAT);
		JniInchiAtom at1 = JniInchiAtom.createNew("at", "Atomic", INCHI_TYPE_TO_NAT);
		
		a1.addNeighbour(at1);
		
		
		a1.addNeighbour(a1);
		
		//