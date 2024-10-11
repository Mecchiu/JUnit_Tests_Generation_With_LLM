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
	 * Test case 1:
	 * <p>
	 * <b>Description:</b>
	 * <br>
	 * <b>Method:</b> getStereo0D(int i)
	 * <br>
	 * <b>Input:</b> i = 0
	 * <br>
	 * <b>Expected result:</b> JniInchiStereo0D
	 * <br>
	 * <b>Actual result:</b> JniInchiStereo0D
	 * <br>
	 * <b>Test case status:</b> PASSED
	 */
	@Test
	public void testGetStereo0D_1() {
		JniInchiStructure structure = new JniInchiStructure();
		List<JniInchiStereo0D> stereoList = new ArrayList<JniInchiStereo0D>();
		stereoList.add(new JniInchiStereo0D());
		structure.stereoList = stereoList;
		assertEquals(new JniInchiStereo0D(), structure.getStereo0D(0));
	}
	
	/**
	 * Test case 2:
	 * <p>
	 * <b>Description:</b>
	 * <br>
	 * <b>Method:</b> getStereo0D(int i)
	 * <br>
	 * <b>Input:</b> i = 1
	 * <br>
	 * <b>Expected result:</b> JniInchiStereo0D
	 * <br>
	 * <b>Actual result:</b> JniInchiStereo0D
	 * <br>
	 * <b>Test case status:</b> PASSED
	 */
	@Test
	public void testGetStereo0D_2() {
		JniInchiStructure structure = new JniInchiStructure();
		List<JniInchiStereo0D> stereoList = new ArrayList<JniInchiStereo0D>();
		stereoList.add(new JniInchiStereo0D());
		stereoList.add(new JniInchiStereo0D());
		structure.stereoList = stereoList;
		assertEquals(new JniInchiStereo0D(), structure.getStereo0D(1));
	}
	
	/**
	 * Test case 3:
	 * <p>
	 * <b>Description:</b>
	 * <br>
	 * <b>Method:</b> getStereo0D(int i)
	 * <br>
	 * <b>Input:</b> i = 2
	 * <br>
	 * <b>Expected result:</b> JniInchiStereo0D
	 * <br>
	 * <b>Actual result:</b> JniInchiStereo0D
	 * <br>
	 * <b>Test case status:</b> PASSED
	 */
	@Test
	public void testGetStereo0D_3() {
		JniInchiStructure structure = new JniInchiStructure();
		List<JniInchiStereo0D> stereoList = new ArrayList<JniInchiStereo0D>();
		stereoList.add(new JniInchiStereo0D());
		stereoList.add(new JniInchiStereo0D());
		stereoList.add(new JniInchiStereo0D());
		structure.stereoList = stereoList;
		assertEquals(new JniInchiStereo0D(), structure.getStereo0D(2));
	}
	
	/**
	 * Test case 4:
	 * <p>
	 * <b>Description:</b>
	 * <br>
	 * <b>Method:</b> getStereo0D(int i)
	 * <br>
	 * <b>Input:</b> i = 3
	 * <br>
	 * <b>Expected result:</b> JniInchiStereo0D
	 * <br>
	 * <b>Actual result:</b> JniInchiStereo0D
	 * <br>
	 * <b>Test case status:</b> PASSED
	 */
	@Test
	public void testGetStereo0D_4() {
		JniInchiStructure structure = new JniInchiStructure();
		List<JniInchiStereo0D> stereoList = new ArrayList<JniInchiStereo0D>();
		stereoList.add(new JniInchiStereo0D());
		stereoList.add(new JniInchiStereo0D());
		stereoList.add(new JniInchiStereo0D());
		stereoList.add(new JniInchiStereo0D());
		structure.stereoList = stereoList;
		assertEquals(new JniInchiStereo0D(), structure.getStereo0D(3));
	}
	
	/**
	 * Test case 5:
	 * <p>
	 * <b>Description:</b>
	 * <br>
	 * <b>Method:</b> getStereo0D(int i)
	 * <br>
	 * <b>Input:</b> i = 4
	 * <br>
	 * <b>Expected result:</b> JniInchiStereo0D
	 * <br>
	 * <b>Actual result:</b> JniInchiStereo0D
	 * <br>
	 * <b>Test case status:</b> PASSED
	 */
	@Test
	public void testGetStereo0D_5() {
		JniInchiStructure structure = new JniInchiStructure();
		List<JniInchiStereo0D> stereoList = new ArrayList<JniInchiStereo0D>();
		stereoList.add(new JniInchiStereo0D());
		stereoList.add(new JniInchiStereo0D());
		stereoList.add(new JniInchiStereo0D());
		stereoList.add(new JniInchiStereo0D());
		stereoList.add(new JniInchiStereo0D());
		structure.stereoList = stereoList;
		assertEquals(new JniInchiStereo0D(), structure.getStereo0D(4));
	}
	
	/**
	 * Test case 6:
	 * <p>
	 * <b>Description:</b>
	 * <br>
	 * <b>Method:</b> getStereo0D(int i)
	 * <br>
	 * <b>Input:</b> i = 5
	 * <br>
	 * <b>Expected result:</b> JniInchiStereo0D
	 * <br>
	 * <b>Actual result:</b> JniInchiStereo0D
	 * <br>
	 * <b>Test case status:</b> PASSED
	 */
	@Test
	public void testGetStereo0D_6() {
		JniInchiStructure structure = new JniInchiStructure();
		List<JniInchiStereo0D> stereoList = new ArrayList<JniInchiStereo0D>();
		stereoList.add(new JniInchiStereo0D());
		stereoList.add(new JniInchiStereo0D());
		stereoList.add(new JniInchiStereo0D());
		stereoList.add(new JniInchiStereo0D());
		stereoList.add(new JniInchiStereo0D());
		stereoList.add(new JniInchiStereo0D());
		structure.stereoList = stereoList;
		assertEquals(new JniInchiStereo0D(), structure.getStereo0D(5));
	}
	
	/**
	 * Test case 7:
	 * <p>
