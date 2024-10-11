// JniInchiStructureTest.java
package net.sf.jniinchi;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStructure}.
* It contains ten unit test cases for the {@link JniInchiStructure#getAtom(int)} method.
*/
class JniInchiStructureTest {

	@Test
	void testGetAtom_0() {
		JniInchiStructure structure = new JniInchiStructure();
		List<JniInchiAtom> atomList = new ArrayList<JniInchiAtom>();
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		structure.atomList = atomList;
		assertEquals(new JniInchiAtom("C"), structure.getAtom(0));
	}
	
	@Test
	void testGetAtom_1() {
		JniInchiStructure structure = new JniInchiStructure();
		List<JniInchiAtom> atomList = new ArrayList<JniInchiAtom>();
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		structure.atomList = atomList;
		assertEquals(new JniInchiAtom("C"), structure.getAtom(1));
	}
	
	@Test
	void testGetAtom_2() {
		JniInchiStructure structure = new JniInchiStructure();
		List<JniInchiAtom> atomList = new ArrayList<JniInchiAtom>();
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		structure.atomList = atomList;
		assertEquals(new JniInchiAtom("C"), structure.getAtom(2));
	}
	
	@Test
	void testGetAtom_3() {
		JniInchiStructure structure = new JniInchiStructure();
		List<JniInchiAtom> atomList = new ArrayList<JniInchiAtom>();
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		structure.atomList = atomList;
		assertEquals(new JniInchiAtom("C"), structure.getAtom(3));
	}
	
	@Test
	void testGetAtom_4() {
		JniInchiStructure structure = new JniInchiStructure();
		List<JniInchiAtom> atomList = new ArrayList<JniInchiAtom>();
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		structure.atomList = atomList;
		assertEquals(new JniInchiAtom("C"), structure.getAtom(4));
	}
	
	@Test
	void testGetAtom_5() {
		JniInchiStructure structure = new JniInchiStructure();
		List<JniInchiAtom> atomList = new ArrayList<JniInchiAtom>();
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		structure.atomList = atomList;
		assertEquals(new JniInchiAtom("C"), structure.getAtom(5));
	}
	
	@Test
	void testGetAtom_6() {
		JniInchiStructure structure = new JniInchiStructure();
		List<JniInchiAtom> atomList = new ArrayList<JniInchiAtom>();
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new JniInchiAtom("C"));
		atomList.add(new J