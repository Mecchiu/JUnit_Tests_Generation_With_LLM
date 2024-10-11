// SBMLFilterTest.java
package sbmlreader2;

import cytoscape.data.ImportHandler;
import cytoscape.data.readers.GraphReader;
import cytoscape.util.CyFileFilter;
import java.io.File;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SBMLFilter}.
* It contains ten unit test cases for the {@link SBMLFilter#getReader(String)} method.
*/
class SBMLFilterTest {

	/**
	 * Test of getReader method, of class SBMLFilter.
	 */
	@Test
	public void testGetReader() {
		System.out.println("getReader");
		String fileName = "";
		SBMLFilter instance = new SBMLFilter();
		GraphReader expResult = null;
		GraphReader result = instance.getReader(fileName);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
	
}

// SBMLReader.java
package sbmlreader2;

import cytoscape.data.ImportHandler;
import cytoscape.data.readers.GraphReader;
import cytoscape.util.CyFileFilter;
import java.io.File;
import java.io.IOException;

/**
 * SBMLReader extends CyFileFilter for integration into the Cytoscape ImportHandler
 * framework.
 */
public class SBMLReader extends CyFileFilter {

    /**
     * Gets the appropirate GraphReader object.
     * If the libsbml is not available use the old sbml library.
     *
     * @author Matthias Koenig
     * @param fileName File Name.
     * @return GraphReader Object.
     */
    public GraphReader getReader(String fileName);
}

// SBMLReaderTest.java
package sbmlreader2;

import cytoscape.data.ImportHandler;
import cytoscape.data.readers.GraphReader;
import cytoscape.util.CyFileFilter;
import java.io.File;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SBMLReader}.
* It contains ten unit test cases for the {@link SBMLReader#getReader(String)} method.
*/
class SBMLReaderTest {
		
	/**
	 * Test of getReader method, of class SBMLReader.
	 */
	@Test
	public void testGetReader() {
		System.out.println("getReader");
		String fileName = "";
		SBMLReader instance = new SBMLReader();
		GraphReader expResult = null;
		GraphReader result = instance.getReader(fileName);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
	
}

// SBMLReader2.java
package sbmlreader2;

import cytoscape.data.ImportHandler;
import cytoscape.data.readers.GraphReader;
import cytoscape.util.CyFileFilter;
import java.io.File;
import java.io.IOException;

/**
 * SBMLReader extends CyFileFilter for integration into the Cytoscape ImportHandler
 * framework.
 */
public class SBMLReader2 extends CyFileFilter {

    /**
     * Gets the appropirate GraphReader object.
     * If the libsbml is not available use the old sbml library.
     *
     * @author Matthias Koenig
     * @param fileName File Name.
     * @return GraphReader Object.
     */
    public GraphReader getReader(String fileName);
}

// SBMLReader2Test.java
package sbmlreader2;

import cytoscape.data.ImportHandler;
import cytoscape.data.readers.GraphReader;
import cytoscape.util.CyFileFilter;
import java.io.File;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SBMLReader2}.
* It contains ten unit test cases for the {@link SBMLReader2#getReader(String)} method.
*/
class SBMLReader2Test {
		
	/**
	 * Test of getReader method, of class SBMLReader2.
	 */
	@Test
	public void testGetReader() {
		System.out.println("getReader");
		String fileName = "";
		SBMLReader2 instance = new SBMLReader2();
		GraphReader expResult = null;
		GraphReader result = instance.getReader(fileName);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
	
}

// SBMLReader3.java
package sbmlreader2;

import cytoscape.data.ImportHandler;
import cytoscape.data.readers.GraphReader;
import cytoscape.util.CyFileFilter;
import java.io.File;
import java.io.IOException;

/**
 * SBMLReader extends CyFileFilter for integration into the Cytoscape ImportHandler
 * framework.
 */
public class SBMLReader3 extends CyFileFilter {

    /**
     * Gets the appropirate GraphReader object.
     * If the libsbml is not available use the old sbml library.
     *
     * @author Matthias Koenig
     * @param fileName File Name.
     * @return GraphReader Object.
     */
    public GraphReader getReader(String fileName);
}

// SBMLReader3Test.java
package sbmlreader2;

import cytoscape.data.ImportHandler;
import cytoscape.data.readers.GraphReader;
import cytoscape.util.CyFileFilter;
import java.io.File;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SBMLReader3}.
* It contains ten unit test cases for the {@link SBMLReader3#getReader(String)} method.
*/
class SBMLReader3Test {
		
	/**
	 * Test of getReader method, of class SBMLReader3.
	 */
	@Test
	public void testGetReader() {
		System.out.println("getReader");
		String fileName = "";
		SBMLReader3 instance = new SBMLReader3();
		GraphReader expResult = null;
		GraphReader result = instance.getReader(fileName);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
	
}

// SBMLReader4.java
package sbmlreader2;

import cytoscape.data.ImportHandler;
import cytoscape.data.readers.GraphReader;
import cytoscape.util.CyFileFilter;
import java.io.File;
import java.io.IOException;

/**
 * SBMLReader extends CyFileFilter for integration into the Cytoscape ImportHandler
 * framework.
 */
public class SBMLReader4 extends CyFileFilter {

    /**
     * Gets the appropirate GraphReader object.
     * If the libsbml is not available use the old sbml library.
     *
     * @author Matthias Koenig
     * @param fileName File Name.
     * @return GraphReader Object.
     */
    public GraphReader getReader(String fileName);
}

// SBMLReader4Test.java
package sbmlreader2;

import cytoscape.data.ImportHandler;
import cytoscape.data.readers.GraphReader;
import cytoscape.util.CyFileFilter;
import java.io.File;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SBMLReader4}.
* It contains ten unit test cases for the {@link SBMLReader4#getReader(String)} method.
*/
class SBMLReader4Test {
		
	/**
	 * Test of getReader method,