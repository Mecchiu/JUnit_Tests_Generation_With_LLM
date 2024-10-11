// SBMLFilter_1Test.java
package sbmlreader2;

/*
 Copyright (c) 2006, 2007, The Cytoscape Consortium (www.cytoscape.org)

 The Cytoscape Consortium is:
 - Institute for Systems Biology
 - University of California San Diego
 - Memorial Sloan-Kettering Cancer Center
 - Institut Pasteur
 - Agilent Technologies

 This library is free software; you can redistribute it and/or modify it
 under the terms of the GNU Lesser General Public License as published
 by the Free Software Foundation; either version 2.1 of the License, or
 any later version.

 This library is distributed in the hope that it will be useful, but
 WITHOUT ANY WARRANTY, WITHOUT EVEN THE IMPLIED WARRANTY OF
 MERCHANTABILITY OR FITNESS FOR A PARTICULAR PURPOSE.  The software and
 documentation provided hereunder is on an "as is" basis, and the
 Institute for Systems Biology and the Whitehead Institute
 have no obligations to provide maintenance, support,
 updates, enhancements or modifications.  In no event shall the
 Institute for Systems Biology and the Whitehead Institute
 be liable to any party for direct, indirect, special,
 incidental or consequential damages, including lost profits, arising
 out of the use of this software and its documentation, even if the
 Institute for Systems Biology and the Whitehead Institute
 have been advised of the possibility of such damage.  See
 the GNU Lesser General Public License for more details.

 You should have received a copy of the GNU Lesser General Public License
 along with this library; if not, write to the Free Software Foundation,
 Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.
*/
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
class SBMLFilter_1Test {

	/**
	 * Test of getReader method, of class SBMLFilter.
	 * @throws java.lang.Exception
	 */
	@Test
	void testGetReader() throws Exception {
		System.out.println("getReader");
		SBMLFilter instance = new SBMLFilter();
		GraphReader result = instance.getReader("");
		assertNotNull(result);
	}
	
	/**
	 * Test of getReader method, of class SBMLFilter.
	 * @throws java.lang.Exception
	 */
	@Test
	void testGetReader_1() throws Exception {
		System.out.println("getReader");
		SBMLFilter instance = new SBMLFilter();
		GraphReader result = instance.getReader("test/data/sbml/BIOMD0000000012.xml");
		assertNotNull(result);
	}
	
	/**
	 * Test of getReader method, of class SBMLFilter.
	 * @throws java.lang.Exception
	 */
	@Test
	void testGetReader_2() throws Exception {
		System.out.println("getReader");
		SBMLFilter instance = new SBMLFilter();
		GraphReader result = instance.getReader("test/data/sbml/BIOMD0000000012.sbml");
		assertNotNull(result);
	}
	
	/**
	 * Test of getReader method, of class SBMLFilter.
	 * @throws java.lang.Exception
	 */
	@Test
	void testGetReader_3() throws Exception {
		System.out.println("getReader");
		SBMLFilter instance = new SBMLFilter();
		GraphReader result = instance.getReader("test/data/sbml/BIOMD0000000013.xml");
		assertNotNull(result);
	}
	
	/**
	 * Test of getReader method, of class SBMLFilter.
	 * @throws java.lang.Exception
	 */
	@Test
	void testGetReader_4() throws Exception {
		System.out.println("getReader");
		SBMLFilter instance = new SBMLFilter();
		GraphReader result = instance.getReader("test/data/sbml/BIOMD0000000013.sbml");
		assertNotNull(result);
	}
	
	/**
	 * Test of getReader method, of class SBMLFilter.
	 * @throws java.lang.Exception
	 */
	@Test
	void testGetReader_5() throws Exception {
		System.out.println("getReader");
		SBMLFilter instance = new SBMLFilter();
		GraphReader result = instance.getReader("test/data/sbml/BIOMD0000000014.xml");
		assertNotNull(result);
	}
	
	/**
	 * Test of getReader method, of class SBMLFilter.
	 * @throws java.lang.Exception
	 */
	@Test
	void testGetReader_6() throws Exception {
		System.out.println("getReader");
		SBMLFilter instance = new SBMLFilter();
		GraphReader result = instance.getReader("test/data/sbml/BIOMD0000000014.sbml");
		assertNotNull(result);
	}
	
	/**
	 * Test of getReader method, of class SBMLFilter.
	 * @throws java.lang.Exception
	 */
	@Test
	void testGetReader_7() throws Exception {
		System.out.println("getReader");
		SBMLFilter instance = new SBMLFilter();
		GraphReader result = instance.getReader("test/data/sbml/BIOMD0000000015.xml");
		assertNotNull(result);
	}
	
	/**
	 * Test of getReader method, of class SBMLFilter.
	 * @throws java.lang.Exception
	 */
	@Test
	void testGetReader_8() throws Exception {
		System.out.println("getReader");
		SBMLFilter instance = new SBMLFilter();
		GraphReader result = instance.getReader("test/data/sbml/BIOMD0000000015.sbml");
		assertNotNull(result);
	}
	
