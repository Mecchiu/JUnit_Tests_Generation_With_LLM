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
	 * @throws Exception
	 */
	@Test
	void testGetStereo0D1() throws Exception {
		JniInchiStructure structure = new JniInchiStructure();
		List<JniInchiStereo0D> stereoList = new ArrayList<JniInchiStereo0D>();
		stereoList.add(new JniInchiStereo0D());
		structure.stereoList = stereoList;
		assertEquals(structure.getStereo0D(0), stereoList.get(0));
	}
	
	/**
	 * Test case 2.
	 * 
	 * @throws Exception
	 */
	@Test
	void testGetStereo0D2() throws Exception {
		JniInchiStructure structure = new JniInchiStructure();
		List<JniInchiStereo0D> stereoList = new ArrayList<JniInchiStereo0D>();
		stereoList.add(new JniInchiStereo0D());
		stereoList.add(new JniInchiStereo0D());
		structure.stereoList = stereoList;
		assertEquals(structure.getStereo0D(1), stereoList.get(1));
	}
	
	/**
	 * Test case 3.
	 * 
	 * @throws Exception
	 */
	@Test
	void testGetStereo0D3() throws Exception {
		JniInchiStructure structure = new JniInchiStructure();
		List<JniInchiStereo0D> stereoList = new ArrayList<JniInchiStereo0D>();
		stereoList.add(new JniInchiStereo0D());
		stereoList.add(new JniInchiStereo0D());
		stereoList.add(new JniInchiStereo0D());
		structure.stereoList = stereoList;
		assertEquals(structure.getStereo0D(2), stereoList.get(2));
	}
	
	/**
	 * Test case 4.
	 * 
	 * @throws Exception
	 */
	@Test
	void testGetStereo0D4() throws Exception {
		JniInchiStructure structure = new JniInchiStructure();
		List<JniInchiStereo0D> stereoList = new ArrayList<JniInchiStereo0D>();
		stereoList.add(new JniInchiStereo0D());
		stereoList.add(new JniInchiStereo0D());
		stereoList.add(new JniInchiStereo0D());
		stereoList.add(new JniInchiStereo0D());
		structure.stereoList = stereoList;
		assertEquals(structure.getStereo0D(3), stereoList.get(3));
	}
	
	/**
	 * Test case 5.
	 * 
	 * @throws Exception
	 */
	@Test
	void testGetStereo0D5() throws Exception {
		JniInchiStructure structure = new JniInchiStructure();
		List<JniInchiStereo0D> stereoList = new ArrayList<JniInchiStereo0D>();
		stereoList.add(new JniInchiStereo0D());
		stereoList.add(new JniInchiStereo0D());
		stereoList.add(new JniInchiStereo0D());
		stereoList.add(new JniInchiStereo0D());
		stereoList.add(new JniInchiStereo0D());
		structure.stereoList = stereoList;
		assertEquals(structure.getStereo0D(4), stereoList.get(4));
	}
	
	/**
	 * Test case 6.
	 * 
	 * @throws Exception
	 */
	@Test
	void testGetStereo0D6() throws Exception {
		JniInchiStructure structure = new JniInchiStructure();
		List<JniInchiStereo0D> stereoList = new ArrayList<JniInchiStereo0D>();
		stereoList.add(new JniInchiStereo0D());
		stereoList.add(new JniInchiStereo0D());
		stereoList.add(new JniInchiStereo0D());
		stereoList.add(new JniInchiStereo0D());
		stereoList.add(new JniInchiStereo0D());
		stereoList.add(new JniInchiStereo0D());
		structure.stereoList = stereoList;
		assertEquals(structure.getStereo0D(5), stereoList.get(5));
	}
	
	/**
	 * Test case 7.
	 * 
	 * @throws Exception
	 */
	@Test
	void testGetStereo0D7() throws Exception {
		JniInchiStructure structure = new JniInchiStructure();
		List<JniInchiStereo0D> stereoList = new ArrayList<JniInchiStereo0D>();
		stereoList.add(new JniInchiStereo0D());
		stereoList.add(new JniInchiStereo0D());
		stereoList.add(new JniInchiStereo0D());
		stereoList.add(new JniInchiStereo0D());
		stereoList.add(new JniInchiStereo0D());
		stereoList.add(new JniInchiStereo0D());
		stereoList.add(new JniInchiStereo0D());
		structure.stereoList = stereoList;
		assertEquals(structure.getStereo0D(6), stereoList.get(6));
	}
	
	/**
	 * Test case 8.
	 * 
	 * @throws Exception
	 */
	@Test
	void testGetStereo0D8() throws Exception {
		JniInchiStructure structure = new JniInchiStructure();
		List<JniInchiStereo0D> stereoList = new ArrayList<JniInchiStereo0D>();
		stereoList.add(new JniInchiStereo0D());
		stereoList.add(new JniInchiStereo0D());
		stereoList.add(new JniInchiStereo0D());
		stereoList.add(new JniInchiStereo0D());
		stereoList.add(new JniInchiStereo0D());
		stereoList.add(new JniInchiStereo0D());
		stereoList.add(new JniInchiStereo0D());
		stereoList.add(new JniInchiStereo0D());
		structure.stereoList = stereoList;
		assertEquals(structure.getStereo0D(7), stereoList.get(7));
	}
	
	/**
	 * Test case 9.
	 * 
	 * @throws Exception
	 */
	@Test
	void testGetStereo0D9() throws Exception {
		JniInchiStructure structure = new JniInchiStructure();
		List<JniInchiStereo0D> stereoList = new ArrayList<JniInchiStereo0D>();
		stereoList.add(new JniInchiStereo0D());
		stereoList.add(new JniInchiStereo0D());
		stereoList.add(new JniInchiStereo0D());
		stereoList.add(new JniInchiStereo0D());
		stereoList.add(new JniInchiStereo0D());
		stereoList.add(new JniInchiStereo0D());
		stereoList.add(new JniInchiStereo0D());
		stereoList.add(new J