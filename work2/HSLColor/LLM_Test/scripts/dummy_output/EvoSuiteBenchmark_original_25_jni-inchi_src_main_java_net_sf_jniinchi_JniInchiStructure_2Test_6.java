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
     * @throws java.lang.Exception Indicates a failing test.
     */
    @Test
    public void test() throws Exception {
        // test 1
        final JniInchiStereo0D parity = new JniInchiStereo0D(0L);
        final JniInchiStereo0D newParity = new JniInchiStereo0D(parity.getParity().toByte());
        assertTrue(!parity.equals(newParity));
        final JniInchiStereo.Stereo parityStereo = new JniInchiStereo.Stereo(parity);
        assertTrue(parityStereo.equals(new JniInchiStereo.Stereo(newParity)));
        assertEquals(parity, newParity);
        assertEquals(parity.toString(), newParity.toString());
        assertTrue(parity.isParity());
        final JniInchiStereo.Stereo stereo = new JniInchiStereo.Stereo(parityStereo);
        assertTrue(stereo.isStereo4());
        final JniInchiStereo0D parity2 = new JniInchiStereo0D(parity.getParity().toByte()+0);
        assertTrue(!parity.equals(parity2));
        assertTrue(!parity.equals(new JniInchiStereo0D("")));
        assertTrue(!parity.equals(new JniInchiStereo0D("0")));
        // test 2
        JniInchiStereo0D stereo2 = new JniInchiStereo0D(JniInchiStereo0D.getParity().toByte()+0);
        assertTrue(!stereo.equals(stereo2));
        assertTrue(!new JniInchiStereo0D(stereo2.getParity().toByte())
               .equals(new JniInchiStereo0D(stereo2.getParity().toByte()+0)));
        stereo = new JniInchiStereo0D(new JniInchiStereo0D(JniInchiStereo0D.getParity()).getParity().toByte()+0);
        assertTrue(stereo == stereo2);
        final JniInchiStereo0D stereo3 = new JniInchiStereo0D(stereo2.getParity().toByte()+0);
        assertTrue(!stereo.equals(stereo3));
        assertTrue(!new JniInchiStereo0D(stereo3.getParity().toByte()+0).equals(new JniInchiStereo0D(stereo3.getParity().toByte()+0).getParity().toByte()+0));
        // test 3
        assertTrue(!stereo.equals(JniInchiStereo_0D.getStereo0D(new JniInchiStereo_0D(0).getParity().toByte()+0,0)));
        assertTrue(!new JniInchiStereo0D(stereo.getParity().toByte()+0)
               .equals(new JniInchiStereo0D(stereo.getParity().toByte()+0).getParity().toByte()+0));
        // test 4
        final JniInchiStereo.Stereo stereo4 = new JniInchiStereo.Stereo(new JniInchiStereo.Stereo(parityStereo));
           
        assertTrue(stereo4.equals(new JniInchiStereo.Stereo(parityStereo)));
        
        final boolean parityChanged = stereo4.isParityChanged();
        final boolean stereoChanged = stereo4.isStereoChanged();
        assertTrue(arityChanged);
        assertTrue(stereoChanged);
        

    }

	ArrayList<JniInchiStereo0D> list = new ArrayList<>();
    @Test
    public void initList() {
        JniInchiStereo0D stereo0D = new JniInchiStereo0D(new byte[1]);
        assertTrue(list.contains(stereo0D));
        
		int i = 0;
		final JniInchiStereo.Stereo stereo1 = new JniInchiStereo.Stereo(new JniInchiStereo.Stereo(parityStereo));
        list.add(stereo0D);
       
		stereo1 = list.get(i);
        assertEquals(stereo1, stereo0D);
        
		i += 1;
		stereo1 = list.get(i);
	    assertEquals(stereo1, stereo0D);
	}
	


}