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
		stereoList.add(new JniInchiStereo0D());
		stereoList.add(new JniInchiStereo0D());
		structure.stereoList = stereoList;
		assertEquals(structure.getStereo0D(8), stereoList.get(8));
	}
	
	/**
	 * Test case 10.
	 * 
	 * @throws Exception
	 */
	@Test
	void testGetStereo0D10() throws Exception {
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
		stereoList.add(new JniInchiStereo0D());
		stereoList.add(new JniInchiStereo0D());
		structure.stereoList = stereoList;
		assertEquals(structure.getStereo0D(9), stereoList.get(9));
	}
}

// JniInchiStereo0D.java
package net.sf.jniinchi;

/**
 * @author Sam Adams
 */
public class JniInchiStereo0D {
}

// JniInchiStereo0DTest.java
package net.sf.jniinchi;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStereo0D}.
* It contains one unit test case for the {@link JniInchiStereo0D#JniInchiStereo0D()} constructor.
*/
class JniInchiStereo0DTest {
		
	/**
	 * Test case 1.
	 * 
	 * @throws Exception
	 */
	@Test
	void testJniInchiStereo0D1() throws Exception {
		JniInchiStereo0D stereo = new JniInchiStereo0D();
		assertNotNull(stereo);
	}
}

// JniInchiAtom.java
package net.sf.jniinchi;

/**
 * @author Sam Adams
 */
public class JniInchiAtom {
}

// JniInchiAtomTest.java
package net.sf.jniinchi;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiAtom}.
* It contains one unit test case for the {@link JniInchiAtom#JniInchiAtom()} constructor.
*/
class JniInchiAtomTest {
		
	/**
	 * Test case 1.
	 * 
	 * @throws Exception
	 */
	@Test
	void testJniInchiAtom1() throws Exception {
		JniInchiAtom atom = new JniInchiAtom();
		assertNotNull(atom);
	}
}

// JniInchiBond.java
package net.sf.jniinchi;

/**
 * @author Sam Adams
 */
public class JniInchiBond {
}

// JniInchiBondTest.java
package net.sf.jniinchi;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiBond}.
* It contains one unit test case for the {@link JniInchiBond#JniInchiBond()} constructor.
*/
class JniInchiBondTest {
		
	/**
	 * Test case 1.
	 * 
	 * @throws Exception
	 */
	@Test
	void testJniInchiBond1() throws Exception {
		JniInchiBond bond = new JniInchiBond();
		assertNotNull(bond);
	}
}

// JniInchiInput.java
package net.sf.jniinchi;

/**
 * @author Sam Adams
 */
public class JniInchiInput {
}

// JniInchiInputTest.java
package net.sf.jniinchi;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiInput}.
* It contains one unit test case for the {@link JniInchiInput#JniInchiInput()} constructor.
*/
class JniInchiInputTest {
		
	/**
	 * Test case 1.
	 * 
	 * @throws Exception
	 */
	@Test
	void testJniInchiInput1() throws Exception {
		JniInchiInput input = new JniInchiInput();
		assertNotNull(input);
	}
}

// JniInchiOutput.java
package net.sf.jniinchi;

/**
 * @author Sam Adams
 */
public class JniInchiOutput {
}

// JniInchiOutputTest.java
package net.sf.jniinchi;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiOutput}.
* It contains one unit test case for the {@link JniInchiOutput#JniInchiOutput()} constructor.
*/
class JniInchiOutputTest {
		
	/**
	 * Test case 1.
	 * 
	 * @throws Exception
	 */
	@Test
	void testJniInchiOutput1() throws Exception {
		JniInchiOutput output = new JniInchiOutput();
		assertNotNull(output);
	}
}

// JniInchiOutputStructure.java
package net.sf.jniinchi;

/**
 * @author Sam Adams
 */
public class JniInchiOutputStructure {
}

// JniInchiOutputStructureTest.java
package net.sf.jniinchi;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiOutputStructure}.
* It contains one unit test case for the {@link JniInchiOutputStructure#JniInchiOutputStructure()} constructor.
*/
class JniInchiOutputStructureTest {
		
	/**
	 * Test case 1.
	 * 
	 * @throws Exception
	 */
	@Test
	void testJniInchiOutputStructure1() throws Exception {
		JniInchiOutputStructure outputStructure = new JniInchiOutputStructure();
		assertNotNull(outputStructure);
	}
}

// JniInchiInputInchi.java
package net.sf.jniinchi;

/**
 * @author Sam Adams
 */
public class JniInchiInputInchi {
}

// JniInchiInputInchiTest.java
package net.sf.jniinchi;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiInputInchi}.
* It contains one unit test case for the {@link JniInchiInputInchi#JniInchiInput