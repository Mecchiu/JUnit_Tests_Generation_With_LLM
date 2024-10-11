// SBMLFilter_0Test.java
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
* It contains ten unit test cases for the {@link SBMLFilter#accept(File)} method.
*/
class SBMLFilter_0Test {

	/**
	 * Test of accept method, of class SBMLFilter.
	 */
	@Test
	void testAccept_File_0() {
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
	void testAccept_File_1() {
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
	void testAccept_File_2() {
		System.out.println("accept");
		File file = new File("test/data/sbml/BIOMD0000000012.txt");
		SBMLFilter instance = new SBMLFilter();
		boolean expResult = false;
		boolean result = instance.accept(file);
		assertEquals(expResult, result);
	}

	/**
	 * Test of accept method, of class SBMLFilter.
	 */
	@Test
	void testAccept_File_3() {
		System.out.println("accept");
		File file = new File("test/data/sbml/BIOMD0000000012.xml.gz");
		SBMLFilter instance = new SBMLFilter();
		boolean expResult = false;
		boolean result = instance.accept(file);
		assertEquals(expResult, result);
	}

	/**
	 * Test of accept method, of class SBMLFilter.
	 */
	@Test
	void testAccept_File_4() {
		System.out.println("accept");
		File file = new File("test/data/sbml/BIOMD0000000012.sbml.gz");
		SBMLFilter instance = new SBMLFilter();
		boolean expResult = false;
		boolean result = instance.accept(file);
		assertEquals(expResult, result);
	}

	/**
	 * Test of accept method, of class SBMLFilter.
	 */
	@Test
	void testAccept_File_5() {
		System.out.println("accept");
		File file = new File("test/data/sbml/BIOMD0000000012.txt.gz");
		SBMLFilter instance = new SBMLFilter();
		boolean expResult = false;
		boolean result = instance.accept(file);
		assertEquals(expResult, result);
	}

	/**
	 * Test of accept method, of class SBMLFilter.
	 */
	@Test
	void testAccept_File_6() {
		System.out.println("accept");
		File file = new File("test/data/sbml/BIOMD0000000012.xml.zip");
		SBMLFilter instance = new SBMLFilter();
		boolean expResult = false;
		boolean result = instance.accept(file);
		assertEquals(expResult, result);
	}

	/**
	 * Test of accept method, of class SBMLFilter.
	 */
	@Test
	void testAccept_File_7() {
		System.out.println("accept");
		File file = new File("test/data/sbml/BIOMD0000000012.sbml.zip");
		SBMLFilter instance = new SBMLFilter();
		boolean expResult = false;
		boolean result = instance.accept(file);
		assertEquals(expResult, result);
	}

	/**
	 * Test of accept method, of class SBMLFilter.
	 */
	@Test
	void testAccept_File_8() {
		System.out.println("accept");
		File file = new File("test/data/sbml/BIOMD0000000012.txt.zip");
		SBMLFilter instance = new SBMLFilter();
		boolean expResult = false;
		boolean result = instance.accept(file);
		assertEquals(expResult, result);
	}

	/**
	 * Test of accept method, of class SBMLFilter.
	 */
	@Test
	void testAccept_File_9() {
		System.out.println("accept");
		File file = new File("test/data/sbml/BIOMD0000000012.xml.bz2");
		SBMLFilter instance = new SBMLFilter();
		boolean expResult = false;
		boolean result = instance.accept(file);
		assertEquals(expResult, result);
	}

	/**
	 * Test of accept method, of class SBMLFilter.
	 */
	@Test
	void testAccept_File_10() {
		System.out.println("accept");
		File file = new File("test/data/sbml/BIOMD0000000012.sbml.bz2");
		SBMLFilter instance = new SBMLFilter();
		boolean expResult = false;
		boolean result = instance.accept(file);
		assertEquals(expResult, result);
	}

	/**
	 * Test of accept method, of class SBMLFilter.
	 */
	@Test
	void testAccept_File_11() {
		System.out.println("accept");
		File file = new File("test/data/sbml/BIOMD0000000012.txt.bz2");
		SBMLFilter instance = new SBMLFilter();
		boolean expResult = false;
		boolean result = instance.accept(file);
		assertEquals(expResult, result);
	}
}

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
* It contains ten unit test cases for the {@link SBMLFilter#accept(File)} method.
*/
class SBMLFilter_1Test {
		
	/**
	 * Test of accept method, of class SBMLFilter.
	 */
	@Test
	void testAccept_File_0() {
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
	void testAccept_File_1() {
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
	void testAccept_File_2() {
		System.out.println("accept");
		File file = new File("test/data/sbml/BIOMD0000000012.txt");
		SBMLFilter instance = new SBMLFilter();
		boolean expResult = false;
		boolean result = instance.accept(file);
		assertEquals(expResult, result);
	}

	/**
	 * Test of accept method, of class SBMLFilter.
	 */
	@Test
	void testAccept_File_3() {
		System.out.println("accept");
		File file = new File("test/data/sbml/BIOMD0000000012.xml.gz");
		SBMLFilter instance = new SBMLFilter();
		boolean expResult = false;
		boolean result = instance.accept(file);
		assertEquals(expResult, result);
	}

	/**
	 * Test of accept method, of class SBMLFilter.
	 */
	@Test
	void testAccept_File_4() {
		System.out.println("accept");
		File file = new File("test/data/sbml/BIOMD0000000012.sbml.gz");
		SBMLFilter instance = new SBMLFilter();
		boolean expResult = false;
		boolean result = instance.accept(file);
		assertEquals(expResult, result);
	}

	/**
	 * Test of accept method, of class SBMLFilter.
	 */
	@Test
	void testAccept_File_5() {
		System.out.println("accept");
		File file = new File("test/data/sbml/BIOMD0000000012.txt.gz");
		SBMLFilter instance = new SBMLFilter();
		boolean expResult = false;
		boolean result = instance.accept(file);
		assertEquals(expResult, result);
	}

	/**
	 * Test of accept method, of class SBMLFilter.
	 */
	@Test
	void testAccept_File_6() {
		System.out.println("accept");
		File file = new File("test/data/sbml/BIOMD0000000012.xml.zip");
		SBMLFilter instance = new SBMLFilter();
		boolean expResult = false;
		boolean result = instance.accept(file);
		assertEquals(expResult, result);
	}

	/**
	 * Test of accept method, of class SBMLFilter.
	 */
	@Test
	void testAccept_File_7() {
		System.out.println("accept");
		File file = new File("test/data/sbml/BIOMD0000000012.sbml.zip");
		SBMLFilter instance = new SBMLFilter();
		boolean expResult = false;
		boolean result = instance.accept(file);
		assertEquals(expResult, result);
	}

	/**
	 * Test of accept method, of class SBMLFilter.
	 */
	@Test
	void testAccept_File_8() {
		System.out.println("accept");
		File file = new File("test/data/sbml/BIOMD0000000012.txt.zip");
		SBMLFilter instance = new SBMLFilter();
		boolean expResult = false;
		boolean result = instance.accept(file);
		assertEquals(expResult, result);
	}

	/**
	 * Test of accept method, of class SBMLFilter.
	 */
	@Test
	void testAccept_File_9() {
		System.out.println("accept");
		File file = new File("test/data/sbml/BIOMD0000000012.xml.bz2");
		SBMLFilter instance = new SBMLFilter();
		boolean expResult = false;
		boolean result = instance.accept(file);
		assertEquals(expResult, result);
	}

	/**
	 * Test of accept method, of class SBMLFilter.
	 */
	@Test
	void testAccept_File_10() {
		System.out.println("accept");
		File file = new File("test/data/sbml/BIOMD0000000012.sbml.bz2");
		SBMLFilter instance = new SBMLFilter();
		boolean expResult = false;
		boolean result = instance.accept(file);
		assertEquals(expResult, result);
	}

	/**
	 * Test of accept method, of class SBMLFilter.
	 */
	@Test
	void testAccept_File_11() {
		System.out.println("accept");
		File file = new File("test/data/sbml/BIOMD0000000012.txt.bz2");
		SBMLFilter instance = new SBMLFilter();
		boolean expResult = false;
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
import cytoscape.data.readers.MetadataEntries;
import cytoscape.data.readers.MetadataParser;
import cytoscape.data.readers.MetadataParser.MetadataType;
import cytoscape.data.readers.TextFileReader;
import cytoscape.data.readers.TextJarReader;
import cytoscape.data.readers.TextJarReader.