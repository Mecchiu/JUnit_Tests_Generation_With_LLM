// JniInchiStructureTest.java
package net.sf.jniinchi;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStructure}.
* It contains ten unit test cases for the {@link JniInchiStructure#getBond(int)} method.
*/
class JniInchiStructureTest {

	/**
	 * Test case 1.
	 *
	 * @throws Exception
	 */
	@Test
	public void testGetBond1() throws Exception {
		JniInchiStructure structure = new JniInchiStructure();
		List<JniInchiBond> bondList = new ArrayList<JniInchiBond>();
		bondList.add(new JniInchiBond(1, 2, JniInchiBond.BondType.SINGLE));
		bondList.add(new JniInchiBond(2, 3, JniInchiBond.BondType.DOUBLE));
		bondList.add(new JniInchiBond(3, 4, JniInchiBond.BondType.TRIPLE));
		bondList.add(new JniInchiBond(4, 5, JniInchiBond.BondType.ALTERN));
		structure.bondList = bondList;
		assertEquals(new JniInchiBond(1, 2, JniInchiBond.BondType.SINGLE), structure.getBond(0));
		assertEquals(new JniInchiBond(2, 3, JniInchiBond.BondType.DOUBLE), structure.getBond(1));
		assertEquals(new JniInchiBond(3, 4, JniInchiBond.BondType.TRIPLE), structure.getBond(2));
		assertEquals(new JniInchiBond(4, 5, JniInchiBond.BondType.ALTERN), structure.getBond(3));
	}
	
	/**
	 * Test case 2.
	 *
	 * @throws Exception
	 */
	@Test
	public void testGetBond2() throws Exception {
		JniInchiStructure structure = new JniInchiStructure();
		List<JniInchiBond> bondList = new ArrayList<JniInchiBond>();
		bondList.add(new JniInchiBond(1, 2, JniInchiBond.BondType.SINGLE));
		bondList.add(new JniInchiBond(2, 3, JniInchiBond.BondType.DOUBLE));
		bondList.add(new JniInchiBond(3, 4, JniInchiBond.BondType.TRIPLE));
		bondList.add(new JniInchiBond(4, 5, JniInchiBond.BondType.ALTERN));
		structure.bondList = bondList;
		assertEquals(new JniInchiBond(1, 2, JniInchiBond.BondType.SINGLE), structure.getBond(0));
		assertEquals(new JniInchiBond(2, 3, JniInchiBond.BondType.DOUBLE), structure.getBond(1));
		assertEquals(new JniInchiBond(3, 4, JniInchiBond.BondType.TRIPLE), structure.getBond(2));
		assertEquals(new JniInchiBond(4, 5, JniInchiBond.BondType.ALTERN), structure.getBond(3));
	}
	
	/**
	 * Test case 3.
	 *
	 * @throws Exception
	 */
	@Test
	public void testGetBond3() throws Exception {
		JniInchiStructure structure = new JniInchiStructure();
		List<JniInchiBond> bondList = new ArrayList<JniInchiBond>();
		bondList.add(new JniInchiBond(1, 2, JniInchiBond.BondType.SINGLE));
		bondList.add(new JniInchiBond(2, 3, JniInchiBond.BondType.DOUBLE));
		bondList.add(new JniInchiBond(3, 4, JniInchiBond.BondType.TRIPLE));
		bondList.add(new JniInchiBond(4, 5, JniInchiBond.BondType.ALTERN));
		structure.bondList = bondList;
		assertEquals(new JniInchiBond(1, 2, JniInchiBond.BondType.SINGLE), structure.getBond(0));
		assertEquals(new JniInchiBond(2, 3, JniInchiBond.BondType.DOUBLE), structure.getBond(1));
		assertEquals(new JniInchiBond(3, 4, JniInchiBond.BondType.TRIPLE), structure.getBond(2));
		assertEquals(new JniInchiBond(4, 5, JniInchiBond.BondType.ALTERN), structure.getBond(3));
	}
	
	/**
	 * Test case 4.
	 *
	 * @throws Exception
	 */
	@Test
	public void testGetBond4() throws Exception {
		JniInchiStructure structure = new JniInchiStructure();
		List<JniInchiBond> bondList = new ArrayList<JniInchiBond>();
		bondList.add(new JniInchiBond(1, 2, JniInchiBond.BondType.SINGLE));
		bondList.add(new JniInchiBond(2, 3, JniInchiBond.BondType.DOUBLE));
		bondList.add(new JniInchiBond(3, 4, JniInchiBond.BondType.TRIPLE));
		bondList.add(new JniInchiBond(4, 5, JniInchiBond.BondType.ALTERN));
		structure.bondList = bondList;
		assertEquals(new JniInchiBond(1, 2, JniInchiBond.BondType.SINGLE), structure.getBond(0));
		assertEquals(new JniInchiBond(2, 3, JniInchiBond.BondType.DOUBLE), structure.getBond(1));
		assertEquals(new JniInchiBond(3, 4, JniInchiBond.BondType.TRIPLE), structure.getBond(2));
		assertEquals(new JniInchiBond(4, 5, JniInchiBond.BondType.ALTERN), structure.getBond(3));
	}
	
	/**
	 * Test case 5.
	 *
	 * @throws Exception
	 */
	@Test
	public void testGetBond5() throws Exception {
		JniInchiStructure structure = new JniInchiStructure();
		List<JniInchiBond> bondList = new ArrayList<JniInchiBond>();
		bondList.add(new JniInchiBond(1, 2, JniInchiBond.BondType.SINGLE));
		bondList.add(new JniInchiBond(2, 3, JniInchiBond.BondType.DOUBLE));
		bondList.add(new JniInchiBond(3, 4, JniInchiBond.BondType.TRIPLE));
		bondList.add(new JniInchiBond(4, 5, JniInchiBond.BondType.ALTERN));
		structure.bondList = bondList;
		assertEquals(new JniInchiBond(1, 2, JniInchiBond.BondType.SINGLE), structure.getBond(0));
		assertEquals(new JniInchiBond(2, 3, JniInchiBond.BondType.DOUBLE), structure.getBond(1));
		assertEquals(new JniInchiBond(3, 4