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
		public final static double EXPECTATION_PARITY = 0.5;
		public final static List<JniInchiStereo0D> EXPECTATION = new ArrayList<>();
		private final String PARAMETERS[] = { "RIGHT_EYE RABBER 0.95\n", "LEFT_EYE RABBER 0.95", "LEFT_EYE RABBER 0.5\n", "LEFT_EYE RABBER 0.95", "LEFT_EYE RABBER 0.5", "RIGHT_EYE RABBER 0.9\n", "RIGHT_EYE RABBER 0.95", "LEFT_EYE BLACK 0.95", "LEFT_EYE BLACK 0.95", "LEFT_EYE BLACK 0.5", "RIGHT_EYE BLACK 0.95", "RIGHT_EYE BLACK 0.95" };

        public final static List<JniInchiStereo0D> EXPECTATIONS = new ArrayList<>();
        static {
            EXPECTATIONS.add(getStereo0D(1));
        }
	
    @Test
    public void testGetStereo0D() {
		final double M = 1;
		final double P = 0.5;
		final List<JniInchiStereo0D> actual = getStereo0D(0);
		final List<JniInchiStereo0D> expected = EXPECTATIONS;
		assertEquals(actual.size(), expected.size());
		for (int i = 0; i < actual.size(); i++) {
			final JniInchiStereo0D actual0D = actual.get(i);
			final JniInchiStereo0D expected0D = expected.get(i);
            assertEquals(actual0D.name(), expected0D.name());
            assertEquals(actual0D.getP(), expected0D.getP(), PARAMETERS[i]);
            assertEquals(actual0D.getM(), expected0D.getM(), PARAMETERS[i]);
            assertEquals(actual0D.getR(), expected0D.getR(), PARAMETERS[i]);
            assertEquals(actual0D.getL(), expected0D.getL(), PARAMETERS[i]);
            assertEquals(actual0D.getR2(), expected0D.getR2(), PARAMETERS[i]);
            assertEquals(actual0D.getM2(), expected0D.getM2(), PARAMETERS[i]);
            assertEquals(actual0D.getI(), expected0D.getI(), PARAMETERS[i]);
            assertEquals(actual0D.getD(), expected0D.getD(), PARAMETERS[i]);
			
		}
	}
    
    public static JniInchiStereo0D getStereo0D(final int i){
        final JniInchiStereo0D ret = new JniInchiStereo0D();
        for (int j = 1 ; j < PARAMETERS.length ; j++) {
            ret.addPara(PARAMETERS[j]);
        }
        ret.setP(P);
        return ret;
    }
    /**
     * A unit test to see that a structure contains both r and m.
     */
    @Test
    public void testGetStereo0DWithMes(){
        final String params = "RIGHT_EYE RABBER 0.5, ";
        final List<String> values = new ArrayList<String>();
        values.add(params);
        final List<JniInchiStereo0D> expected = new ArrayList<>();
        final List<JniInchiStereo0D> ret = getStereo0D(0);
        final List<JniInchiStereo0D> returned = ret;
        for (int i = 0; i < values.size(); i++) {
            assertEquals(returned.get(i).getName(), ret.get(i).getName());
            assertEquals("Stereo parity", ret.get(i).getP(), 
                    returned.get(i).getP(), params);
            assertEquals("P",  returned.get(i).getP(), ret.get(i).getP(), "name");
            //assertArrayEquals ("P",  returned.get (i). getP (), ret. get(i).getP(), param);
            assertEquals("P",  ret.get(i).getP(), ret.get(i).getP(), params);
            assertEquals("M",  returned.get(i).getM(), ret.get(i).getM(), "name");
            assertEquals("M",  returned.get (i). getM(), ret.get(i). getM(), "name");
            assertEquals("R",  returned.get(i). getR(), ret. get(i). getR(), "name");
            assertEquals("R",  returned.get(i). getR(), ret.get(i). getR(), "name");
        }
    
    }

    /**
     * A unit test to see that a structure contains both m and r.
     */
    @Test
    public void testGetStereo0DWithM(){
        final String params = "LEFT_EYE RABBER 0.5, ";
        final List<String> values = new ArrayList<String>();
        values.add(params);
        final List<JniInchiStereo0D> expected = new ArrayList<>();
        final List<JniInchiStereo0D> ret = getStereo0D(0);
        final List<JniInchiStereo0D> returned = ret;
        for (int i = 0; i < values.size(); i++) {
            assertEquals(returned.get(i).getName(), ret.get(i).getName());
            assertEquals("Stereo parity", ret.get(i).getP(),
                    returned.get(i).getP(), params);
            assertEquals("P",  returned.get(i).getP(), ret.get(i).getP(), "name");
            //assertArrayEquals ("P",  returned. getP (), ret.get (i).  getP(), param);
            assertEquals("P",  ret.get(i).getP(), ret.get(i).getP(), "name");
            assertEquals("r",  returned.get(i).getR(), ret.get(i).getR(), "name");
            assertEquals("R",  returned.get(i). getR (), ret.get(i). getR(), "name");
            assertEquals("L",  returned.get(i). getL(), ret.get(i). getL(), "name");
            assertEquals("L",  returned.get (i). getL(), ret.get(i). getL(), "name");
        }
    }
    
}