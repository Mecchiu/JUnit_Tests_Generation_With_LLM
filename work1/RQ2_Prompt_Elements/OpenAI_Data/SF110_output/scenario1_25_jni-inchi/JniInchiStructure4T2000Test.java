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

	@Test
	void testGetBond_0() {
		JniInchiStructure structure = new JniInchiStructure();
		List<JniInchiBond> bondList = new ArrayList<JniInchiBond>();
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		structure.bondList = bondList;
		assertEquals(new JniInchiBond(), structure.getBond(0));
	}
	
	@Test
	void testGetBond_1() {
		JniInchiStructure structure = new JniInchiStructure();
		List<JniInchiBond> bondList = new ArrayList<JniInchiBond>();
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		structure.bondList = bondList;
		assertEquals(new JniInchiBond(), structure.getBond(1));
	}
	
	@Test
	void testGetBond_2() {
		JniInchiStructure structure = new JniInchiStructure();
		List<JniInchiBond> bondList = new ArrayList<JniInchiBond>();
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		structure.bondList = bondList;
		assertEquals(new JniInchiBond(), structure.getBond(2));
	}
	
	@Test
	void testGetBond_3() {
		JniInchiStructure structure = new JniInchiStructure();
		List<JniInchiBond> bondList = new ArrayList<JniInchiBond>();
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		structure.bondList = bondList;
		assertEquals(new JniInchiBond(), structure.getBond(3));
	}
	
	@Test
	void testGetBond_4() {
		JniInchiStructure structure = new JniInchiStructure();
		List<JniInchiBond> bondList = new ArrayList<JniInchiBond>();
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		structure.bondList = bondList;
		assertEquals(new JniInchiBond(), structure.getBond(4));
	}
	
	@Test
	void testGetBond_5() {
		JniInchiStructure structure = new JniInchiStructure();
		List<JniInchiBond> bondList = new ArrayList<JniInchiBond>();
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		structure.bondList = bondList;
		assertEquals(new JniInchiBond(), structure.getBond(5));
	}
	
	@Test
	void testGetBond_6() {
		JniInchiStructure structure = new JniInchiStructure();
		List<JniInchiBond> bondList = new ArrayList<JniInchiBond>();
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
		structure.bondList = bondList;
		assertEquals(new JniInchiBond(), structure.getBond(6));
	}
	
	@Test
	void testGetBond_7() {
		JniInchiStructure structure = new JniInchiStructure();
		List<JniInchiBond> bondList = new ArrayList<JniInchiBond>();
		bondList.add(new JniInchiBond());
		bondList.add(new JniInchiBond());
