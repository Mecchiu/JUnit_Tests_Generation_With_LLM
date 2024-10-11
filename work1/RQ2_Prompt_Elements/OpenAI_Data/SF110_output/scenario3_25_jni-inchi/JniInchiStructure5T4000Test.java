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
	void testGetStereo0D9() throws JniInchiException {
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
		stereo0DList.add(new JniInchiStereo0D());
		structure.setStereo0D(stereo0DList);
		assertEquals(structure.getStereo0D(8), stereo0DList.get(8));
	}
	
	/**
	 * Test case 10.
	 *
	 * @throws JniInchiException
	 */
	@Test
	void testGetStereo0D10() throws JniInchiException {
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
		stereo0DList.add(new JniInchiStereo0D());
		stereo0DList.add(new JniInchiStereo0D());
		structure.setStereo0D(stereo0DList);
		assertEquals(structure.getStereo0D(9), stereo0DList.get(9));
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
* It contains one unit test case for the {@link JniInchiStereo0D#getStereoType()} method.
*/
class JniInchiStereo0DTest {
		
	/**
	 * Test case 1.
	 *
	 * @throws JniInchiException
	 */
	@Test
	void testGetStereoType1() throws JniInchiException {
		JniInchiStereo0D stereo0D = new JniInchiStereo0D();
		stereo0D.setStereoType(JniInchiStereoType.TETRAHEDRAL);
		assertEquals(stereo0D.getStereoType(), JniInchiStereoType.TETRAHEDRAL);
	}
}

// JniInchiStereoType.java
package net.sf.jniinchi;

/**
 * @author Sam Adams
 */
public enum JniInchiStereoType {
    TETRAHEDRAL,
    ALLENE,
    SQUARE_PLANAR,
    TRIGONAL_BIPYRAMIDAL,
    OCTAHEDRAL,
    TRIGONAL_PYRAMIDAL,
    UNSPECIFIED
}

// JniInchiStereoTypeTest.java
package net.sf.jniinchi;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStereoType}.
* It contains one unit test case for the {@link JniInchiStereoType#getValue()} method.
*/
class JniInchiStereoTypeTest {
		
	/**
	 * Test case 1.
	 *
	 * @throws JniInchiException
	 */
	@Test
	void testGetValue1() throws JniInchiException {
		assertEquals(JniInchiStereoType.TETRAHEDRAL.getValue(), 0);
	}
}

// JniInchiWrapper.java
package net.sf.jniinchi;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Sam Adams
 */
public class JniInchiWrapper {

    /**
     * Returns the InChI version.
     *
     * @return
     */
    public String getInchiVersion();

    /**
     * Returns the InChI library version.
     *
     * @return
     */
    public String getInchiLibVersion();

    /**
     * Returns the InChI key for the given structure.
     *
     * @param structure
     * @return
     * @throws JniInchiException
     */
    public String getInchi(JniInchiInput structure) throws JniInchiException;

    /**
     * Returns the InChI key for the given structure.
     *
     * @param structure
     * @param options
     * @return
     * @throws JniInchiException
     */
    public String getInchi(JniInchiInput structure, String options) throws JniInchiException;

    /**
     * Returns the InChI key for the given structure.
     *
     * @param structure
     * @param options
     * @param outputStream
     * @return
     * @throws JniInchiException
     */
    public String getInchi(JniInchiInput structure, String options, OutputStream outputStream) throws JniInchiException;

    /**
     * Returns the InChI key for the given structure.
     *
     * @param structure
     * @param options
     * @param outputStream
     * @param logStream
     * @return
     * @throws JniInchiException
     */
    public String getInchi(JniInchiInput structure, String options, OutputStream outputStream, OutputStream logStream) throws JniInchiException;

    /**
     * Returns the InChI key for the given structure.
     *
     * @param structure
     * @param options
     * @param outputStream
     * @param logStream
     * @param message
     * @return
     * @throws JniInchiException
     */
    public String getInchi(JniInchiInput structure, String options, OutputStream outputStream, OutputStream logStream, String message) throws JniInchiException;

    /**
     * Returns the InChI key for the given structure.
     *
     * @param structure
     * @param options
     * @param outputStream
     * @param logStream
     * @param message
     * @param warning
     * @return
     * @throws JniInchiException
     */
    public String getInchi(JniInchiInput structure, String options, OutputStream outputStream, OutputStream logStream, String message, String warning) throws JniInchiException;

    /**
