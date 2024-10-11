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
		* Test for <code>addBond()</code> method of type
		* {@link net.sf.jniinchi.JniInchiStructure}.
		* <p>
		* Tested method has the following attributes:
		* <ol>
		*     <li>{@link net.sf.jniinchi.JniInchiStructure#getSize() getSize()} returns 0</li>
		*     <li>{@link net.sf.jniinchi.JniInchiStructure#getBonds() getBonds()} returns an empty
		*         {@link List}</li>
		* <ol>
		*/
		@Test
		public void getSize() {
			JniInchiStructure instance = new JniInchiStructure();
			assertEquals(0, instance.getSize());
			List<JniInchiBond> bonds = new ArrayList<>();
			instance.addBond(bonds.get(0));
			instance.addBond(bonds.get(0));
			bonds = new ArrayList<>();
			instance.addBond(bonds.get(0));
			instance.addBond(bonds.get(1));
			bonds = new ArrayList<>();
			instance.addBond(bonds.get(0));
			instance.addBond(bonds.get(1));
			assertTrue(bonds.size() == 3);
			assertTrue(bonds.get(0) == null);
			assertTrue(bonds.get(1) == null);
		}
	
}