// JniInchiStructure_3Test.java
package net.sf.jniinchi;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStructure}.
* It contains one unit test case for the {@link JniInchiStructure#getAtom(int)} method.
*/
class JniInchiStructure_3Test {
		  
	// Constructors.
	public JniInchiStructure_3Test() { }

	/**
	* It throws an AssertionError since this tests is not runnable yet.
	*/
	@Test
	public void ensureDoesNotThrowError() {
		  
		// Assertions.
		assertThrows(
				AssertionError.class,
				() -> {
					JniInchiStructure.getAtom(1);
				});
	}
	
	// Tests.
	@Test
	public void testGetAtom() {
		// No parameters tests
		assertThrows(
				AssertionError.class,
				() -> {
					JniInchiStructure.getAtom((byte) 0);
				}) ;
		
		// One parameter tests
		for (byte b : JniInchiStructure.Atom.values()) {
			assertThrows(
					AssertionError.class,
					() -> {
						JniInchiStructure.getAtom((JniInchiStructure.Atom) b);
					});
		}
	}
	
	// Tests.
	@Test
	public void testAtom() {
		// No parameters tests
		assertThrows(
				AssertionError.class,
				() -> {
					byte[] v;
					JniInchiStructure.getAtom(v);
				}) ;
		
		// One parameter tests
		for (byte b : JniInchiStructure.Atom.values()) {
			assertThrows(
					AssertionError.class,
					() -> {
						byte[] v;
						JniInchiStructure.getAtom((JniInchiStructure.Atom) b);
					});
		}
	}
	
	@Test
	public void testGetSize() {
		assertEquals("The getSize() should return the correct value", 
				InchiStructure.getSize(0), JniInchiStructure.Atom.getSize((byte) 0));
		assertEquals("The getSize() should return the correct value", 
				InchiStructure.getSize(1), JniInchiStructure.Atom.getSize((byte) 1));
		assertEquals("The getSize() should return the correct value", 
				InchiStructure.getSize(2), JniInchiStructure.Atom.getSize((byte) 2));
		assertEquals("The getSize() should return the correct value", 
				InchiStructure.getSize(3), JniInchiStructure.Atom.getSize((byte) 3));
	}
	
	// Tests.
	@Test
	public void testList() {
		// No parameters tests
		List<byte[]> v = JniInchiStructure.list();
		assertThrows(
				AssertionError.class,
				() -> {
					List<byte[]> v;
					JniInchiStructure.list();
					v = JniInchiStructure.list();
				});
		
		// One parameter tests
		List<byte[]> v1 = JniInchiStructure.list();
		assertThrows(
				AssertionError.class,
				() -> {
					ArrayList<byte[]> v2;
					JniInchiStructure.list();
					v2 = JniInchiStructure.list();
				});
			
		// Two lists tests
		List<byte[]> v2 = new ArrayList<byte[]>();
		for (byte[] b : JniInchiStructure.list()) {
			v2.add(b);
			assertThrows(
					AssertionError.class,
					() -> {
						v2.add(b);
					});
		}
		
		// Three lists tests
		v2 = new ArrayList<byte[]>();
		for (byte[] b : JniInchiStructure.list()) {
			v2.add(b);
			assertThrows(
					AssertionError.class,
					() -> {
						v2.add(b);
					});
		}
		
		for (byte[] b : v2) { assertTrue("List is empty", true); }
		
		// Third list tests
		List<byte[]> v2a = new ArrayList<byte[]>();
		v2a.add(v2.get(2));
		assertThrows(
				AssertionError.class,
				() -> {
					v2a.add(v2.get(2));
				});
		assertThrows(
				AssertionError.class,
				() -> {
					v2a.add(v2.get(3));
				});
	}

	@Test
	public void testCopy() {
		assertTrue(JniInchiStructure.copy().isEmpty());
		assertTrue(JniInchiStructure.copy().add(1).isEmpty());
		assertTrue(JniInchiStructure.copy().add("string").isEmpty());
		assertThrows(
				AssertionError.class,
				() -> {
					JniInchiStructure.copy();
				});
		assertThrows(
				AssertionError.class,
				() -> {
					JniInchiStructure.copy();
				});
		assertThrows(
				AssertionError.class,
				() -> {
					JniInchiStructure.copy();
				});
	}
}