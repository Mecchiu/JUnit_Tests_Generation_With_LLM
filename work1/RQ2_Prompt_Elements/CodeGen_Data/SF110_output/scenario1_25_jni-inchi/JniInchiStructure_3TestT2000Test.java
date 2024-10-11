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

	/** Unit test:
	  *  {@link JniInchiStructure#getAtom(int)} for illegal indices.
	  */
	@Test
	public void jniInchiStructure_badIndex() {

		assertThrows(IndexOutOfBoundsException.class, () -> JniInchiUtils.getAtom(1, 0));
		assertThrows(IndexOutOfBoundsException.class, () -> JniInchiUtils.getAtom(0, 0 + 1));
		assertThrows(IndexOutOfBoundsException.class, () -> JniInchiUtils.getAtom(3, 0));
		assertThrows(IndexOutOfBoundsException.class, () -> JniInchiUtils.getAtom(4, -1));
		assertThrows(IndexOutOfBoundsException.class, () -> JniInchiUtils.getAtom(5, 4));
		assertThrows(IndexOutOfBoundsException.class, () -> JniInchiUtils.getAtom(6, 5));

        assertThrows(IndexOutOfBoundsException.class, () -> JniInchiStructure.getAtom(6, 1));
        assertThrows(IndexOutOfBoundsException.class, () -> JniInchiStructure.getAtom(0, 6));
		assertThrows(IndexOutOfBoundsException.class, () -> JniInchiStructure.getAtom(4, 3));
	}
}
