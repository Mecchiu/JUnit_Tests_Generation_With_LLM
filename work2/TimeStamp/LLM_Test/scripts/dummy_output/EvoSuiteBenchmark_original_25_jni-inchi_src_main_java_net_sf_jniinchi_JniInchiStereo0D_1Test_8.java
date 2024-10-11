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
		 * Test of {@link JniInchiStereo0D#createNewDoublebondStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)}.
		 * This test case will create a stereo 0D double bond stereo 0D and return the result.
		 */
		@Test
		void testStereo0DStereo() {
			String out = "";

			assertNotEquals(null, createNewDoublebondStereo0D(null, null, null, null, null));
			assertNotEquals(null, createNewDoublebondStereo0D(null, null, null, null, INCHI_PARITY_ODD));
			assertNotEquals(null, createNewDoublebondStereo0D(null, null, null, null, INCHI_PARITY_EVEN));

			final JniInchiStereo0D stereo0D = createNewDoublebondStereo0D(null, null, null, null, INCHI_PARITY_UNKNOWN);

			final JniInchiAtom atom0 = new JniInchiAtom(JniInchiElement.NO_ATOM.toString());
			final JniInchiAtom atom1 = new JniInchiAtom(JniInchiElement.NO_ATOM.toString());
			final JniInchiAtom atom2 = new JniInchiAtom(JniInchiElement.NO_ATOM.toString());
			final JniInchiAtom atom3 = new JniInchiAtom(JniInchiElement.NO_ATOM.toString());

			final JniInchiElement element0 = new JniInchiElement(JniInchiElement.NO_ATOM.toString(), new JniInchiAtom(JniInchiElement.INH_E.toString(), new JniInchiAtom(JniInchiElement.INH_O.toString(), new JniInchiAtom(JniInchiElement.INH_U.toString()))), new JniInchiElement(JniInchiElement.NO_ATOM.toString(), new JniInchiAtom(JniInchiElement.INH_E.toString(), new JniInchiAtom(JniInchiElement.INH_O.toString(), new JniInchiAtom(JniInchiElement.INH_U.toString(), new JniInchiAtom(JniInchiElement.INH_T.toString(), new JniInchiAtom(JniInchiElement.INH_Y.toString(), new JniInchiAtom(JniInchiElement.INH_I.toString(), atom0))))), new JniInchiElement(JniInchiElement.NO_ATOM.toString(), new JniInchiAtom(JniInchiElement.INH_E.toString(), new JniInchiAtom(JniInchiElement.INH_O.toString(), new JniInchiAtom(JniInchiElement.INH_U.toString(), atom1))), new JniInchiElement(JniInchiElement.NO_ATOM.toString(), new JniInchiAtom(JniInchiElement.INH_E.toString(), new JniInchiAtom(JniInchiElement.INH_O.toString(), atom2))), new JniInchiElement(JniInchiElement.NO_ATOM.toString(), new JniInchiAtom(JniInchiElement.INH_E.toString(), new JniInchiAtom(JniInchiElement.INH_O.toString(), atom3))), null, null, null, null, true, true);

			out = out + element0 + " " + element1 + " ";
			out += element2 + " " + element3;
			out += " ";
			out += stereo0D;

			final JniInchiStereo0D stereo = new JniInchiStereo0D(out.toCharArray(), out.length());

			assertEquals(stereo.parity(), parity);
			stereo.clearDummyState();
			stereo.clear();

			final JniInchiElement atom0InAtom = atom0.factory().getAtom(atom1.factory());
			stereo.clearPair(((JniInchiAtom) atom0InAtom.atom().factory(), (JniInchiAtom) atom0InAtom.atom.factory()));

			final JniAtom bond = ((JniInchiAtom) atom0InAtom.atom().factory());
			stereo.removePair(((JniInchiAtom) bond.atom().factory()), (JniAtom) atom0InAtom.atom());

			final Iterator<JniInuchiAtom> atomIt = stereo.iterator();
			if (atomIt.hasNext()) {
				final JniInuchiAtom next = atomIt.next();
				assertTrue(next.isCentral() && next.parent().is(JniInchiElement.NO_ATOM));
				assertEquals(atom1().factory().factory(), next.parent().factory());
				assertEquals(atom2().factory().factory(), next.parent().factory().factory());
				assertEquals(atom3().factory().factory(), next.parent().factory().factory());
			}
			assertFalse(atomIt.hasNext());




		}
}