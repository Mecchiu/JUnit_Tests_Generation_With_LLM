// ArrayOfDependencyTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfDependency}.
* It contains one unit test case for the {@link ArrayOfDependency#getTypeDesc()} method.
*/
class ArrayOfDependencyTest {
		
	@Test
	public void testGetTypeDesc() {
		mygrid.web.ArrayOfDependency instance = ArrayOfDependency.emptyDependency();
		assertTrue(instance.canDeserialize(null));
	}

	@Test
	public void testGetTypeDesc_l() {
		mygrid.web.ArrayOfDependency instance = ArrayOfDependency.emptyDependency();
		assertTrue(instance.canDeserialize(instance));
	}

	@Test
	public void testCanDeserialize() {
		mygrid.web.ArrayOfDependency instance = ArrayOfDependency.emptyDependency();
		assertFalse(instance.canDeserialize(instance));
	}

	@Test
	public void testToString() {
		mygrid.web.ArrayOfDependency instance = ArrayOfDependency.emptyDependency();
		assertEquals(instance.toString(), "ArrayOfDependency<emptyDependency/>");	
	}

	@Test
	public void testEquals() {
		mygrid.web.ArrayOfDependency instance = ArrayOfDependency.emptyDependency();
		assertEquals(instance, null);
	}

	@Test
	public void testHashCode() {
		mygrid.web.ArrayOfDependency instance = ArrayOfDependency.emptyDependency();
		assertTrue(instance.equals(instance));
		for (int i=0; i<instance.length(); i++)
		    assertEquals(instance.hashCode(), instance.getTypeDesc().hashCode());
	}

	@Test
	public void testParallelize() {
		mygrid.web.ArrayOfDependency[] arrayOfDependency = ArrayOfDependency.emptyArr();
		assertEquals(0, arrayOfDependency.length);
		
		arrayOfDependency = ArrayOfDependency.arrayOfDependency();
		assertEquals(0, arrayOfDependency.length);
		
		mygrid.web.ArrayOfDependency instance1 = ArrayOfDependency.emptyDependency();
		arrayOfDependency = ArrayOfDependency.arrayOfDependency();
		arrayOfDependency[0] = instance1;
		assertTrue(arrayOfDependency.canParallelize());
		assertArrayEquals(arrayOfDependency, ArrayOfDependency.arrayOfDependency());	
	}
	
	@Test
	public void testToArrayOfDependency()    {
		ArrayOfDependency[] arrayOfDependency = ArrayOfDependency.arrayOfDependency();
		assertArrayEquals(ArrayOfDependency.emptyDependency(), arrayOfDependency);	
	}		
}