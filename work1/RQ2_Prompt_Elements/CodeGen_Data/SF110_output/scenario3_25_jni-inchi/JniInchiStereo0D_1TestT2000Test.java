// JniInchiStereo0D_1Test.java
package net.sf.jniinchi;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStereo0D}.
* It contains one unit test case for the {@link JniInchiStereo0D#createNewDoublebondStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)} method.
*/
class JniInchiStereo0D_1Test {
/**
		 * Initializes and compares the given test case.
		 * @param case Test case.
		 */
		private void init(JniInchiStereo0D_1Test case) {
			final JniInchiStereo0D testObject = case.createNewDoublebondStereo0D(new JniInchiAtom(0), new JniInchiAtom(1), new JniInchiAtom(2), new JniInchiAtom(3), case.getEnumValue(0, INCHI_PARITY.NEAREST));

			assertEquals(0, testObject.neighbor[0].intValue());
			assertEquals(1, testObject.neighbor[1].intValue());
			assertEquals(2, testObject.neighbor[2].intValue());
			assertEquals(3, testObject.neighbor[3].intValue());
		}

		@Test(expected = IllegalArgumentException.class)
		public void testConstructEmpty(JniInchiStereo0D testObject) {
			testObject.neighbor = new int[0];
		}

		@Test
		public void test() {
			init(this);
		}
}

