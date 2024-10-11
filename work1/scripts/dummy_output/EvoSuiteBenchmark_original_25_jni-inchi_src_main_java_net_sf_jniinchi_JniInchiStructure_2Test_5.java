// JniInchiStructure_2Test.java
package net.sf.jniinchi;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStructure}.
* It contains one unit test case for the {@link JniInchiStructure#addStereo0D(JniInchiStereo0D)} method.
*/
class JniInchiStructure_2Test {
		private JniInchiStructure struc;
		private final T0D0 t0d0 = new T0D0();

		/**
		 * @throws java.lang.Exception
		 */
		@Test
		public void initStructure() throws Exception {
			struc = new JniInchiStructure(t0d0);
		}

		/** Test adding a stereo parity to a molecule (1-4).
	 * @throws java.lang.Exception
	 */
		@Test
		public void addParity0D1() throws Exception {
			assertAllResultsEliminated(struc.addStereo(0, 0));
		}

		/** Test adding a stereo parity to a molecule (1-4).
	 * @throws java.lang.Exception
	 */
		@Test
		public void addParity0D2() throws Exception {
			assertAllResultsEliminated(struc.addStereo(0, 1));
		}

		/** Test adding a stereo parity to a molecule (1-4).
	 * @throws java.lang.Exception
	 */
		@Test
		public void addParity0D3() throws Exception {
			assertAllResultsEliminated(struc.addStereo(0, 2));
		}

		/** Test adding a stereo parity to a molecule (1-4).
	 * @throws java.lang.Exception
	 */
		@Test
		public void addParity0D4() throws Exception {
			assertAllResultsEliminated(struc.addStereo(0, 3));
		}

		/** Test adding a stereo parity to a molecule (1-4).
	 * @throws java.lang.Exception
	 */
		@Test
		public void addParity0D5() throws Exception {
			assertAllResultsEliminated(struc.addStereo(0, 4));
		}

		/** Test adding a stereo parity to a molecule (1-4).
	 * @throws java.lang.Exception
	 */
		@Test
		public void addParity0D6() throws Exception {
			assertAllResultsEliminated(struc.addStereo(0, 5));
		}

		/** Test adding a stereo parity to a molecule (1-4).
	 * @throws java.lang.Exception
	 */
		@Test
		public void addParity0D7() throws Exception {
			assertAllResultsEliminated(struc.addStereo(0, 6));
		}

		/** Test adding a stereo parity to a molecule (1-4).
	 * @throws java.lang.Exception
	 */
		@Test
		public void addParity0D8() throws Exception {
			assertAllResultsEliminated(struc.addStereo(0, 7));
		}

		/** Test adding a stereo parity to a molecule (1-4).
	 * @throws java.lang.Exception
	 */
		@Test
		public void addParity0D9() throws Exception {
			assertAllResultsEliminated(struc.addStereo(0, 8));
		}

		/** Test adding a stereo parity to a molecule (1-4).
	 * @throws java.lang.Exception
	 */
		@Test
		public void addParity0D10() throws Exception {
			assertAllResultsEliminated(struc.addStereo(1, 0));
		}

		/** Test adding a stereo parity to a molecule (1-4).
	 * @throws java.lang.Exception
	 */
		@Test
		public void addParity0D11() throws Exception {
			assertAllResultsEliminated(struc.addStereo(1, 1));
		}

		/** Test adding a stereo parity to a molecule (1-4).
	 * @throws java.lang.Exception
	 */
		@Test
		public void addParity0D12() throws Exception {
			assertAllResultsEliminated(struc.addStereo(1, 2));
		}

		/** Test adding a stereo parity to a molecule (1-4).
	 * @throws java.lang.Exception
	 */
		@Test
		public void addParity0D13() throws Exception {
			assertAllResultsEliminated(struc.addStereo(1, 3));
		}

		/** Test adding a stereo parity to a molecule (1-4).
	 * @throws java.lang.Exception
	 */
		@Test
		public void addParity0D14() throws Exception {
			assertAllResultsEliminated(struc.addStereo(1, 4));
		}

		/** Test adding a stereo parity to a molecule (1-4).
	 * @throws java.lang.Exception
	 */
		@Test
		public void addParity0D15() throws Exception {
			assertAllResultsEliminated(struc.addStereo(1, 5));
		}

		/** Test adding a stereo parity to a molecule (1-4).
	 * @throws java.lang.Exception
	 */
		@Test
		public void addParity0D16() throws Exception {
			assertAllResultsEliminated(struc.addStereo(1, 6));
		}

		/** Test adding a stereo parity to a molecule (1-4).
	 * @throws java.lang.Exception
	 */
		@Test
		public void addParity0D17() throws Exception {
			assertAllResultsEliminated(struc.addStereo(1, 7));
		}

		/** Test adding a stereo parity to a molecule (1-4).
	 * @throws java.lang.Exception
	 */
		@Test
		public void addParity1D0() throws Exception {
			assertAllResultsEliminated(struc.addStereo(0, 2));
		}

		/** Test adding a stereo parity to a molecule (1-4).
	 * @throws java.lang.Exception
	 */
		@Test
		public void addParity1D1() throws Exception {
			assertAllResultsEliminated(struc.addStereo(0, 3));
		}

		/** Test adding a stereo parity to a molecule (1-4).
	 * @throws java.lang.Exception
	 */
		@Test
		public void addParity1D2() throws Exception {
			assertAllResultsEliminated(struc.addStereo(0, 4));
		}

		/** Test adding a stereo parity to a molecule (1-4).
	 * @throws java.lang.Exception
	 */
		@Test
		public void addParity1D3() throws Exception {
			assertAllResultsEliminated(struc.addStereo(0, 5));
		}

		/** Test adding a stereo parity to a molecule (1-4).
	 * @throws java.lang.Exception
	 */
		@Test
		public void addParity1D4() throws Exception {
			assertAllResultsEliminated(struc.addStereo(0, 6));
		}

		/** Test adding a stereo parity to a molecule (1-4).
	 * @throws java.lang.Exception
	 */
		@Test
		public void addParity1D5() throws Exception {
			assertAllResultsEliminated(struc.addStereo(0, 7));
		}

		/** Test adding a stereo parity to a molecule (1-4).
	 * @throws java.lang.Exception
	 */
		@Test
		public void addParity1D6() throws Exception {
}
}