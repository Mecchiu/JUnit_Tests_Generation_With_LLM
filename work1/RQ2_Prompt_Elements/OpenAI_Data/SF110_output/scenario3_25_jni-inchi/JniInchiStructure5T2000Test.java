// JniInchiStructureTest.java
package net.sf.jniinchi;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStructure}.
* It contains ten unit test cases for the {@link JniInchiStructure#getStereo0D(int)} method.
*/
class JniInchiStructureTest {

	/**
	 * Test case 1.
	 *
	 * @throws JniInchiException
	 */
	@Test
	void testGetStereo0D1() throws JniInchiException {
		JniInchiStructure structure = new JniInchiStructure();
		List<JniInchiStereo0D> stereo0DList = new ArrayList<JniInchiStereo0D>();
		stereo0DList.add(new JniInchiStereo0D());
		structure.setStereo0D(stereo0DList);
		assertEquals(structure.getStereo0D(0), stereo0DList.get(0));
	}
	
	/**
	 * Test case 2.
	 *
	 * @throws JniInchiException
	 */
	@Test
	void testGetStereo0D2() throws JniInchiException {
		JniInchiStructure structure = new JniInchiStructure();
		List<JniInchiStereo0D> stereo0DList = new ArrayList<JniInchiStereo0D>();
		stereo0DList.add(new JniInchiStereo0D());
		stereo0DList.add(new JniInchiStereo0D());
		structure.setStereo0D(stereo0DList);
		assertEquals(structure.getStereo0D(1), stereo0DList.get(1));
	}
	
	/**
	 * Test case 3.
	 *
	 * @throws JniInchiException
	 */
	@Test
	void testGetStereo0D3() throws JniInchiException {
		JniInchiStructure structure = new JniInchiStructure();
		List<JniInchiStereo0D> stereo0DList = new ArrayList<JniInchiStereo0D>();
		stereo0DList.add(new JniInchiStereo0D());
		stereo0DList.add(new JniInchiStereo0D());
		stereo0DList.add(new JniInchiStereo0D());
		structure.setStereo0D(stereo0DList);
		assertEquals(structure.getStereo0D(2), stereo0DList.get(2));
	}
	
	/**
	 * Test case 4.
	 *
	 * @throws JniInchiException
	 */
	@Test
	void testGetStereo0D4() throws JniInchiException {
		JniInchiStructure structure = new JniInchiStructure();
		List<JniInchiStereo0D> stereo0DList = new ArrayList<JniInchiStereo0D>();
		stereo0DList.add(new JniInchiStereo0D());
		stereo0DList.add(new JniInchiStereo0D());
		stereo0DList.add(new JniInchiStereo0D());
		stereo0DList.add(new JniInchiStereo0D());
		structure.setStereo0D(stereo0DList);
		assertEquals(structure.getStereo0D(3), stereo0DList.get(3));
	}
	
	/**
	 * Test case 5.
	 *
	 * @throws JniInchiException
	 */
	@Test
	void testGetStereo0D5() throws JniInchiException {
		JniInchiStructure structure = new JniInchiStructure();
		List<JniInchiStereo0D> stereo0DList = new ArrayList<JniInchiStereo0D>();
		stereo0DList.add(new JniInchiStereo0D());
		stereo0DList.add(new JniInchiStereo0D());
		stereo0DList.add(new JniInchiStereo0D());
		stereo0DList.add(new JniInchiStereo0D());
		stereo0DList.add(new JniInchiStereo0D());
		structure.setStereo0D(stereo0DList);
		assertEquals(structure.getStereo0D(4), stereo0DList.get(4));
	}
	
	/**
	 * Test case 6.
	 *
	 * @throws JniInchiException
	 */
	@Test
	void testGetStereo0D6() throws JniInchiException {
		JniInchiStructure structure = new JniInchiStructure();
		List<JniInchiStereo0D> stereo0DList = new ArrayList<JniInchiStereo0D>();
		stereo0DList.add(new JniInchiStereo0D());
		stereo0DList.add(new JniInchiStereo0D());
		stereo0DList.add(new JniInchiStereo0D());
		stereo0DList.add(new JniInchiStereo0D());
		stereo0DList.add(new JniInchiStereo0D());
		stereo0DList.add(new JniInchiStereo0D());
		structure.setStereo0D(stereo0DList);
		assertEquals(structure.getStereo0D(5), stereo0DList.get(5));
	}
	
	/**
	 * Test case 7.
	 *
	 * @throws JniInchiException
	 */
	@Test
	void testGetStereo0D7() throws JniInchiException {
		JniInchiStructure structure = new JniInchiStructure();
		List<JniInchiStereo0D> stereo0DList = new ArrayList<JniInchiStereo0D>();
		stereo0DList.add(new JniInchiStereo0D());
		stereo0DList.add(new JniInchiStereo0D());
		stereo0DList.add(new JniInchiStereo0D());
		stereo0DList.add(new JniInchiStereo0D());
		stereo0DList.add(new JniInchiStereo0D());
		stereo0DList.add(new JniInchiStereo0D());
		stereo0DList.add(new JniInchiStereo0D());
		structure.setStereo0D(stereo0DList);
		assertEquals(structure.getStereo0D(6), stereo0DList.get(6));
	}
	
	/**
	 * Test case 8.
	 *
	 * @throws JniInchiException
	 */
	@Test
	void testGetStereo0D8() throws JniInchiException {
		JniInchiStructure structure = new JniInchiStructure();
		List<JniInchiStereo0D> stereo0DList = new ArrayList<JniInchiStereo0D>();
		stereo0DList.add(new JniInchiStereo0D());
		stereo0DList.add(new JniInchiStereo0D());
		stereo0DList.add(new JniInchiStereo0D());
		stereo0DList.add(new JniInchiStereo0D());
		stereo0DList.add(new JniInchiStereo0D());
		stereo0DList.add(new JniInchiStereo0D());
		stereo0DList.add(new JniInchiStereo0D());
		stereo0DList.add(new JniInchiStereo0D());
		structure.setStereo0D(stereo0DList);
		assertEquals(structure.getStereo0D(7), stereo0DList.get(7));
	}
	
	/**
	 * Test case 9.
	 *
	 * @throws JniInchiException
	 */
	@Test
	void testGet