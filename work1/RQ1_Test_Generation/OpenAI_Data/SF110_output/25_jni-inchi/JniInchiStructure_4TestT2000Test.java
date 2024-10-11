// JniInchiStructure_4Test.java
package net.sf.jniinchi;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStructure}.
* It contains ten unit test cases for the {@link JniInchiStructure#getBond(int)} method.
*/
class JniInchiStructure_4Test {

		@Test
		void testGetBond_0() {
				JniInchiStructure structure = new JniInchiStructure();
				JniInchiAtom atom1 = new JniInchiAtom("C");
				JniInchiAtom atom2 = new JniInchiAtom("C");
				JniInchiAtom atom3 = new JniInchiAtom("C");
				JniInchiAtom atom4 = new JniInchiAtom("C");
				JniInchiAtom atom5 = new JniInchiAtom("C");
				JniInchiAtom atom6 = new JniInchiAtom("C");
				JniInchiAtom atom7 = new JniInchiAtom("C");
				JniInchiAtom atom8 = new JniInchiAtom("C");
				JniInchiAtom atom9 = new JniInchiAtom("C");
				JniInchiAtom atom10 = new JniInchiAtom("C");
				structure.addAtom(atom1);
				structure.addAtom(atom2);
				structure.addAtom(atom3);
				structure.addAtom(atom4);
				structure.addAtom(atom5);
				structure.addAtom(atom6);
				structure.addAtom(atom7);
				structure.addAtom(atom8);
				structure.addAtom(atom9);
				structure.addAtom(atom10);
				JniInchiBond bond1 = new JniInchiBond(atom1, atom2, JniInchiBond.BondType.SINGLE);
				JniInchiBond bond2 = new JniInchiBond(atom2, atom3, JniInchiBond.BondType.SINGLE);
				JniInchiBond bond3 = new JniInchiBond(atom3, atom4, JniInchiBond.BondType.SINGLE);
				JniInchiBond bond4 = new JniInchiBond(atom4, atom5, JniInchiBond.BondType.SINGLE);
				JniInchiBond bond5 = new JniInchiBond(atom5, atom6, JniInchiBond.BondType.SINGLE);
				JniInchiBond bond6 = new JniInchiBond(atom6, atom7, JniInchiBond.BondType.SINGLE);
				JniInchiBond bond7 = new JniInchiBond(atom7, atom8, JniInchiBond.BondType.SINGLE);
				JniInchiBond bond8 = new JniInchiBond(atom8, atom9, JniInchiBond.BondType.SINGLE);
				JniInchiBond bond9 = new JniInchiBond(atom9, atom10, JniInchiBond.BondType.SINGLE);
				JniInchiBond bond10 = new JniInchiBond(atom10, atom1, JniInchiBond.BondType.SINGLE);
				structure.addBond(bond1);
				structure.addBond(bond2);
				structure.addBond(bond3);
				structure.addBond(bond4);
				structure.addBond(bond5);
				structure.addBond(bond6);
				structure.addBond(bond7);
				structure.addBond(bond8);
				structure.addBond(bond9);
				structure.addBond(bond10);
				JniInchiStereo0D stereo1 = new JniInchiStereo0D(bond1, bond2, bond3, bond4, JniInchiStereo0D.StereoType.TETRAHEDRAL_CCW);
				JniInchiStereo0D stereo2 = new JniInchiStereo0D(bond2, bond3, bond4, bond5, JniInchiStereo0D.StereoType.TETRAHEDRAL_CCW);
				JniInchiStereo0D stereo3 = new JniInchiStereo0D(bond3, bond4, bond5, bond6, JniInchiStereo0D.StereoType.TETRAHEDRAL_CCW);
				JniInchiStereo0D stereo4 = new JniInchiStereo0D(bond4, bond5, bond6, bond7, JniInchiStereo0D.StereoType.TETRAHEDRAL_CCW);
				JniInchiStereo0D stereo5 = new JniInchiStereo0D(bond5, bond6, bond7, bond8, JniInchiStereo0D.StereoType.TETRAHEDRAL_CCW);
				JniInchiStereo0D stereo6 = new JniInchiStereo0D(bond6, bond7, bond8, bond9, JniInchiStereo0D.StereoType.TETRAHEDRAL_CCW);
				JniInchiStereo0D stereo7 = new JniInchiStereo0D(bond7, bond8, bond9, bond10, JniInchiStereo0D.StereoType.TETRAHEDRAL_CCW);
				JniInchiStereo0D stereo8 = new JniInchiStereo0D(bond8, bond9, bond10, bond1, JniInchiStereo0D.StereoType.TETRAHEDRAL_CCW);
				JniInchiStereo0D stereo9 = new JniInchiStereo0D(bond9, bond10, bond1, bond2, JniInchiStereo0D.StereoType.TETRAHEDRAL_CCW);
				JniInchiStereo0D stereo10 = new JniInchiStereo0D(bond10, bond1, bond2, bond3, JniInchiStereo0D.StereoType.TETRAHEDRAL_CCW);
				structure.addStereo0D(stereo1);
				structure.addStereo0D(stereo2);
				structure.addStereo0D(stereo3);
				structure.addStereo0D(stereo4);
				structure.addStereo0D(stereo5);
				structure.addStereo0D(stereo6);
				structure.addStereo0D(stereo7);
				structure.addStereo0D(stereo8);
				structure.addStereo0D(stereo9);
				structure.addStereo0D(stereo10);
				assertEquals(structure.getBond(0), bond1);
				assertEquals(structure.getBond(1), bond2);
				assertEquals(structure.getBond(2), bond3);
				assertEquals(structure.getBond(3), bond4);
				assertEquals(structure.getBond(4), bond5);
				assertEquals(structure.getBond(5), bond6);
				assertEquals(structure.getBond(6), bond7);
				assertEquals(structure.getBond(7), bond8);
				assertEquals(structure.getB