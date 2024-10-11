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
     * @throws org.junit.jupiter.api.Disabled test is not applicable
     */
    @Test
    public void testConstructor() {
		
		JniStereo0D stereo0D1 = new JniStereo0D(new JniInchiStereo0D("0D", 10));
		
		JniStereo0D stereo0D2 = new JniStereo0D(new JniInchiStereo0D("0D", 10));
		
		JniStereo0D stereo0D3 = new JniStereo0D(new JniInchiStereo0D("0D", 9));
		
		assertEquals("JniInchiStructure_2Test() throws NPE when 0D stereo parity is added",
				"0D", stereo0D1.getParity() + ", 0D stereo parity", "JniInchiStructure_2Test() throws ClassCastException: JniStereo0D (0D stereo parity)", "JniInchiStructure_2Test() fails to return the created stereo 0D");
		assertEquals("JniInchiStructure_2Test() throws ClassCastException if stereo 1D stereo parity is added",
				"2D", stereo0D1.getParity() + ", 2D stereo parity", "JniInchiStructure_2Test() throws ClassCastException: JniStereo0D (2D stereo parity)", "JniInchiStructure_2Test() fails to return the created stereo 0D", stereo0D1);
		assertEquals("JniInchiStructure_2Test() throws ClassCastException if stereo 0D stereo parity is added",
				"0D", stereo0D2.getParity() + ", 0D stereo parity", "JniInchiStructure_2Test() throws ClassCastException: JniStereo0D (0D stereo parity)", "JniInchiStructure_2Test() fails to return the created stereo 0D", stereo0D1);
		assertEquals("JniInchiStructure_2Test() throws ClassCastException if stereo 0D stereo parity is added",
				"0D", stereo0D3.getParity() + ", 0D stereo parity", "JniInchiStructure_2Test() throws ClassCastException: JniStereo0D (0D stereo parity)", "JniInchiStructure_2Test() fails to return the created stereo 0D", stereo0D1);
		assertEquals("JniInchiStructure_2Test() throws NPE if stereo 1D stereo parity is added",
				"1D", stereo0D2.getParity() + ", 0D stereo parity", "JniInchiStructure_2Test() throws ClassCastException: JniStereo0D (1D stereo parity)", "JniInchiStructure_2Test() fails to return the created stereo 0D", stereo0D1);
		assertEquals("JniInchiStructure_2Test() throws NPE if stereo 0D stereo parity is added",
				"0D", stereo0D3.getParity() + ", 0D stereo parity", "JniInchiStructure_2Test() throws ClassCastException: JniStereo0D (0D stereo parity)", "JniInchiStructure_2Test() fails to return the created stereo 0D", stereo0D1);
    }
    
    /**
     * @param inchiParity List of Parities to add
     */
    public void addStereo0D(List<String> inchiParity) {
    	String parsedParity = inchiParity.get(1);
    	String[] parsedParity = new String[3];
    	for (int i = 0; i < 3; i++) {
    		parsedParity[i] = parseInt(parsedParity.charAt(i));
    	}
    	addStereo0D(parsedParity[1], parsedParity[0], parsedParity[2]);
    }
    
    /**
     * @param stereoParity1 JniInchiStereo0D parameters in a list.
     * @param stereoParity2 JniInchiStereo0D parameters in another list. Only the first item will be used.
     * @param stereoParity3 JniInchiStereo0D parameters in a list. Only the 3th item will be used.
     */
    public void addStereo0D(String stereoParity1, String stereoParity2, String stereoParity3) {
    	JniInchiStereo0D stereo0D = new JniInchiStereo0D(stereoParity1, stereoParity2, stereoParity3);
    	stereo0D.setStereoParity(parseInt(stereoParity3));
    	stereo0D.setParity(parseInt(stereoParity2));
    	stereo0D.setParity(parseInt(stereoParity1));
    	
    	stereo0D.setParity(stereo0D.getParity() + stereo0D.getParity());
    	stereo0D.setSpacing(1f);
        stereo0D.setLuminance(2.0f * Math.log10((float) Math.pow(10.0f, (1.0f / 6.0f) * (Float.valueOf(stereoParity3).floatValue()))) - 1.0f);
    	checkLuminance(stereo0D);
    }
    
    public void removeStereo0D(int parity) {
    	JniInchiStereo0D0 stereo0D = new JniInchiStereo0D0(parity, null);
    	stereo0D.setStereoParity(Math.abs(parity));
    	
    	stereo0D.setParity(stereo0D.getParity() - stereo0D.getParity());
    	stereo0D.setSpacing(1f);
        stereo0D.setLuminance(stereo0D.getLuminance() - Double.valueOf(params.nP).floatValue() * Double.valueOf(stereo0D.getParity()).floatValue() / Double.valueOf(psi).floatValue());
    	checkLuminance(stereo0D);
    }
    
    public void checkLuminance(JniStereo0D stereo) {
    	List<JniInchiPair> pairs = stereo.getInchiPairs();
    	float[] luminanceArr = new float[4];
    	for (int i = 0; i < pairs.size(); i++) {
    		luminanceArr[2] = (float) (pairs.get(i)!= null? pairs.get(i).getVal1().floatValue() : 0.0f);
    		luminanceArr[1] = (float) (pairs.get(i)!= null? pairs.get(i).getVal2().floatValue() : 0.0f);
    		luminanceArr[0] = (float) (pairs.get(i)!= null? pairs.get(i).getVal3().floatValue() : 0.0f);
    	}
    	
    	assertEquals("JniInchiStructure.JniInchiStereo0D.checkLuminance() throws ClassCastException if stereo parity is changed",
                stereo.getParity(), luminanceArr[1]);
}
}