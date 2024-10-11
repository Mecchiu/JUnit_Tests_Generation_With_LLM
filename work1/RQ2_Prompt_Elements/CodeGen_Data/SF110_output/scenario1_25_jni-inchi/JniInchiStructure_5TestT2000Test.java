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

	public void checkIn(int i) {
		assertTrue(stereoList.get(i).getStereo0D() >= 0);
	}	  
	
	/** Returns a specific list containing all the objects in the model (in a list so that you can modify it) */
	public List stereoList_all() {
		ArrayList<JniInchiStereo0D> lst = new ArrayList<>();
		for (int i = (int)((JniInchiStereo0D)stereoList.get(0)).stereo0D(); i < stereoList.size(); i++) lst.add((JniInchiStereo0D)stereoList.get(i));
		return lst;
	}
	

	/** Sets up the classes for testing */
	@Test
	public void testStereochemistry() { 
		JniInchiStereo0D stereo0D = new JniInchiStereo0D(1);
		JniInichic stereo1 = new JniInichic();
		
		ArrayList<JniInchiStereo0D> stereoList = new ArrayList<>();
		stereoList.add(stereo0D); stedior1 = new JniInchiStereo1();
		stereoList.add(stereo1);
		stereoList.add(stereo1);
		final int stereo0DSize = stereoList.size();
		stereoList_all().add(stereo0D);
		stereoList_all().add(stereo1);
		assertEquals(stereo0D.isEmpty(), Boolean.FALSE);
		assertEquals(stereo1.isEmpty(), Boolean.TRUE);
		assertTrue(stereo0D.isEmpty()); // since it's only 1st stereo
		assertEquals(1,STEREO_ORDER.length);// this test is testing for order
		assertEquals(1,STEREO_ORDER.length);

		assertTrue(stereo0D.getStereo0D() == 1); assertTrue(STEREO_ORDER.length <= stereo0DSize); assertTrue(stereo0DSize <= stereo1.getStereo0D());

        assertTrue(stereo0D.setStereo0D(2)); assertTrue(stereo0D.getStereo0D() == 2); // the setting does not affect all other elements 
        assertEquals(2,STEREO_ORDER.length); assertTrue(STEREO_ORDER.indexOf(stereo0D.getStereo0D()) >= 0); assertTrue(stereoXSDouble.getStereo0D() == 2); // this is testing for x-shift and zero-shift	  
        assertTrue(STEREO_ORDER.indexOf(stereo1.getStereo0D()) >= 0); assertTrue(STEREO_ORDER.indexOf(stereo1.getStereo1D()) >= 0); // this is testing for other stereo
        final List<JniInchiStereo0D> list0 = new ArrayList<JniInchiStereo0D>(stereoList);
        assertEquals(list0,STEREO_ORDER);
        
        final List list1 = new ArrayList(); list1.add(stereo1); list1.add(stereo0D);
        assertEquals(list1,STEREO_ORDER);
		
		assertTrue(stereo0D.isContainedBy(stereo0D)); // the setting works for stereo0D as well
		
		assertTrue(!stereo0D.isContainedBy(stereo0D.clone()));
		
		stereo0D.init(0);
		assertTrue(!stereo0D.isContainedBy(stereoList));
		assertTrue(stereo0D.contains(list0.add(0))); assertTrue(stereo0D.contains(list0.add(1))); // no need to add stereo0D to list here 
        assertEquals(2,STEREO_ORDER.length); assertTrue(STEREO_ORDER.indexOf(stereo0D.getStereo0D()) >= 0); assertTrue(stereo0DSize == stereo0D.getStereo0D().size()); // 
				// this will also be tested for stereo0D.clone() = stereo0D
    	assertTrue(!stereo0D.isContainedBy(stereo0DSize + 1));
    	
		assertTrue(stereo0D.isContainedBy(new JniInchiStereo0D(2))); 
		
		assertTrue(stereo1.isContainedBy(stereoList)
				|| stereo0D.isContainedBy(stereoXSDouble)
				|| stereo1.isContainedBy(stereoXSDouble)); // checking all elements of the list
		
		assertTrue(!stereo0D.isContainedBy(stereo0D.clone()));
		assertTrue(!stereo0D.isContainedBy(stereoXSDouble.clone()));
		assertTrue(!stereo0D.isContainedBy(stereoXSDouble.clone()));
				
		assertFalse(stereo1.isContainedBy(stereoList)); 
		assertFalse(stereo0D.isContainedBy(stereoXSDouble)); 

	}

}