	/**
	 * Test of getReader method, of class SBMLFilter.
	 * @throws java.lang.Exception
	 */
	@Test
	void testGetReader_9() throws Exception {
		System.out.println("getReader");
		SBMLFilter instance = new SBMLFilter();
		GraphReader result = instance.getReader("test/data/sbml/BIOMD0000000016.xml");
		assertNotNull(result);
	}
	
	/**
	 * Test of getReader method, of class SBMLFilter.
	 * @throws java.lang.Exception
	 */
	@Test
	void testGetReader_10() throws Exception {
		System.out.println("getReader");
		SBMLFilter instance = new SBMLFilter();
		GraphReader result = instance.getReader("test/data/sbml/BIOMD0000000016.sbml");
		assertNotNull(result);
	}
	
}

// SBMLFilter_2Test.java
package sbmlreader2;

/*
 Copyright (c) 2006, 2007, The Cytoscape Consortium (www.cytoscape.org)

 The Cytoscape Consortium is:
 - Institute for Systems Biology
 - University of California San Diego
 - Memorial Sloan-Kettering Cancer Center
 - Institut Pasteur
 - Agilent Technologies

 This library is free software; you can redistribute it and/or modify it
 under the terms of the GNU Lesser General Public License as published
 by the Free Software Foundation; either version 2.1 of the License, or
 any later version.

 This library is distributed in the hope that it will be useful, but
 WITHOUT ANY WARRANTY, WITHOUT EVEN THE IMPLIED WARRANTY OF
 MERCHANTABILITY OR FITNESS FOR A PARTICULAR PURPOSE.  The software and
 documentation provided hereunder is on an "as is" basis, and the
 Institute for Systems Biology and the Whitehead Institute
 have no obligations to provide maintenance, support,
 updates, enhancements or modifications.  In no event shall the
 Institute for Systems Biology and the Whitehead Institute
 be liable to any party for direct, indirect, special,
 incidental or consequential damages, including lost profits, arising
 out of the use of this software and its documentation, even if the
 Institute for Systems Biology and the Whitehead Institute
 have been advised of the possibility of such damage.  See
 the GNU Lesser General Public License for more details.

 You should have received a copy of the GNU Lesser General Public License
 along with this library; if not, write to the Free Software Foundation,
 Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.
*/
import cytoscape.data.ImportHandler;
import cytoscape.data.readers.GraphReader;
import cytoscape.util.CyFileFilter;
import java.io.File;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SBMLFilter}.
* It contains ten unit test cases for the {@link SBMLFilter#accept(java.io.File)} method.
*/
class SBMLFilter_2Test {
		
	/**
	 * Test of accept method, of class SBMLFilter.
	 */
	@Test
	void testAccept() {
		System.out.println("accept");
		File file = new File("test/data/sbml/BIOMD0000000012.xml");
		SBMLFilter instance = new SBMLFilter();
		boolean expResult = true;
		boolean result = instance.accept(file);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of accept method, of class SBMLFilter.
	 */
	@Test
	void testAccept_1() {
		System.out.println("accept");
		File file = new File("test/data/sbml/BIOMD0000000012.sbml");
		SBMLFilter instance = new SBMLFilter();
		boolean expResult = true;
		boolean result = instance.accept(file);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of accept method, of class SBMLFilter.
	 */
	@Test
	void testAccept_2() {
		System.out.println("accept");
		File file = new File("test/data/sbml/BIOMD0000000013.xml");
		SBMLFilter instance = new SBMLFilter();
		boolean expResult = true;
		boolean result = instance.accept(file);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of accept method, of class SBMLFilter.
	 */
	@Test
	void testAccept_3() {
		System.out.println("accept");
		File file = new File("test/data/sbml/BIOMD0000000013.sbml");
		SBMLFilter instance = new SBMLFilter();
		boolean expResult = true;
		boolean result = instance.accept(file);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of accept method, of class SBMLFilter.
	 */
	@Test
	void testAccept_4() {
		System.out.println("accept");
		File file = new File("test/data/sbml/BIOMD0000000014.xml");
		SBMLFilter instance = new SBMLFilter();
		boolean expResult = true;
		boolean result = instance.accept(file);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of accept method, of class SBMLFilter.
	 */
	@Test
	void testAccept_5() {
		System.out.println("accept");
		File file = new File("test/data/sbml/BIOMD0000000014.sbml");
		SBMLFilter instance = new SBMLFilter();
		boolean expResult = true;
		boolean result = instance.accept(file);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of accept method, of class SBMLFilter.
	 */
	@Test
	void testAccept_6() {
		System.out.println("accept");
		File file = new File("test/data/sbml/BIOMD0000000015.xml");
		SBMLFilter instance = new SBMLFilter();
		boolean expResult = true;
		boolean result = instance.accept(file);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of accept method, of class SBMLFilter.
	 */
	@Test
	void testAccept_7() {
		System.out.println("accept");
		File file = new File("test/data/sbml/BIOMD0000000015.sbml");
		SBMLFilter instance = new SBMLFilter();
		boolean expResult = true;
		boolean result = instance.accept(file);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of accept method, of class SBMLFilter.
	 */
	@Test
	void testAccept_8() {
		System.out.println("accept");
		File file = new File("test/data/sbml/BIOMD0000000016.xml");
		SBMLFilter instance = new SBMLFilter();
		boolean expResult = true;
		boolean result = instance.accept(file);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of accept method, of class SBMLFilter.
	 */
	@Test
	void testAccept_9() {
		System.out.println("accept");
		File file = new File("test/data/sbml/BIOMD0000000016.sbml");
		SBMLFilter instance = new SBMLFilter();
		boolean expResult = true;
		boolean result = instance.accept(file);
		assertEquals(expResult, result);
	}
	
}

// SBMLGraphReader.java
package sbmlreader2;

/*
 Copyright (c) 2006, 2007, The Cytoscape Consortium (www.cytoscape.org)

 The Cytoscape Consortium is:
 - Institute for Systems Biology
 - University of California San Diego
 - Memorial Sloan-Kettering Cancer Center
 - Institut Pasteur
 - Agilent Technologies

 This library is free software; you can redistribute it and/or modify it
 under the terms of the GNU Lesser General Public License as published
 by the Free Software Foundation; either version 2.1 of the License, or
 any later version.

 This library is distributed in the hope that it will be useful, but
 WITHOUT ANY WARRANTY, WITHOUT EVEN THE IMPLIED WARRANTY OF
 MERCHANTABILITY OR FITNESS FOR A PARTICULAR PURPOSE.  The software and
 documentation provided hereunder is on an "as is" basis, and the
 Institute for Systems Biology and the Whitehead Institute
 have no obligations to provide maintenance, support,
 updates, enhancements or modifications.  In no event shall the
 Institute for Systems Biology and the Whitehead Institute
 be liable to any party for direct, indirect, special,
 incidental or consequential damages, including lost profits, arising
 out of the use of this software and its documentation, even if the
 Institute for Systems Biology and the Whitehead Institute
 have been advised of the possibility of such damage.  See
 the GNU Lesser General Public License for more details.

 You should have received a copy of the GNU Lesser General Public License
 along with this library; if not, write to the Free Software Foundation,
 Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.
*/
import cytoscape.CyNetwork;
import cytoscape.Cytoscape;
import cytoscape.data.CyAttributes;
import cytoscape.data.readers.GraphReader;
import cytoscape.data.readers.TextFileReader;
import cytoscape.data.readers.TextJarReader;
import cytoscape.data.readers.TextJarReader.JarEntryReader;
import cytoscape.data.readers.TextJarReader.JarInputStreamReader;
import cytoscape.data.readers.TextJarReader.URLJarReader;
import cytoscape.data.readers.TextJarReader.URLReader;
import cytoscape.data.readers.TextJarReader.ZipEntryReader;
import cytoscape.data.readers.TextJarReader.ZipInputStreamReader;
import cytoscape.data.readers.TextJarReader.ZipURLReader;
import cytoscape.data.readers.TextJarReader.ZipURLStreamReader;
import cytoscape.data.readers.TextJarReader.ZipURLStreamReader.ZipInputStreamURLReader;
import cytoscape.data.readers.TextJarReader.ZipURLStreamReader.ZipInputStreamURLReader.ZipInputStreamURLJarReader;
import cytoscape.data.readers.TextJarReader.ZipURLStreamReader.ZipInputStreamURLReader.ZipInputStreamURLJarReader.ZipInputStreamURLJarEntryReader;
import cytoscape.data.readers.TextJarReader.ZipURLStreamReader.ZipInputStreamURLReader.ZipInputStreamURLReader;
import cytoscape.data.readers.TextJarReader.ZipURLStreamReader.ZipInputStreamURLReader.ZipInputStreamURLReader.ZipInputStreamURLJarReader;
import cytoscape.data.readers.TextJarReader.ZipURLStreamReader.ZipInputStreamURLReader.ZipInputStreamURLReader.ZipInputStreamURLJarReader.ZipInputStreamURLJarEntryReader;
import cytoscape.data.readers.TextJarReader.ZipURLStreamReader.ZipInputStreamURLReader.ZipInputStreamURLReader.ZipInputStreamURLReader;
import cytoscape.data.readers.TextJarReader.ZipURLStreamReader.ZipInputStreamURLReader.ZipInputStreamURLReader.ZipInputStreamURLReader;
import cytoscape.data.readers.TextJarReader.ZipURLStreamReader.ZipInputStreamURLReader.ZipInputStreamURLReader.ZipInputStreamURLReader.ZipInputStreamURLJarReader;
import cytoscape.data.readers.TextJarReader.ZipURLStreamReader.ZipInputStreamURLReader.ZipInputStreamURLReader.ZipInputStreamURLReader.ZipInputStreamURLJarReader.ZipInputStreamURLJarEntryReader;
import cytoscape.data.readers.TextJarReader.ZipURLStreamReader