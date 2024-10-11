// JniInchiStructure_5Test.java
package net.sf.jniinchi;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStructure}.
* It contains one unit test case for the {@link JniInchiStructure#getStereo0D(int)} method.
*/
class JniInchiStructure_5Test {
/** List of test cases to run for {@link JniInchiStructure#getStereo0D(int)}. */
	  public static final List<Test> TEST_LIST = new ArrayList<>();
	   
        public JniInchiStructure_5Test(){
            Test test = new Test();
            TEST_LIST.add(test);
        }
    /**
     * Creates in-memory structure, with no stereo parameters.
     *
     * @return
     */
    final JniInchiStructure getStructureNoStereo() {
          JniInchiStructure s = new JniInchiStructure();

          s.stereoList.add(new JniInchiStereo0D(0));

          return s;
        }
    /**
     * Creates in-memory structure, with stereo parameters.
     *
     * @param value
     * @return
     */
    final JniInchiStructure getStructure(final JniInchiStereo0D value) {
        JniInchiStructure s = new JniInchiStructure();

        s.stereoList.add(value);

        return s;
	}
        @Test
    public void test() throws Exception {
        for (int i = 0; i < TEST_LIST.size(); i++) {
            final Test test = TEST_LIST.get(i);
			    assertTrue(JniStructure.getStereo0D(test.iN).equals(test.eStereo0D));
			    assertTrue(test.iN > -1);
			    assertTrue(test.iN <= JniStructure.Stereo_MAX_N);
			    //assertTrue(test.iN.equals(test.iN));
			    assertNotNull(test.eStereo0D);
			    assertTrue(t.isCompatible(test.eStereo0D, test.eStereo0C));
			    assertFalse(test.iN.isCompatible(test.eStereo0C, test.eStereo0D));	

		}
	}
}

/******************************************************************************
 *  Copyright 2002-2015, Robert Sedgewick and Kevin Wayne.
 *
 *  This file is part of algs4.jar, which accompanies the textbook
 *
 *      Algorithms, 4th edition by Robert Sedgewick and Kevin Wayne,
 *      Addison-Wesley Professional, 2011, ISBN 0-321-57351-X.
 *      http://algs4.cs.princeton.edu
 *
 *
 *  algs4.jar is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  algs4.jar is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with algs4.jar.  If not, see http://www.gnu.org/licenses.
 ******************************************************************************/
