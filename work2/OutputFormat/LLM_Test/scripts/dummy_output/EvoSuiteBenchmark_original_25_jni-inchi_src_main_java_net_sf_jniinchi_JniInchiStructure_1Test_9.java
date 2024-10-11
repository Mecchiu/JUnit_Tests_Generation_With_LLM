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
		
	/**
	 * Test adding two bonds with the same bond ID.
	 * For each b, it should return the same thing.
	 */
	@Test
	void one() {
		ArrayList<InchiObject> b = new ArrayList<InchiObject>();
		InchiObject b0 = new InchiObject("b4.0", 0, 0);
		b.add(b0);
		ArrayList<InchiObject> a = new ArrayList<InchiObject>();
		InchiObject a0 = new InchiObject("a1.0", 0, 0);
		a.add(a0);
		
		JniInchiStructure s = new JniInchiStructure();
		InchiObject obj = s.addBond(b);
		assertEquals(b, obj);
		obj = s.addBond(b);
		assertNotEquals(obj, b);
		obj = s.addBond(b);
		assertEquals(b, obj);
		obj = s.addBond(b);
		assertEquals(s, obj);
	}

	/**
	 * Test adding two bonds with different bond ID.
	 * For each b, it should return a different object.
	 */
	@Test
	void twoAddBonds() {
		ArrayList<InchiObject> b = new ArrayList<InchiObject>();
		InchiObject b0 = new InchiObject("b4.0", 0, 0);
		b.add(b0);
		ArrayList<InchiObject> a = new ArrayList<InchiObject>();
		InchiObject a0 = new InchiObject("a1.0", 0, 0);
		a.add(a0);
		
		JniInchiStructure s = new JniInchiStructure();
		InchiObject obj = s.addBond(b);
		while (b.size()!= 0) {
			b = new ArrayList<InchiObject>();
			b.add(a);
		}
		obj = s.addBond(b);
		assertNotEquals(obj, b0);
		assertEquals(obj, b0);
		obj = s.addBond(b);
		assertNotEquals(obj, b0);
		assertEquals(obj, b0);
	}

}