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
		public static void main (String args[]) {
			junit.jupiter.TestSystem.run(JniInchiStructure_0Test.class, new junit.framework.Test() { // test runner
		        public void run() {
		                Atom a;
		                new ArrayList();
		                a = new Atom(1,2,3,4,5,6,7.0);
		                ArrayList<Atom> atoms = new ArrayList();
		                atoms.add(a);
		                new JniInchiStructure(atoms);
		                Atom a1;
		                Atom a2;
		                a1 = (Atom) a.clone();
		                a2 = (Atom) a1.clone();
		                assertEquals("Clone not same instance of atom (atoms", a1,a2);
		                JniInchiStructure a3;
		                a3 = (JniInchiStructure)a1.clone();
		                assertNotSame("Clone not same instance of cloned instance of atom (atoms", a3,a1);
		                //a3.removeAtom(a1);
		                Atom a4;
		                a4 = (Atom) a2.clone();
		                assertEquals("Clone not the same as the last atom (atom)", a3.getAtom(4),a4);
		                System.out.println("");
		                System.out.println("Done");
		        }
		    });
		}
	}

/////////////////////////////////////////////////////////////////////////////////////////////////////