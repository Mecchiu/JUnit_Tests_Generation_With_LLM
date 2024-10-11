// JniInchiStructure_1Test.java
package net.sf.jniinchi;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStructure}.
* It contains one unit test case for the {@link JniInchiStructure#addBond(JniInchiBond)} method.
*/
class JniInchiStructure_1Test {
		
	@Test
	public void testStructure() {
		assertNotNull("JNIStructure is instanceof an non-null object", JniInchiStructure.structure);
	}

	@Test
	public void testAddBond() {
		assertNotNull("InchiStructure is instanceof an non-null object", JniInchiStructure.structure);
		assertNotNull("Structure is a JNIStructure", JniInchiStructure.structure);
		assertNotNull("Structure is an JNIInchiStructure", JniInchiStructure.structure);
		assertNotNull("JNIStructure is a JNIStructure", JniInchiStructure.structure);
		assertSame("Structure cannot be modified by another JNIStructure", JniInchiStructure.structure, JniInchiStructure.structure);
		assertNotSame("Molecule contains multiple inchi structures", JniInchiStructure.molecule, JniInchiStructure.structure);

		JniInchiStructure addStructure = new JniInchiStructure("bond_name");
		assertEquals("Structure id returned", "bond_name", addStructure.getId());
		assertEquals("Structure is not a bond structure", addStructure.isBond(), Boolean.TRUE);
		assertSame("Structure cannot be modified by another JNIStructure", JniInchiStructure.structure, JniInchiStructure.structure);
		JniInchiBond bond = new JniInchiBond("bond_name");
		assertEquals("Bond id returned", "bond_name_bond", bond.getId());
		assertEquals("Bond id cannot be modified by another JNIStructure", JniInchiStructure.structure, JniInchiStructure.structure);
	}

   
	@Test
	public void testJNIStructure() {
		assertNotNull(JniInchiStructure.JNIStructure);
		assertNotNull(JniInchiStructure.structure);

		List<JniInchiStructure> list = new ArrayList< JniInchiStructure >();
		List<JniInchiStructure> list1 = new ArrayList< JniInchiStructure >();
		List<JniInchiStructure> list2 = new ArrayList< JniInchiStructure >();

		// List empty
		list.add(new JniInchiStructure1("list1_1"));
		list.add(new JniInchiStructure1("list1_2"));

		// List contains non-null objects
		list1.add(new JniInchiStructure1("list1_1"));	
		list1.add(new JniInchiStructure1("list1_2"));

		// List contains JNIInchiStructure objects
		list2.add(new JniInchiStructure1("list2_1"));	
		list2.add(new JniInchiStructure1("list2_2"));	

		assertEquals("Returned list size is wrong", list.size(), JniInchiStructure.JNIStructure.size());
		assertEquals("Returned list does not contain any valid list of JNIInchestStructure objects", list.size(), JniInchiStructure.structure.size());
		assertEquals("Returned list does not contain the right JNIInchiStructure objects", list.toString(), JniInchiStructure.JNIStructure.toString());
		assertTrue("Returned list contains at least a single JNIInchiStructure object for list1_1", list1.size() == JniInchiStructure.JNIStructure.size());
		assertEquals("Returned list does not contain list1_1_bond", list1.toString(), JniInchiStructure.structure.toString());
		assertEquals("Returned list does not contain list2_1_bond", list2.toString(), JniInchiStructure.structure.toString());

		// Modify all objects
		list.clear();
		list.addAll(list2);
		list.add(new JniInchiStructure1("list2_1"));
        list.add(new JniInchiStructure1("list2_2"));
		JniInchiStructure structure4 = new JniInchiStructure1("list1_2");
		JniInchiStructure structure1 = new JniInchiStructure1("list1_1");
		list.clear();
		list.add(structure4);
		list.add(structure1);
		list.add(new JniInchiBond("list2_1_bond"));
		list.add(new JniInchiBond("list2_2_bond"));
		// Modify all and add to new list
		list.clear();
		list.add(new JniInchiStructure1("list1_1"));
		list.add(new JniInchiStructure1("list1_2"));
		list.add(new JniInchiBond("list2_1_bond"));
		list.add(new JniInchiBond("list2_2_bond"));
    }

}