// JniInchiStereo0D_0Test.java
package net.sf.jniinchi;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStereo0D}.
* It contains one unit test case for the {@link JniInchiStereo0D#createNewTetrahedralStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)} method.
*/
class JniInchiStereo0D_0Test {

		private static final String NAME = "JniInchiStereo0Test_0"; 
		private static final boolean PARITY = true;
		
		/**
		 * Empty constructor.
		 */
		public JniInchiStereo0D_0Test() { }
	
		/**
		 * Runs test cases from {@link JniInchiStereo0D} interface.
		 * @throws NullPointerException When tested {@link JniInchiStereo0D} object
		*   is null
		* @throws Exception When failed to test cases 
		*/		
		@Test
		public void run0() throws Exception {
			JniInchiStereo0D inchi0d = createNewTetrahedralStereo0D(new JniInchiAtom("A"), new JniInchiAtom("B"), new JniInchiAtom("C"), new JniInchiAtom("D"), new JniInchiAtom("E"), PARITY?INCHI_PARITY.TRAPEZOID:INCHI_PARITY.INVERT);
			assertEquals("Incorrect output!", inchi0d, JniInchiStereo0D.createNewTetrahedralStereo0D(new JniInchiAtom("C"), new JniInchiAtom("A"), new JniInchiAtom("E"), new JniInchiAtom("B"), new JniInchiAtom("D"), PARITY?INCHI_PARITY.TRAPEZOID:INCHI_PARITY.INVERT));
		}
		
		/**	
		 * Creates and returns a {@link JniInchiStereo0D} object, by calling {@link #createNewTetrahedralStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)} method with {@link INCHI_PARITY#INVERT} to
		 * create the {@link JniInchiStereo0D} object and to check its result.
		* @throws NullPointerException If tested {@link JniInchiStereo0D} object is null
		* @throws Exception If failed test case 
		*/	
		@Test
		public void createNewTetrahedralStereo0D_1() throws Exception {
			JniInchiStereo0D inchi0d = createNewTetrahedralStereo0D(null, new JniInchiAtom("A"), new JniInchiAtom("B"), new JniInchiAtom("D"), new JniInchiAtom("E"), PARITY?INCHI_PARITY.TRAPEZOID:INCHI_PARITY.INVERT);
			assertSame("Incorrect output!", inchi0d, 
				JniInchiStereo0D.createNewTetrahedralStereo0D(new JniInchiAtom("A"), new JniInchiAtom("B"), new JniInchiAtom("D"), new JniInchiAtom("E"), PARITY?INCHI_PARITY.TRAPEZOID:INCHI_PARITY.INVERT));
		}
		
		/**
		* If test {@link JniInchiStereo0D#createNewTetrahedralStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)} should return
		* a {@link JniInchiStereo0D} with a specific {@link JniInchiStereo0D#INCHI_PARITY()} enum and {@link IInchiAtomicParameters#PARITY} attribute setted to
		* <code>true</code>.
		*/
		@Test
		public void createNewTetrahedralStereo0D_2() {
			assertSame("Incorrect output!", 
				createNewTetrahedralStereo0D(new JniInchiAtom("B"), null, null, null, null, PARITY?INCHI_PARITY.TRAPEZOID:INCHI_PARITY.INVERT), 
				JniInchiStereo0D.INCHI_PARITY.TRAPEZOID.PARITY);
		}
			
		/**
		* If test {@link JniInchiStereo0D#createNewTetrahedralStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)} should return
		* a {@link JniInchiStereo0D} with a specific {@link JniInchiStereo0D#INCHI_PARITY()} enum and {@link IInchiAtomicParameters#PARITY} attribute setted to
		* <code>null</code>.
		*/
		@Test
		public void createNewTetrahedralStereo0D_3() {
			assertNull("Incorrect output!", createNewTetrahedralStereo0D(null, null, null, null, null, PARITY?INCHI_PARITY.TRAPEZOID:INCHI_PARITY.INVERT));
		}
		
		/**
		* If test {@link JniInchiStereo0D#createNewTetrahedralStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)} should return
		* a {@link JniInchiStereo0D} with a specific {@link JniInchiStereo0D#INCHI_PARITY()} enum attribute setted to
		* <code>false</code>.
		*/
		@Test
		public void createNewTetrahedralStereo0D_4() {
			assertNotSame("Incorrect output!", 
				createNewTetrahedralStereo0D(null, null, null, null, null, PARITY?INCHI_PARITY.NONE:INCHI_PARITY.NULL), 
				createNewTetrahedralStereo0D(null, null, null, null, null, PARITY?INCHI_PARITY.ALMOST_UNIQUE:INCHI_PARITY.NULL));
		}
	}

}
