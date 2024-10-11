// JniInchiStructureTest.java
package net.sf.jniinchi;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStructure}.
* It contains ten unit test cases for the {@link JniInchiStructure#addStereo0D(JniInchiStereo0D)} method.
*/
class JniInchiStructureTest {

	/**
	 * Test case 1:
	 * 
	 * <pre>
	 * Input:
	 * 		parity = null
	 * </pre>
	 * 
	 * <pre>
	 * Expected:
	 * 		IllegalArgumentException
	 * </pre>
	 */
	@Test
	void testAddStereo0D_1() {
		JniInchiStructure structure = new JniInchiStructure();
		JniInchiStereo0D parity = null;
		
		assertThrows(IllegalArgumentException.class, () -> {
			structure.addStereo0D(parity);
		});
	}
	
	/**
	 * Test case 2:
	 * 
	 * <pre>
	 * Input:
	 * 		parity = new JniInchiStereo0D(new JniInchiAtom[0], JniInchiStereo0D.INCHI_PARITY_NONE, JniInchiStereo0D.INCHI_PARITY_NONE)
	 * </pre>
	 * 
	 * <pre>
	 * Expected:
	 * 		IllegalArgumentException
	 * </pre>
	 */
	@Test
	void testAddStereo0D_2() {
		JniInchiStructure structure = new JniInchiStructure();
		JniInchiStereo0D parity = new JniInchiStereo0D(new JniInchiAtom[0], JniInchiStereo0D.INCHI_PARITY_NONE, JniInchiStereo0D.INCHI_PARITY_NONE);
		
		assertThrows(IllegalArgumentException.class, () -> {
			structure.addStereo0D(parity);
		});
	}
	
	/**
	 * Test case 3:
	 * 
	 * <pre>
	 * Input:
	 * 		parity = new JniInchiStereo0D(new JniInchiAtom[1], JniInchiStereo0D.INCHI_PARITY_NONE, JniInchiStereo0D.INCHI_PARITY_NONE)
	 * </pre>
	 * 
	 * <pre>
	 * Expected:
	 * 		IllegalArgumentException
	 * </pre>
	 */
	@Test
	void testAddStereo0D_3() {
		JniInchiStructure structure = new JniInchiStructure();
		JniInchiStereo0D parity = new JniInchiStereo0D(new JniInchiAtom[1], JniInchiStereo0D.INCHI_PARITY_NONE, JniInchiStereo0D.INCHI_PARITY_NONE);
		
		assertThrows(IllegalArgumentException.class, () -> {
			structure.addStereo0D(parity);
		});
	}
	
	/**
	 * Test case 4:
	 * 
	 * <pre>
	 * Input:
	 * 		parity = new JniInchiStereo0D(new JniInchiAtom[2], JniInchiStereo0D.INCHI_PARITY_NONE, JniInchiStereo0D.INCHI_PARITY_NONE)
	 * </pre>
	 * 
	 * <pre>
	 * Expected:
	 * 		IllegalArgumentException
	 * </pre>
	 */
	@Test
	void testAddStereo0D_4() {
		JniInchiStructure structure = new JniInchiStructure();
		JniInchiStereo0D parity = new JniInchiStereo0D(new JniInchiAtom[2], JniInchiStereo0D.INCHI_PARITY_NONE, JniInchiStereo0D.INCHI_PARITY_NONE);
		
		assertThrows(IllegalArgumentException.class, () -> {
			structure.addStereo0D(parity);
		});
	}
	
	/**
	 * Test case 5:
	 * 
	 * <pre>
	 * Input:
	 * 		parity = new JniInchiStereo0D(new JniInchiAtom[3], JniInchiStereo0D.INCHI_PARITY_NONE, JniInchiStereo0D.INCHI_PARITY_NONE)
	 * </pre>
	 * 
	 * <pre>
	 * Expected:
	 * 		IllegalArgumentException
	 * </pre>
	 */
	@Test
	void testAddStereo0D_5() {
		JniInchiStructure structure = new JniInchiStructure();
		JniInchiStereo0D parity = new JniInchiStereo0D(new JniInchiAtom[3], JniInchiStereo0D.INCHI_PARITY_NONE, JniInchiStereo0D.INCHI_PARITY_NONE);
		
		assertThrows(IllegalArgumentException.class, () -> {
			structure.addStereo0D(parity);
		});
	}
	
	/**
	 * Test case 6:
	 * 
	 * <pre>
	 * Input:
	 * 		parity = new JniInchiStereo0D(new JniInchiAtom[4], JniInchiStereo0D.INCHI_PARITY_NONE, JniInchiStereo0D.INCHI_PARITY_NONE)
	 * </pre>
	 * 
	 * <pre>
	 * Expected:
	 * 		IllegalArgumentException
	 * </pre>
	 */
	@Test
	void testAddStereo0D_6() {
		JniInchiStructure structure = new JniInchiStructure();
		JniInchiStereo0D parity = new JniInchiStereo0D(new JniInchiAtom[4], JniInchiStereo0D.INCHI_PARITY_NONE, JniInchiStereo0D.INCHI_PARITY_NONE);
		
		assertThrows(IllegalArgumentException.class, () -> {
			structure.addStereo0D(parity);
		});
	}
	
	/**
	 * Test case 7:
	 * 
	 * <pre>
	 * Input:
	 * 		parity = new JniInchiStereo0D(new JniInchiAtom[5], JniInchiStereo0D.INCHI_PARITY_NONE, JniInchiStereo0D.INCHI_PARITY_NONE)
	 * </pre>
	 * 
	 * <pre>
	 * Expected:
	 * 		IllegalArgumentException
	 * </pre>
	 */
	@Test
	void testAddStereo0D_7() {
		JniInchiStructure structure = new JniInchiStructure();
		JniInchiStereo0D parity = new JniInchiStereo0D(new JniInchiAtom[5], JniInchiStereo0D.INCHI_PARITY_NONE, JniInchiStereo0D.INCHI_PARITY_NONE);
		
		assertThrows(IllegalArgumentException.class, () -> {
			structure.addStereo0D(parity);
		});
	}
	
	/**
	 * Test case 8:
	 * 
	 * <pre>
	 * Input:
	 * 		parity = new JniInchiStereo0D(new JniInchiAtom[6], JniInchiStereo0D.INCHI_PARITY_NONE, JniInchiStereo0D.INCHI_PARITY_NONE)
	 * </pre>
	 * 
	