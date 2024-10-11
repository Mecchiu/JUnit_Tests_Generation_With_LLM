// JniInchiStructure_0Test.java
package net.sf.jniinchi;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStructure}.
* It contains one unit test case for the {@link JniInchiStructure#addAtom(JniInchiAtom)} method.
*/
class JniInchiStructure_0Test {

	@Test
    public void addAtom_2() {
		JniInchiStructure atom = new JniInchiStructure();
		List<JniInchiAtom> atomList = atom.getAtomList();
		List<JniInchiAtom> atomList1 = new ArrayList<>();
		for (int i=0; i<10; i++) {
			JniInchiAtom atom = new JniInchiAtom(6, "atom " + i);
//			atomList.add(i, atom);
            atomListList.add(i, atom);
		}
		List<JniInchiAtom> atomList2 = new ArrayList<>();
//		for (int i=0; i<6; i++) {
//			JniInchiAtom atom = new JniInchiAtom(6, "atom " + i);
//			atomList2.add(i, atom);
//	    }
			for(int i=0; i<10; i++) {
				atomList.add(6, atomList2.remove((5-i)));
			}

		List<JniInchiAtom> atomList3 = new ArrayList<>();
		for (int i=0; i<20; i++) {
			JniInchiAtom atom = new JniInchiAtom(i, "2_" + i);
			atomList3.add(i, atom);
		}
		atomList.add(21, atomList3.remove(10));
		for (int i=0; i<20; i++) {
			atomList.add(i, atomList3.remove((12-i)));
		}
		List<JniInchiAtom> atomList4 = new ArrayList<>();
		for (int i=0; i<21; i++) {
			JniInchiAtom atom = new JniInchiAtom(12, "2_" + i);
			atomList4.add(i, atom);
		}
		atomList.add(12, atomList4.remove(9));
		atomList.add(13, atom.getAtomList().remove(13));
		List<JniInchiAtom> atomList5 = new ArrayList<>();
		for (int i=0; i<12; i++) {
			JniInchiAtom atom = new JniInchiAtom(i, "1_" + i);
			atomList5.add(i, atom);
		}
		atom.addAtom(atomList5.remove(10));
		JniInchiAtom atom6 = atomList5.get(10);
		atom.setTitle("1_3_1_1_2_3_1");
		//
		List<JniInchiAtom> atomList6 = new ArrayList<>();
		for (InchiTextInfo info : JniInchiTinyInchi.instance().getAllTextInfo()) {
			JniInchiAtom atom = new JniInchiAtom(info.id(), info.shortDescription());
			atomList6.add(info);
		}
		//
        JniInchiStructure st = new JniInchiStructure();
		st.addAtom(new JniInchiStructuredAtom(21, atomList6.remove((13-10))));
		st.addAtom(new JniInchiStructuredAtom(61, atomList6));
		st.addAtom(new JniInchiStructuredAtom(21, atomList6.remove(40)));
		st.addAtom(new JniInchiStructuredAtom(21, atomList6.remove(10)));
		st.addAtom(new JniInchiStructuredAtom(21, atomList6.remove(0)), atomList6);
	}
}
