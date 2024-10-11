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
		
    /**
     * Tests that {@link #addStereo0D(JniInchiStereo0D)} returns a value of type {@link JniInchiStereo0D}.
     */
    @Test
    void test_addStereo0D() {
        JniInchiStereo0D st = null;
        st  = addStereo0D(new JniInchiStereo0D(1,2));
        assertNotNull(st);
        assertEquals(3, st.getFiber());
        assertEquals(1, st.getStereo());
        assertEquals(2, st.getRotation());
    } 

    /**
     * Tests adding different types of stereo0D.
     */
    @Test
    void test_addStereo0D_types() {
        JniInchiStereo0D[] st1 = null;
        st1  = new JniInchiStereo0D[]{new JniInchiStereo0D(1,2), new JniInchiStereo0D(1,3), new JniInchiStereo0D(1,4)};
        JniInchiStereo0D[] types = null;
        types = addStereo0D(st1);
        assertNotEquals(null,types);
        assertEquals(2,types.length);
        assertTrue(types[0].equals(st1[0]));
        assertTrue(types[1].equals(st1[1]));

        //Test non identical stereo 0D types only if non-empty list
        types[0] = new JniInchiStereo0D(2);	
        assertFalse(types[0].equals(st1[0]));
        
        //Test non-empty non-same stereo 0D types
        //TODO: Test a non-empty stereo0D, but this should not be tested at the moment
        //      since the list is not clear here
        //assertFalse(new JniInchiStereo0D(1,2).equals(new JniInchiStereo0D(1,2)));
        //      Test non-empty stereo0D and type
        //assertFalse(new JniInchiStereo0D(1).equals(new JniInchiStereo0D(1)));
        //assertFalse(new JniInchiStereo0D(1,2).equals(new JniInchiStereo0D(1)));
    }
	
	/**
	 * Tests the creation from lists of {@link JniInchiStereo0D} members.
	 */
	@SuppressWarnings("deprecation")
    @Test
    void test_JniInchiStereo0D_types_deprecated() {
        JniInchiStereo0D[] st1 = null;
        st1 = new JniInchiStereo0D[]{
                new JniInchiStereo0D(1,2),
                new JniInchiStereo0D(1,3),
                new JniInchiStereo0D(1,4)
                };
        JniInchiStereo0D[] types = null;
        types = addStereo0D(st1);
        assertNotEquals(null, types);
        assertEquals(2,types.length);
        assertTrue(types[0].equals(st1[0]));
        assertTrue(types[1].equals(st1[1]));
        
        //Test non-identical stereo 0D types only if non-empty list
        types[0] = new JniInchiStereo0D(2);	
        assertFalse(types[0].equals(st1[0]));
        
        //Test non-empty non-same stereo 0D types
        //TODO: Test a non-empty stereo0D, but this should not be tested at the moment
        //      since the list is not clear here
        //assertFalse(new JniInchiStereo0D(1,2).equals(new JniInchiStereo0D(1,2)));
        //      Test non-empty stereo0D and type
        //assertFalse(new JniInchiStereo0D(1).equals(new JniInchiStereo0D(1)));
        //assertFalse(new JniInchiStereo0D(1,2).equals(new JniInchiStereo0D(1)));
    }
	 
    /**
     * Checks whether an inchi structure is of correct type.
     * {@link JniInchiStructure.JniInchiStereo0D}
     */
    @Test
    void test_JniInchiStereo0D() {
        JniInchiStereo0D stereo0D = null;
        stereo0D = addStereo0D(new JniInchiStereo0D(1,2));
        assertNotNull(stereo0D);
        assertEquals(JniInchiStereo0D.class,stereo0D.getClass());
        assertEquals(3,stereo0D.getFiber());
        assertEquals(1,stereo0D.getStereo());
        assertEquals(2,stereo0D.getRotation());
            
    } 

    /**
	 * Returns a list of different 0D stereodes.
	 */
	private interface JniInchiStereo0D[] {
		public JniInchiStereo0D[] clone();
	}
}